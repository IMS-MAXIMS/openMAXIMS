# Oracle-backed openMAXIMS application setup

This guide follows
[`04-oracle-docker-prerequisites.md`](04-oracle-docker-prerequisites.md).
It takes a clean openMAXIMS checkout, an Oracle database prepared for local
use, and a Java 8/Tomcat environment through schema creation and a first
application smoke test.

This is a restoration and feasibility procedure. Use synthetic or explicitly
authorised data only. Do not use it as a production deployment procedure.

## What this guide does

It covers:

1. choosing the Oracle connection values;
2. building the historical WAR with the Oracle build target;
3. generating the Oracle schema SQL;
4. applying the schema and Oracle reference data with the user's chosen SQL
   client;
5. configuring Tomcat's JNDI datasource;
6. deploying the WAR and checking the first application requests.

It does not attempt to repair every historical warning, validate every module,
or certify clinical behaviour.

## Required local values

Choose values appropriate to the Oracle container created by the previous
guide. They do not have to be `ORCLPDB1` or any other example name:

```text
DATABASE_HOST       <database host>
DATABASE_PORT       <database port>
DATABASE_SERVICE    <PDB service name>
DATABASE_USER       <application schema user>
DATABASE_PASSWORD   <application schema password>
```

Keep the password in an untracked local configuration. Do not commit it or
place it in a repository script.

The browser login is a separate, disposable restoration account. The packaged
`WebApp/src/configuration.xml` records `user` / `pass` with the `Admin` role,
but the HIB runtime also requires an active database `core_appuser` row and
role mapping. Complete the account creation/repair step in
[`16-standards-port-build-and-run.md`](16-standards-port-build-and-run.md)
after loading reference data. These are not the Oracle schema credentials;
do not use the account outside a disposable local restoration environment.

`WebApp/WebAppBuild.xml` has five legacy `xxxxx` defaults: `dbHost`, `dbPort`,
`dbName`, `userid`, and `password`. The first three are the database endpoint;
`userid` and `password` are the Oracle schema credentials for Ant targets that
connect to the database. They are not the browser login. Leave the checked-in
defaults alone; supply local Ant property overrides instead. A WAR-only build
does not connect to the application database, while schema-generation or
database-management targets may need the schema credentials.

## Build prerequisites

The historical build currently requires:

- Java 8;
- Apache Ant;
- Tomcat libraries supplied through `TOMCAT_HOME`;
- the repository's committed Java 8 compatibility fixes.

The tested local build used Tomcat 6.0.53 libraries and Ant 1.10.18. Other
Tomcat versions may work, but should be recorded and tested separately.

From the repository root, set the local tool locations:

```bash
export JAVA_HOME='<path to a Java 8 JDK>'
export TOMCAT_HOME='<path to a Tomcat installation>'
```

The project build entrypoint checks that `JAVA_HOME` is Java 8 and that Ant
and `TOMCAT_HOME` are available.

## Build the WAR

The legacy Ant build writes `bin` directories, generated metadata, and the WAR
inside the selected workspace. Do not run it directly against the Git checkout
unless you deliberately want those generated files there. Create a persistent
workspace outside the checkout instead:

```bash
export OPENMAXIMS_WORKSPACE="$HOME/openmaxims-workspace"
mkdir -p "$OPENMAXIMS_WORKSPACE"
cp -a "Source Library/openmaxims_workspace/." "$OPENMAXIMS_WORKSPACE/"
WORKSPACE="$OPENMAXIMS_WORKSPACE"
```

The historical WAR build does not package the vendor JDBC drivers. The Oracle
driver is present in the workspace as:

```text
$WORKSPACE/WebApp/WEB-INF/lib/OracleJdbc.jar
```

It must be installed in the Tomcat installation's shared library directory
before the application starts. For the tested Tomcat 6 layout, use
`CATALINA_HOME/lib`; a separate `CATALINA_BASE/lib` is not reliably searched by
this historical Tomcat classloader:

```bash
export CATALINA_BASE='<path to the Tomcat instance>'
cp -p "$WORKSPACE/WebApp/WEB-INF/lib/OracleJdbc.jar" \
      "$CATALINA_HOME/lib/"
```

Restart Tomcat after adding or changing a shared JDBC driver. Keep the driver
local to the development Tomcat installation; do not add it to the Git
checkout or assume that a different Oracle JDBC driver is compatible with this
historical application.

The external workspace is where Ant will write compiled classes, generated
schema files, build-number metadata, and the WAR. Keep the Git checkout as the
source of truth.

To perform a clean build later, remove the external workspace and copy the
source into a new one:

