# IE7 bundle-derived JavaScript modules

This commit promotes eight additional client modules reconstructed from direct
regions of the historical packed IE7 bundle:

- `container.js`
- `deploy.js`
- `designcanvas.js`
- `formdialog.js`
- `logincontrol_newblue.js`
- `messagebox.js`
- `selectrole_newblue.js`
- `version.js`

The source files are formatted reconstructions of bundle regions. They are not
claimed to preserve the original source comments, local variable names, or
module boundaries. Their provenance is the historical bundle whose SHA-256 is:

```text
f7ba5ac4e4abafd19c8ccbb8a867ad917bde5f3aef4b79f719d4e0221cdeb9da
```

Each region had a direct candidate boundary in the private reconstruction
workspace and parses successfully as ES5 JavaScript. Bundle-derived offsets and
private extraction metadata remain outside this repository.

After this commit, the reconstruction inventory is:

- 71 recovered modules from the historical public fork;
- 15 bundle-derived reconstructed modules (8 direct-boundary and 7 named-anchor);
- 12 additional candidate regions still under review;
- 4 unresolved modules: `designgrid.js`, `focusmanager.js`,
  `forminit-single.js`, and `minitest.js`.

The packed runtime bundle is unchanged. These source modules are not promoted
to the runtime build until assembly order, dependency behaviour, and clean
source-to-bundle reproduction have been verified.
