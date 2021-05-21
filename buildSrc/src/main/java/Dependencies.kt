
object Versions {
    const val kotlinCoroutines = "1.4.3-native-mt"
    const val slf4j = "1.7.30"
    const val compose = "1.0.0-beta03"
    const val nav_compose = "1.0.0-alpha09"
    const val accompanist = "0.6.2"
    const val junit = "4.13"
    const val testRunner = "1.3.0"
}


object AndroidSdk {
    const val min = 21
    const val compile = 30
    const val target = compile
}

object Libs {
    const val kotlinVersion = "1.4.32"
    const val gradle = "com.android.tools.build:gradle:7.1.0-alpha01"
    const val gradleKotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val kotlinSerialization = "org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion"
    const val sqldelight = "com.squareup.sqldelight:gradle-plugin:${SqlDelight.version}"
}

object Test {
    const val junit = "junit:junit:${Versions.junit}"
}

object AndroidX {
    const val appcompat = "androidx.appcompat:appcompat:1.2.0-rc01"
    const val coreKtx = "androidx.core:core-ktx:1.5.0-beta03"
    const val material = "com.google.android.material:material:1.1.0"
    const val activityCompose = "androidx.activity:activity-compose:1.3.0-alpha06"
}

object Lifecycle {
    private const val version = "2.3.0-beta01"
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha03"
    const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
}

object Compose {
    const val version = "1.0.0-beta07"
    const val core = "androidx.compose.ui:ui:$version"
    const val foundation = "androidx.compose.foundation:foundation:$version"
    const val layout = "androidx.compose.foundation:foundation-layout:$version"
    const val material = "androidx.compose.material:material:$version"
    const val materialIconsExtended = "androidx.compose.material:material-icons-extended:$version"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout-compose:1.0.0-alpha05"
    const val runtime = "androidx.compose.runtime:runtime:$version"
    const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata:$version"
    const val tooling = "androidx.compose.ui:ui-tooling:$version"
    const val test = "androidx.compose.ui:ui-test:$version"
    const val uiTest = "androidx.compose.ui:ui-test-junit4:$version"
}

object Koin {
    const val version = "3.0.1-beta-1"
    val core = "io.insert-koin:koin-core:$version"
    val test = "io.insert-koin:koin-test:$version"
    val android = "io.insert-koin:koin-android:$version"
    val compose = "io.insert-koin:koin-androidx-compose:$version"
}

object Ktor {
    const val version = "1.5.2"
    val clientCore = "io.ktor:ktor-client-core:$version"
    val clientJson = "io.ktor:ktor-client-json:$version"
    val clientLogging = "io.ktor:ktor-client-logging:$version"
    val clientSerialization = "io.ktor:ktor-client-serialization:$version"
    val clientAuth = "io.ktor:ktor-client-auth:$version"
    val clientAndroid = "io.ktor:ktor-client-android:$version"
    val clientIos = "io.ktor:ktor-client-ios:$version"
}

object Serialization {
    const val version = "1.0.1"
    val core = "org.jetbrains.kotlinx:kotlinx-serialization-core:$version"
}

object Coroutines {
    const val version = "1.3.9-native-mt"
    const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
}

object SqlDelight {
    const val version = "1.4.3"
    val runtime = "com.squareup.sqldelight:runtime:$version"
    val coroutineExtensions = "com.squareup.sqldelight:coroutines-extensions:$version"
    val androidDriver = "com.squareup.sqldelight:android-driver:$version"
    val nativeDriver = "com.squareup.sqldelight:native-driver:$version"
    val sqlliteDriver = "com.squareup.sqldelight:sqlite-driver:$version"
}


