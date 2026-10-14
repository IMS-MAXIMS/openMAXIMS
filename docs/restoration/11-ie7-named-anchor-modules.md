# IE7 named-anchor module reconstructions

This commit adds seven additional bundle-derived modules identified by named
historical bundle anchors:

- `controlshadow.js`
- `designmode.js`
- `designmodemixin.js`
- `designmodewrapper.js`
- `objectmodel-mixins.js`
- `progressbar.js`
- `tabcontainer.js`

These are lower-confidence than the direct-boundary batch. The named anchor
identifies a responsibility region, but the original source-file boundary is
not independently recoverable from the packed bundle. The files are therefore
inferred reconstructions, not claims of original source recovery.

All seven parse as ES5 JavaScript. They remain outside the runtime packaging
until dependency order and behaviour are verified against the historical client.