```bash
rm -rf "$OPENMAXIMS_WORKSPACE"
mkdir -p "$OPENMAXIMS_WORKSPACE"
cp -a "Source Library/openmaxims_workspace/." "$OPENMAXIMS_WORKSPACE/"
```

Use a fresh temporary workspace only when specifically testing reproducibility
or investigating stale generated output.

The build accepts the database selection and connection properties as Ant
overrides. The WAR itself uses the Tomcat JNDI datasource at runtime; do not
put a real password on the command line merely to build it.

```bash
./build-java8.sh \
  -Ddbtype=ORA \
  -DdbHost="$DATABASE_HOST" \
  -DdbPort="$DATABASE_PORT" \
  -DdbName="$DATABASE_SERVICE"
```

For an Ant target that connects to Oracle, supply `userid` and `password` as
well. Prefer a permission-restricted Ant property file outside the checkout
rather than putting the schema password directly on the command line:

```properties
dbHost=127.0.0.1
dbPort=1521
dbName=ORCLPDB1
userid=<DATABASE_USER>
password=<DATABASE_PASSWORD>
```

Save it with owner-only permissions (for example, mode `600`) and pass it with
Ant's `-propertyfile /path/to/private-oracle-build.properties` option. The
file is for Oracle database access only; it does not set the `user` / `pass`
browser login.

The resulting WAR is:

```text
$WORKSPACE/WebApp/openMAXIMS.war
```

The build produces generated and compiled files inside the external workspace,
not the Git checkout.

## Generate the Oracle schema

The historical Ant build includes a `SchemaExport` target. It uses the
Hibernate mappings and the selected Oracle dialect to write:

```text
$WORKSPACE/DomainObjects/create_schema.sql
```

Run it with the same Oracle database properties:

```bash
export ANT_OPTS="-Dcatalina.home=$TOMCAT_HOME"

./build-java8.sh \
  -Ddbtype=ORA \
  -DdbHost="$DATABASE_HOST" \
  -DdbPort="$DATABASE_PORT" \
  -DdbName="$DATABASE_SERVICE" \
  SchemaExport
```

The generated output is not automatically a clean, portable Oracle script.
The checked-in helper `restoration-tests/oracle/prepare_oracle_sql.py` makes
the observed Oracle 19 corrections to a **copy** of the generated output:
quote numeric-leading identifiers, replace the three SQL Server `OBJECT_ID`
sequence guards with Oracle `USER_SEQUENCES` checks, and wrap long physical
lines for SQL*Plus. It is intentionally not a general SQL dialect converter.

Before applying the file, preserve the unmodified output for comparison and
prepare a separate file:

```bash
python3 restoration-tests/oracle/prepare_oracle_sql.py schema \
  "$WORKSPACE/DomainObjects/create_schema.sql" \
  "$WORKSPACE/DomainObjects/create_schema_oracle.sql"
```

## Apply the schema and reference data

Use any Oracle-capable SQL client. This may be DBeaver, SQL Developer,
SQL*Plus, an Oracle-compatible command-line tool, or another client that can
execute Oracle scripts.

Connect using:

```text
Host:          <DATABASE_HOST>
Port:          <DATABASE_PORT>
Service name:  <DATABASE_SERVICE>
Username:      <DATABASE_USER>
Password:      <DATABASE_PASSWORD>
Role:          normal
```

Prepare the Oracle reference-data script as a separate copy as well. The helper
removes its UTF-8 BOM; it does not otherwise rewrite the historical seed:

```bash
python3 restoration-tests/oracle/prepare_oracle_sql.py seed \
  "$WORKSPACE/WebApp/MAXIMS_RefDataORA.sql" \
  "$WORKSPACE/WebApp/MAXIMS_RefDataORA_oracle.sql"
```

Execute, in order:

1. `$WORKSPACE/DomainObjects/create_schema_oracle.sql` as the application
   schema owner;
2. `$WORKSPACE/WebApp/MAXIMS_RefDataORA_oracle.sql` as the same owner;
3. any separately required lookup or application seed scripts identified by
   the restoration notes.

Use the chosen client's documented **script execution** operation rather than
assuming that a particular command-line client is installed. Confirm how it
handles PL/SQL blocks, statement delimiters, errors, and file encoding before
loading the large reference-data file.

For the tested SQL*Plus flow, do not use `WHENEVER SQLERROR EXIT`: this schema
has duplicate indexes/constraints that report errors while later DDL still
creates the remaining objects. Inspect the full spool/log and verify the
object counts after execution. Do not ignore new errors without investigating
them.

