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

    // drawable 은 하위 폴더를 만들 수 없어서, 리소스 루트를 분리해 종류별로 관리한다.
    //   res-icon/ : ic_*  (아이콘, 로고)
    //   res-bg/   : bg_*  (배경, 도형)
    // 코드/레이아웃에서는 그대로 @drawable/ic_xxx, R.drawable.bg_xxx 로 참조.
    sourceSets {
        getByName("main") {
            res.directories += "src/main/res-icon"
            res.directories += "src/main/res-bg"
        }
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