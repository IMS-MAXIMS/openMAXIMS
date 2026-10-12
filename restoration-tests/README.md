# MAXIMS restoration integration tests

This directory is new restoration infrastructure. It is **not part of the
historical MAXIMS application source**.

The persistence smoke test runs against a built and running WAR. It temporarily
injects one test-only servlet into the already-deployed exploded application
and exercises the
application's Hibernate domain layer:

1. create a synthetic patient;
2. commit it;
3. reload it in a fresh domain factory;
4. update it and commit;
5. reload the update in a fresh domain factory;
6. delete the synthetic patient.

The deployed `web.xml` and test class are restored/removed automatically. The
application source and original WAR are not changed. The existing application
context is used so legacy startup components are not started a second time.

## Safety

Use a disposable or dedicated test schema. This test writes and deletes data.
Do not point it at a production database or an irreplaceable development
schema. All connection settings are supplied through environment variables;
no credentials are stored in this repository.

## Oracle example

The following assumes the Java 8 build and Tomcat setup described in
`docs/restoration/05-oracle-application-setup.md` and a running Tomcat base:

```bash
export JAVA_HOME=/path/to/jdk8
export TOMCAT_HOME=/path/to/apache-tomcat-6.0.53
export CATALINA_BASE=/path/to/tomcat-base
export OPENMAXIMS_APP_DIR="$CATALINA_BASE/webapps/openMAXIMS"

./restoration-tests/run-persistence-smoke.sh
```

The test uses the datasource configured for the running application context.
For a future MySQL run, change the application context/build database
configuration; the test itself must remain the same.

The application context must be able to start normally. A Tomcat context that
fails during legacy servlet or scheduler startup cannot expose the test
endpoint; fix that runtime failure first rather than interpreting a timeout as
a database result.
