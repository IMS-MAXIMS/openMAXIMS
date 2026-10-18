# IE7 client JavaScript source restoration

The original checkout contains a damaged JavaScript source distribution:
multiple files in `WebApp/jsCN/source/` and `WebApp/jsCN/source/build/files/`
are identical copies of a non-JavaScript blob. The packed client output is also
not treated as a trustworthy source archive.

This branch restores the readable modules for which we have a defensible
historical source reference:

- 70 modules recovered from the public `pacharanero/openmaxims-linux`
  source archive;
- one recovered navigation mixin copied to the historical filename
  `navigation-collapse-mixin.js`.

Eight additional modules have since been reconstructed from direct regions of
the historical packed bundle. They are documented separately as
bundle-derived reconstructions, not recovered source. The 27 bundle-derived candidate regions have since been promoted in
separately documented reconstruction commits. Four unresolved filenames still
require reconstruction. The active packed output is now rebuilt from the
Standards Port; the unchanged historical packed artifact is preserved
separately as the Legacy Bundle.

The recovered source is intended to restore the original source layout and
make provenance explicit. It is not a claim that every missing module or
packed artifact has been reconstructed.

## Current source layout

On the Standards Port branch, the two source trees are deliberately separate:

- `WebApp/jsCN/source/build/files/` contains the active Standards Port modules.
- `WebApp/jsCN/source/build/files-legacy/` contains the reconstructed Legacy
  Source for reference and comparison.

The active bundle is generated at `WebApp/packed/jscn.js.gz`; the preserved
Legacy Bundle is at `WebApp/packed-legacy/jscn.js.gz`.

The Standards Port is served from `WebApp/index.html`. The historical
`WebApp/ideagz.html` remains available in the same WAR as the Legacy Bundle
entrypoint, so developers can compare both clients without redirects.

## Four client artifacts

Use these names when discussing the browser client:

- **Legacy Bundle** — the preserved 2015-era packed client at
  `WebApp/packed-legacy/jscn.js.gz`. This file is an unchanged historical
  reference artifact.
- **Legacy Source** — the readable, evidence-based reconstruction under
  `WebApp/jsCN/source/build/files-legacy/`. It is maintainable source, but is not
  guaranteed to be byte-for-byte identical to the original source.
- **Standards Port** — a separate standards-browser implementation of the
  historical client. It is not the preserved IE7/IE8 implementation.
- **Ramsay Reference** — the private modern Ramsay client, used only as an
  authorised behavioural reference and not redistributed or used at build
  time.

The active Standards Port bundle is rebuilt explicitly with:

```sh
./build-javascript.sh
```

That command concatenates the recorded Standards Port module order and writes
only `WebApp/packed/jscn.js.gz`. The ordinary Java/Ant WAR build does not
compile JavaScript; it copies the existing `WebApp/packed/**` directory into
the WAR. Neither build overwrites
`WebApp/packed-legacy/jscn.js.gz`, which is the preserved Legacy Bundle.

## Theme separation

The active Standards Port uses the standalone New Blue Standards theme under:

```text
WebApp/themes/new-blue/
WebApp/packed/themes/css/new-blue.css.gz
WebApp/src/themes/new-blue/layout.html
```

Its standards layout rules are compiled into the primary stylesheet; the
application must not depend on a separately deployed override stylesheet. The
pre-port New Blue assets are retained under `themes-legacy/`,
`src/themes-legacy/`, and `packed-legacy/themes/` for preservation and
comparison.

`index.html` is the active Standards Port launcher.
`ideagz.html` remains the directly accessible historical launcher and
loads `packed-legacy/jscn.js.gz`.
