openMAXIMS software is provided under the terms of the GNU Affero General Public licence and for most of the software included in this project the copyright is owned by IMS MAXIMS.

We also make use of some 3rd party software components within openMAXIMS which are subject to their own licence terms and the copyright for these is owned by other parties. (see each LICENCE.TXT file for full licence details)

This version of openMAXIMS is intended for use with Microsoft SQL Server 2008 R2 or 2012 (JDBC v3)
(other database systems such as Oracle and MySQL are also supported but will require you to make some configuration code changes)

----------------------------------------------------------------------------------------
Some 3rd party tools are provided in the 'apps' folder for your convenience, or else can be found here:

For JDK 1.5.0_22:

http://www.oracle.com/technetwork/java/javasebusiness/downloads/java-archive-downloads-javase5-419410.html#jdk-1.5.0_22-oth-JPR

For Apache Ant 1.6.5:

http://archive.apache.org/dist/ant/binaries/

For Apache Jakarta Tomcat 5.5.9:

http://archive.apache.org/dist/jakarta/tomcat-5/v5.5.9/bin/
---------------------------------------------------------------------------------------

to build the openMAXIMS project for Windows:

1. Install JDK 1.5 (jdk-1_5_0_22-windows-i586-p.exe) - (note: this is the latest/final version of jdk 1.5)
2. Ensure the <jdk_install_home>\bin directory is in the PATH.
3. Install Tomcat (jakarta-tomcat-5.5.9.exe)
4. Create a system wide environment variable called TOMCAT_HOME set to <tomcat_install_dir>
5. Copy .\apps\jta.jar to <tomcat_install_dir>\common\lib
6. Copy .\apps\SQLServerJdbc.jar to <tomcat_install_dir>\common\lib
7. Install ANT (apache-ant-1.6.5-bin.tar.gz) which simply involves using winzip to unzip to a chosen install dir.
8. Make sure <ant_install_dir>\bin is in the PATH
9. Modify the property workspace on line 4 of openmaxims_workspace\WebApp\WebAppBuild.xml to point to the openmaxims_workspace
10. Modify the setenv.bat file to match your environment (change disk and paths)
11. From a DOS window, go to the directory containing this file, run the 'setenv.bat' batch file followed by the 'build_openMAXIMS.bat' batch file
12. Once the build is successful, there is a newly created file called openMAXIMS.war located in .\openmaxims_workspace\WebApp folder

openMAXIMS.war consitutes the entire openMAXIMS application, containing all run-time dependencies. 
This can be deployed as a web application in Apache Tomcat in the standard manner.
