plugins {
    id(BuildPlugin.androidLibrary)
    id(BuildPlugin.kotlinAndroid)
    id(BuildPlugin.kotlinAndroidExtensions)
    id(BuildPlugin.kotlinKapt)
    id(BuildPlugin.androidHilt)
    kotlin("kapt")
}

kapt {
    correctErrorTypes = true
}

android {
    namespace = "com.jakchang.domain"
    compileSdk = AndroidSdk.compile

    defaultConfig {
        minSdk = AndroidSdk.min
        targetSdk = AndroidSdk.target

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Dependencies.Kotlin.SDK)
    implementation(Dependencies.Kotlin.Coroutine)

    implementation(Dependencies.AndroidX.Core)
    implementation(Dependencies.AndroidX.AppCompat)

    implementation(Dependencies.Network.Retrofit)
    implementation(Dependencies.Network.GsonConverter)
    implementation(platform(Dependencies.Network.OkhttpBom))
    implementation(Dependencies.Network.Okhttp)
    implementation(Dependencies.Network.OkhttpInterceptor)

    implementation(Dependencies.Image.Glide)
    kapt(Dependencies.Image.GlideCompiler)

    implementation(Dependencies.DI.Hilt)
    kapt(Dependencies.DI.AndroidHiltCompiler)
    kapt(Dependencies.DI.HiltCompiler)

    implementation(Dependencies.LocalDB.Room) {
        exclude(group = "org.xerial")
    }
    implementation(Dependencies.LocalDB.RoomKtx) {
        exclude(group = "org.xerial")
    }
    kapt(Dependencies.LocalDB.RoomCompiler) {
        exclude(group = "org.xerial")
    }

    implementation("org.xerial:sqlite-jdbc:3.36.0")
    testImplementation(Dependencies.Test.JUNIT)
    androidTestImplementation(Dependencies.AndroidTest.TEST_RUNNER)
    androidTestImplementation(Dependencies.AndroidTest.ESPRESSO_CORE)
}