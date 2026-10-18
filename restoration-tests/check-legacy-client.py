#!/usr/bin/env python3
"""Verify a legacy-profile WAR against the preserved repository artifacts.

Optionally verify the assets and CNHost layout served by a legacy deployment.
This does not emulate IE7 or assert browser interaction compatibility.
"""
import argparse
from pathlib import Path
from urllib.request import urlopen, Request
from zipfile import ZipFile
import xml.etree.ElementTree as ET

ROOT = Path(__file__).resolve().parents[1]
WEBAPP = ROOT / 'Source Library/openmaxims_workspace/WebApp'
parser = argparse.ArgumentParser(description=__doc__)
parser.add_argument('war', type=Path)
parser.add_argument('--url', help='Application base URL of a legacy-profile deployment')
args = parser.parse_args()
expected = {
    'packed/jscn.js.gz': 'packed-legacy/jscn.js.gz',
    'packed-legacy/jscn.js.gz': 'packed-legacy/jscn.js.gz',
    'packed/themes/css/new-blue.css.gz': 'packed-legacy/themes/css/new-blue.css.gz',
    'ideagz.html': 'ideagz.html',
    'index.html': 'ideagz.html',
    'jsCN/forminit.js': 'jsCN/forminit.js',
    'WEB-INF/classes/themes/new-blue/layout.html': 'src/themes-legacy/new-blue/layout.html',
}
for asset in (WEBAPP / 'themes-legacy/new-blue').rglob('*'):
    if asset.is_file():
        expected['themes/new-blue/' + str(asset.relative_to(WEBAPP / 'themes-legacy/new-blue'))] = str(asset.relative_to(WEBAPP))
with ZipFile(args.war) as war:
    for target, source in expected.items():
        assert war.read(target) == (WEBAPP / source).read_bytes(), target + ' differs from preserved artifact'
    assert war.read('index.html') == (WEBAPP / 'ideagz.html').read_bytes()
print('PASS: Legacy Bundle, IE bootstrap, launcher, theme and server layout match preserved artifacts')
if args.url:
    base = args.url.rstrip('/') + '/'
    for target, source in expected.items():
        if target.startswith('WEB-INF/'):
            continue
        with urlopen(base + target, timeout=15) as response:
            assert response.read() == (WEBAPP / source).read_bytes(), target + ' differs when served'
    data = b'<events><updateTheme theme="new-blue"/><uniqueID value="legacy-smoke"/></events>'
    with urlopen(Request(base + 'CNHost', data=data, headers={'Content-Type': 'text/xml'}), timeout=30) as response:
        document = ET.fromstring(response.read())
    html = document.find('.//html')
    assert html is not None, 'CNHost did not return a theme layout'
    # CNHost concatenates layout lines when producing the CDATA response.
    normalise = lambda text: text.replace('\r', '').replace('\n', '').strip()
    assert normalise(html.text or '') == normalise((WEBAPP / 'src/themes-legacy/new-blue/layout.html').read_text()), 'CNHost did not serve the preserved theme layout'
    print('PASS: served legacy artifacts and CNHost theme layout match the preserved client')