The 2026-10-18 Oracle 19 run created all 1,675 tables and the three expected
sequences (`AUDIT_SEQUENCE`, `ORDER_SEQUENCE`, and `HIBERNATE_SEQUENCE`). It
reported duplicate-object/index/constraint errors (`ORA-00955`, `ORA-01408`,
`ORA-02264`, `ORA-02275`) from repeated generated DDL; the complete object
counts were checked. The reference-data script has SQL Server-specific
`OBJECT_ID` guards, a backup-table assumption, duplicate menu rows, two
placeholder `xxxxx` user inserts, and a final `CONVERT(date, getdate())` that
Oracle does not support. These are seed portability gaps; they do not define
the browser login. The local restoration account is completed by the packaged configuration
and the database `core_appuser`/role setup described in
[`16-standards-port-build-and-run.md`](16-standards-port-build-and-run.md).
The Oracle reference-data placeholders are not a reliable substitute for that
step.

After loading the data, ensure that the application user has the objects and
privileges needed by the generated schema. Do not run the application as `SYS`.

## Configure Tomcat

Create a local Tomcat context configuration for the application. The exact
file location depends on the Tomcat installation; a common arrangement is an
application context file under:

```text
$TOMCAT_HOME/conf/Catalina/localhost/openMAXIMS.xml
```

Use a local, untracked file containing a JNDI resource equivalent to:

```xml
<Context>
    <Resource name="jdbc/maxims"
              auth="Container"
              type="javax.sql.DataSource"
              driverClassName="oracle.jdbc.driver.OracleDriver"
              url="jdbc:oracle:thin:@//<DATABASE_HOST>:<DATABASE_PORT>/<DATABASE_SERVICE>"
              username="<DATABASE_USER>"
              password="<DATABASE_PASSWORD>"
              maxActive="100"
              maxIdle="30"
              maxWait="30000"/>

    <!-- Required by the historical Quartz scheduler. Keep these values in
         this local, untracked context file alongside the datasource. -->
    <Environment name="QuartzDbDriver" type="java.lang.String"
                 value="oracle.jdbc.driver.OracleDriver" override="false"/>
    <Environment name="QuartzDbUrl" type="java.lang.String"
                 value="jdbc:oracle:thin:@//<DATABASE_HOST>:<DATABASE_PORT>/<DATABASE_SERVICE>"
                 override="false"/>
    <Environment name="QuartzDbUsername" type="java.lang.String"
                 value="<DATABASE_USER>" override="false"/>
    <Environment name="QuartzDbPassword" type="java.lang.String"
                 value="<DATABASE_PASSWORD>" override="false"/>
</Context>
```

The local runtime experiment required relaxed Oracle 19 authentication
settings because the historical Oracle JDBC driver was rejected by the
database's default authentication policy. This was done only in a disposable
local Docker database. Do not weaken authentication policy in a production
environment; preferably use a compatible JDBC driver if that can be verified
against this historical app.

## Deploy and start Tomcat

Stop Tomcat before changing the deployed application. Remove an old exploded
`openMAXIMS` application directory if it could contain stale files, then copy
the newly built WAR as:

```text
$TOMCAT_HOME/webapps/openMAXIMS.war
```

Start Tomcat using the Java 8 runtime selected for the build. Monitor the
Tomcat log and confirm that the application context deploys without a JNDI
datasource error.

### Keep Tomcat available to a macOS browser

If Tomcat is started as a child of a short-lived terminal/tool session, that
process may be stopped when the session exits. For a persistent per-user
development server, run Tomcat as a `launchd` LaunchAgent. The plist should
invoke `catalina.sh run` and set `JAVA_HOME`, `JRE_HOME`, `CATALINA_HOME`, and
`CATALINA_BASE` to that user's Java 8 and Tomcat paths. Keep the password only
in the permission-restricted Tomcat context file, not in the plist.

For example, after creating a plist at
`$HOME/Library/LaunchAgents/org.openmaxims.oracle.tomcat.plist` with those
values and the standard `RunAtLoad`/`KeepAlive` keys, load and inspect it with:

```bash
launchctl bootstrap "gui/$(id -u)" \
  "$HOME/Library/LaunchAgents/org.openmaxims.oracle.tomcat.plist"
launchctl kickstart -k "gui/$(id -u)/org.openmaxims.oracle.tomcat"
launchctl print "gui/$(id -u)/org.openmaxims.oracle.tomcat"
curl -I http://127.0.0.1:18080/openMAXIMS/
```

To stop and unload the agent, use `launchctl bootout` with the same GUI domain
and plist path. `KeepAlive` restarts Tomcat if it exits; it does not make the
server available before the user logs into macOS.

