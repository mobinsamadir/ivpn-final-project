// File: android/settings.gradle.kts
// This is the final, correct version that explicitly adds the Flutter repository.

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        // This line is essential for finding the Flutter plugin
        maven {
            url = uri("https://storage.googleapis.com/download.flutter.io")
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // This line is also needed for some Flutter packages
        maven {
            url = uri("https://storage.googleapis.com/download.flutter.io")
        }
    }
}

rootProject.name = "android"
include(":app")
