package eu.stefanwimmer128.kotlin3

import eu.stefanwimmer128.kotlin3.api.Kotlin3API
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import org.apache.logging.log4j.Logger

@Mod(modid = Kotlin3API.MODID, name = Kotlin3API.NAME, version = Kotlin3API.VERSION, modLanguageAdapter = "eu.stefanwimmer128.kotlin3.api.KotlinLanguageAdapter", updateJSON = "https://raw.githubusercontent.com/stefanwimmer128/kotlin3/master/versions.json")
object Kotlin3: Kotlin3API {
    @Mod.Instance
    lateinit var instance: Kotlin3
}
