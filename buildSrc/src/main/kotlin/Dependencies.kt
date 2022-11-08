object Dependencies {

    object Versions {
        const val gradle = "7.0.3"

        const val kotlinStandard = "1.7.10"
        const val kotlinCoroutines = "1.6.4"

        const val lifeCycle = "2.5.1"
        const val lifeCycleExtension = "2.2.0"
        const val activityKtx = "1.6.1"
        const val fragmentKtx = "1.5.4"

        const val hilt = "2.42"
        const val hiltCompiler = "1.0.0"
        const val retrofit = "2.9.0"
        const val okhttp = "4.9.1"

        const val glide = "4.11.0"

        const val room = "2.4.3"
        const val roomCompiler = "2.2.5"

    }

    object Kotlin {
        const val SDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinStandard}"
        const val Coroutine =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutines}"
    }

    object AndroidX {
        const val Material = "com.google.android.material:material:1.6.0"
        const val ConstraintLayout = "androidx.constraintlayout:constraintlayout:2.1.3"
        const val AppCompat = "androidx.appcompat:appcompat:1.3.1"
        const val Core = "androidx.core:core-ktx:1.7.0"
        const val LifecycleExtension =
            "androidx.lifecycle:lifecycle-extensions:${Versions.lifeCycleExtension}"
        const val LifeCycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifeCycle}"
        const val LifecycleViewModel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeCycle}"
        const val LifecycleLiveData =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifeCycle}"
        const val ActivityKtx = "androidx.activity:activity-ktx:${Versions.activityKtx}"
        const val FragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"
    }

    object Network {
        const val Retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val GsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val OkhttpBom = "com.squareup.okhttp3:okhttp-bom:${Versions.okhttp}"
        const val Okhttp = "com.squareup.okhttp3:okhttp"
        const val OkhttpInterceptor = "com.squareup.okhttp3:logging-interceptor"
    }

    object Image {
        const val Glide = "com.github.bumptech.glide:glide:${Versions.glide}"
        const val GlideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    }

    object LocalDB {
        const val RoomCompiler = "androidx.room:room-compiler:${Versions.roomCompiler}"
        const val Room = "androidx.room:room-runtime:${Versions.room}"
        const val RoomKtx = "androidx.room:room-ktx:${Versions.room}"
    }

    object DI {
        const val Hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val HiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
        const val AndroidHiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}"
    }

    object Test {
        const val JUNIT = "junit:junit:4.13.2"
        const val ANDROID_JUNIT_RUNNER = "AndroidJUnitRunner"
    }

    object AndroidTest {
        const val TEST_RUNNER = "androidx.test.ext:junit:1.1.3"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.4.0"
    }
}

object AndroidSdk {
    const val min = 21
    const val compile = 33
    const val target = compile
}

object BuildPlugin {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Dependencies.Versions.gradle}"
    const val kotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Dependencies.Versions.kotlinStandard}"
    const val hiltGradlePlugin =
        "com.google.dagger:hilt-android-gradle-plugin:${Dependencies.Versions.hilt}"

    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinKapt = "kotlin-kapt"
    const val androidHilt = "dagger.hilt.android.plugin"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
    const val androidLibrary = "com.android.library"
}