# openMAXIMS restoration baseline

**Baseline date:** 2026-10-12  
**Repository:** `https://github.com/IMS-MAXIMS/openMAXIMS`  
**Local fork:** `https://github.com/jsmcx/openMAXIMS`  
**Baseline scope:** the unmodified checkout at the exact commit recorded below.

This document freezes what was received before restoration work. It deliberately
separates facts in the upstream checkout from findings made later during local
build and JavaScript investigations.

## 1. Exact upstream revision

- **Commit:** `f59654c5fb733ea0c4f9e84edc7573fd08e4271c`
- **Commit date:** 2017-04-28 11:00:01 +0100
- **Commit subject:** `Applications/Libraries for openMAXIMS 10.5`
- **Branch at baseline:** `master`
- **Working tree:** clean

The repository history identifies the immediately preceding release-related
commit as `2cf3d8e4bd68efe3606d30727051287e0a584904` (`Version 10.5.6`,
2016-10-28). The baseline itself is the later 2017 application/library
snapshot, not a separately tagged release.

## 2. Original release and source identifiers

The checkout identifies itself as **openMAXIMS release 10.5**:

- `README.md`: “openMAXIMS release 10.5”; described as the version live at
  Taunton and Somerset NHS Trust.
- `README.txt`: 17 December 2015 major updated release, release 10.5.
- `Source Library/openmaxims_workspace/WebApp/src/configuration.xml`:
  `MAXIMS` version `10.5.3.17`, dated `08/10/2015 17:26`, by Barbara Worwood.
- `Source Library/openmaxims_workspace/DevBuildNumber`: Ant build number `45`
  (dated 14 December 2015).
- Database filenames identify the database baseline as `ref147` and the
  associated reference-data script as `rel147`:
  - `database/DDL-scripts-ref147-openMAXIMS.sql`
  - `database/Reference-Data-scripts-rel147-openMAXIMS.sql`

The top-level README says this release superseded an archived original source
code set after “many hundreds of enhancements, bug fixes and other changes.”
The workspace also contains that older tree at
`Source Library/openmaxims_workspace-archive/`, whose build number is `6`.

## 3. Original source/archive condition

The expected readable Client Framework source location is:

```text
Source Library/openmaxims_workspace/WebApp/jsCN/source/build/files/*.js
```

At this baseline it contains **102 JavaScript filenames**, but all 102 files
have the same SHA-256:

```text
a06fcf1eb430b378fbb484a81d7a1c8ee8cdcb3d2f69195ef4f9a339c3506afa
```

The content is a Java source blob for `ims.webservice.MAXIMSWebService`, not
JavaScript. Therefore the readable module source is missing/corrupted; these
files must not be treated as valid JS source.

The following nominal source/build artifacts have the same corruption pattern
and are not valid archives or usable source in this checkout:

- `WebApp/jsCN/source/sources.zip`
- `WebApp/jsCN/source/new-blue.css.sources.zip`
- `WebApp/jsCN/debug/jscn.js`

The usable historical browser artifact is instead:

```text
WebApp/packed/jscn.js.gz
```

Its recorded SHA-256 is:

```text
80246402e61f0e276bac0035e6c67cf3820546ca9f8c65fcfb7cd775129fbc2a
```

Decompressing it produces 957,764 bytes with SHA-256:

```text
f7ba5ac4e4abafd19c8ccbb8a867ad917bde5f3aef4b79f719d4e0221cdeb9da
```

`jsCN/forminit.js` remains a separate readable bootstrap file. Its existence
does not repair the missing module source set.

### Restoration consequence

The baseline client can be preserved and analysed as a packed artifact, but a
source-level JavaScript restoration must record provenance separately. It must
not silently replace the 102 damaged files with deminified or bundle-derived
code and call that the original upstream source.

## 4. Original documented build requirements

The supplied documentation describes a Windows build using:

- JDK **1.5.0_22** (Windows i586; the final Java 5 release listed in the
  documentation).
- Apache Ant **1.6.5**.
- Apache Jakarta Tomcat **5.5.9**.
- A system-wide `TOMCAT_HOME` environment variable.
- `jta.jar` and `SQLServerJdbc.jar` copied into Tomcat's common library
  directory.
- The workspace path set in
  `openmaxims_workspace/WebApp/WebAppBuild.xml`.
- `setenv.bat` configured for the local installation.
- `build_openMAXIMS.bat` run from a DOS prompt after `setenv.bat`.

The documented output is `openMAXIMS.war` in
`openmaxims_workspace/WebApp/`; the documentation describes that WAR as the
complete deployable application with runtime dependencies.

The repository also contains convenience installers/archives for JDK 6u45,
Tomcat 7.0.68, Ant 1.6.5, and related libraries. Their presence does not
change the original documented build recipe above.

The build is Ant-based and predates Maven/Gradle. `WebAppBuild.xml` defaults
to `dbtype=MSQ05` and contains placeholder values for workspace, database
host/port/name, user, and password. Those values must be set for a real
installation.

