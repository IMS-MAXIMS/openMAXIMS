#!/usr/bin/env python3
"""Exercise the deployed Standards Port in Chrome; uses Python's standard library.

--login uses only the documented disposable user/pass account. Screenshots are
written outside the checkout. No browser packages or private lab scripts needed.
"""
import argparse
import base64
import json
import os
from pathlib import Path
import shutil
import socket
import struct
import subprocess
import tempfile
import time
from urllib.parse import urlparse
from urllib.request import urlopen


class Browser:
    def __init__(self, chrome, profile):
        self.process = subprocess.Popen([
            chrome, '--headless', '--disable-gpu', '--no-first-run',
            '--remote-debugging-port=0', '--user-data-dir=' + profile, 'about:blank',
        ], stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)
        self.profile = Path(profile)
        self.socket = None
        self.errors = []
        self.sequence = 0

    def connect(self):
        active = self.profile / 'DevToolsActivePort'
        deadline = time.monotonic() + 20
        while not active.exists():
            if self.process.poll() is not None:
                raise RuntimeError('Chrome exited before its debugging port opened')
            if time.monotonic() > deadline:
                raise TimeoutError('Chrome debugging port did not open')
            time.sleep(.1)
        port = int(active.read_text().splitlines()[0])
        with urlopen(f'http://127.0.0.1:{port}/json', timeout=10) as response:
            pages = json.load(response)
        url = urlparse(next(p['webSocketDebuggerUrl'] for p in pages if p['type'] == 'page'))
        self.socket = socket.create_connection((url.hostname, url.port), timeout=10)
        key = base64.b64encode(os.urandom(16)).decode()
        self.socket.sendall((f'GET {url.path} HTTP/1.1\r\nHost: {url.netloc}\r\n'
                             'Upgrade: websocket\r\nConnection: Upgrade\r\n'
                             f'Sec-WebSocket-Key: {key}\r\nSec-WebSocket-Version: 13\r\n\r\n').encode())
        headers = b''
        while not headers.endswith(b'\r\n\r\n'):
            headers += self.read(1)
        if b' 101 ' not in headers.split(b'\r\n')[0]:
            raise RuntimeError('Chrome rejected the debugging WebSocket')
        self.call('Runtime.enable')
        self.call('Page.enable')

    def read(self, count):
        data = b''
        while len(data) < count:
            chunk = self.socket.recv(count - len(data))
            if not chunk:
                raise EOFError('Chrome debugging connection closed')
            data += chunk
        return data

    def call(self, method, params=None):
        self.sequence += 1
        data = json.dumps({'id': self.sequence, 'method': method, 'params': params or {}}).encode()
        size = len(data)
        length = bytes([128 | size]) if size < 126 else b'\xfe' + struct.pack('!H', size)
        mask = os.urandom(4)
        self.socket.sendall(b'\x81' + length + mask + bytes(v ^ mask[i % 4] for i, v in enumerate(data)))
        while True:
            opcode, length = self.read(2)
            size = length & 127
            if size == 126:
                size = struct.unpack('!H', self.read(2))[0]
            elif size == 127:
                size = struct.unpack('!Q', self.read(8))[0]
            payload = self.read(size)
            if opcode & 15 == 8:
                raise EOFError('Chrome closed the WebSocket')
            message = json.loads(payload)
            if message.get('method') == 'Runtime.exceptionThrown':
                self.errors.append(message['params']['exceptionDetails'])
            if message.get('id') == self.sequence:
                if 'error' in message:
                    raise RuntimeError(message['error'])
                return message.get('result', {})

    def evaluate(self, expression):
        result = self.call('Runtime.evaluate', {'expression': expression, 'returnByValue': True})
        if 'exceptionDetails' in result:
            raise RuntimeError(result['exceptionDetails'])
        return result['result'].get('value')

    def wait(self, expression, timeout=30):
        deadline = time.monotonic() + timeout
        while time.monotonic() < deadline:
            if self.evaluate(expression):
                return
            time.sleep(.2)
        raise TimeoutError('Browser condition failed: ' + expression)

    def screenshot(self, path):
        result = self.call('Page.captureScreenshot', {'format': 'png'})
        path.write_bytes(base64.b64decode(result['data']))

    def close(self):
        if self.socket:
            self.socket.close()
        self.process.terminate()
        try:
            self.process.wait(timeout=5)
        except subprocess.TimeoutExpired:
            self.process.kill()
            self.process.wait()


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--url', default='http://127.0.0.1:18080/openMAXIMS/index.html')
    parser.add_argument('--chrome', default=shutil.which('google-chrome') or '/Applications/Google Chrome.app/Contents/MacOS/Google Chrome')
    parser.add_argument('--login', action='store_true', help='Submit disposable restoration credentials user/pass')
    parser.add_argument('--screenshots', type=Path, help='Private screenshot output directory outside the checkout')
    args = parser.parse_args()
    # Tomcat opens its connector after the application startup work completes.
    deadline = time.monotonic() + 90
    while True:
        try:
            with urlopen(args.url, timeout=3) as response:
                if response.status == 200:
                    break
        except OSError:
            pass
        if time.monotonic() >= deadline:
            raise TimeoutError('Tomcat launcher did not become ready: ' + args.url)
        time.sleep(.5)
    with tempfile.TemporaryDirectory(prefix='openmaxims-browser-') as profile:
        browser = Browser(args.chrome, profile)
        try:
            browser.connect()
            browser.call('Emulation.setDeviceMetricsOverride', {'width': 1280, 'height': 800, 'deviceScaleFactor': 1, 'mobile': False})
            browser.call('Page.navigate', {'url': args.url})
            browser.wait('typeof formManager !== "undefined" && CNFormManager.themeLoaded && !formManager._loading && document.querySelector(".cn_logincontrol_newblue input[type=password]") !== null')
            # Check actual login rectangles and pointer hit-testing.
            for width, height in [(1280, 800)]:
                browser.call('Emulation.setDeviceMetricsOverride', {'width': width, 'height': height, 'deviceScaleFactor': 1, 'mobile': False})
                time.sleep(.3)
                problems = browser.evaluate('''JSON.stringify((function(){
                  var problems=[], inputs=document.querySelectorAll('.cn_logincontrol_newblue input.loginBox');
                  if(inputs.length!==2) problems.push('expected two login inputs');
                  inputs.forEach(function(input){
                    var r=input.getBoundingClientRect(), p=input.parentElement.getBoundingClientRect();
                    if(r.width<=0 || r.height<=0 || r.left<0 || r.top<0 || r.right>innerWidth || r.bottom>innerHeight) problems.push('input outside viewport');
                    if(r.left<p.left || r.right>p.right+1) problems.push('input outside wrapper');
                    if(document.elementFromPoint(r.left+8,r.top+r.height/2)!==input) problems.push('input obscured');
                  });
                  if(document.getElementById('__loginChrome').getBoundingClientRect().height<=0) problems.push('empty login surface');
                  return problems;
                })())''')
                assert json.loads(problems) == [], f'{width}x{height}: {problems}'
                print(f'PASS: login layout and pointer hit-testing at {width}x{height}')
                if args.screenshots:
                    args.screenshots.mkdir(parents=True, exist_ok=True)
                    browser.screenshot(args.screenshots / f'login-{width}.png')
            browser.call('Emulation.setDeviceMetricsOverride', {'width': 1280, 'height': 800, 'deviceScaleFactor': 1, 'mobile': False})
            if args.login:
                browser.evaluate('''(function(){
                  document.querySelector('.cn_logincontrol_newblue input[type=text]').value='user';
                  var password=document.querySelector('.cn_logincontrol_newblue input[type=password]');
                  password.value='pass'; password.focus();
                })()''')
                button = browser.evaluate("""(function(){
                  var r=document.querySelector('.cn_logincontrol_newblue .loginButton').getBoundingClientRect();
                  return {x:r.left+r.width/2,y:r.top+r.height/2};
                })()""")
                browser.call('Input.dispatchMouseEvent', dict(button, type='mousePressed', button='left', clickCount=1))
                browser.call('Input.dispatchMouseEvent', dict(button, type='mouseReleased', button='left', clickCount=1))
                browser.wait('!formManager._loading && !document.querySelector(".cn_logincontrol_newblue") && document.body.innerText.includes("Patient Search")', timeout=45)
                print('PASS: user/pass login reaches authenticated Patient Search')
                geometry_ok = browser.evaluate("""(function(){
                  var grid=document.querySelector('.cn_grid');
                  if(!grid) return false;
                  var r=grid.getBoundingClientRect();
                  var inputs=Array.from(document.querySelectorAll('input[type=text]')).filter(function(input){
                    var b=input.getBoundingClientRect(); return b.width>0 && b.height>0;
                  });
                  return r.width>500 && r.height>200 && r.top>100 && inputs.length>=4 && inputs.every(function(input){
                    var b=input.getBoundingClientRect(); return b.bottom<=r.top+1 || b.left>=r.right || b.right<=r.left;
                  });
                })()""")
                assert geometry_ok, 'Patient Search inputs overlap or grid geometry is incorrect'
                surface_ok = browser.evaluate("""(function(){
                  var surface=document.getElementById('__si_darkHeader');
                  return surface.classList.contains('theme_darkFormSurface') &&
                    surface.getBoundingClientRect().height>0 &&
                    getComputedStyle(surface).backgroundImage.includes('linear-gradient');
                })()""")
                assert surface_ok, 'New Blue dark form surface is missing'
                print('PASS: existing New Blue dark form surface is active')
                print('PASS: Patient Search fields and results grid have distinct layout')
                more_button = browser.evaluate("""(function(){
                  var button=document.querySelector('.moreButton');
                  if(!button) return null;
                  var r=button.getBoundingClientRect(); return {x:r.left+r.width/2,y:r.top+r.height/2};
                })()""")
                assert more_button, 'More toolbar button missing'
                browser.call('Input.dispatchMouseEvent', dict(more_button, type='mouseMoved'))
                browser.wait('getComputedStyle(document.querySelector(".topButtonsMoreDiv")).visibility === "visible"')
                browser.wait('document.querySelector(".topButtonsMoreDiv").getBoundingClientRect().width > 100')
                more_colors = browser.evaluate("""(function(){
                  var menu=document.querySelector('.topButtonsMoreDiv');
                  var item=menu.querySelector('.topButton');
                  return {background:getComputedStyle(menu).backgroundColor,
                    text:item && getComputedStyle(item).color,
                    inlineBackground:menu.style.backgroundColor};
                })()""")
                assert more_colors == {'background':'rgb(65, 108, 162)',
                    'text':'rgb(255, 255, 255)', 'inlineBackground':''}, \
                    'More menu does not use the Legacy New Blue dark surface: ' + json.dumps(more_colors)
                print('PASS: More menu uses the Legacy New Blue dark surface with white text')
                if args.screenshots:
                    browser.screenshot(args.screenshots / 'patient-search-more-menu.png')
                    browser.screenshot(args.screenshots / 'patient-search.png')
                logout_button = browser.evaluate("""(function(){
                  var button=Array.from(document.querySelectorAll('.topButton')).find(function(e){return e.textContent.trim()==='Logout';});
                  if(!button) return null;
                  var r=button.getBoundingClientRect(); return {x:r.left+r.width/2,y:r.top+r.height/2};
                })()""")
                assert logout_button, 'Logout toolbar button missing'
                browser.call('Input.dispatchMouseEvent', dict(logout_button, type='mousePressed', button='left', clickCount=1))
                browser.call('Input.dispatchMouseEvent', dict(logout_button, type='mouseReleased', button='left', clickCount=1))
                browser.wait('document.querySelector(".cn_logincontrol_newblue input[type=password]") !== null && !formManager._loading')
                print('PASS: logout returns to the login screen')
            assert not browser.errors, json.dumps(browser.errors)
            print('PASS: no uncaught browser exceptions')
        except Exception:
            if browser.socket:
                try:
                    print('Browser failure state:', browser.evaluate('JSON.stringify({body:document.body.innerText.slice(0,1200),loading:formManager._loading,posting:formManager._isPostingBack})'))
                    print('Browser exceptions:', json.dumps(browser.errors))
                    if args.screenshots:
                        browser.screenshot(args.screenshots / 'failure.png')
                except Exception:
                    pass
            raise
        finally:
            browser.close()


if __name__ == '__main__':
    main()
