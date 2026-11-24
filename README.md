# PhotoCraft 1.0.0

A Minecraft 26.3 Fabric singleplayer photography mod foundation by LegendWorks.

## Target toolchain
- Minecraft 26.3
- Java 25
- Fabric Loader 0.19.5
- Fabric API 0.161.0+26.3
- Fabric Loom 1.17-SNAPSHOT
- Gradle 9.6

## Build on Windows
1. Install a JDK 25 distribution and set `JAVA_HOME` to it.
2. Open this folder in a terminal.
3. Run `gradlew.bat build`.

The first run downloads Gradle and Minecraft/Fabric build dependencies. The build task copies the remapped mod JAR into `mod/`.

## Build on Linux/macOS
```bash
chmod +x ./gradlew
./gradlew build
```

## GitHub Actions
The workflow builds on pushes and pull requests, copies the remapped JAR into `mod/`, uploads it as an artifact, and creates a GitHub Release when a `v*` tag is pushed.

## Included
- Four camera items and internal camera components.
- Seven lenses, eight colour/effect filters and three stands.
- Photo paper, undeveloped/developed photo placeholders, gallery book and developing-table item.
- Original generated item icons, item models, English names and crafting recipes.

## Important implementation status
This is the **1.0.0 content/build foundation**, not yet the finished playable photography feature set. Registered items and crafting recipes are included, but the following gameplay systems still need implementation and in-game verification:
- camera hotbar left-click configuration screen and right-click viewfinder/zoom controls;
- actual framebuffer screenshot capture and image data stored in photo item data;
- applying colour/sepia/monochrome filters to captured pixels;
- lens-based zoom and stand placement/rotation;
- developing-table block interaction and photo development;
- gallery-book page UI and persistent photo storage;
- developed-photo rendering in item frames.

The photo and developing-table entries are currently placeholder items; no captured image is embedded yet.

## License
MIT
