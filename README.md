openMAXIMS - home of the openMAXIMS PAS/EPR
===========================================

---

This project aims to restore the openMAXIMS source so that it can be compiled and run on modern hardware. This is restoration of 2015-era code, at the time it was open-sourced, and it should not be assumed that any of this code represents the current state of the IMSMaxims codebase.

---

## Building and local development

The Java application can be compiled and packaged with the documented Java 8
build setup. Tomcat is a separate servlet/JSP dependency; it does not supply
Java. Database provisioning is also separate from WAR compilation.

**For the restored modern-browser application (the Standards Port), start with the
[Standards Port build and run guide](docs/restoration/16-standards-port-build-and-run.md).**
It records the complete procedure, including the repository-owned launcher,
New Blue theme/bootstrap requirements, no-popup launch, macOS `launchd`
Tomcat persistence, Oracle JNDI setup, and
the disposable `user` / `pass` application administrator. **Do not use
`ideagz.html` for the Standards Port; it remains available for direct IE7
comparison against the same server. The application root and `index.html` both
open the Standards Port.**

For the preserved 2015 IE7 client, use the separate
[Legacy Bundle build/run profile](docs/restoration/15-javascript-artifacts.md#build-and-run-the-preserved-ie7-client).

The underlying restoration references are:

- [Java 8 build and new-machine setup](docs/restoration/01-build-java8.md)
- [Oracle Docker prerequisites](docs/restoration/04-oracle-docker-prerequisites.md)
- [Oracle-backed application setup](docs/restoration/05-oracle-application-setup.md)

These guides describe a development/restoration environment, not production
deployment or clinical-safety certification.

---

##Clinical Safety

IMS MAXIMS provides absolutely no guarantee of the Clinical Safety of this software program.  Users of this software do so entirely at their own risk. IMS MAXIMS only ensures the Clinical Safety of unaltered run-time software that it builds, deploys and maintains.

If any Clinical Safety issue is discovered IMS MAXIMS will issue a Clinical Safety Notice.  It is therefore a requirement of your use of this source code that you send your contact details to openmaxims-user@imsmaxims.com so that you may receive Clinical Safety Notices.

---
