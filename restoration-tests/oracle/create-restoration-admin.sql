-- Disposable restoration database only. Run as the application schema owner
-- after the schema and MAXIMS_RefDataORA reference data have been loaded.
-- This creates the browser user/pass account, not an Oracle database account.
WHENEVER SQLERROR EXIT SQL.SQLCODE ROLLBACK
SET DEFINE OFF
DECLARE
  user_id NUMBER;
  role_id NUMBER;
  navigation_id NUMBER;
BEGIN
  -- The historical Oracle seed ends with SQL Server CONVERT/getdate syntax
  -- for this group. Without it, startup recursively tries to create the group
  -- while auditing its own creation and waits on its own uncommitted row.
  INSERT INTO core_configflaggrou(id, vstp, rie, name)
    SELECT -900003, 0, 0, 'Default' FROM dual
      WHERE NOT EXISTS (SELECT 1 FROM core_configflaggrou WHERE name = 'Default');

  SELECT MIN(id) INTO navigation_id FROM core_appnavigation
    WHERE navigation = 'MAXIMS';
  IF navigation_id IS NULL THEN
    RAISE_APPLICATION_ERROR(-20001, 'MAXIMS navigation missing: load reference data first');
  END IF;

  SELECT MIN(id) INTO role_id FROM core_approle WHERE name = 'Admin';
  IF role_id IS NULL THEN
    -- Reserved negative restoration IDs avoid the positive Hibernate sequence.
    role_id := -900001;
    INSERT INTO core_approle(id, vstp, rie, name, isactive, navigation)
      VALUES(role_id, 0, 0, 'Admin', 1, navigation_id);
  END IF;
  UPDATE core_approle SET isactive = 1 WHERE id = role_id;

  SELECT MIN(id) INTO user_id FROM core_appuser WHERE username = 'user';
  IF user_id IS NULL THEN
    user_id := -900002;
    INSERT INTO core_appuser(id, vstp, rie, username, c_passwo, encodedpas, theme, isactive)
      VALUES(user_id, 0, 0, 'user', 'nU4eI71bcnBGqeO0t9tXvY1u5oQ=', 'pass', 'new-blue', 1);
  END IF;
  UPDATE core_appuser
    SET c_passwo = 'nU4eI71bcnBGqeO0t9tXvY1u5oQ=', encodedpas = 'pass',
        isactive = 1, c_lock = NULL, theme = 'new-blue'
    WHERE id = user_id;
  INSERT INTO core_appuser_c_rol(from_side, to_side)
    SELECT user_id, role_id FROM dual
      WHERE NOT EXISTS (SELECT 1 FROM core_appuser_c_rol
        WHERE from_side = user_id AND to_side = role_id);
  COMMIT;
END;
/
SELECT username, isactive, theme FROM core_appuser WHERE username = 'user';
EXIT
