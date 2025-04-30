@echo off
setlocal

set DIR=%~dp0
set MAVEN_PROJECTBASEDIR=%DIR%

set WRAPPER_JAR="%DIR%\\.mvn\\wrapper\\maven-wrapper.jar"
set WRAPPER_LAUNCHER=org.apache.maven.wrapper.MavenWrapperMain

java -Dmaven.multiModuleProjectDirectory=%MAVEN_PROJECTBASEDIR% -cp %WRAPPER_JAR% %WRAPPER_LAUNCHER% %*
