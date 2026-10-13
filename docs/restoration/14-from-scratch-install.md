# From-scratch local installation

This is the shortest complete installation path for a newcomer who wants to
run the restored historical IE7 client on a modern Apple Silicon Mac, using
SQL Server in Docker and an XP/IE VM under UTM.

This is a disposable development installation. It is **not** a production
installation and must use synthetic or explicitly authorised data only.

The tested versions are:

```text
Host:       macOS on Apple Silicon (arm64)
Database:   SQL Server 2022 Developer, linux/amd64 under Docker emulation
Java:       Java 8
Ant:        Apache Ant 1.10.x
Servlet:    Tomcat 6.0.53 libraries and runtime
Browser:    IE7/IE8 in an XP VM
```

The application login created by the restoration seed is:

```text
Username: user
Password: pass
Role:     Admin
```

Do not use those credentials outside this disposable restoration environment.

## 1. Install host prerequisites

Install Docker Desktop and ensure Docker is running. Install Git, Homebrew,
Ant, and a Java 8 JDK. On a Mac with Homebrew, the tool installation is:

```bash
brew install git ant
brew install --cask temurin@8
```

Confirm Java 8 is selected:

```bash
/usr/libexec/java_home -V
export JAVA_HOME="$(/usr/libexec/java_home -v 1.8)"
"$JAVA_HOME/bin/java" -version
ant -version
docker version
uname -m
```

The Java version must be 8. Do not use a modern JDK for this historical build.
On macOS, the cask installer may request administrator approval through
`sudo`; approve that prompt in a normal Terminal session.
The SQL Server container is an x86-64 image and must use Docker emulation on
Apple Silicon.

Download and unpack Apache Tomcat 6.0.53 from the Apache archive. Keep it in a
persistent location rather than `/tmp`:

```bash
mkdir -p "$HOME/openmaxims-tools"
curl -fL -o "$HOME/openmaxims-tools/apache-tomcat-6.0.53.tar.gz" \
  https://archive.apache.org/dist/tomcat/tomcat-6/v6.0.53/bin/apache-tomcat-6.0.53.tar.gz
tar -xzf "$HOME/openmaxims-tools/apache-tomcat-6.0.53.tar.gz" \
  -C "$HOME/openmaxims-tools"
export TOMCAT_HOME="$HOME/openmaxims-tools/apache-tomcat-6.0.53"
```

`TOMCAT_HOME` supplies the historical build's servlet/JSP APIs and shared
libraries. `CATALINA_BASE`, introduced below, is the runnable application
instance. Do not confuse the two.

## 2. Obtain the source

Clone the repository and check out the restoration branch or commit being
validated:

```bash
cd "$HOME"
git clone https://github.com/jsmcx/openMAXIMS.git openMAXIMS
cd "$HOME/openMAXIMS"
git switch restoration/original-runtime-pre-js
```

If that branch has not yet been pushed to the fork, use the restoration commit
provided by the project maintainer instead.

Keep the Git checkout as source only. The historical Ant build writes generated
classes, metadata, and the WAR into a separate persistent workspace:

```bash
export OPENMAXIMS_WORKSPACE="$HOME/openmaxims-workspace"
mkdir -p "$OPENMAXIMS_WORKSPACE"
cp -a "Source Library/openmaxims_workspace/." "$OPENMAXIMS_WORKSPACE/"
```

## 3. Create a fresh SQL Server database

Choose a private SQL Server administrator password. Keep it in the current
shell only; do not put it in Git:

```bash
export MSSQL_SA_PASSWORD='Choose-A-Strong-Password1!'
export MSSQL_APP_PASSWORD='Choose-Another-Strong-Password1!'
```

Create the emulated SQL Server container:

```bash
docker volume create openmaxims-mssql-data
docker run -d \
  --platform linux/amd64 \
  --name openmaxims-mssql \
  -e ACCEPT_EULA=Y \
  -e MSSQL_PID=Developer \
  -e MSSQL_SA_PASSWORD="$MSSQL_SA_PASSWORD" \
  -p 1433:1433 \
  -v openmaxims-mssql-data:/var/opt/mssql \
  mcr.microsoft.com/mssql/server:2022-latest
```

Wait until SQL Server accepts connections. The image's `sqlcmd` path is
usually `/opt/mssql-tools18/bin/sqlcmd`:

```bash
until docker exec openmaxims-mssql /bin/bash -lc \
  '/opt/mssql-tools18/bin/sqlcmd -C -S localhost -U sa \
   -P "$MSSQL_SA_PASSWORD" -Q "SELECT 1"' >/dev/null 2>&1; do
  sleep 2
done
```

