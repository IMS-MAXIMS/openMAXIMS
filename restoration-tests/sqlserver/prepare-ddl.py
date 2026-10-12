#!/usr/bin/env python3
"""Prepare the historical openMAXIMS SQL Server DDL for modern SQL Server.

The source DDL is retained unchanged. This generates a separate script for
the restoration environment because modern SQL Server rejects two historical
properties of the source file:

* the very wide ``core_patient`` CREATE TABLE statement;
* duplicate constraint and index names from different generated mappings.

This is a mechanical compatibility transformation, not a replacement schema.
"""

from __future__ import annotations

import argparse
import re
from collections import Counter
from pathlib import Path


def split_columns(body: str) -> list[str]:
    """Split a table body on commas outside type parentheses."""

    parts: list[str] = []
    start = 0
    depth = 0
    for index, character in enumerate(body):
        if character == "(":
            depth += 1
        elif character == ")":
            depth -= 1
        elif character == "," and depth == 0:
            parts.append(body[start:index].strip())
            start = index + 1
    parts.append(body[start:].strip())
    return parts


def split_core_patient(lines: list[str]) -> tuple[list[str], int]:
    """Split core_patient into one CREATE and one ALTER per column."""

    output: list[str] = []
    replacements = 0
    for line in lines:
        if not line.lower().startswith("create table core_patient "):
            output.append(line)
            continue

        body = line[line.index("(") + 1 : line.rindex(")")]
        parts = split_columns(body)
        columns = [part for part in parts if not part.upper().startswith("CONSTRAINT ")]
        constraints = [part for part in parts if part.upper().startswith("CONSTRAINT ")]
        if len(columns) < 2 or len(constraints) != 1:
            raise ValueError("unexpected core_patient DDL shape")

        output.extend([f"create table core_patient ({columns[0]})", "go"])
        for column in columns[1:]:
            output.extend([f"alter table core_patient add {column}", "go"])
        output.extend([f"alter table core_patient add {constraints[0]}", "go"])
        replacements += 1

    if replacements != 1:
        raise ValueError(f"expected one core_patient table, found {replacements}")
    return output, replacements


def uniquify_names(text: str) -> tuple[str, int, int]:
    """Suffix repeated constraint and index names in the generated script."""

    constraint_counts: Counter[str] = Counter()

    def constraint_replacement(match: re.Match[str]) -> str:
        prefix, name = match.group(1), match.group(2)
        constraint_counts[name] += 1
        occurrence = constraint_counts[name]
        return prefix + (name if occurrence == 1 else f"{name}_{occurrence}")

    text = re.sub(
        r"(?i)(\b(?:CONSTRAINT|ADD\s+CONSTRAINT)\s+)([A-Za-z0-9_]+)",
        constraint_replacement,
        text,
    )

    index_counts: Counter[str] = Counter()

    def index_replacement(match: re.Match[str]) -> str:
        prefix, name = match.group(1), match.group(2)
        index_counts[name] += 1
        occurrence = index_counts[name]
        return prefix + (name if occurrence == 1 else f"{name}_{occurrence}")

    text = re.sub(
        r"(?i)(\bCREATE\s+(?:UNIQUE\s+)?INDEX\s+)([A-Za-z0-9_]+)",
        index_replacement,
        text,
    )

    return (
        text,
        sum(count - 1 for count in constraint_counts.values()),
        sum(count - 1 for count in index_counts.values()),
    )


def prepare(source: Path, destination: Path) -> tuple[int, int, int]:
    lines = source.read_text(encoding="utf-8-sig").splitlines()
    lines, table_replacements = split_core_patient(lines)
    text, renamed_constraints, renamed_indexes = uniquify_names("\n".join(lines) + "\n")
    destination.parent.mkdir(parents=True, exist_ok=True)
    destination.write_text(text, encoding="utf-8")
    return table_replacements, renamed_constraints, renamed_indexes


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--input", required=True, type=Path)
    parser.add_argument("--output", required=True, type=Path)
    args = parser.parse_args()

    tables, constraints, indexes = prepare(args.input, args.output)
    print(f"split wide tables: {tables}")
    print(f"renamed duplicate constraints: {constraints}")
    print(f"renamed duplicate indexes: {indexes}")
    print(f"wrote: {args.output}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())

