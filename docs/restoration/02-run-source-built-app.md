# Run the source-built application

This runbook describes how to run the Java 8 source build for local
restoration work, including access from an XP virtual machine under UTM.

It is intentionally separate from the compilation instructions in
[`01-build-java8.md`](01-build-java8.md).

## Important distinctions

- The Java application is compiled into a WAR from the repository source.
- The current IE7 JavaScript restoration has a separately compiled historical
  runtime bundle for testing, but three expected source files remain unresolved:
  `focusmanager.js`, `forminit-single.js`, and `minitest.js`.
- Do not claim that the complete 102-file JavaScript source tree has been
  reconstructed until those files and the public build order are resolved.

## Use a persistent build workspace

The historical Ant build writes generated classes, metadata, schema output,
and the WAR into the selected workspace. Do not use a disposable per-build
`/tmp` directory for the normal application installation, and do not build
against the Git checkout unless you deliberately intend to restore generated
files afterwards.

The tested build can use the workspace included in the checkout. The build
script defaults to it, so no copy into `/tmp` is required:

```bash
unset OPENMAXIMS_WORKSPACE
```

If an isolated workspace is needed, set `OPENMAXIMS_WORKSPACE` to a persistent
directory outside the checkout. Do not use a disposable per-build `/tmp`
directory for normal work. Keep the Git checkout as the source of truth.

## Build the WAR

Use Java 8 and the Tomcat libraries required by the historical Ant build. The
following are the versions used by the verified run:

```bash
export JAVA_HOME="/tmp/jdks8-recover/jdk8u504-b01/Contents/Home"
export TOMCAT_HOME="/tmp/tomcat6/apache-tomcat-6.0.53"
./build-java8.sh
```

The generated WAR is:

```text
Source Library/openmaxims_workspace/WebApp/openMAXIMS.war
```

With `OPENMAXIMS_WORKSPACE` set, use `$OPENMAXIMS_WORKSPACE/WebApp/openMAXIMS.war`
instead. Confirm the WAR timestamp and size before deploying it.

## Use the proven persistent Tomcat instance

The verified SQL Server run uses this persistent Tomcat installation and base:

```bash
export CATALINA_HOME="/tmp/tomcat6/apache-tomcat-6.0.53"
export CATALINA_BASE="$HOME/openmaxims-tomcat-sqlserver"
```

This base contains the working JNDI datasource context at
`$CATALINA_BASE/conf/Catalina/localhost/openMAXIMS.xml`, including the
SQL Server connection settings. Keep that file local; do not put database
passwords into Git.

For this Tomcat 6 layout, shared JDBC drivers must be installed in
`CATALINA_HOME/lib` so the Tomcat shared classloader can see them. The tested
SQL Server driver was `mssql-jdbc-12.10.1.jre8.jar`:

```bash
cp /path/to/mssql-jdbc-12.10.1.jre8.jar "$CATALINA_HOME/lib/"
```

Do not assume that `CATALINA_BASE/lib` is searched.

Deploy the newly built WAR:

```bash
export WAR="$PWD/Source Library/openmaxims_workspace/WebApp/openMAXIMS.war"
mkdir -p "$CATALINA_BASE/deployment-backups"

# If a KeepAlive launchd agent is installed, stop it first. Otherwise it may
# immediately restart Tomcat while the deployment is being replaced.
uid=$(id -u)
launchctl bootout "gui/$uid/com.openmaxims.sqlserver-tomcat" 2>/dev/null || true

# Stop any remaining Tomcat process before changing the deployment.
"$CATALINA_HOME/bin/catalina.sh" stop || true

# Preserve old deployments outside webapps. Tomcat 6 attempts to deploy every
# application directory found under webapps, including timestamped backups.
stamp=$(date +%Y%m%d%H%M%S)
for path in "$CATALINA_BASE/webapps/openMAXIMS" \
            "$CATALINA_BASE/webapps/openMAXIMS.war"; do
    if [ -e "$path" ]; then
        mv "$path" "$CATALINA_BASE/deployment-backups/$(basename "$path").$stamp"
    fi
done

cp "$WAR" "$CATALINA_BASE/webapps/openMAXIMS.war"
```

Do not leave the moved backup directories inside `webapps`, or Tomcat will
try to deploy them as additional contexts.

## Configure access from the XP VM

The UTM host-only bridge used for this restoration is normally:

```text
Mac host: 192.168.128.1
XP guest: 192.168.128.2
Subnet:   255.255.255.0
```

