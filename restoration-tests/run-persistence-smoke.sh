#!/usr/bin/env bash
set -euo pipefail

# Runs the test against an already-built and running MAXIMS Tomcat instance.
# Only the deployed exploded application is changed temporarily; it is restored
# by cleanup. No application source, WAR, or persistent workspace is modified.

: "${CATALINA_BASE:?Set CATALINA_BASE to the running Tomcat base}"
: "${TOMCAT_HOME:?Set TOMCAT_HOME to the Tomcat installation}"
: "${JAVA_HOME:?Set JAVA_HOME to a Java 8 JDK}"
: "${OPENMAXIMS_APP_DIR:=$CATALINA_BASE/webapps/openMAXIMS}"

if [[ ! -x "$JAVA_HOME/bin/javac" ]]; then
    echo "javac not found under JAVA_HOME: $JAVA_HOME" >&2
    exit 2
fi

context_name="openMAXIMS"
work_dir=$(mktemp -d "${TMPDIR:-/tmp}/openmaxims-restoration-test.XXXXXX")
web_xml="$OPENMAXIMS_APP_DIR/WEB-INF/web.xml"
web_xml_backup="$work_dir/web.xml"
test_class="$OPENMAXIMS_APP_DIR/WEB-INF/classes/ims/restoration/tests/PersistenceSmokeServlet.class"
cleanup() {
    if [[ -f "$web_xml_backup" ]]; then
        cp "$web_xml_backup" "$web_xml"
    fi
    if [[ -f "$test_class" ]]; then
        rm -f "$test_class"
    fi
    rm -rf "$work_dir"
}
trap cleanup EXIT

if [[ ! -f "$web_xml" ]]; then
    echo "Exploded application web.xml not found: $web_xml" >&2
    exit 2
fi
cp "$web_xml" "$web_xml_backup"
mkdir -p "$work_dir/classes" "$OPENMAXIMS_APP_DIR/WEB-INF/classes/ims/restoration/tests"

servlet_cp="$OPENMAXIMS_APP_DIR/WEB-INF/classes"
for jar in "$OPENMAXIMS_APP_DIR"/WEB-INF/lib/*.jar "$TOMCAT_HOME"/lib/*.jar; do
    servlet_cp="$servlet_cp:$jar"
done

"$JAVA_HOME/bin/javac" -source 1.7 -target 1.7 -encoding UTF-8 \
    -cp "$servlet_cp" -d "$OPENMAXIMS_APP_DIR/WEB-INF/classes" \
    restoration-tests/src/ims/restoration/tests/PersistenceSmokeServlet.java

python3 - "$web_xml" <<'PY'
from pathlib import Path
import sys
path = Path(sys.argv[1])
text = path.read_text(encoding="utf-8")
marker = "</web-app>"
if marker not in text:
    raise SystemExit("web.xml has no closing web-app element")
addition = """
    <servlet>
        <servlet-name>restorationPersistenceSmoke</servlet-name>
        <servlet-class>ims.restoration.tests.PersistenceSmokeServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>restorationPersistenceSmoke</servlet-name>
        <url-pattern>/restoration/persistence</url-pattern>
    </servlet-mapping>
"""
path.write_text(text.replace(marker, addition + marker), encoding="utf-8")
PY

url="${OPENMAXIMS_BASE_URL:-http://127.0.0.1:8080}/${context_name}/restoration/persistence"
for _ in $(seq 1 60); do
    if result=$(curl --silent --show-error --fail --max-time 10 "$url" 2>/dev/null); then
        printf '%s\n' "$result"
        exit 0
    fi
    sleep 1
done

echo "Timed out waiting for $url" >&2
exit 1
