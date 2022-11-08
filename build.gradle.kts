// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath (BuildPlugin.androidGradlePlugin)
        classpath (BuildPlugin.kotlinGradlePlugin)
        classpath (BuildPlugin.hiltGradlePlugin)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}