@file:JvmName("Helpers")

package eu.stefanwimmer128.kotlin3.api

import net.minecraft.block.Block
import net.minecraft.creativetab.CreativeTabs

var Block.creativeTab: CreativeTabs
    get() =
        creativeTabToDisplayOn
    set(creativeTab) {
        setCreativeTab(creativeTab)
    }
