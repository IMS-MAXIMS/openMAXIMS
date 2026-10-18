# Oracle database prerequisites

This guide describes how to create a disposable Oracle database for local
openMAXIMS development and restoration work.

It is deliberately independent of any particular SQL client. DBeaver,
SQL Developer, SQL*Plus, an Oracle-compatible command-line tool, or another
client may be used where this guide asks you to submit SQL.

This guide does **not** yet create the openMAXIMS schema, load openMAXIMS
reference data, configure Tomcat, or start the application. Those steps belong
to the application setup guide that follows it.

## Important warnings

- Oracle Database is proprietary software, not part of this repository, and is
  subject to Oracle's licence terms.
- Download Oracle software directly from Oracle and review the applicable
  terms before use.
- Do not commit Oracle installation archives, database files, credentials,
  database dumps, or application logs.
- Use synthetic or explicitly authorised data only.
- The commands below are for an isolated development database, not production.

## Requirements

Install or obtain:

- Docker Desktop or another Docker-compatible runtime;
- Git;
- an Oracle-capable SQL client of your choice;
- sufficient disk space for the Oracle installation archive, image, and data
  volume.

### Selecting the Oracle installation archive

Use the archive matching the CPU architecture of the database container you
intend to build:

- Apple Silicon / Linux ARM64: `LINUX.ARM64_1919000_db_home.zip`;
- x86-64: the corresponding Oracle Database 19c Linux x86-64 archive.

Oracle's current container-image documentation describes both the required
installation archive and ARM64 support. Do not unpack the archive before
placing it in the Docker build directory.

References:

- <https://github.com/oracle/docker-images/tree/main/OracleDatabase/SingleInstance>
- <https://www.oracle.com/database/technologies/oracle19c-linux-arm64-downloads.html>
- <https://www.oracle.com/database/technologies/oracle-database-software-downloads.html>

The openMAXIMS restoration has been exercised with an Oracle 19c container.
This guide intentionally does not require a particular PDB name such as
`ORCLPDB1`.

## Build the Oracle container image

Clone Oracle's public Docker build scripts somewhere outside the openMAXIMS
checkout:

```bash
git clone https://github.com/oracle/docker-images.git
cd docker-images/OracleDatabase/SingleInstance/dockerfiles
```

Place the downloaded, still-compressed Oracle 19c database archive in:

```text
docker-images/OracleDatabase/SingleInstance/dockerfiles/19.3.0/
```

Build an Enterprise Edition image:

```bash
./buildContainerImage.sh -v 19.3.0 -e
```

The resulting image is normally tagged:

```text
oracle/database:19.3.0-ee
```

The Docker build repository is only needed to build the image. It may be
removed afterwards if the image was built successfully and is available
locally.

## Create a persistent database container

Choose local values for the container name, administrative password, host port,
and Docker volume. For example:

```bash
docker run -d \
  --name <container_name> \
  -e ORACLE_PWD='<choose_a_local_password>' \
  -p <host_port>:1521 \
  -v <docker_volume_name>:/opt/oracle/oradata \
  oracle/database:19.3.0-ee
```

For a first local installation, a typical choice is host port `1521`, but the
port may be changed if it is already in use.

The Docker volume preserves the database data independently of the container.
The container can later be stopped and started without recreating the database:

```bash
docker stop <container_name>
docker start <container_name>
```

On first startup, Oracle needs several minutes to initialise the database.
Monitor the container output using Docker's logs facility or the equivalent
Docker Desktop log view:

```bash
docker logs -f <container_name>
```

Continue only after the database reports that startup and pluggable-database
creation have completed. The exact completion message can vary by image
version.

## Identify the connection details

Use the values chosen when creating the container:

```text
Host:          <database_host>
Port:          <host_port>
Service name:  <pdb_service_name>
```

The service name is determined by the Oracle image and its initialisation
configuration. Do not assume that it is `ORCLPDB1`; inspect the container's
startup output or database configuration if a different value is reported.

The administrative account supplied by the image can be used to create a
separate application schema. Do not run the application as `SYS` or another
administrative account.

## Create an application schema

Connect to the pluggable database with an administrative account using any
Oracle-capable SQL client. Supply the host, port, service name, administrative
username, password, and administrative role required by that client.

Submit the following SQL after replacing the placeholders with local values:

```sql
SELECT role FROM dba_roles WHERE role = 'IMS_DML';
```

If the query returns no rows, create the legacy role once as an administrator:

```sql
CREATE ROLE IMS_DML;
```

Then create the application account and grant it this role:

```sql
CREATE USER <application_user> IDENTIFIED BY "<application_password>";
GRANT CONNECT, RESOURCE TO <application_user>;
GRANT UNLIMITED TABLESPACE TO <application_user>;
GRANT IMS_DML TO <application_user>;
```

If `IMS_DML` already exists, do not run `CREATE ROLE` again. The generated schema grants table
privileges to `IMS_DML`, so the role must exist before loading the schema.

The password is shown only as a placeholder. Choose a local password that
meets the Oracle installation's password policy and keep it outside the
repository.

Verify the account using the same SQL client:

```sql
SELECT username FROM dba_users;
```

Then create a new connection as the application user and verify that it can
connect to the intended service. Use the normal, non-administrative role for
that connection.

## Client-neutral SQL guidance

The restoration process will later provide SQL files for the openMAXIMS schema
and reference data. Execute those files using a client that supports Oracle
script execution.

Do not assume that every client interprets SQL*Plus commands, substitution
variables, PL/SQL blocks, or script delimiters identically. Before loading a
large file, confirm how the chosen client handles:

- statement terminators;
- PL/SQL blocks;
- comments and blank lines;
- script files containing multiple statements;
- errors and continuation behaviour;
- character encoding.

Record the client and version used for a reproducible restoration, but do not
put client-specific commands in this prerequisite guide.

## Connection information for the application

The later Tomcat configuration will need a JNDI datasource with values
equivalent to:

```text
driver:       oracle.jdbc.driver.OracleDriver
host:         <database_host>
port:         <host_port>
service:      <pdb_service_name>
user:         <application_user>
password:     <application_password>
```

The corresponding JDBC URL has this form:

```text
jdbc:oracle:thin:@//<database_host>:<host_port>/<pdb_service_name>
```

Do not commit the completed connection settings. Keep passwords in a local,
untracked Tomcat configuration.

## Cleanup

To stop the database while preserving its data:

```bash
docker stop <container_name>
```

To remove only the container while retaining the database volume:

```bash
docker rm <container_name>
```

The volume must be deliberately removed separately. Treat that operation as
destructive because it deletes the database files and any locally loaded
schema or test data.

## Expected outcome

At the end of this guide, a newcomer should have:

1. a locally built Oracle 19c Docker image;
2. a persistent, running Oracle container;
3. a known host/port/service connection;
4. a separate application database user; and
5. a chosen SQL client capable of executing the later restoration scripts.

The next guide should use these connection details to generate or load the
openMAXIMS schema, load Oracle reference data, configure Tomcat, and run the
application smoke test.
