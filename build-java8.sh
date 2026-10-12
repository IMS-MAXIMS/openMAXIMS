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
# Keep the workspace override outside the XML so the checkout remains portable.
export PATH="$JAVA_HOME/bin:$PATH"
exec ant -f "$WORKSPACE_DIR/WebApp/WebAppBuild.xml" \
    -Dworkspace="$WORKSPACE_DIR/" \
    "$@"
