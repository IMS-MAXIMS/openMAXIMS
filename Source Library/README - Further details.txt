You will need to put the necessary details into the following files (where these are relevant to your system)
------------------------------------------------------------------------------------------------------------------------------------------------------

TO COMPLETE THE BUILD PROCESS:

openmaxims_workspace\WebApp\WebAppBuild.xml
Line 6: set path to your local source code directory
lines 14 through 18: the actual location and parameters for database can be set
-----------------------------------------------------------------------------------------------------------
IMPORTANT - The following 2 java source files employ hard coded passwords that are compiled into the final
build, by default these are set to "xxxx" in this code. These paswords control access to some of the lower level
configuration settings that should not be changed (except by a very confident system administrator or developer)
once the system has been initially configured and had data loaded - else data corruption and other nasty things
could occur. For a simple test deployment these passwords are not important, but for any real-world use they
should be set to a locally agreed but secure string.

openmaxims_workspace\Admin\src\ims\admin\forms\configflags\Logic.java
line 437: set system password details - gives access to change configflags on built system
-----------------------------------------------------------------------------------------------------------
openmaxims_workspace\Admin\src\ims\admin\forms\applicationusers\Logic.java
line 895: set system password details - gives access to master account on built system
-----------------------------------------------------------------------------------------------------------


TO COMPLETE THE DEPLOYMENT PROCESS:

(These changes can be made post-build)

For access to NHS PDS and eRS (C&B) services over N3:
openmaxims_workspace\WebApp\cabgw_configuration.xml
Substitute actual values wherever "xxxxx" appears
-----------------------------------------------------------------------------------------------------------
If using the MS SQL Server 2008/12 database:
openmaxims_workspace\WebApp\MAXIMS_RefDataMSQ05.sql
line 107302: actual username and password strings required for default user
line 107304: actual username and password strings required for default user
-----------------------------------------------------------------------------------------------------------
If using the Oracle 10/11 database:
openmaxims_workspace\WebApp\MAXIMS_RefDataORA.sql
line 123836: actual username and password strings required for default user
line 123838: actual username and password strings required for default user
-----------------------------------------------------------------------------------------------------------
openmaxims_workspace\WebApp\WEB-INF\web.xml
lines 94 and 98: actual username and password for HL7 service to access DB
-----------------------------------------------------------------------------------------------------------
openmaxims_workspace\WebApp\src\configuration.xml
Line 5740: your system admin password details needed
-----------------------------------------------------------------------------------------------------------
