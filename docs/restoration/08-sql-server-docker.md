# SQL Server Docker setup for openMAXIMS

This guide prepares a disposable Microsoft SQL Server instance for local
openMAXIMS restoration work.  It is intended for development and testing, not
production deployment.

The original project documentation names SQL Server 2008 R2 and SQL Server
2012, uses the `MSQ05` Ant database target, and supplies SQL Server-specific
DDL and reference-data scripts.  This guide uses SQL Server 2022 Developer
Edition as the first modern test target.  Compatibility with the historical
application still has to be demonstrated by the build and smoke tests.

## Apple Silicon warning

This procedure is being run on an Apple Silicon Mac.  SQL Server's Linux
container image is an `linux/amd64` image, so Docker Desktop must run it using
x86-64 emulation:

```text
--platform linux/amd64
```

Microsoft documents SQL Server containers as supported on Intel/AMD x86-64
Linux hosts, not under Rosetta, QEMU, or other emulation.  Therefore a
successful Apple Silicon run is useful restoration evidence, but is not an
officially supported SQL Server deployment.  If emulation causes unexplained
failures, repeat the test on a real x86-64 Linux host.

## Requirements

- Docker Desktop, with Docker running;
- a working internet connection for the Microsoft container image;
- enough disk space for SQL Server and its data volume;
- a strong local development password;
- DBeaver or another SQL Server-capable client for executing scripts.

SQL Server Developer Edition is free for development, testing, and
demonstration.  It must not be used for production workloads.

Check that Docker is available and confirm the host architecture:

```bash
uname -m
docker version
```

On this restoration machine, `uname -m` is expected to report `arm64`.

## Create the SQL Server container

Create a named Docker volume first.  The volume keeps the database when the
container is stopped or recreated:

```bash
docker volume create openmaxims-mssql-data
```

Create the container.  Replace the example password with a private password;
do not commit it to the repository or paste it into a tracked file.  Avoid
including the container, database, or login name in the password: SQL Server's
password policy can reject an otherwise complex password for being too
similar to the login name.

```bash
docker run -d \
  --platform linux/amd64 \
  --name openmaxims-mssql \
  -e ACCEPT_EULA=Y \
  -e MSSQL_PID=Developer \
  -e MSSQL_SA_PASSWORD='Use-A-Strong-Password1!' \
  -p 1433:1433 \
  -v openmaxims-mssql-data:/var/opt/mssql \
  mcr.microsoft.com/mssql/server:2022-latest
```

Follow the startup log until SQL Server is ready:

```bash
docker logs -f openmaxims-mssql
```

In another terminal, confirm that the container remains running:

```bash
docker ps --filter name=openmaxims-mssql
docker port openmaxims-mssql
```

The expected host mapping is:

```text
0.0.0.0:1433 -> 1433/tcp
```

On the Apple Silicon restoration machine, the image was pulled and started
successfully under emulation.  The tested image reported:

```text
SQL Server 2022 (RTM-CU27) 16.0.4295.3
Developer Edition (64-bit) on Linux (Ubuntu 22.04.5 LTS)
```

The container can be stopped and started without losing data:

```bash
docker stop openmaxims-mssql
docker start openmaxims-mssql
```

Do not use `docker rm -v` unless the database is intentionally disposable.

## Connect and create the application database

Connect to the SQL Server instance with DBeaver or another SQL Server client:

```text
Host:       localhost
Port:       1433
Database:   master
Username:   sa
Password:   the private MSSQL_SA_PASSWORD value
```

Use the client's **script execution** mode, not a single-statement execute
button.  The historical project scripts contain `GO` batch separators and
must be executed with SQL Server-aware delimiter handling.

The current Microsoft image also includes `sqlcmd` at
`/opt/mssql-tools18/bin/sqlcmd`.  It is optional; DBeaver or another
SQL Server-capable client is equally valid.  When using this bundled client
against the container's self-signed development certificate, add `-C` to
trust that certificate for the local connection.

As `sa`, create a project database, login, database user, and the role named
by the supplied DDL.  Choose a different password for the application login.
The names below are defaults for this guide and can be changed consistently.

```sql
CREATE DATABASE openMAXIMS
    COLLATE SQL_Latin1_General_CP1_CI_AS;
GO

USE openMAXIMS;
GO

CREATE LOGIN openMAXIMS
    WITH PASSWORD = 'Choose-A-Strong-App-Password1!';
GO

CREATE USER openMAXIMS FOR LOGIN openMAXIMS;
GO

CREATE ROLE ims_dml;
GO

ALTER ROLE ims_dml ADD MEMBER openMAXIMS;
GO
```

