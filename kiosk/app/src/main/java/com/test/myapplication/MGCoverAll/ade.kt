package com.test.myapplication.MGCoverAll

import com.test.myapplication.Menu

class AdeMenu(info:MutableList<Menu>) {
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
                        LemonAde(info[sel-1]).displayInfo()
                        println("")
                    }
                    2 -> {
                        CherryCoke(info[sel-1]).displayInfo()
                        println("")
                    }
                    3 -> {
                        GreenGrapeAde(info[sel-1]).displayInfo()
                        println("")
                    }
                    4 -> {
                        UnicornPink(info[sel-1]).displayInfo()
                        println("")
                    }
                    5 -> {
                        UnicornBlue(info[sel-1]).displayInfo()
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



class LemonAde(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class CherryCoke(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class GreenGrapeAde(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class UnicornPink(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class UnicornBlue(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}