package com.test.myapplication

fun main(){
    val menuSelect=MainMenu()
    val megaThread = MegaThread()
    megaThread.start()
    menuSelect.showMenu()
}