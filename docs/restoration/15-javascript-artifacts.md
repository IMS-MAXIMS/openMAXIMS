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

The JavaScript build concatenates the recorded Standards Port modules and
writes only `WebApp/packed/jscn.js.gz`. It never writes
`WebApp/packed-legacy/`.

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
WebApp/ideagz-legacy.html
    launcher that explicitly loads packed-legacy/jscn.js.gz
```

Legacy Source is a readable reconstruction, not a claim of byte-for-byte
original source. The Legacy Bundle is the historical executable reference.
Neither is overwritten by `build-javascript.sh` or the normal WAR build.

The Ramsay Reference remains private and is not part of this repository's
runtime or build inputs.
