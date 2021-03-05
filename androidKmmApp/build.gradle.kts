plugins {
    id("com.android.application")
    kotlin("android")
}

dependencies {
    implementation(project(":sharedKmm"))
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.2")
}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "id.yukngoding.explore_kmm.androidKmmApp"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}