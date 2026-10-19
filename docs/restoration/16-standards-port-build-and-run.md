# Build and run the restored Standards Port

This is the supported local route for the **Standards Port**, the modern-browser
client added by the restoration. The separate **Legacy Bundle** is the 2015
IE7 client; **Legacy Source** is its reconstructed readable source. The private
**Ramsay Reference** is not required by this procedure.

Open the application root or `index.html` after deployment. They open the
Standards Port. `ideagz.html` remains available for Legacy Bundle comparison.
A new install needs the build tools,
a prepared database, and a Tomcat instance. All application sources, build
scripts, SQL preparation and login seed scripts are in this repository.

The combined WAR intentionally exposes both clients without redirects:

| URL | Client artifact | Purpose |
|---|---|---|
| `/openMAXIMS/index.html` | Standards Port | Normal modern-browser run |
| `/openMAXIMS/ideagz.html` | Legacy Bundle | Direct IE7 comparison run |

This is deliberate: developers can build one WAR and compare the two clients
against the same server and fixtures. `index.html` is the servlet welcome file;
`ideagz.html` remains a direct historical entrypoint and is not redirected to
the Standards Port.

## 1. Install prerequisites

Install Git, a Java 8 **JDK**, Apache Ant, Python 3, and Tomcat 6.0.53. On Apple
Silicon the tested Java 8 installation uses x86-64 with Rosetta 2. Follow
[Java 8 setup](01-build-java8.md#set-up-the-build-tools-on-a-new-machine) for
installation commands. Tomcat does not install Java.

Clone this repository, or use the checkout containing this restoration, and
set the installed tool paths:

```bash
cd /path/to/openMAXIMS
export JAVA_HOME=/path/to/jdk8
export TOMCAT_HOME=/path/to/apache-tomcat-6.0.53
"$JAVA_HOME/bin/java" -version
ant -version
python3 --version
```

Keep tools and runtime directories in persistent locations, not `/tmp`.

## 2. Prepare an Oracle database

Follow [Oracle Docker prerequisites](04-oracle-docker-prerequisites.md) to
install Docker, build the Oracle 19 image from the vendor archive, start the
database, create `IMS_DML`, and create a separate application schema. Choose
and record the actual host, port, PDB service and application-schema credentials.
Use a disposable development database with synthetic data.

The historical Oracle driver may require the isolated Oracle 19 container's
`sqlnet.ora` to contain:

```text
SQLNET.ALLOWED_LOGON_VERSION_SERVER=8
SQLNET.ALLOWED_LOGON_VERSION_CLIENT=8
```

If login reports `ORA-28040`, set these in the container's active Oracle network
configuration, then reset the application schema's password as an administrator
so Oracle generates a compatible verifier. The password must be at most 30
characters with the tested historical driver/database compatibility settings.
These are local restoration compatibility settings.

## 3. Build a new external workspace

Use a new directory so stale deployment or build outputs cannot supply missing
files. A WAR-only build does not connect to the database:

```bash
# Make a new persistent workspace even if an older one already exists.
export OPENMAXIMS_WORKSPACE="$(mktemp -d "$HOME/openmaxims-workspace.XXXXXX")"
cp -a "Source Library/openmaxims_workspace/." "$OPENMAXIMS_WORKSPACE/"
test -f "$OPENMAXIMS_WORKSPACE/WebApp/jsCN/source/build/bin/standards-build-order.json"
./build-java8.sh -Ddbtype=ORA -DdbHost=127.0.0.1 -DdbPort=1521 \
  -DdbName=ORCLPDB1 -Duserid=build-only -Dpassword=build-only openMAXIMSwarfile
```

If an existing workspace reports a missing
`WebApp/jsCN/source/build/bin/standards-build-order.json`, it predates or lacks
the current Standards Port source copy. The file is tracked in this checkout
under `Source Library/openmaxims_workspace/`. Run the complete workspace-copy
step above with a new destination. Do not copy only the manifest: it describes
modules that the older workspace may also lack. `OPENMAXIMS_WORKSPACE` must
point to the directory containing `WebApp/`, not to the repository root.

`build-java8.sh` rebuilds the active Standards Port JavaScript and packed New
Blue CSS before Ant creates `$OPENMAXIMS_WORKSPACE/WebApp/openMAXIMS.war`.
The required result is `BUILD SUCCESSFUL`. The preserved Legacy Bundle is not
modified by this build.

## 4. Load schema, reference data and browser administrator

Use the same workspace to generate the Oracle schema. The detailed database
procedure and expected historical seed warnings are in
[Oracle application setup](05-oracle-application-setup.md).

```bash
export ANT_OPTS="-Dcatalina.home=$TOMCAT_HOME"
./build-java8.sh -Ddbtype=ORA -DdbHost=127.0.0.1 -DdbPort=1521 \
  -DdbName=ORCLPDB1 -Duserid=build-only -Dpassword=build-only SchemaExport
python3 restoration-tests/oracle/prepare_oracle_sql.py schema \
  "$OPENMAXIMS_WORKSPACE/DomainObjects/create_schema.sql" \
  "$OPENMAXIMS_WORKSPACE/DomainObjects/create_schema_oracle.sql"
python3 restoration-tests/oracle/prepare_oracle_sql.py seed \
  "$OPENMAXIMS_WORKSPACE/WebApp/MAXIMS_RefDataORA.sql" \
  "$OPENMAXIMS_WORKSPACE/WebApp/MAXIMS_RefDataORA_oracle.sql"
```

With an Oracle script-capable SQL client, connect as the **application schema
owner** and execute these files in order:

1. `$OPENMAXIMS_WORKSPACE/DomainObjects/create_schema_oracle.sql`
2. `$OPENMAXIMS_WORKSPACE/WebApp/MAXIMS_RefDataORA_oracle.sql`
3. `restoration-tests/oracle/create-restoration-admin.sql`

For SQL*Plus, first run `SET DEFINE OFF` and `SET SQLBLANKLINES ON`, then
use `@/absolute/path/to/file.sql`. If SQL*Plus runs inside the container, copy
the files there first with `docker cp`. Execute the
schema and reference seed in continuation mode and inspect the errors described
in the database guide; the small administrator script deliberately fails on an
unexpected SQL error. Do not apply schema creation to an existing installation.

For a first installation, verify the loaded state before starting Tomcat:

```sql
SELECT COUNT(*) FROM user_tables; -- verified run: 1675
SELECT username, isactive, theme FROM core_appuser WHERE username = 'user';
SELECT r.name FROM core_approle r
  JOIN core_appuser_c_rol ur ON ur.to_side = r.id
  JOIN core_appuser u ON u.id = ur.from_side WHERE u.username = 'user';
```

The account must be active and the role query must include `Admin`.

The administrator script creates or repairs the disposable browser account
**`user` / `pass`**, sets New Blue, and assigns an active `Admin` role using the
seeded `MAXIMS` navigation. It is rerunnable. Its three reserved negative IDs must
be unused when the account/role is first created. The packaged XML login alone
does not create a database-backed application user. Oracle schema credentials
and browser credentials are separate.

The script also seeds the `Default` configuration-flag group. The historical
Oracle seed uses SQL Server `CONVERT(date, getdate())` for that row and fails
to insert it. If it is missing, first startup can block recursively while
trying to create the group and audit that creation. Create it before starting
Tomcat; do not wait indefinitely at the loading screen.

## 5. Create a clean Tomcat base

```bash
export CATALINA_HOME="$TOMCAT_HOME"
export CATALINA_BASE="$HOME/openmaxims-tomcat"
mkdir "$CATALINA_BASE"
cp -a "$CATALINA_HOME/." "$CATALINA_BASE/"
mkdir -p "$CATALINA_BASE/conf/Catalina/localhost" "$CATALINA_BASE/deployment-backups"
cp "$OPENMAXIMS_WORKSPACE/WebApp/WEB-INF/lib/OracleJdbc.jar" "$CATALINA_HOME/lib/"
```

Create `$CATALINA_BASE/conf/Catalina/localhost/openMAXIMS.xml` locally with the
actual PDB and schema credentials:

```xml
<Context>
  <Resource name="jdbc/maxims" auth="Container" type="javax.sql.DataSource"
    driverClassName="oracle.jdbc.driver.OracleDriver"
    url="jdbc:oracle:thin:@//127.0.0.1:1521/ORCLPDB1"
    username="YOUR_SCHEMA" password="YOUR_SCHEMA_PASSWORD"
    maxActive="100" maxIdle="30" maxWait="30000"/>
  <Environment name="QuartzDbDriver" type="java.lang.String"
    value="oracle.jdbc.driver.OracleDriver" override="false"/>
  <Environment name="QuartzDbUrl" type="java.lang.String"
    value="jdbc:oracle:thin:@//127.0.0.1:1521/ORCLPDB1" override="false"/>
  <Environment name="QuartzDbUsername" type="java.lang.String"
    value="YOUR_SCHEMA" override="false"/>
  <Environment name="QuartzDbPassword" type="java.lang.String"
    value="YOUR_SCHEMA_PASSWORD" override="false"/>
</Context>
```

Protect the completed context file with `chmod 600`. In
`$CATALINA_BASE/conf/server.xml`, set the HTTP connector to port `18080`,
shutdown port to `18005` and AJP connector to `18009`, or choose free ports.
The URLs below assume HTTP `18080`.

With Tomcat stopped, deploy the new WAR:

```bash
cp "$OPENMAXIMS_WORKSPACE/WebApp/openMAXIMS.war" "$CATALINA_BASE/webapps/openMAXIMS.war"
```

On later deployments, unload the LaunchAgent first and move both the old WAR
and exploded `openMAXIMS/` directory outside `webapps` before copying the new
WAR. Tomcat attempts to deploy backup directories left under `webapps`.

## 6. macOS: install the persistent LaunchAgent

Tomcat must be managed by `launchd` for persistent macOS use. A server started
from a terminal/tool session can disappear when that session closes.
Create `$HOME/Library/LaunchAgents/org.openmaxims.standards-port.tomcat.plist`
using real **absolute paths**; plist strings do not expand `$HOME` or variables:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE plist PUBLIC "-//Apple//DTD PLIST 1.0//EN" "http://www.apple.com/DTDs/PropertyList-1.0.dtd">
<plist version="1.0"><dict>
  <key>Label</key><string>org.openmaxims.standards-port.tomcat</string>
  <key>ProgramArguments</key><array>
    <string>/path/to/apache-tomcat-6.0.53/bin/catalina.sh</string><string>run</string>
  </array>
  <key>EnvironmentVariables</key><dict>
    <key>JAVA_HOME</key><string>/path/to/jdk8</string>
    <key>JRE_HOME</key><string>/path/to/jdk8</string>
    <key>CATALINA_HOME</key><string>/path/to/apache-tomcat-6.0.53</string>
    <key>CATALINA_BASE</key><string>/Users/your-name/openmaxims-tomcat</string>
    <key>CATALINA_OPTS</key><string>-Xms512m -Xmx2048m -Dfile.encoding=UTF-8</string>
  </dict>
  <key>WorkingDirectory</key><string>/Users/your-name/openmaxims-tomcat</string>
  <key>RunAtLoad</key><true/><key>KeepAlive</key><true/>
  <key>StandardOutPath</key><string>/Users/your-name/openmaxims-tomcat/logs/launchd.stdout.log</string>
  <key>StandardErrorPath</key><string>/Users/your-name/openmaxims-tomcat/logs/launchd.stderr.log</string>
</dict></plist>
```

Create the LaunchAgents directory before saving the file. Start and inspect it:

```bash
mkdir -p "$HOME/Library/LaunchAgents"
plutil -lint "$HOME/Library/LaunchAgents/org.openmaxims.standards-port.tomcat.plist"
launchctl bootstrap "gui/$(id -u)" \
  "$HOME/Library/LaunchAgents/org.openmaxims.standards-port.tomcat.plist"
launchctl print "gui/$(id -u)/org.openmaxims.standards-port.tomcat"
tail -f "$CATALINA_BASE/logs/launchd.stdout.log"
```

Wait for `Server startup` and the application deployment. Do not start a second
Tomcat process. Stop the service with:

```bash
launchctl bootout "gui/$(id -u)/org.openmaxims.standards-port.tomcat"
```

On Linux, use the platform service manager with the same environment and
`catalina.sh run`. A macOS user LaunchAgent starts after login, not before.

## 7. Open and verify the restored client

Open the repository-owned launcher directly:

**<http://127.0.0.1:18080/openMAXIMS/index.html>**

Verify visible/editable login inputs, enter **`user` / `pass`**, and confirm
Patient Search and navigation appear. The existing New Blue dark-blue form
surface, toolbar, search controls, results grid and total should remain visible.
Log out to return to login. The launcher opens directly without popup wrappers
or timing/statistics windows. No private shell, bundle, theme or deployment
script is required.

The optional repository browser check uses Chrome and Python's standard library:

```bash
python3 restoration-tests/check-client-entrypoints.py \
  "$OPENMAXIMS_WORKSPACE/WebApp/openMAXIMS.war"
python3 restoration-tests/check-standards-browser.py --login \
  --url http://127.0.0.1:18080/openMAXIMS/index.html \
  --screenshots /tmp/openmaxims-smoke
```

Use `--chrome /path/to/chrome` if needed. It tests login input hit-testing,
`user`/`pass` authentication, Patient Search geometry, the existing dark-blue
surface, logout and uncaught JavaScript exceptions. Inspect the screenshots
and check Safari separately. HTTP 200 alone does not verify a usable UI.

### Browser cache and the Safari symptom

The launcher deliberately does not use fixed, cacheable client URLs. On each
launch it assigns a cache-generation value and loads both the Standards Port
bundle and `forminit.js` with that value. The form manager applies the same
value to the packed New Blue stylesheet. This prevents Safari from combining a
new WAR with an older `jscn.js.gz` or theme CSS after a rebuild; that mixed state
can show the old login background and report the CNHost request as an access
control failure even though the page and servlet are on the same origin.

The launcher also derives the CNHost request as a path on the current origin.
Do not solve this symptom by adding wildcard CORS headers to CNHost. If the
console still reports an access-control error after a fresh direct launch,
confirm that the address is exactly the launcher URL above and that Safari has
not retained an older tab/frame or a different host/port. A direct POST to
`/openMAXIMS/CNHost` should return HTTP 200; the repository browser check is the
repeatable validation.

The Standards Port login does not request the optional `siteLogo.png` asset.
The repository contains the historical `_siteLogo.png` variants, not a file
with that active name; a 404 for `themes/new-blue/g/siteLogo.png` therefore
indicates an old or locally modified client, not a missing database setting.

## Focus of this repair

The launcher loads `packed/jscn.js.gz` and
`jsCN/source/build/files/forminit.js`. The build includes the restored New Blue
login module, regenerates packed CSS, and preserves the Legacy Bundle. Shared
XML coordinate/anchor handling now emits pixel units so the restored client
can use its documented launch page. Grid header sizing keeps numeric internal
widths. The form renderer activates the already-existing dark-blue CSS class;
the form theme has not been replaced. Login-specific CSS prevents clipping.
The earlier bulk conversion of unrelated controls was rolled back.

Background scheduler warnings about unseeded Quartz tables remain separate
from this login/Patient Search verification. This procedure is for local
restoration, not production or clinical acceptance.

## Verification record — 2026-10-18

Followed this procedure with a newly copied source workspace, Java 8, Ant,
a fresh Tomcat 6.0.53 distribution/base and a separate empty Oracle application
schema. SchemaExport and the WAR build succeeded. The prepared schema created
1,675 tables; the public reference data and repository administrator seed were
loaded, including the required `Default` flags group. No private deployment
helper, browser shell or reference assets were used.

The packaged WAR ran under the documented macOS LaunchAgent. Browser checks
passed for visible/editable login fields, `user` / `pass`, authenticated Patient
Search, the existing dark-blue form surface, field/grid layout and logout,
with no uncaught JavaScript exceptions. Served launcher, JavaScript, CSS and
bootstrap bytes matched the WAR. These checks cover this startup/login slice;
they do not claim verification of every restored control or workflow.
