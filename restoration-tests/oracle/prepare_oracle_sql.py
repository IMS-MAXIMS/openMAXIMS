#!/usr/bin/env python3
"""Prepare generated openMAXIMS Oracle SQL without editing its source artifact.

Usage:
  python3 prepare_oracle_sql.py schema INPUT.sql OUTPUT.sql
  python3 prepare_oracle_sql.py seed INPUT.sql OUTPUT.sql

The schema mode applies the Oracle 19/SQL*Plus compatibility corrections
observed during the local restoration: quote numeric-leading identifiers,
replace the three SQL Server OBJECT_ID sequence guards with Oracle dictionary
checks, and wrap unusually long physical lines. Seed mode removes only a UTF-8
BOM, which SQL*Plus otherwise interprets as stray input. This is not a general
T-SQL-to-Oracle converter.
"""

from __future__ import annotations

import argparse
import re
from pathlib import Path


def prepare_schema(source: str) -> str:
    sequence_names = ("AUDIT_SEQUENCE", "ORDER_SEQUENCE", "hibernate_sequence")
    for sequence in sequence_names:
        pattern = (
            r"begin\s+if\s+object_id\('hibernate_sequence'\)\s+is\s+null\s+then\s+"
            r"execute\s+immediate\s+'create\s+sequence\s+"
            + re.escape(sequence)
            + r"\s+cache\s+100';\s+end\s+if;\s+end;\s*/"
        )
        replacement = (
            "declare\n  sequence_count number;\nbegin\n"
            "  select count(*) into sequence_count from user_sequences where sequence_name = '"
            + sequence.upper()
            + "';\n  if sequence_count = 0 then\n    execute immediate 'create sequence "
            + sequence
            + " cache 100';\n  end if;\nend;\n/"
        )
        source, count = re.subn(pattern, replacement, source, flags=re.IGNORECASE)
        if count != 1:
            raise ValueError(
                f"Expected one generated {sequence} OBJECT_ID guard, found {count}; "
                "the source schema may have changed."
            )

    # Hibernate emits a few unquoted identifiers starting with underscore + digit.
    source = re.sub(
        r'(?<![A-Za-z0-9_$#])(_[0-9]+[A-Za-z0-9_$#]*)',
        lambda match: '"' + match.group(1).upper() + '"',
        source,
    )

    # Keep all original tokens and split only at whitespace for SQL*Plus.
    wrapped = []
    for line in source.splitlines():
        while len(line) > 180:
            split_at = line.rfind(" ", 0, 181)
            if split_at < 1:
                raise ValueError("Cannot safely wrap an overlong SQL line")
            wrapped.append(line[:split_at])
            line = "  " + line[split_at + 1 :]
        wrapped.append(line)
    return "\n".join(wrapped) + "\n"


def prepare_seed(source: bytes) -> bytes:
    return source[3:] if source.startswith(b"\xef\xbb\xbf") else source


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("kind", choices=("schema", "seed"))
    parser.add_argument("input", type=Path)
    parser.add_argument("output", type=Path)
    args = parser.parse_args()

    if args.kind == "schema":
        args.output.write_text(prepare_schema(args.input.read_text(errors="replace")))
    else:
        args.output.write_bytes(prepare_seed(args.input.read_bytes()))
    print(f"Prepared {args.kind}: {args.output}")


if __name__ == "__main__":
    main()
