package com.test.myapplication.MGCoverAll

import com.test.myapplication.Menu

class BeverageMenu(info:MutableList<Menu>) {
    private var sel=0
    private val info:MutableList<Menu>
    private var cnt=0
    init {
        this.info=info
    }
    fun detail() {
        while(true){
            println("[ BEVERAGE 메뉴 ]")
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
                        SweetPotatoLatte(info[sel-1]).displayInfo()
                        println("")
                    }
                    2 -> {
                        StrawberryLatte(info[sel-1]).displayInfo()
                        println("")
                    }
                    3 -> {
                        GreenTeaLatte(info[sel-1]).displayInfo()
                        println("")
                    }
                    4 -> {
                        BlackBubble(info[sel-1]).displayInfo()
                        println("")
                    }
                    5 -> {
                        NutLatte(info[sel-1]).displayInfo()
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



class SweetPotatoLatte(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class StrawberryLatte(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class GreenTeaLatte(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class BlackBubble(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class NutLatte(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}