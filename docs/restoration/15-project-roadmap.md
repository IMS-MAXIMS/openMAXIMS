# openMAXIMS project roadmap

## Purpose

The immediate restoration work has established that the 2015-era application can
be built from source and run on modern host hardware using its historical Java
8/Tomcat 6 runtime. That is an important baseline, but it does not by itself
make openMAXIMS an independently maintainable open-source project.

The repository still reflects a product developed through internal tooling,
generated code, vendor-specific deployment environments, and an IE7/IE8 client.
This roadmap separates three different goals:

1. **Historical restoration** — preserve and reproduce the application as it
   existed.
2. **Independent maintainability** — make meaningful changes possible without
   unavailable IMS tooling.
3. **Modernisation** — change the runtime, browser client, database support,
   and operational model for contemporary use.

These goals must not be mixed together. Historical behaviour should be
recorded before it is changed.

## Current position

Completed or substantially demonstrated:

- The corrupted IE7 JavaScript source has been reconstructed with provenance
  recorded separately from the original packed bundle.
- The historical Java 8/Ant build can produce a WAR from an external clean
  workspace.
- The application can run under Tomcat 6 on a modern Apple Silicon host.
- SQL Server setup, schema loading, reference-data loading, and application
  login are documented.
- The original application login is documented as `user` / `pass` for the
  disposable restoration environment.
- A clean-room installation procedure has been exercised rather than merely
  described.

Known limitations:

- The runtime remains dependent on Java 8, Tomcat 6, and an IE7/IE8-oriented
  client.
- IMSIDE is not included, so the original visual/form-development workflow is
  not independently reproducible.
- SQL Server and Oracle are vendor-specific databases; neither is an
  open-source database solution.
- Other database backends are not equivalent merely because Hibernate exists.
- The restoration is not a production or clinical-safety claim.

## Phase 1 — Preserve the historical baseline

**Priority: immediate. This is the current restoration track.**

- Merge the build/source-restoration PR only after the clean-room instructions
  and provenance records have been reviewed.
- Tag the restored baseline with the upstream commit, restoration commit, WAR,
  packed JavaScript, and reconstructed-source manifests.
- Keep generated workspaces, database volumes, credentials, and deployment
  contexts outside the repository.
- Add automated checks that detect the original duplicate-corruption pattern if
  it is accidentally reintroduced.
- Record known unresolved JavaScript source modules and bundle-generation gaps
  explicitly rather than presenting inferred code as original source.

**Exit criteria:** a new contributor can clone the repository, follow the
installation guide, build the WAR, start the application, and identify which
artifacts are original, reconstructed, or generated.

## Phase 2 — Replace the missing IMSIDE workflow

**Priority: high. Required for independent maintenance.**

First document what IMSIDE actually generated and consumed:

- form definitions and screen geometry;
- generated Java form classes and value objects;
- XML configuration and registration;
- database/reference-data changes;
- JavaScript/client-framework integration;
- build and deployment metadata.

Then define a supported, reviewable replacement workflow. Prefer ordinary
repository-native inputs—XML, Java, SQL, templates, and scripts—over a new
opaque IDE. Where generated files are unavoidable:

- document their source-of-truth inputs;
- add reproducible generators;
- make generated output deterministic;
- check generated-output drift in CI;
- mark generated files clearly.

Do not claim IMSIDE has been replaced until a newcomer can create and modify a
small form using documented tools, rebuild it, and verify it in the running
application.

**Exit criteria:** at least one representative form can be changed end to end
without IMSIDE, with the change reviewable in Git and reproducible by another
contributor.

## Phase 3 — Make the client independently maintainable

**Priority: high.**

- Complete the inventory of reconstructed and unresolved JavaScript modules.
- Establish a source-to-bundle build that is deterministic and produces a
  byte-level or behaviourally justified result.
- Add browser tests for the protocol and high-risk controls: login, grids,
  combo boxes, tabs, navigation, forms, and server round trips.
- Preserve an IE7/IE8-compatible build profile while clearly separating it from
  any standards-browser profile.
- Remove accidental dependence on local diagnostic pages, stale bundles, and
  machine-specific deployment paths.
- Define which parts of the client protocol are server contract, framework
  implementation, and theme styling.

**Exit criteria:** a named client source module can be edited, rebuilt into the
client artifact, tested, and traced to the resulting browser behaviour.

## Phase 4 — Reduce database lock-in

**Priority: high, but after the historical baseline is stable.**

- Treat SQL Server as the initial compatibility target because it was the
  original primary deployment target.
- Keep Oracle support documented and tested where it is known to work.
- Inventory every vendor-specific SQL feature, stored procedure, datatype,
  identity/sequence assumption, trigger, and migration script.
- Define a portable database contract rather than assuming Hibernate provides
  portability automatically.
- Select one genuinely open database target—most plausibly PostgreSQL—for a
  deliberate compatibility effort.
- Port schema, reference data, migrations, locking, pagination, date/time
  behaviour, blobs, and batch jobs systematically.
- Run the same persistence smoke tests against SQL Server, Oracle, and the
  open database target.

**Exit criteria:** the selected open database can create a clean database, load
reference data, authenticate a user, save and retrieve a patient, and pass the
same automated persistence suite as SQL Server.

## Phase 5 — Separate runtime compatibility from modernisation

**Priority: medium. Do not begin before Phases 1–3 are documented.**

Create a separate modern-runtime branch or project rather than silently
changing the historical restoration:

- Java 8 → a supported modern Java release;
- Tomcat 6 → a supported servlet container;
- obsolete libraries → maintained replacements where behaviour permits;
- HTTP and TLS defaults → modern secure defaults;
- IE7/IE8 client → a standards-browser client or compatibility shell;
- ad hoc deployment → a repeatable container or scripted deployment.

Every modernization change should have a compatibility note explaining whether
it preserves or intentionally changes historical behaviour.

**Exit criteria:** the modern runtime has its own supported build, tests, and
migration notes, while the historical runtime remains reproducible.

## Phase 6 — Establish open-source project governance

**Priority: medium.**

A repository is not independently useful merely because a licence file exists.
The project should also provide:

- a maintained README with honest capability and limitation statements;
- contribution and code-review guidance;
- issue templates for build, database, client, and clinical-safety concerns;
- a supported-version policy;
- CI for build, source-integrity, and database smoke tests;
- release artifacts with hashes and provenance;
- a clear statement of what is generated and what is hand-maintained;
- security and data-handling guidance;
- explicit separation between experimental restoration work and supported use.

Do not describe the project as production-ready or clinically safe without an
independent process capable of substantiating those claims.

## Non-goals

This roadmap does not promise to:

- recreate IMSIDE byte-for-byte;
- make the IE7 client a modern web application in place;
- support every database named in historical documentation;
- imply that open-source licensing guarantees product quality;
- endorse the historical product for clinical deployment.

The first success condition is modest but meaningful: a stranger should be able
to understand what the project is, build the historical baseline, reproduce a
known test installation, and see exactly what remains to be made independent.
