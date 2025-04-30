@echo off
setlocal
set MVNW_REPOURL=
set MVNW_VERBOSE=
set JAVA_EXE=java
set DIR=%~dp0
"%DIR%\.mvn\wrapper\maven-wrapper.jar" %*
