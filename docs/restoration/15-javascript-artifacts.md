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

Rebuild the active JavaScript bundle with:

```sh
./build-javascript.sh
```

This concatenates the recorded Standards Port modules and writes only
`WebApp/packed/jscn.js.gz`. The Java/Ant WAR build copies the existing active
`WebApp/packed/` tree; it does not rebuild JavaScript and does not touch the
legacy artifacts.

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
