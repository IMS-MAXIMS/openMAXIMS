# Java 8 build restoration

**Branch:** `restoration/01-build-java8`  
**Starting commit:** `f59654c5fb733ea0c4f9e84edc7573fd08e4271c`  
**Result:** Java 8 compilation and WAR packaging succeed from a clean detached
checkout.

## Changes

The branch contains four deliberately separate build commits:

1. `70c522504` — `build: fix Java 8 source compatibility defects`
   - Renames four `EmergencyEpisodeLite` Java files to match their public
     PascalCase class names.
   - Removes the unused, invalid `sun.misc.Sort` import.
2. `aaf731ee9` — `build: fix case-sensitive paths and WAR packaging`
   - Changes build references from `Racpc` to the actual `RACPC` directory in
     both Ant build files.
   - Enables `zip64Mode="always"` for both WAR targets, because the full WAR
     exceeds the classic ZIP entry-count limit.
3. `cb34e9c84` — `build: add Java 8 Unix build entrypoint`
   - Adds `build-java8.sh`, preserving the existing Windows batch workflow.
   - Allows the workspace location to be overridden with
     `OPENMAXIMS_WORKSPACE`.
4. `98b7ba778` — `build: enforce Java 8 in Unix entrypoint`
   - Prevents accidentally running this historical target with a newer JDK.

No JavaScript source was reconstructed or replaced by this branch. No source
files were bulk-converted between character encodings.

## Java 8 runtime compiler compatibility

The original dependency set includes Eclipse JDT 3.4.4, which is too old for
Drools 5.5 rule compilation when the application runs on Java 8. It fails while
reading Java 8 platform classes with `ClassFormatException` / `wrong class
format`. The active workspace therefore uses Eclipse compiler (ECJ) 4.4.2
instead. `WebApp/build_common.xml` explicitly packages `ecj-4.4.2.jar` and no
longer packages the old JDT jar.

This is a bounded Java 8 compatibility change. It does not claim support for
later Java releases, and it does not replace Drools or alter the application
rule model. The rebuilt WAR starts under Tomcat 6 and the reconstructed
JavaScript runtime has been exercised in an isolated SQL Server deployment.

## Reproducible build environment

The clean build was run on:

- **OS:** macOS on Apple Silicon
- **JDK:** Eclipse Temurin `1.8.0_504` x86_64, executed through Rosetta 2
- **Ant:** `1.10.18`
- **Tomcat support libraries:** Apache Tomcat `6.0.53`; only its servlet/JSP
  libraries were used for compilation, not a running Tomcat server
- **Database:** not required for compilation or packaging

Tomcat 6 was used as the available compatible servlet/JSP API provider. The
original documentation specifies Tomcat 5.5.9; this substitution is recorded
and is not a claim that the deployed application has been validated on Tomcat
6.

The legacy Ant build expects both the old `TOMCAT_HOME/common/lib` layout and
the newer `TOMCAT_HOME/lib` layout. For this test environment,
`common/lib` pointed to Tomcat 6's `lib` directory. This is environment setup,
not a repository change.

## Command

From the repository root:

```bash
export JAVA_HOME=/path/to/jdk8
export TOMCAT_HOME=/path/to/tomcat-support
./build-java8.sh
```

## Set up the build tools on a new machine

Tomcat does **not** install or provide Java. Install a Java 8 JDK and Apache
Ant separately, then download Tomcat for the servlet/JSP libraries required by
this historical Ant build. A running Tomcat server and database are not needed
to compile/package the WAR.

On macOS with Homebrew:

```bash
brew install ant
brew install --cask temurin@8
curl -fL -o "$HOME/apache-tomcat-6.0.53.tar.gz" \
  https://archive.apache.org/dist/tomcat/tomcat-6/v6.0.53/bin/apache-tomcat-6.0.53.tar.gz
tar -xzf "$HOME/apache-tomcat-6.0.53.tar.gz" -C "$HOME"
export JAVA_HOME="$(/usr/libexec/java_home -v 1.8)"
export TOMCAT_HOME="$HOME/apache-tomcat-6.0.53"
java -version
ant -version
```

The Temurin installer may request administrator approval. On Apple Silicon,
the tested Temurin 8 distribution is x86-64 and runs through Rosetta 2; install
Rosetta if needed. On Linux, install a vendor-provided Java 8 JDK (not a JRE)
and Ant using that distribution's package manager, download/extract the same
Tomcat support-library version, then set `JAVA_HOME` and `TOMCAT_HOME` to those
installations. Do not assume the system's default Java is 8: verify
`"$JAVA_HOME/bin/java" -version` before building.

For an isolated build workspace outside the checkout:

```bash
export OPENMAXIMS_WORKSPACE="$HOME/openmaxims-workspace"
mkdir -p "$OPENMAXIMS_WORKSPACE"
cp -a "Source Library/openmaxims_workspace/." "$OPENMAXIMS_WORKSPACE/"
./build-java8.sh openMAXIMSwarfile
```

Database setup is a separate task. For a disposable Oracle development
database, continue with
[`04-oracle-docker-prerequisites.md`](04-oracle-docker-prerequisites.md) and
[`05-oracle-application-setup.md`](05-oracle-application-setup.md).

The script invokes the existing Ant build with the workspace path supplied as
an absolute property. It does not require manually editing
`WebAppBuild.xml`.

## Clean-checkout result

A detached clean worktree at commit `98b7ba778` was built successfully:

```text
BUILD SUCCESSFUL
Total time: 2 minutes 15 seconds
exit status: 0
```

Generated artifact:

```text
Source Library/openmaxims_workspace/WebApp/openMAXIMS.war
```

Artifact size:

```text
233930644 bytes
```

SHA-256 from the clean-worktree build:

```text
b40bd7cf51344bafac949a3a5688a7a19aa20547aa3596a1a90a7cfc137b0975
```

The WAR hash is a build artifact identifier for this run; generated build
metadata and timestamps may make subsequent WAR hashes differ.

## Warnings and limits

The build succeeds with warnings, including:

- Ant's `includeantruntime` warning for existing `<javac>` tasks.
- Deprecated and unchecked API warnings.
- Existing use of internal `sun.*` and `com.sun.*` APIs.
- Existing unreachable-catch warnings in parts of the source tree.

These warnings are intentionally not addressed by this Java 8 restoration.
They are candidates for a later compatibility or code-quality workstream.

This result proves compilation and packaging only. It does not prove that the
WAR starts under Tomcat, connects to SQL Server, initializes reference data,
or supports a real login. Those are separate runtime/database milestones.
