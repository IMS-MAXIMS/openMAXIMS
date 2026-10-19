#!/usr/bin/env python3
"""Prepare the historical SQL Server reference-data script.

The source file is retained unchanged. This preparation removes its UTF-8
BOM, which old SQL Server tooling treated as SQL text, and removes only exact
duplicate single-line INSERT statements. The latter are redundant duplicate
rows in the historical reference-data file and otherwise violate the modern
SQL Server primary key on ``core_appform_menuaction``. The historical default user block contains redacted placeholder credentials.
The restoration seed makes the first user the standard local administrator
(`user` / `pass`) and gives the second historical row a distinct username.
The same credentials are also present in the packaged XML login configuration.
"""

from __future__ import annotations

import argparse
import re
from pathlib import Path


def prepare(source: Path, destination: Path) -> tuple[int, int, int]:
    lines = source.read_text(encoding="utf-8-sig").splitlines()
    seen: set[str] = set()
    output: list[str] = []
    removed = 0
    renamed_default_user = 0
    seeded_admin_user = 0

    for line in lines:
        normalized = re.sub(r"\s+", " ", line.strip().lower())
        if normalized == "values(1,0,0, 'xxxxx','xxxxx', 'xxxxx', 'blue', 1)":
            line = line.replace("'xxxxx','xxxxx', 'xxxxx'", "'user','nU4eI71bcnBGqeO0t9tXvY1u5oQ=', 'pass'")
            seeded_admin_user += 1
        elif normalized == "values(2,0,0, 'xxxxx','xxxxx', 'xxxxx', 'blue', 1)":
            line = line.replace("'xxxxx','xxxxx', 'xxxxx'", "'user2','nU4eI71bcnBGqeO0t9tXvY1u5oQ=', 'pass'")
            renamed_default_user += 1
        if normalized.startswith("insert into ") and " values " in normalized:
            if normalized in seen:
                removed += 1
                continue
            seen.add(normalized)
        output.append(line)

    destination.parent.mkdir(parents=True, exist_ok=True)
    destination.write_text("\n".join(output) + "\n", encoding="utf-8")
    return removed, renamed_default_user, seeded_admin_user


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--input", required=True, type=Path)
    parser.add_argument("--output", required=True, type=Path)
    args = parser.parse_args()

    removed, renamed_default_user, seeded_admin_user = prepare(args.input, args.output)
    print(f"removed exact duplicate single-line INSERTs: {removed}")
    print(f"renamed duplicate default username: {renamed_default_user}")
    print(f"seeded standard local user: {seeded_admin_user}")
    print(f"wrote: {args.output}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
