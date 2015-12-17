openMAXIMS source code project is located in the 'Source Library' folder

-----------------------------------------------------------------------------------------------------------------------------------
17th December 2015 - Major new updated (release 10.5)

This is the version of openMAXIMS that is live at the Taunton and Somerset NHS Trust.

Because there have been many hundreds of enhancements, bug fixes and other changes, the original source code has been archived and a completely new release of the source code has been uploaded.

-----------------------------------------------------------------------------------------------------------------------------------
1st August 2014 - Updated Release

The openMAXIMS database creation scripts have been uploaded, together with scripts for the creation of the initial reference data.

Instructions have been included.

-----------------------------------------------------------------------------------------------------------------------------------
20th June 2014 - Updated Release

The compressed (zip) version has been removed as GitHub provides for a 'zipped' download

There were a number of issues with the XML scripts used by Ant and so the build did not proceed smoothly, these issues have been resolved and the scripts revised,. The updated 'WebAppBuild.XML' and 'build_common.XML' files are in the 'openmaxims_workspace/WebApp' folder.

There was also one bug identifed in a .java source file (openmaxims_workspace\Clinical\src\ims\clinical\forms\summaryclinicalinformation\Logic.java) where a method not supported in Java version 1.5 was used. This has been fixed and thanks to 'jonnyry' for finding this and providing the fix.

The issue around the 'CAREUK' module has been resolved, this module is now called RefMan (Referral Management) and is included in this updated release.

The README information in the 'Source Library' folder has been updated with some additional details that downloaders should be aware of before building the project.
---------------------------------------------------------------------------------------------------------------------------------
11th June 2014 - Initial Upload




