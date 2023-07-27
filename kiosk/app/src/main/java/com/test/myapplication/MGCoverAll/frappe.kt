package com.test.myapplication.MGCoverAll

import com.test.myapplication.Menu

class FrappeMenu(info:MutableList<Menu>) {
    private var sel=0
    private val info:MutableList<Menu>
    private var cnt=0
    init {
        this.info=info
    }
    fun detail() {
        println("[ FRAPPE 메뉴 ]")
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
                        CookieFrappe(info[sel-1]).displayInfo()
                        println("")
                    }
                    2 -> {
                        UnicornFrappe(info[sel-1]).displayInfo()
                        println("")
                    }
                    3 -> {
                        RealChocoFrappe(info[sel-1]).displayInfo()
                        println("")
                    }
                    4 -> {
                        MintFrappe(info[sel-1]).displayInfo()
                        println("")
                    }
                    5 -> {
                        CheeseHolic(info[sel-1]).displayInfo()
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



class CookieFrappe(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class UnicornFrappe(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class RealChocoFrappe(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class MintFrappe(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class CheeseHolic(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}