The original DDL grants table DML permissions to `ims_dml`; do not replace
this role with an invented application privilege model while reproducing the
historical setup.

## Prepare and load the historical schema

The repository contains the original SQL Server schema here:

```text
Source Library/database/DDL-scripts-ref147-openMAXIMS.sql
```

The unchanged file cannot be applied directly to modern SQL Server.  The
first restoration attempt exposed two historical generator assumptions:

- the very wide `core_patient` table must be assembled with one column at a
  time;
- generated constraint and index names are repeated across mappings, whereas
  SQL Server requires those names to be unique within the schema.

Generate a separate compatibility script with the repository tool:

```bash
python3 restoration-tests/sqlserver/prepare-ddl.py \
  --input "Source Library/database/DDL-scripts-ref147-openMAXIMS.sql" \
  --output "$HOME/openmaxims-workspace/DDL-scripts-ref147-openMAXIMS-mssql.sql"
```

The tool makes only those mechanical changes.  It does not edit the original
DDL, change table or column types, or invent application tables.  Execute the
generated file against the `openMAXIMS` database as an administrative account.
It remains a SQL Server batch script and includes `GO` separators.  Do not use
the Oracle reference-data script for this database.

The initial modern SQL Server run produced 1,675 tables and 3,489 foreign-key
constraints from the prepared script.  Record the counts from your own run.

The script is historical and large.  Record the SQL client name/version,
execution duration, errors, and final table count.  Do not silently ignore
errors.  Some statements may assume the original SQL Server version or a
particular fresh-database ordering; those failures belong in the restoration
failure inventory.

## Load SQL Server reference data

The project-specific SQL Server reference data is:

```text
Source Library/openmaxims_workspace/WebApp/MAXIMS_RefDataMSQ05.sql
```

Execute it against `openMAXIMS` after the schema.  Use a SQL Server-aware
script executor and record all errors and row counts.  Keep the original file
unchanged; any compatibility transformation must be a separate, reviewable
restoration script.

The historical file begins with a UTF-8 BOM and contains three exact duplicate
single-line inserts into `core_appform_menuaction`.  Prepare it without
modifying the source:

```bash
python3 restoration-tests/sqlserver/prepare-reference-data.py \
  --input "Source Library/openmaxims_workspace/WebApp/MAXIMS_RefDataMSQ05.sql" \
  --output "$HOME/openmaxims-workspace/MAXIMS_RefDataMSQ05-mssql.sql"
```

Execute the generated file as an administrative account.  This preparation
does not deduplicate different rows or alter multi-line statements.  It seeds
the primary default user as `user` with password `pass`, and renames the
second placeholder default username to `user2`, because the SQL Server
schema's unique username index rejects duplicate usernames while preserving
both historical user IDs and role rows.

A persistent Docker volume retains the existing `core_appuser` rows when the
container is stopped or restarted. Changing the repository seed script or the
packaged XML configuration does not migrate an already-seeded database. If an
existing restoration database contains older local credentials, rebuild or
reseed that database before testing, and verify the resulting application
user rows.

## Values for the application runtime

The historical Ant build selects the SQL Server path with:

```text
dbtype=MSQ05
```

Its connection properties are:

```text
Database host:     localhost
Database port:     1433
Database name:     openMAXIMS
Database user:     openMAXIMS
Database password: the private application-login password
JDBC driver:       com.microsoft.sqlserver.jdbc.SQLServerDriver
JDBC URL:          jdbc:sqlserver://localhost:1433;databaseName=openMAXIMS
Hibernate dialect: org.hibernate.dialect.SQLServerDialect
```

The application login is separate from the SQL Server database login. Every
restoration database uses this disposable application administrator:

```text
Username: user
Password: pass
Role:     Admin
```

Do not use these credentials for a real deployment.

The application build includes the historical driver asset:

```text
Source Library/apps/SQLServerJdbc.jar
```

That historical driver is part of the original application dependency set,
but it cannot negotiate with the tested SQL Server 2022 image.  The first
Tomcat start failed during the JDBC pre-login exchange with:

```text
The server version is not supported. The target server must be SQL Server 2000 or later.
```

This is a driver/server-generation incompatibility, not a schema or login
failure.  For a modern SQL Server development run, download a Microsoft
`mssql-jdbc` release that still provides a Java 8 jar (for example, the
`12.10.1.jre8` artifact) and place it in the **runtime Tomcat base** `lib`
directory.  Do not replace the historical jar in the Git checkout or add the
downloaded vendor jar to the repository without a separate licensing and
compatibility review.  Do not leave both jars active: they contain the same
JDBC driver classes and the older one may be selected first.

