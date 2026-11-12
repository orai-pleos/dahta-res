plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.orai.dahta.res"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        minSdk = 34
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}

dependencies {
    // themes.xml 이 Theme.MaterialComponents 를 parent 로 사용
    api(libs.material)
}