The first useful server-level check is:

```text
http://<application-host>:<application-port>/openMAXIMS/
```

For the Standards Port browser smoke test, follow
[`16-standards-port-build-and-run.md`](16-standards-port-build-and-run.md) and
open the repository-owned `standards-port-launcher.html`. Do not use
`ideagz.html` for that test; it launches the historical client path.

The historical `CNHost` endpoint may reject a direct `GET`; that is not by
itself a deployment failure. The meaningful test is a real client request
through the application protocol.

In the 2026-10-18 repository-WAR deployment, these server-level checks
completed successfully against the local Oracle database:

- `GET /openMAXIMS/` returned HTTP 200;
- `GET /openMAXIMS/CNHost` returned the expected “GET method is not supported”
  response from the servlet;
- Tomcat deployed the repository WAR without the lab-only modern client files.

Tomcat also initialized the application Hibernate mappings and registered
forms/images. This confirms the app can start with the Oracle JNDI datasource
and serve requests. The first browser attempt used `ideagz.html`, which loads
the historical Legacy Bundle bootstrap and therefore remained on the loading
message in Safari. The working Standards Port route is the repository-owned
`standards-port-launcher.html` described in
[`16-standards-port-build-and-run.md`](16-standards-port-build-and-run.md);
it is packaged in the WAR separately from the historical launcher. That run
exposed and fixed the missing `logincontrol_newblue` module,
the login-surface clipping caused by zero-height `#__si_form` overflow, and
the New Blue theme z-index/layout rules. The same run also required the
`core_appuser`/`Admin` setup documented in the Standards Port guide. The
resulting browser smoke test reached authenticated Patient Search. The
historical launcher and Legacy Bundle remain unchanged.

## Initial smoke test

Using the repository-owned Standards Port launcher described in
[`16-standards-port-build-and-run.md`](16-standards-port-build-and-run.md),
verify in this order:

1. the login screen is returned;
2. login succeeds with the packaged local restoration credentials `user` /
   `pass` (role `Admin`), distinct from the Oracle schema credentials;
3. the authenticated navigation tree is returned;
4. Patient Search loads;
5. a known synthetic patient can be searched;
6. navigation to another basic form succeeds;
7. logout completes.

Record the exact application revision, Java and Tomcat versions, Oracle
version, SQL client and version, database scripts used, and any warnings.

Successful login and Patient Search establish a meaningful Oracle-backed
runtime, but do not establish that every module, report, scheduled job,
backup, restore, or clinical workflow works.

## Fresh-install reproducibility status

This is a manual feasibility guide, not yet a one-command Oracle installer or
a clean-room new-user proof. A prior local Oracle 19 run reached login and
Patient Search. In the 2026-10-18 rerun, the repository WAR built, the helper
prepared both scripts, the schema created 1,675 tables and all three sequences,
the seed ran with documented Oracle/T-SQL errors, and Tomcat returned HTTP 200
from the launcher plus the expected CNHost GET response. Login and Patient
Search were **not** re-tested in this run. The missing `Default` config group
had to be inserted manually; Quartz startup also reports missing Quartz tables
because their creation guards in the legacy seed use SQL Server syntax.

The tools repository's static Hibernate mapping inventory records 1,291
`native` identifier generators and two explicit `ORDER_SEQUENCE` mappings.
The Oracle seed reads `hibernate_sequence.NEXTVAL` before attempting to create
`ORDER_SEQUENCE`; these facts informed the schema helper's sequence checks.
Static mapping counts are not runtime proof. The helper and this runbook make
the observed prep repeatable, but every Oracle seed error must still be
reviewed, and fresh-user login remains unverified. No database credentials,
database files, or generated SQL output are included in Git.

## Known warnings and stop conditions

The previous Oracle-backed run reported non-blocking warnings involving:

- legacy Axis XML configuration;
- a Drools `wrong class format` warning;
- a RefMan scheduled-job path expecting the SQL Server JDBC driver.

Record these separately from failures in the smoke test.

Stop and document the result rather than inventing replacements if the run
requires:

- a missing proprietary driver or other unavailable component;
- an unexplained schema-load failure;
- a destructive database change whose effect is not understood;
- credentials or data that cannot be safely handled in the local environment.

## Reproducibility record

For each successful or failed run, record:

```text
Repository commit:
Operating system / architecture:
JDK version:
Ant version:
Tomcat version:
Oracle version / image:
Oracle service name:
SQL client and version:
Build command:
Schema command:
Reference-data procedure:
Smoke-test result:
Warnings and unresolved dependencies:
```

Do not record passwords, database dumps, datafiles, or private patient data.
