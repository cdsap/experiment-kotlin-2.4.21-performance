plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.kotlin.plugin)
    implementation(libs.kotlin.compose.plugin)


                implementation(libs.android.gradle.plugin)
                implementation(libs.hilt.plugin)

}


gradlePlugin {
    plugins {
        register("androidLibPlugin") {
            id = "awesome.androidlib.plugin"
            implementationClass = "com.logic.CompositeBuildPluginAndroidLib"
        }
        register("androidKmpLibPlugin") {
            id = "awesome.android.kmp.lib.plugin"
            implementationClass = "com.logic.CompositeBuildPluginAndroidKmpLib"
        }
    }
}
gradlePlugin {
    plugins {
        register("androidAppPlugin") {
            id = "awesome.androidapp.plugin"
            implementationClass = "com.logic.CompositeBuildPluginAndroidApp"
        }
    }
}

/develocity-failure-handler In the checkout of the VirgoAndroid project, handle one failure in this build: https://pov-2enbqm7zlf2r6.develocity.cloud/s/uyn77tqrvtxlw This run did not confirm that this build carries the failure. Check that first.
The failure to triage is the build failure "deviceTest devBuildFat instrumented tests fail on pixel2api36". The build may carry other failures; triage only that one.