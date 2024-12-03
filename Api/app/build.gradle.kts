plugins {
    id("com.android.application")
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.api"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.api"
        minSdk = 31
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation("com.google.android.gms:play-services-maps:19.0.0")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")

    //auto-slider
    //implementation ("com.github.dangiashish:Auto-Image-Slider:1.0.2")
    implementation ("com.github.dangiashish:Auto-Image-Slider:1.0.6")

    //hien thi danh sach
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    //Xác minh thời gian biên dịch các truy vấn SQL
    implementation("androidx.room:room-runtime:2.6.1")
    //Lưu dữ liệu trong cơ sở dữ liệu cục bộ bằng Room, Thư viện lưu trữ Room cung cấp một lớp trừu tượng trên SQLite
    annotationProcessor("androidx.room:room-compiler:2.6.1")
    
    implementation("androidx.cardview:cardview:1.0.0")

    //firebase
    implementation("com.google.firebase:firebase-analytics:22.1.2")
    //Account(mail & pass, check...)
    implementation("com.google.firebase:firebase-auth:23.1.0")
    //User(attribute information)
    implementation("com.google.firebase:firebase-firestore:25.1.1")
    implementation("com.google.firebase:firebase-database:21.0.0")
    implementation("com.google.firebase:firebase-storage:21.0.1")
    //picasso thu vien de load icon call API
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    implementation ("com.squareup.picasso:picasso:2.5.2")
    //retrofit thư viện lấy dữ liẹu từ internet
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    //gson có thể chuyển đổi từ một đối tượng Java sang JSON và ngược lại
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
}