import org.gradle.api.artifacts.dsl.RepositoryHandler

/**
 * Created by idisfkj on 2020/7/23.
 * Email: idisfkj@gmail.com.
 */
object Versions {

    const val compile_sdk_version = 31
    const val min_sdk_version = 15
    const val target_sdk_version = 31
    const val version_code = 1
    const val version_name = "1.0"

    const val gradle = "7.0.4"
    const val kotlin = "1.6.0"
    const val core_ktx = "1.7.0"
    const val appcompat = "1.4.0"
    const val junit = "4.13.2"
    const val ext_junit = "1.1.2"
    const val espresso_core = "3.4.0"
    const val constraint_layout = "2.1.2"
    const val android_startup = "1.0.7"
    const val tracing = "1.0.0"

    const val gradle_bintray_plugin = "1.8.0"
    const val android_maven_gradle_plugin = "2.1"
}

object Dependencies {
    const val build_gradle = "com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val junit = "junit:junit:${Versions.junit}"
    const val tracing = "androidx.tracing:tracing:${Versions.tracing}"
    const val ext_junit = "androidx.test.ext:junit:${Versions.ext_junit}"
    const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
    const val gradle_bintray_plugin = "com.jfrog.bintray.gradle:gradle-bintray-plugin:${Versions.gradle_bintray_plugin}"
    const val android_maven_gradle_plugin = "com.github.dcendents:android-maven-gradle-plugin:${Versions.android_maven_gradle_plugin}"
    const val android_startup = "io.github.idisfkj:android-startup:${Versions.android_startup}"

    val addRepos: (handler: RepositoryHandler) -> Unit = {
        it.google()
        it.jcenter()
    }
}