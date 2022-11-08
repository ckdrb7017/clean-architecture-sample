plugins {
    id(BuildPlugin.androidApplication)
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
    namespace = "com.jakchang.clean_architecture_sample"
    compileSdk = AndroidSdk.compile

    defaultConfig {
        applicationId = "com.jakchang.clean_architecture_sample"
        minSdk = AndroidSdk.min
        targetSdk = AndroidSdk.target
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
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
    implementation (project(":domain"))
    implementation (project(":data"))

    implementation(Dependencies.Kotlin.SDK)
    implementation(Dependencies.Kotlin.Coroutine)

    implementation(Dependencies.AndroidX.Core)
    implementation(Dependencies.AndroidX.AppCompat)
    implementation(Dependencies.AndroidX.Material)
    implementation(Dependencies.AndroidX.ConstraintLayout)
    implementation(Dependencies.AndroidX.LifecycleExtension)
    kapt(Dependencies.AndroidX.LifeCycleCompiler)
    implementation(Dependencies.AndroidX.LifecycleViewModel)
    implementation(Dependencies.AndroidX.LifecycleLiveData)
    implementation(Dependencies.AndroidX.ActivityKtx)
    implementation(Dependencies.AndroidX.FragmentKtx)

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