Create the application database and SQL login. This is the **database** login,
not the openMAXIMS application login:

```bash
docker exec -i openmaxims-mssql /bin/bash -lc \
  '/opt/mssql-tools18/bin/sqlcmd -C -S localhost -U sa \
   -P "$MSSQL_SA_PASSWORD"' <<SQL
CREATE DATABASE openMAXIMS COLLATE SQL_Latin1_General_CP1_CI_AS;
GO
USE openMAXIMS;
GO
CREATE LOGIN openMAXIMS WITH PASSWORD = '$MSSQL_APP_PASSWORD';
GO
CREATE USER openMAXIMS FOR LOGIN openMAXIMS;
GO
CREATE ROLE ims_dml;
GO
ALTER ROLE ims_dml ADD MEMBER openMAXIMS;
GO
SQL
```

## 4. Load the historical schema and reference data

Prepare the scripts without modifying the historical originals:

```bash
mkdir -p "$OPENMAXIMS_WORKSPACE/sqlserver"
python3 restoration-tests/sqlserver/prepare-ddl.py \
  --input "Source Library/database/DDL-scripts-ref147-openMAXIMS.sql" \
  --output "$OPENMAXIMS_WORKSPACE/sqlserver/DDL-mssql.sql"
python3 restoration-tests/sqlserver/prepare-reference-data.py \
  --input "Source Library/openmaxims_workspace/WebApp/MAXIMS_RefDataMSQ05.sql" \
  --output "$OPENMAXIMS_WORKSPACE/sqlserver/ReferenceData-mssql.sql"
```

Copy the generated files into the container and execute them with SQL Server's
batch-aware `sqlcmd`:

```bash
docker cp "$OPENMAXIMS_WORKSPACE/sqlserver/DDL-mssql.sql" \
  openmaxims-mssql:/tmp/DDL-mssql.sql
docker cp "$OPENMAXIMS_WORKSPACE/sqlserver/ReferenceData-mssql.sql" \
  openmaxims-mssql:/tmp/ReferenceData-mssql.sql

docker exec openmaxims-mssql /bin/bash -lc \
  '/opt/mssql-tools18/bin/sqlcmd -C -S localhost -U openMAXIMS \
   -P "$MSSQL_APP_PASSWORD" -d openMAXIMS -i /tmp/DDL-mssql.sql'
docker exec openmaxims-mssql /bin/bash -lc \
  '/opt/mssql-tools18/bin/sqlcmd -C -S localhost -U openMAXIMS \
   -P "$MSSQL_APP_PASSWORD" -d openMAXIMS -i /tmp/ReferenceData-mssql.sql'
```

The prepared reference data creates the application users `user` and `user2`.
Verify the primary row before continuing:

```bash
docker exec openmaxims-mssql /bin/bash -lc \
  '/opt/mssql-tools18/bin/sqlcmd -C -S localhost -U sa \
   -P "$MSSQL_SA_PASSWORD" -d openMAXIMS -W -s "|" \
   -Q "SET NOCOUNT ON; SELECT id, username, c_passwo, encodedpas FROM core_appuser ORDER BY id;"'
```

The first row must show `user`, the SHA-1/base64 value for `pass`, and `pass`.

## 5. Build the WAR

Build from the repository root using Java 8 and the Tomcat libraries:

```bash
export JAVA_HOME="$(/usr/libexec/java_home -v 1.8)"
export TOMCAT_HOME="$HOME/openmaxims-tools/apache-tomcat-6.0.53"
./build-java8.sh openMAXIMSwarfile
```

The WAR is written to:

```text
$OPENMAXIMS_WORKSPACE/WebApp/openMAXIMS.war
```

The build may emit existing deprecation, unchecked-code, internal-API, and
Ant `includeantruntime` warnings. The required result is `BUILD SUCCESSFUL`.

## 6. Create a clean Tomcat runtime

Use a persistent Tomcat base separate from the Tomcat library installation:

```bash
export CATALINA_BASE="$HOME/openmaxims-tomcat-sqlserver"
mkdir -p "$CATALINA_BASE"
cp -a "$TOMCAT_HOME/." "$CATALINA_BASE/"
mkdir -p "$CATALINA_BASE/deployment-backups"
```

Install the modern Java 8-compatible Microsoft JDBC driver in the shared
Tomcat library directory. Do not leave the historical incompatible driver
active alongside it:

