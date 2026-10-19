# Database support inventory

Status: evidence inventory; not an end-to-end support certification.

## Scope

This inventory records the implementation evidence for the Oracle and Microsoft
SQL Server database paths, and the evidence currently available for a possible
MySQL/MariaDB port. Evidence was checked against the checkout and against the
supporting investigation material in `openMaxims-tools` and
`openmaxims-lab`.

## Evidence matrix

| Layer | Evidence | Status |
| --- | --- | --- |
| Build configuration | `WebApp/src/build_common.xml` has explicit `ORA`, `MSQ`, `MSQ05`, `SYB`, and `HSQ` branches with drivers, URLs, SQL terminators, and Hibernate dialects. | Artifact present; execution not yet verified for each database |
| Runtime drivers | The web application contains Oracle, SQL Server, SQL Server JDBC 4, HSQLDB, and an old MySQL JDBC JAR. | Artifact present; effective runtime selection not fully traced |
| Schema generation | Ant invokes Hibernate `SchemaExport` using the selected dialect. | Implemented mechanism; generated schemas not yet compared or applied here |
| Database DDL | `database/DDL-scripts-ref147-openMAXIMS.sql` is a concrete SQL Server DDL asset. | SQL Server artifact present |
| Reference data | Separate `MAXIMS_RefDataMSQ05.sql` and `MAXIMS_RefDataORA.sql` files exist. | Strong evidence of intentional vendor-specific initialization |
| ORM/HQL | Shared Hibernate mappings and HQL provide a common persistence layer. | Plausible portability layer; representative runtime verification required |
| Direct JDBC | Roughly 19 non-generated Java files use direct JDBC calls outside Hibernate SQL generation. | Portability exceptions identified; statement-level audit required |
| Reports/procedures | Vendor-specific report and SQL assets have not yet been fully classified or executed. | Unknown |
| Provisioning scripts | Build targets expect `DomainObjects/scripts/${dbtype}/` directories, which are absent from this checkout. | Significant reproducibility gap |
| Oracle deployment | A working Oracle 19 deployment has been achieved independently. | Execution verified for login, navigation, and Patient Search; not all workflows |
| SQL Server deployment | No equivalent clean provisioning and workflow result has yet been recorded. | Unverified |
| MySQL/MariaDB | No active MySQL build branch, dialect, reference-data script, or deployment evidence was found. | Not currently supported; feasibility remains an investigation question |

## Confirmed implementation pattern

The Oracle and SQL Server paths are not merely README claims. The build makes
deliberate vendor selections for:

- JDBC driver and connection URL;
- SQL statement delimiter;
- Hibernate dialect;
- schema generation;
- database-specific reference data.

This is sufficient to establish **concrete implementation support**. It is not
sufficient to claim that every feature, report, job, backup, restore, and
deployment path works equivalently on both databases.

## Important inconsistencies and risks

### Missing database-script directories

The Ant build refers to database-specific scripts beneath:

```text
DomainObjects/scripts/${dbtype}/
```

Those directories are not present in this checkout. They may be generated,
externally supplied, obsolete, or accidentally omitted. Database provisioning
must not be described as reproducible until this is resolved.

### Oracle-specific console configuration

`WebApp/src/console_hibernate.cfg.xml` is hard-coded to an IMS Oracle driver,
Oracle URL, and Oracle dialect. This may be intentional for a console tool,
but it is not database-neutral and must be traced separately from the selectable
Ant build configuration.

### Direct JDBC portability exceptions

Direct JDBC occurs in areas including Admin, Clinical, Core, Jobs, OCS_IF,
Oncology, PCI, and RefMan. These paths require review for:

- vendor-specific SQL syntax;
- generated keys and identity handling;
- date and large-object types;
- transaction and locking behavior;
- parameter and result-set assumptions.

The absence of Hibernate `createSQLQuery` calls does not eliminate this risk.

## MySQL/MariaDB conclusion

The old `mm.mysql-2.0.14-bin.jar` is evidence that a MySQL driver was once
available, but not that MySQL was supported. No active MySQL configuration,
Hibernate dialect, reference data, schema asset, or deployment result was
found. A MySQL/MariaDB port should therefore begin as a new database-support
investigation, not as an already-supported target.

## Verification plan

Use these statuses for each support layer:

1. **Artifact present** — source/configuration/assets exist.
2. **Configuration traced** — the deployed application is shown to load them.
3. **Execution verified** — the operation succeeds against the target database.
4. **Cross-database parity verified** — matched workflows produce equivalent results.

Next checks:

1. Determine the provenance of `DomainObjects/scripts/${dbtype}/`.
2. Trace database properties from Ant/build output through application-server deployment.
3. Generate and apply Oracle and SQL Server schemas in disposable databases.
4. Load matching reference data and start the application on each.
5. Inventory and test direct JDBC, reports, stored procedures, jobs, and backup/restore.
6. Record database versions, driver versions, JDK, application-server configuration,
   commands, and results for each tested path.

Until those checks are complete, the accurate claim is:

> Oracle and SQL Server have concrete, vendor-specific implementation paths;
> Oracle has a demonstrated deployment in this restoration; complete SQL Server
> parity and reproducible provisioning remain to be verified.
