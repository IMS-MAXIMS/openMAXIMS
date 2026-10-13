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

The remaining 31 historical filenames are deliberately unchanged. They need
reconstruction from a historical bundle or another source archive and must not
be represented as recovered source. The packed `jscn.js` and compressed output
are likewise unchanged by this commit.

The recovered source is intended to restore the original source layout and
make provenance explicit. It is not a claim that every missing module or
packed artifact has been reconstructed.
