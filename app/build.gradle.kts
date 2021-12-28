plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "demos.${rootProject.name.replace('-', '_')}"
        minSdk = 15
        targetSdk = 28
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("com.google.dagger:dagger:2.40.5")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.6.10")
    implementation("androidx.appcompat:appcompat:1.4.0")
    implementation("com.android.support.constraint:constraint-layout:2.0.4")
    annotationProcessor("com.google.dagger:dagger-compiler:2.40.5")
}
