#!/usr/bin/env python3
"""Check that the WAR uses the Standards Port bootstrap, not the IE bootstrap."""

from __future__ import annotations

import gzip
import json
import sys
from pathlib import Path
from zipfile import ZipFile


ROOT = Path(__file__).resolve().parents[1]
WEBAPP = ROOT / "Source Library/openmaxims_workspace/WebApp"
WAR = Path(sys.argv[1]) if len(sys.argv) > 1 else WEBAPP / "openMAXIMS.war"


def require(condition: bool, message: str) -> None:
    if not condition:
        raise SystemExit(f"FAIL: {message}")


page = (WEBAPP / "index.html").read_text(encoding="utf-8")
legacy_bootstrap = (WEBAPP / "jsCN/forminit.js").read_text(encoding="utf-8")
standards_bootstrap = (WEBAPP / "jsCN/source/build/files/forminit.js").read_text(
    encoding="utf-8"
)
standards_modules = json.loads(
    (WEBAPP / "jsCN/source/build/bin/standards-build-order.json").read_text(encoding="utf-8")
)["modules"]
newblue_login_control = (WEBAPP / "jsCN/source/build/files/logincontrol_newblue.js").read_text(
    encoding="utf-8"
)
legacy_entrypoint = (WEBAPP / "ideagz.html").read_text(encoding="utf-8")
newblue_css = (WEBAPP / "themes/new-blue/css/allthemestyles.css").read_text(
    encoding="utf-8"
)
application_config = (WEBAPP / "src/configuration.xml").read_text(encoding="utf-8")

require('packed/jscn.js.gz?v=' in page, "Standards Port launcher must load active bundle with cache generation")
require(
    'jsCN/source/build/files/forminit.js?v=' in page,
    "Standards Port launcher must load the Standards Port bootstrap with cache generation",
)
require("window.addEventListener(\"load\"" in standards_bootstrap,
        "Standards Port bootstrap must use addEventListener")
require("attachEvent" not in standards_bootstrap,
        "Standards Port bootstrap must not require IE attachEvent")
require("logincontrol_newblue.js" in standards_modules,
        "Standards Port build order must include the active new-blue login control")
require(
    'currentThemeName == "new-blue"' in (WEBAPP / "jsCN/source/build/files/formmanager.js").read_text(encoding="utf-8")
    and "CN_logincontrol_newblue" in (WEBAPP / "jsCN/source/build/files/formmanager.js").read_text(encoding="utf-8"),
    "Form Manager must select the new-blue login control for the Standards Port",
)
require("function CN_logincontrol_newblue" in newblue_login_control,
        "Standards Port new-blue login control source is missing")
require("attachEvent" not in newblue_login_control,
        "Standards Port new-blue login control must not require IE attachEvent")
require('CNFormManager.defaultThemeName = "new-blue";' in standards_bootstrap,
        "Standards Port bootstrap must select the active new-blue theme")
require("CNFormManager.usePacked = true;" in standards_bootstrap,
        "Standards Port bootstrap must use the packed active theme")
require(
    "#__si_form:has(.cn_logincontrol_newblue)" in newblue_css
    and "overflow: visible !important" in newblue_css,
    "New Blue theme must allow the login control to paint outside its zero-height form shell",
)
require("window.attachEvent(\"onload\"" in legacy_bootstrap,
        "preserved legacy bootstrap unexpectedly changed")
require('src="packed-legacy/jscn.js.gz"' in legacy_entrypoint,
        "ideagz.html must remain the directly accessible Legacy Bundle launcher")
require('src="jsCN/forminit.js"' in legacy_entrypoint,
        "ideagz.html must load the preserved IE bootstrap")
require('src="packed/jscn.js.gz"' not in legacy_entrypoint,
        "ideagz.html must not load the active Standards Port bundle")
require(
    'login="user" password="pass"' in application_config
    and '<userRole user="user" role="Admin"' in application_config,
    "packaged restoration application login must be user/pass with the Admin role",
)

with ZipFile(WAR) as war:
    # The default WAR must retain the separately preserved IE client artifacts.
    for relative in ("ideagz.html", "packed-legacy/jscn.js.gz",
                     "packed-legacy/themes/css/new-blue.css.gz", "jsCN/forminit.js"):
        require(war.read(relative) == (WEBAPP / relative).read_bytes(),
                "WAR changed or omitted preserved legacy artifact: " + relative)
    for image in (WEBAPP / "themes-legacy/new-blue").rglob("*"):
        if image.is_file():
            relative = str(image.relative_to(WEBAPP))
            require(war.read(relative) == image.read_bytes(),
                    "WAR changed or omitted preserved legacy image: " + relative)
    packaged_page = war.read("index.html").decode("utf-8")
    packaged_bootstrap = war.read("jsCN/source/build/files/forminit.js").decode("utf-8")
    packaged_legacy_bootstrap = war.read("jsCN/forminit.js").decode("utf-8")
    packaged_legacy_entrypoint = war.read("ideagz.html").decode("utf-8")
    packaged_application_config = war.read("WEB-INF/classes/configuration.xml").decode(
        "utf-8"
    )
    active_bundle = gzip.decompress(war.read("packed/jscn.js.gz")).decode("utf-8")
    active_theme = gzip.decompress(war.read("packed/themes/css/new-blue.css.gz")).decode(
        "utf-8"
    )
    require(
        'jsCN/source/build/files/forminit.js?v=' in packaged_page,
        "WAR Standards Port launcher is not wired to the Standards Port bootstrap",
    )
    require("ideagz-legacy.html" not in war.namelist(),
            "WAR must expose only ideagz.html for direct Legacy Bundle comparison")
    require(
        "window.addEventListener(\"load\"" in packaged_bootstrap,
        "WAR is missing the standards-compatible bootstrap",
    )
    require(
        'CNFormManager.defaultThemeName = "new-blue";' in packaged_bootstrap
        and "CNFormManager.usePacked = true;" in packaged_bootstrap,
        "WAR Standards Port bootstrap does not select the packaged active theme",
    )
    require(
        "window.attachEvent(\"onload\"" in packaged_legacy_bootstrap,
        "WAR did not preserve the historical bootstrap separately",
    )
    require(
        'src="packed-legacy/jscn.js.gz"' in packaged_legacy_entrypoint
        and 'src="jsCN/forminit.js"' in packaged_legacy_entrypoint
        and 'src="packed/jscn.js.gz"' not in packaged_legacy_entrypoint,
        "WAR ideagz.html is not the preserved Legacy Bundle entrypoint",
    )
    require(
        "function CN_logincontrol_newblue" in active_bundle,
        "WAR active bundle is missing the new-blue login control",
    )
    require(
        'currentThemeName == "new-blue"' in active_bundle
        and "CN_logincontrol_newblue" in active_bundle,
        "WAR Form Manager does not select the new-blue login control",
    )
    require(
        "#__si_form:has(.cn_logincontrol_newblue)" in active_theme
        and "overflow: visible !important" in active_theme,
        "WAR active New Blue stylesheet does not prevent the login form from being clipped",
    )
    require(
        "themes/new-blue/g/login-login-bg.png" in war.namelist(),
        "WAR is missing the New Blue login field background asset",
    )
    require(
        'login="user" password="pass"' in packaged_application_config
        and '<userRole user="user" role="Admin"' in packaged_application_config,
        "WAR is missing the documented user/pass Admin application login",
    )

print(f"PASS: Standards Port and IE-specific bootstrap wiring are separate in {WAR}")
