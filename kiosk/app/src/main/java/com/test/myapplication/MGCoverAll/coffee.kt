package com.test.myapplication.MGCoverAll

import com.test.myapplication.Menu

class CoffeeMenu(info:MutableList<Menu>) {
    private var sel=0
    private val info:MutableList<Menu>
    private var cnt=0
    init {
        this.info=info
    }
    fun detail() {
        while(true){
                for(i in info){
                    println("${++cnt}. ${i.name} | $ ${i.price} | ${i.description}")
                    if(cnt==5){
                        cnt=0
                    }
                }
                println("0. 이전")
                print("select >> ")
            try {
                sel= readLine()!!.toInt()
                when(sel) {
                    1 -> {
                        Americano(info[sel-1]).displayInfo()
                        println("")
                    }
                    2 -> {
                        CubeLatte(info[sel-1]).displayInfo()
                        println("")
                    }
                    3 -> {
                        VanillaLatte(info[sel-1]).displayInfo()
                        println("")
                    }
                    4 -> {
                        VanillaAmericano(info[sel-1]).displayInfo()
                        println("")
                    }
                    5 -> {
                        TiramisuLatte(info[sel-1]).displayInfo()
                        println("")
                    }
                    0 -> {
                        break
                    }
                }
            }catch (e:java.lang.NumberFormatException) {
                println("번호를 입력해주세요")
            }
        }
    }
}



class Americano(AmericanoData: Menu) : OverAll(AmericanoData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class CubeLatte(cubeLatteData: Menu) : OverAll(cubeLatteData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class VanillaLatte(VanillaLatteData: Menu) : OverAll(VanillaLatteData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class VanillaAmericano(VanillaAmericanoData: Menu) : OverAll(VanillaAmericanoData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class TiramisuLatte(TiramisuLatteData: Menu) : OverAll(TiramisuLatteData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}