```bash
curl -fL -o "$TOMCAT_HOME/lib/mssql-jdbc-12.10.1.jre8.jar" \
  https://repo1.maven.org/maven2/com/microsoft/sqlserver/mssql-jdbc/12.10.1.jre8/mssql-jdbc-12.10.1.jre8.jar
mv "$TOMCAT_HOME/lib/SQLServerJdbc.jar" \
   "$TOMCAT_HOME/lib/SQLServerJdbc.jar.historical" 2>/dev/null || true
```

Create the local, untracked JNDI context:

```bash
mkdir -p "$CATALINA_BASE/conf/Catalina/localhost"
cat > "$CATALINA_BASE/conf/Catalina/localhost/openMAXIMS.xml" <<XML
<Context>
  <Resource name="jdbc/maxims" auth="Container" type="javax.sql.DataSource"
    driverClassName="com.microsoft.sqlserver.jdbc.SQLServerDriver"
    url="jdbc:sqlserver://127.0.0.1:1433;databaseName=openMAXIMS;encrypt=false"
    username="openMAXIMS" password="$MSSQL_APP_PASSWORD"
    maxActive="100" maxIdle="30" maxWait="30000" />
  <Environment name="QuartzDbDriver" type="java.lang.String"
    value="com.microsoft.sqlserver.jdbc.SQLServerDriver" override="false" />
  <Environment name="QuartzDbUrl" type="java.lang.String"
    value="jdbc:sqlserver://127.0.0.1:1433;databaseName=openMAXIMS;encrypt=false" override="false" />
  <Environment name="QuartzDbUsername" type="java.lang.String"
    value="openMAXIMS" override="false" />
  <Environment name="QuartzDbPassword" type="java.lang.String"
    value="$MSSQL_APP_PASSWORD" override="false" />
  <Environment name="AuditEnabled" type="java.lang.Boolean"
    value="false" override="false" />
</Context>
XML
```

Use port 8080 unless it is already occupied. Configure the HTTP connector in
`$CATALINA_BASE/conf/server.xml` to listen on all interfaces. Do not add an
`address="127.0.0.1"` attribute when the XP VM must connect.

Deploy only the new WAR. Do not leave an old exploded `openMAXIMS/` directory
inside `webapps`, because Tomcat will serve it instead of the current WAR:

```bash
if [ -e "$CATALINA_BASE/webapps/openMAXIMS" ]; then
  mv "$CATALINA_BASE/webapps/openMAXIMS" \
     "$CATALINA_BASE/deployment-backups/openMAXIMS.$(date +%Y%m%d%H%M%S)"
fi
cp "$OPENMAXIMS_WORKSPACE/WebApp/openMAXIMS.war" \
   "$CATALINA_BASE/webapps/openMAXIMS.war"
```

## 7. Start and verify

Stop any previous Tomcat launch agent before starting this one. Then start
Tomcat with Java 8:

```bash
export JAVA_HOME="$(/usr/libexec/java_home -v 1.8)"
export CATALINA_HOME="$HOME/openmaxims-tools/apache-tomcat-6.0.53"
export CATALINA_BASE="$HOME/openmaxims-tomcat-sqlserver"
"$CATALINA_HOME/bin/catalina.sh" start
```

Wait for `CNHost servlet started` and `Server startup` in:

```text
$CATALINA_BASE/logs/catalina.out
```

Verify from the Mac:

```bash
curl --connect-timeout 5 --max-time 20 -I \
  http://127.0.0.1:8080/openMAXIMS/
curl --connect-timeout 5 --max-time 20 -I \
  http://192.168.128.1:8080/openMAXIMS/
```

Both should return HTTP `200`. From the XP VM, open:

```text
http://192.168.128.1:8080/openMAXIMS/
```

Use the application credentials `user` / `pass`. The historical client is
intended to be tested in IE7/IE8; Safari may display only the loading page
because the entrypoint uses IE conditional comments.

## 8. Reset everything and repeat

This destroys the SQL Server database and the local Tomcat deployment. It does
not delete the Git checkout or the persistent Java/Tomcat downloads:

```bash
"$CATALINA_HOME/bin/catalina.sh" stop || true
docker rm -f openmaxims-mssql
docker volume rm openmaxims-mssql-data
```

Then return to step 3. To perform a clean application build, remove and
recreate `$OPENMAXIMS_WORKSPACE` before step 5. Keep passwords, JDBC drivers,
Tomcat context files, and generated workspaces outside Git.