Configure the HTTP connector in `$CATALINA_BASE/conf/server.xml` to use port
8080 and do not restrict it to `127.0.0.1`:

```xml
<Connector port="8080"
           protocol="HTTP/1.1"
           connectionTimeout="20000"
           redirectPort="8443" />
```

Tomcat will listen on all interfaces unless an `address` attribute overrides
that behaviour. Port 8080 is preferred here because macOS Apache commonly
occupies port 80. The no-port URL is therefore **not** the expected URL for
this setup.

## Start and wait for readiness

For an ordinary terminal-managed development run:

```bash
export JAVA_HOME="/path/to/java-8"
export CATALINA_HOME="/tmp/tomcat6/apache-tomcat-6.0.53"
export CATALINA_BASE="$HOME/openmaxims-tomcat-sqlserver"
"$CATALINA_HOME/bin/catalina.sh" start
```

The verified setup uses a user `launchd` agent named
`com.openmaxims.sqlserver-tomcat`, with `KeepAlive` enabled and logs at:

```text
$CATALINA_BASE/logs/launchd.stdout.log
$CATALINA_BASE/logs/launchd.stderr.log
```

If using that agent, bootstrap it once, or restart it if it is already loaded;
do not start another Tomcat instance:

```bash
uid=$(id -u)
if launchctl print "gui/$uid/com.openmaxims.sqlserver-tomcat" >/dev/null 2>&1; then
    : # already loaded
else
    launchctl bootstrap "gui/$uid" \
      "$HOME/Library/LaunchAgents/com.openmaxims.sqlserver-tomcat.plist"
fi
launchctl kickstart -k "gui/$uid/com.openmaxims.sqlserver-tomcat"
```

Always check for an existing listener and launch agent before starting Tomcat.

Startup is slow. The application may spend 30–60 seconds loading Hibernate
mappings, registered forms, images, and database configuration. A listening
socket alone is not sufficient evidence that the application is ready.

Wait for both CNHost initialization and this line in the configured
launch-agent log:

```text
Server startup in ... ms
```

The successful run also logged `CNHost servlet started` and
`Registered Forms loaded successfully`.

Then verify from the Mac:

```bash
curl --connect-timeout 5 --max-time 15 \
  -D - -o /dev/null \
  http://127.0.0.1:8080/openMAXIMS/

curl --connect-timeout 5 --max-time 15 \
  -D - -o /dev/null \
  http://192.168.128.1:8080/openMAXIMS/
```

Both should return HTTP `200` before testing from XP.

From the XP VM, use:

```text
http://192.168.128.1:8080/openMAXIMS/
```

## Browser compatibility of this runtime

This source-built page is the historical IE7 client. Its `ideagz.html` page
loads `jsCN/forminit.js` inside an IE conditional comment:

```html
<!--[if gte IE 6]>
<script src="jsCN/forminit.js"></script>
<![endif]-->
```

Consequently, Safari and other standards browsers can display the static
`Application is loading, please wait...` screen without running the form
bootstrap. That symptom does not by itself indicate a Java, database, or
Tomcat failure. Use the XP/IE7 VM to validate this historical runtime. A
standards-browser client requires the separate standards-port page and bundle,
not this unmodified IE7 entrypoint.

## Troubleshooting checklist

If Safari or XP cannot connect:

```bash
ps aux | grep '[j]ava'
lsof -nP -iTCP:8080 -sTCP:LISTEN
nc -vz 192.168.128.1 8080
```

Interpretation:

- No Java process or listener: Tomcat is not running.
- Listener exists but requests time out: wait for `Server startup`, then inspect
  the current log for startup exceptions.
- `Connection refused`: the process has stopped or the connector uses another
  port.
- Mac works but XP fails: confirm the XP address, subnet, UTM network mode, and
  that the connector is not bound to localhost.
- Port 80 fails while 8080 works: macOS Apache is probably using port 80.
  Stop it only if the no-port URL is specifically required; otherwise use
  port 8080.

Do not diagnose an application/database failure from a browser request made
before Tomcat has emitted `Server startup`. If the browser shows the static
loading page in Safari, test the same URL in the XP/IE VM; the IE conditional
bootstrap is intentionally not executed by Safari.

## Stop the instance

For a normal Tomcat process:

```bash
"$CATALINA_HOME/bin/catalina.sh" stop
```

For a user `launchd` service, stop that service using its label rather than
starting another copy. Verify that the Java process and HTTP listener are
 gone before changing configuration or deploying another WAR.
