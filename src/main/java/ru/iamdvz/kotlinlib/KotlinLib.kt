package ru.iamdvz.kotlinlib

import org.bukkit.plugin.java.JavaPlugin

class KotlinLib : JavaPlugin() {
    override fun onEnable() {
        System.out.println("Hello! Have a good day.")
    }

    override fun onDisable() {
        System.out.println("Bye-bye!")
    }
}