## 5. Original database requirements

The documented primary target is:

- **Microsoft SQL Server 2008 R2 or SQL Server 2012**
- Microsoft JDBC v3 driver
- SQL Server Management Studio 2008 is used in the database-creation guide

The supplied database guide specifies, in summary:

1. Create a SQL Server database (examples use `maxims_uat`, `maxims_train`, or
   `maxims_prod`).
2. Use `SQL_Latin1_General_CP1_CI_AS` collation.
3. A full recovery model is recommended.
4. Create the `openMAXIMS` SQL login/user and the `ims_dml` database role.
5. Apply `DDL-scripts-ref147-openMAXIMS.sql`; the guide says this creates 1,371
   tables.
6. Apply `Reference-Data-scripts-rel147-openMAXIMS.sql`.

The application uses Hibernate as its database-independence layer. The
README says Oracle and MySQL may also be supported, but require configuration
code changes; the build files contain configuration branches for SQL Server,
Oracle, Sybase, and HSQLDB. This should not be read as proof that each backend
is deployable from the baseline without further work.

Deployment also requires site-specific credentials/configuration. The supplied
“Further details” document calls out database credentials in the SQL Server or
Oracle reference-data scripts, HL7 credentials in `WEB-INF/web.xml`, NHS PDS/
eRS values in `cabgw_configuration.xml`, and system-admin password settings.
Those values are intentionally not reproduced here.

## 6. Known missing or corrupted files

The principal known corruption is the complete 102-file JavaScript module set
described in §3. The nominal `sources.zip`, debug bundle, and CSS source archive
are also invalid copies of the same blob.

The packed JavaScript bundle is present and hashable, but it is a generated
artifact rather than a substitute for the missing readable modules. No claim
is made here that every later module filename can be recovered from it without
additional provenance work.

Other files may be absent from the original distribution, but no additional
missing-file claim is made in this baseline without a direct build or manifest
failure identifying it.

## 7. Known build failures at baseline

A later controlled build investigation against this checkout identified the
following failures in the unmodified source/build inputs:

1. **Four Java public-class/file-name mismatches** in the
   `EmergencyEpisodeLite` value-object cluster. The lowercase filenames do not
   match their PascalCase public classes.
2. **Invalid unused import** `sun.misc.Sort` in
   `Clinical/src/ims/clinical/forms/outpatientcliniclist/Logic.java`.
3. **WAR entry-count failure** when a modern Ant packages the full application:
   the WAR contains approximately 106,000 entries and exceeds the classic ZIP
   65,535-entry limit. The original documented Ant 1.6.5 may behave differently;
   this has not been treated as evidence that the unmodified build is portable
   to modern tooling.
4. **Case-sensitive path risk:** a build reference uses `Racpc` while the
   workspace directory is `RACPC`. This is tolerated by default case-insensitive
   macOS filesystems but is a failure risk on case-sensitive systems.

These are build findings, not restoration edits. The baseline checkout remains
unmodified. A successful build after applying fixes must be recorded as a
separate dated experiment, with the exact patch and toolchain.

## 8. Original supported-browser assumptions

The original web client assumes Microsoft Internet Explorer:

- `ideagz.html` sets `X-UA-Compatible: IE=EmulateIE8`.
- It uses IE conditional comments and VML markup for the loading presentation.
- Its non-IE branch displays: “This application requires Internet Explorer 7
  or higher.”
- The documented/implemented compatibility target is therefore **Internet
  Explorer 7 or higher**, with the page explicitly requesting IE8 emulation.

The baseline does not claim support for Safari, Chrome, Firefox, Edge, or other
standards-based browsers. The damaged JavaScript source also prevents a clean
source-level audit of all browser-specific assumptions; the packed artifact
contains extensive IE-specific runtime dependencies.

## 9. Licensing information

The repository distributes the openMAXIMS software under the **GNU Affero
General Public License, version 3 (AGPL-3.0)**. The authoritative license text
is present in:

- `LICENCE.TXT`
- `Source Library/LICENCE.TXT`

`Source Library/README.TXT` states that most software copyright is owned by IMS
MAXIMS and that bundled third-party components retain their own copyright and
license terms. The repository includes separate/bundled third-party libraries
and installers; each component's license must be checked before redistribution.
The AGPL notice is not a blanket relicensing statement for those third-party
components.

The README also includes an explicit clinical-safety disclaimer and asks users
to provide contact details to IMS MAXIMS for Clinical Safety Notices. This
baseline records that notice; it does not constitute a safety assessment.

## 10. Restoration rules

- Preserve this exact commit and the original packed artifact hashes.
- Keep the corrupted files as evidence until a replacement has independently
  documented provenance.
- Do not publish private HARs, modern proprietary bundles, patient data, or
  bundle-derived private offsets as if they were upstream source.
- Record every restoration or build fix in a later numbered document under
  `docs/restoration/`, including tool versions, commands, hashes, and whether
  the result is source recovery, reconstruction, or a local compatibility fix.
