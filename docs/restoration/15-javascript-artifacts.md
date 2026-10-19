# JavaScript client artifact layout

The WebApp contains two deliberately separate client paths.

## Active development path

```text
WebApp/jsCN/source/build/files/
    Standards Port source
WebApp/jsCN/source/build/bin/standards-build-order.json
    recorded active module order
WebApp/packed/jscn.js.gz
    generated active bundle
WebApp/jsCN/source/build/files/forminit.js
    Standards Port bootstrap used by the active build artifacts
WebApp/themes/new-blue/
    standalone New Blue Standards theme
```

Rebuild the active JavaScript bundle directly with:

```sh
./build-javascript.sh
```

The supported full build is:

```sh
./build-java8.sh openMAXIMSwarfile
```

`build-java8.sh` runs the JavaScript build first, then invokes Ant. This keeps
the WAR's active bundle synchronized with the Standards Port source. It also
honours `OPENMAXIMS_WORKSPACE` when building an external workspace.

The recorded Standards Port module order includes the New Blue login control
(`logincontrol_newblue.js`), which is required when the server selects the
`new-blue` theme. The JavaScript build concatenates these modules into `WebApp/packed/jscn.js.gz`
and regenerates the packed Standards Port CSS. It never writes
`WebApp/packed-legacy/`.

The checked-in `ideagz.html` still loads the historical `jsCN/forminit.js`
bootstrap and is not the working Standards Port browser entry point. The
standards-browser run uses the repository-owned `index.html`,
documented in [`16-standards-port-build-and-run.md`](16-standards-port-build-and-run.md).
It loads the Standards Port bootstrap and active packed bundle from this
checkout. The top-level `jsCN/forminit.js` remains the IE-specific Legacy Bundle
bootstrap and uses `window.attachEvent`; do not load it from the Standards Port
launcher. `ideagz.html` remains paired with the Legacy Bundle and its
historical bootstrap. The Ant static-content allowlist packages the two
launchers separately.

## Preservation path

```text
WebApp/jsCN/source/build/files-legacy/
    evidence-based reconstructed Legacy Source
WebApp/packed-legacy/jscn.js.gz
    unchanged 2015-era Legacy Bundle
WebApp/themes-legacy/new-blue/
    preserved pre-port theme assets
WebApp/src/themes-legacy/new-blue/layout.html
    preserved pre-port theme layout
WebApp/ideagz.html
    launcher that explicitly loads packed-legacy/jscn.js.gz
```

Legacy Source is a readable reconstruction, not a claim of byte-for-byte
original source. The Legacy Bundle is the historical executable reference.
Neither is overwritten by `build-javascript.sh` or the normal WAR build.

The Ramsay Reference remains private and is not part of this repository's
runtime or build inputs.

## Build and run the preserved IE7 client

The default profile is `OPENMAXIMS_CLIENT=standards`. To build the Java server
and WAR with the **Legacy Bundle**, use a separate external workspace:

```bash
cd /path/to/openMAXIMS
export JAVA_HOME=/path/to/jdk8
export TOMCAT_HOME=/path/to/apache-tomcat-6.0.53
export OPENMAXIMS_WORKSPACE="$(mktemp -d "$HOME/openmaxims-legacy-workspace.XXXXXX")"
cp -a "Source Library/openmaxims_workspace/." "$OPENMAXIMS_WORKSPACE/"
OPENMAXIMS_CLIENT=legacy ./build-java8.sh -Ddbtype=ORA \
  -DdbHost=127.0.0.1 -DdbPort=1521 -DdbName=ORCLPDB1 \
  -Duserid=build-only -Dpassword=build-only openMAXIMSwarfile
python3 restoration-tests/check-legacy-client.py \
  "$OPENMAXIMS_WORKSPACE/WebApp/openMAXIMS.war"
```

The legacy profile stages the preserved JavaScript, packed New Blue CSS,
images and server-supplied theme layout into their historical serving paths
**only inside the external workspace**. It also copies the preserved launcher
to `index.html` for the root welcome URL, while retaining `ideagz.html`, so the
original `1280.html`, `1024.html` and `full-screen.html` wrappers select the
Legacy Bundle. It skips the Standards Port JavaScript
build. This packages the preserved executable; it does not claim a reproducible
build of the reconstructed Legacy Source.

A legacy-staged workspace cannot be reused for a Standards Port build. Create
a new workspace for each profile. The script rejects staging the legacy
profile into the source checkout.

Deploy the resulting WAR using the Java/JNDI/database and macOS LaunchAgent
procedure in [the build/run guide](16-standards-port-build-and-run.md). Use a
separate Tomcat base and free HTTP, shutdown and AJP ports if running both
profiles. Use a distinct LaunchAgent label and plist filename, for example
`org.openmaxims.legacy.tomcat` and
`~/Library/LaunchAgents/org.openmaxims.legacy.tomcat.plist`; set that agent's
`CATALINA_BASE` and log paths to the legacy base. Do not copy the legacy WAR
over a running Standards Port deployment. Both profiles use the same server
code and database account setup.

In the Windows XP/IE7 guest, open the wrapper (example legacy HTTP port 18081):

```text
http://<Mac-host-address>:18081/openMAXIMS/1280.html
```

Allow that wrapper's popup. The historical launcher requires a window name
starting with `ims`; opening `ideagz.html` directly may close the page.
The Standards Port direct launcher is intentionally absent from the legacy
profile WAR. The default WAR includes preserved assets for reference, but the
legacy profile is required to select the preserved **server theme layout** as
well as the preserved script/CSS. A different script URL alone is insufficient.

For a server/assets check of the deployed legacy profile:

```bash
python3 restoration-tests/check-legacy-client.py \
  "$OPENMAXIMS_WORKSPACE/WebApp/openMAXIMS.war" \
  --url http://127.0.0.1:18081/openMAXIMS/
```

This checks artifact bytes and a CNHost theme response. Actual IE7 rendering,
login and interaction must be verified in the VM; Chrome cannot validate the
IE-only event/XML/VML behavior.

### Verification — 2026-10-18

Both profile WAR builds completed successfully. The legacy-profile WAR and
its deployment on HTTP18081 matched the preserved JavaScript, packed CSS,
IE bootstrap, launcher, 616 theme images and server layout; a CNHost theme
request returned the preserved layout (with CNHost's line-break removal).
The Standards Port on HTTP18080 independently passed browser login with
`user`/`pass`, Patient Search layout/dark-blue surface, logout and no uncaught
JavaScript exceptions. Preserved Legacy Bundle, Legacy Source, theme and
bootstrap files remained unchanged in the source checkout. IE7 interaction
has not been retested in the VM by this check.
