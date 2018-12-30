# Kotlin³

Kotlin³ provides an easy-to-use Kotlin Language Adapter and helpers to develop Minecraft Mods in Kotlin.

## How to use Kotlin³ in your project?

To use Kotlin³ in your project add the following code to your `build.gradle`:

``` groovy
repositories {
    jcenter()
    maven {
        url = "https://dl.bintray.com/stefanwimmer128/maven"
    }
}

dependencies {
    // compile against Kotlin³ API
    provided "eu.stefanwimmer128.kotlin3:kotlin3-api:${version}"
    // at runtime include full Kotlin³ mod
    runtime "eu.stefanwimmer128.kotlin3:kotlin3:${version}"
} 
```

And create your Mod like this:

``` kotlin
@Mod(modid = "your-mod, modLanguageAdapter = "eu.stefanwimmer128.kotlin3.api.KotlinLanguageAdapter")
object YourMod {
    // put your code here
}
```

Additional documentation can be found [here](https://stefanwimmer128.github.io/kotlin3/).
