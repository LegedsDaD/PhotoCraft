@echo off
setlocal
set GRADLE_VERSION=9.6
set GRADLE_HOME=%USERPROFILE%\.gradle\photocraft-gradle-%GRADLE_VERSION%
set GRADLE_EXE=%GRADLE_HOME%\gradle-%GRADLE_VERSION%\bin\gradle.bat
if exist "%GRADLE_EXE%" goto run
echo PhotoCraft: downloading Gradle %GRADLE_VERSION%...
if not exist "%GRADLE_HOME%" mkdir "%GRADLE_HOME%"
powershell -NoProfile -ExecutionPolicy Bypass -Command "$ProgressPreference='SilentlyContinue'; Invoke-WebRequest 'https://services.gradle.org/distributions/gradle-%GRADLE_VERSION%-bin.zip' -OutFile '%GRADLE_HOME%\gradle.zip'; Expand-Archive -Force '%GRADLE_HOME%\gradle.zip' '%GRADLE_HOME%'; Remove-Item '%GRADLE_HOME%\gradle.zip'"
if errorlevel 1 exit /b 1
:run
call "%GRADLE_EXE%" %*
exit /b %ERRORLEVEL%
