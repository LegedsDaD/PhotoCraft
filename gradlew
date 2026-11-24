#!/usr/bin/env sh
set -eu
VERSION=9.6
BASE="${GRADLE_USER_HOME:-$HOME/.gradle}/photocraft-gradle-$VERSION"
EXE="$BASE/gradle-$VERSION/bin/gradle"
if [ ! -x "$EXE" ]; then
  mkdir -p "$BASE"
  echo "PhotoCraft: downloading Gradle $VERSION..."
  curl -fL "https://services.gradle.org/distributions/gradle-$VERSION-bin.zip" -o "$BASE/gradle.zip"
  unzip -oq "$BASE/gradle.zip" -d "$BASE"
  rm "$BASE/gradle.zip"
fi
exec "$EXE" "$@"
