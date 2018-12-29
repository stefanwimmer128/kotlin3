# Kotlin³

Kotlin³ provides an easy-to-use Kotlin Language Adapter and helpers to develop Minecraft Mods in Kotlin.

## How to use Kotlin³ in your project?

To use Kotlin³ in your project add the following code to yout `build.gradle`:

``` groovy
repositories {
    maven {
        url = "https://dl.bintray.com/stefanwimmer128/maven"
    }
}

dependencies {
    // compile against Kotlin³ API
    compileOnly "eu.stefanwimmer128.kotlin3:kotlin3-api:1.0.0"
    // at runtime include full Kotlin³ mod
    runtimeOnly "eu.stefanwimmer128.kotlin3:kotlin3:1.0.0"
} 
```

``` kotlin
@Mod(modid = "your-mod", modLanguageAdapter = "eu.stefanwimmer128.kotlin3.KotlinLanguageAdapter")
object YourMod {
    // 
}
```
