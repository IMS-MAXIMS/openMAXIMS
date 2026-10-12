# Oracle runtime verification

Status: verified local feasibility runtime; not a production deployment.

## Result

The application has been run locally against Oracle 19 in Docker using:

```text
Oracle service: localhost:1521/ORCLPDB1
Application server: Apache Tomcat 6
JDK: Java 8
Application: openMAXIMS WAR from upstream commit f59654c5f
```

The verified request path was:

```text
CNHost client request
  -> Tomcat 6
  -> openMAXIMS application
  -> JNDI datasource
  -> Oracle 19
```

The application successfully:

- displayed the login screen;
- authenticated through the real CNHost servlet;
- returned an authenticated navigation tree;
- loaded the Patient Search form;
- completed subsequent authenticated navigation requests;
- displayed a synthetic patient record.

This establishes a working Oracle-backed application path beyond static WAR
deployment. It does not certify all modules, scheduled jobs, reports, or
clinical workflows.

## Standard local administrator

Restoration builds use the same disposable administrator account regardless of
database vendor:

```text
Username: admin
Password: password1
Role:     Admin
```

This is a deliberately documented development credential for local restoration
only. Change or remove it before any non-disposable deployment. The account is
defined in the packaged `configuration.xml`; the database reference-data
seed also gives the primary `core_appuser` row the `admin` username.

## Required local configuration

The application discovers a datasource below the Tomcat JNDI namespace
`java:comp/env/jdbc/*`. The safe template is:

```xml
<Resource name="jdbc/maxims" auth="Container" type="javax.sql.DataSource"
          driverClassName="oracle.jdbc.driver.OracleDriver"
          url="jdbc:oracle:thin:@//${ORACLE_HOST}:${ORACLE_PORT}/${ORACLE_SERVICE}"
          username="${ORACLE_USER}" password="${ORACLE_PASSWORD}"
          maxActive="100" maxIdle="30" maxWait="30000"/>
```

Credentials must remain in an untracked local Tomcat configuration. Do not
copy the working password or database volume into this repository.

## Schema and reference data

The Oracle schema was generated from the historical Hibernate metadata and
loaded into Oracle 19. The generated output required two local, mechanical
corrections:

- quote a small number of identifiers beginning with digits;
- split a small number of long SQL*Plus physical lines.

`MAXIMS_RefDataORA.sql` was then loaded. The remaining fresh-install noise was
understood and documented in the local runtime notes: SQL Server conditional
constraint drops, a backup-table reference, a UTF-8 BOM, duplicate menu rows,
and placeholder default-user rows.

The test database contained only synthetic data, including a patient named
`test test`.

## Compatibility limitations

The WAR contains an old Oracle JDBC driver. Oracle 19 rejected it under the
default authentication policy, so the disposable Oracle container's
authentication settings were relaxed for this experiment and the local test
account was reset. This is acceptable only for isolated development and must
not be copied into a production security configuration.

Known non-blocking warnings included:

- a legacy Axis XML configuration warning;
- a Drools rules-engine `wrong class format` warning;
- a RefMan scheduled-job path expecting the SQL Server JDBC driver.

These warnings require separate investigation. They do not invalidate the
verified login and Patient Search path.

## Next Oracle work

The next Oracle-focused verification should be reproducible and incremental:

1. Script the schema-generation corrections without committing generated SQL.
2. Script the reference-data load and record expected harmless errors.
3. Build the WAR from a clean checkout using `build-java8.sh`.
4. Deploy it to a disposable Tomcat instance using the JNDI template.
5. Run a small matched smoke-test suite: login, navigation, patient search,
   patient creation/update, and logout.
6. Test scheduled jobs and reports separately, recording failures rather than
   treating the interactive path as full support.

No credentials, Oracle datafiles, database dumps, HARs, or private browser
assets belong in this repository.
