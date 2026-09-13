# KAIROS WebView APK

This repository contains a small Android Studio WebView app and a GitHub Actions workflow that builds a debug APK.

## Build from GitHub

Open **Actions → Build KAIROS APK → Run workflow** and enter the website URL. When the workflow finishes, download the `KAIROS-debug-apk` artifact.

## Build locally

Install Android Studio or Android SDK plus Java 17 and Gradle, then run:

```bash
gradle assembleDebug -PwebsiteUrl=https://your-site.example
```

The APK is created at `app/build/outputs/apk/debug/app-debug.apk`. This repository includes a generated vector KAIROS logo. The workflow produces a debug APK; release signing can be added later.
