# IE7 structural module reconstructions

This commit adds the remaining twelve candidate regions currently available
from the historical bundle analysis:

- the five form-manager dialog/message/tab helpers;
- `genericcontainer.js` and `lightweightdom.js`;
- `simpleformdialog.js`;
- `themeabledialog.js`, `thememanager.js`, and `themesupport.js`.

These modules were assigned by structural responsibility rather than a unique
filename anchor. They are inferred reconstructions from the historical bundle,
not claims of original source recovery. Their comments, local names, and exact
source-file boundaries may not be recoverable after minification.

All promoted files parse as ES5 JavaScript. Runtime assembly remains unchanged
until dependency order, whole-client behaviour, and source-to-bundle
reproducibility are verified.
