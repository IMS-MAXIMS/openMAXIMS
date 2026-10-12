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

It must be installed in the Tomcat instance's shared library directory before
the application starts. With a separate `CATALINA_BASE`, use its `lib`
directory; otherwise use the Tomcat installation's `lib` directory:

```bash
export CATALINA_BASE='<path to the Tomcat instance>'
cp -p "$WORKSPACE/WebApp/WEB-INF/lib/OracleJdbc.jar" \
      "$CATALINA_BASE/lib/"
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
In the known Oracle 19 restoration, a small number of numeric-leading
identifiers required quoting and a small number of long statements required
line reformatting for the selected SQL client. Keep those corrections as a
reviewable local patch or script; do not silently edit the historical source.

Before applying the file, inspect the generated SQL and preserve a copy of
the unmodified output for comparison.

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

Execute, in order:

1. the corrected Oracle schema generated as `$WORKSPACE/DomainObjects/create_schema.sql`;
2. `$WORKSPACE/WebApp/MAXIMS_RefDataORA.sql`;
3. any separately required lookup or application seed scripts identified by
   the restoration notes.

Use the chosen client's documented **script execution** operation rather than
assuming that a particular command-line client is installed. Confirm how it
handles PL/SQL blocks, statement delimiters, errors, and file encoding before
loading the large reference-data file.

The known Oracle 19 load produced some expected fresh-install noise, including
SQL Server-style conditional constraint drops, a backup-table reference, a
UTF-8 BOM, duplicate menu rows, and placeholder default-user rows. Record the
client, version, row counts, errors, and any local corrections used. Do not
ignore new errors without investigating them.

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
database's default authentication policy. This is acceptable only for an
isolated development database; do not weaken authentication policy in a
production environment without understanding the security consequences.

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

The first useful checks are:

```text
http://<application-host>:<application-port>/openMAXIMS/
http://<application-host>:<application-port>/openMAXIMS/ideagz.html
```

The historical `CNHost` endpoint may reject a direct `GET`; that is not by
itself a deployment failure. The meaningful test is a real client request
through the application protocol.

In the first clean repository-WAR deployment, these server-level checks
completed successfully:

- `GET /openMAXIMS/` returned HTTP 200;
- `GET /openMAXIMS/CNHost` returned the expected “GET method is not supported”
  response from the servlet;
- Tomcat deployed the repository WAR without the lab-only modern client files.

This confirms that the Java application is starting and serving requests. It
does not yet replace the authenticated smoke test below.

## Initial smoke test

Using the historical client or another compatible test client, verify in this
order:

1. the login screen is returned;
2. login succeeds with a test account;
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
