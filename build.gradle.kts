buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

    val kotlinVersion: String by project
    val gradleVersion: String by project
    val composeVersion: String by project

    dependencies {
        classpath("org.jetbrains.compose:compose-gradle-plugin:$composeVersion")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        @Suppress("AndroidGradlePluginVersion")
        classpath("com.android.tools.build:gradle:$gradleVersion")
    }
}