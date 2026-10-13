# IE7 design-grid reconstruction

`designgrid.js` was not a standalone named region in the historical packed
bundle. Its implementation is embedded after the design-canvas code as the
`CNDesignGridMixin` registration and `IDStringTypeCell` definition, ending
immediately before `CN_flash`.

This commit extracts that contiguous responsibility region into the expected
`designgrid.js` filename. It is a bundle-derived reconstruction, not a claim
that the original source file had this exact boundary or formatting.

The historical bundle provides direct evidence for the extracted code and the
file parses as ES5 JavaScript. The remaining unresolved files are
`focusmanager.js`, `forminit-single.js`, and `minitest.js`.
