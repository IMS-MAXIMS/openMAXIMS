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

python3 - "$BUILD/files" "$ORDER" "$OUT" <<'PY'
import gzip
import json
import sys
from pathlib import Path

files = Path(sys.argv[1])
order = json.loads(Path(sys.argv[2]).read_text(encoding="utf-8"))["modules"]
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
