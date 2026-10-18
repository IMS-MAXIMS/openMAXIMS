#!/bin/sh
set -eu

# Build the active Standards Port bundle. The historical Legacy Bundle is
# preserved separately under WebApp/packed-legacy/ and is never touched.
ROOT="$(CDPATH= cd -- "$(dirname -- "$0")" && pwd)"
WORKSPACE="${OPENMAXIMS_WORKSPACE:-$ROOT/Source Library/openmaxims_workspace}"
WEBAPP="$WORKSPACE/WebApp"
BUILD="$WEBAPP/jsCN/source/build"
ORDER="$BUILD/bin/standards-build-order.json"
OUT="$WEBAPP/packed/jscn.js.gz"

python3 - "$BUILD/files" "$ORDER" "$OUT" "$WEBAPP" <<'PY'
import gzip
import json
import sys
from pathlib import Path

files = Path(sys.argv[1])
order_path = Path(sys.argv[2])
if not order_path.is_file():
    raise SystemExit(
        "Incomplete or older Standards Port workspace: " + str(files.parents[4])
        + "\nMissing build-order file: " + str(order_path)
        + "\nCreate a new OPENMAXIMS_WORKSPACE and copy the entire "
        "'Source Library/openmaxims_workspace/.' directory from this checkout."
        + "\nDo not copy just the manifest into an older source tree. "
        "See docs/restoration/16-standards-port-build-and-run.md, section 3."
    )
order = json.loads(order_path.read_text(encoding="utf-8"))["modules"]
output = Path(sys.argv[3])
parts = []
for name in order:
    path = files / name
    if not path.is_file():
        raise SystemExit(f"missing Standards Port module: {path}")
    parts.append(path.read_bytes())
joined = b"\n".join(parts) + b"\n"
output.parent.mkdir(parents=True, exist_ok=True)
with output.open("wb") as raw:
    with gzip.GzipFile(fileobj=raw, mode="wb", compresslevel=9, mtime=0) as stream:
        stream.write(joined)
print(f"wrote {output} ({len(joined)} uncompressed bytes)")
PY

# The Standards Port loads packed CSS; regenerate it from the editable theme.
python3 - "$WEBAPP" <<'PYTHEME'
import gzip
import sys
from pathlib import Path
webapp = Path(sys.argv[1])
source = webapp / "themes/new-blue/css/allthemestyles.css"
output = webapp / "packed/themes/css/new-blue.css.gz"
output.parent.mkdir(parents=True, exist_ok=True)
with output.open("wb") as raw:
    with gzip.GzipFile(filename="", fileobj=raw, mode="wb", compresslevel=9, mtime=0) as stream:
        stream.write(source.read_bytes())
print(f"wrote {output} from {source}")
PYTHEME
