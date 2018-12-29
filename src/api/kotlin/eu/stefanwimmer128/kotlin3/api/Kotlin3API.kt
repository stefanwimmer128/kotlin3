package eu.stefanwimmer128.kotlin3.api

interface Kotlin3API {
    companion object {
        const val MODID = "kotlin3"
        const val NAME = "Kotlin³"
        const val VERSION = "#{VERSION}"
        
        @JvmStatic
        val instance: Kotlin3API? by lazy {
            try {
                Class.forName("eu.stefanwimmer128.kotlin3.Kotlin3").getField("INSTANCE").get(null) as Kotlin3API
            } catch (e: Exception) {
                null
            }
        }
    }
}
