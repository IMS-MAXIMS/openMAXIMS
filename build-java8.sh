#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR=$(CDPATH= cd -- "$(dirname -- "$0")" && pwd)
WORKSPACE_DIR=${OPENMAXIMS_WORKSPACE:-"$ROOT_DIR/Source Library/openmaxims_workspace"}

: "${JAVA_HOME:?Set JAVA_HOME to a Java 8 JDK before running this script}"
: "${TOMCAT_HOME:?Set TOMCAT_HOME to a Tomcat installation supplying the servlet/JSP APIs}"

if [[ ! -x "$JAVA_HOME/bin/java" ]]; then
    echo "JAVA_HOME does not contain an executable Java runtime: $JAVA_HOME" >&2
    exit 2
fi
if [[ ! -x "$JAVA_HOME/bin/javac" ]]; then
    echo "JAVA_HOME does not contain javac: $JAVA_HOME" >&2
    exit 2
fi
java_version=$("$JAVA_HOME/bin/java" -version 2>&1 | sed -n 's/.*version "\([^"]*\)".*/\1/p' | head -n 1)
case "$java_version" in
    1.8*|8*) ;;
    *)
        echo "This entrypoint requires Java 8; found ${java_version:-unknown} in $JAVA_HOME" >&2
        exit 2
        ;;
esac
if [[ ! -d "$TOMCAT_HOME" ]]; then
    echo "TOMCAT_HOME does not exist: $TOMCAT_HOME" >&2
    exit 2
fi
if ! command -v ant >/dev/null 2>&1; then
    echo "Ant is not on PATH" >&2
    exit 2
fi

# The source predates Maven/Gradle and uses TOMCAT_HOME from the environment.
# Build the active Standards Port bundle before Ant packages WebApp/packed/**.
# The Legacy Bundle under WebApp/packed-legacy/ is deliberately not touched.
export PATH="$JAVA_HOME/bin:$PATH"
case "${OPENMAXIMS_CLIENT:-standards}" in
    standards)
        if [[ -f "$WORKSPACE_DIR/.openmaxims-legacy-client" ]]; then
            echo "This workspace was staged for the Legacy Bundle. Copy a fresh workspace for the Standards Port." >&2
            exit 2
        fi
        OPENMAXIMS_WORKSPACE="$WORKSPACE_DIR" "$ROOT_DIR/build-javascript.sh"
        ;;
    legacy)
        # Legacy JS is a preserved artifact: never regenerate it from active source.
        python3 - "$ROOT_DIR" "$WORKSPACE_DIR" <<'PYCLIENT'
from pathlib import Path
import shutil
import sys
root, workspace = (Path(p).resolve() for p in sys.argv[1:])
if workspace == root / "Source Library/openmaxims_workspace":
    raise SystemExit("Legacy profile requires a separate OPENMAXIMS_WORKSPACE; the source checkout is not modified.")
webapp = workspace / "WebApp"
required = ["packed-legacy/jscn.js.gz", "packed-legacy/themes/css/new-blue.css.gz",
            "src/themes-legacy/new-blue/layout.html", "ideagz.html", "jsCN/forminit.js"]
for name in required:
    if not (webapp / name).is_file():
        raise SystemExit("Incomplete Legacy Bundle workspace; missing " + str(webapp / name))
# Mark before any mutation so an interrupted stage cannot become a standards build.
(workspace / ".openmaxims-legacy-client").touch()
for source, destination in [("packed-legacy/jscn.js.gz", "packed/jscn.js.gz"),
                            ("packed-legacy/themes/css/new-blue.css.gz", "packed/themes/css/new-blue.css.gz"),
                            ("src/themes-legacy/new-blue/layout.html", "src/themes/new-blue/layout.html")]:
    target = webapp / destination
    target.parent.mkdir(parents=True, exist_ok=True)
    shutil.copy2(webapp / source, target)
shutil.copytree(webapp / "themes-legacy/new-blue", webapp / "themes/new-blue", dirs_exist_ok=True)
# ideagz.html is the preserved launcher; stage it at the welcome path only in
# this legacy-only WAR profile.
shutil.copy2(webapp / "ideagz.html", webapp / "index.html")
print("Staged preserved Legacy Bundle, theme, layout and IE bootstrap for WAR packaging")
PYCLIENT
        ;;
    *)
        echo "OPENMAXIMS_CLIENT must be standards (default) or legacy" >&2
        exit 2
        ;;
esac

# Keep the workspace override outside the XML so the checkout remains portable.
exec ant -f "$WORKSPACE_DIR/WebApp/WebAppBuild.xml" \
    -Dworkspace="$WORKSPACE_DIR/" \
    "$@"
