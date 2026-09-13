plugins { id("com.android.application") }

android { namespace = "com.kairos.webview"; compileSdk = 35
    defaultConfig { applicationId = "com.kairos.webview"; minSdk = 24; targetSdk = 35; versionCode = 1; versionName = "1.0" }
    buildTypes { release { isMinifyEnabled = false; proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro") } }
    buildFeatures { buildConfig = true }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
}

val websiteUrl = providers.gradleProperty("websiteUrl").orElse("https://example.com")

android.defaultConfig.buildConfigField("String", "WEBSITE_URL", "\"${websiteUrl.get()}\"")

dependencies { implementation("androidx.appcompat:appcompat:1.7.0"); implementation("androidx.webkit:webkit:1.12.1") }

configurations.all {
    resolutionStrategy.force(
        "org.jetbrains.kotlin:kotlin-stdlib:1.8.22",
        "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.8.22",
        "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.22"
    )
}