Example, using Maven Central only as a download source:

```bash
mkdir -p "$CATALINA_BASE/lib"
curl -fL -o "$CATALINA_BASE/lib/mssql-jdbc-12.10.1.jre8.jar" \
  https://repo1.maven.org/maven2/com/microsoft/sqlserver/mssql-jdbc/12.10.1.jre8/mssql-jdbc-12.10.1.jre8.jar
mv "$CATALINA_BASE/lib/SQLServerJdbc.jar" \
   "$CATALINA_BASE/lib/SQLServerJdbc.jar.historical" 2>/dev/null || true
```

The exact driver version, download URL, checksum, Java compatibility, and
licence should be recorded for a reproducible local run.  Keep credentials,
the downloaded driver, and Tomcat context configuration outside Git.

## Verify before changing application code

Before diagnosing application behaviour, capture this database-only evidence:

```sql
SELECT @@VERSION;
SELECT DB_NAME();
SELECT COUNT(*) AS table_count
FROM INFORMATION_SCHEMA.TABLES
WHERE TABLE_TYPE = 'BASE TABLE';
```

Then run the repository's SQL Server build and persistence smoke test with the
same host, port, database, user, and password.  A failure should be classified
as one of:

1. container or emulation startup;
2. database creation or permissions;
3. historical schema/reference-data script;
4. JDBC driver or application configuration;
5. application/Hibernate runtime behaviour.

Do not modify the shared ORM or database support code until the lower layers
have been checked and the failure has been recorded.

## Resetting the disposable database

To destroy and recreate the database completely:

```bash
docker rm -f openmaxims-mssql
docker volume rm openmaxims-mssql-data
```

Then repeat this guide from the container-creation step.  This is useful when
a partially applied historical script has left the database in an unknown
state.

## Current verification status

The following setup steps have been executed successfully on the Apple
Silicon restoration machine:

- Docker Desktop 29.8.1 on an `arm64` host;
- SQL Server 2022 `2022-latest`, forced to `linux/amd64`;
- SQL Server 16.0.4295.3 Developer Edition;
- named data volume `openmaxims-mssql-data`;
- host port `1433` mapped to container port `1433`;
- database `openMAXIMS` with `SQL_Latin1_General_CP1_CI_AS`;
- login/user `openMAXIMS` and database role `ims_dml`;
- application user confirmed able to connect and is a member of `ims_dml`;
- prepared DDL applied successfully: 1,675 tables and 3,489 foreign keys.
- prepared reference data applied successfully: 1,780 forms, 150 navigation
  forms, 20 navigation groups, 1,305 lookup types, and 2,874 lookup
  instances.
- historical `SQLServerJdbc.jar` rejected SQL Server 2022 during pre-login;
  Microsoft `mssql-jdbc-12.10.1.jre8.jar` succeeded in the Java 8 runtime.
- the WAR built successfully with Java 8, Ant 1.10.18, and Tomcat 6.0.53
  libraries; the isolated runtime served `/openMAXIMS/` with HTTP 200.
- `restoration-tests/run-persistence-smoke.sh` passed against the SQL Server
  datasource: create, reload, update, reload, and delete.

The SQL Server schema has now been loaded from the generated compatibility
script, followed by the prepared reference-data script.  The application was
then built with Java 8 and deployed to an isolated Tomcat 6.0.53 base using
the Java-8-compatible Microsoft JDBC driver described above.  `GET
/openMAXIMS/` returned HTTP 200 and the repository persistence smoke test
passed, including create, reload, update, reload, and delete of a synthetic
patient.

This demonstrates the restored SQL Server persistence path for the tested
versions.  It does not certify every module, scheduled job, report, or
clinical workflow.

The first unchanged schema-load attempt against SQL Server 2022 CU27 failed
with:

```text
Msg 102, Level 15, State 1
Incorrect syntax near 'varchar'.
```

Batch isolation showed that the failure occurs while creating
`core_patient`, at the `timeofdeat varchar(255)` portion of that historical
DDL statement.  The source DDL has not been edited.  The first reference-data
attempt then exposed the source file's UTF-8 BOM and three exact duplicate
`core_appform_menuaction` inserts.  A subsequent run also exposed the
duplicate `xxxxx` default username; the preparation tool handles these issues
without modifying the source files.  The prepared schema and reference data
now load successfully with the recorded counts above.
