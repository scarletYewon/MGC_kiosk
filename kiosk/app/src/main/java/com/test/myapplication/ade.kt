package com.test.myapplication

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
                        MainMenu().showMenu()
                    }
                }
            }catch (e:java.lang.NumberFormatException) {
                println("번호를 입력해주세요")
            }
        }
    }
}

open class Ade(ade:Menu) {

    private val name:String
    private val price:Int
    private val description:String

    init {
        this.name=ade.name
        this.price=ade.price
        this.description=ade.description
    }

    open fun displayInfo() {
        println("-${name} 선택-")
        println("가격 : ${price}")
        println("설명 : ${description}")
    }
}

class LemonAde(LemonAdeData:Menu) : Coffee(LemonAdeData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class CherryCoke(CherryCokeData:Menu) : Coffee(CherryCokeData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class GreenGrapeAde(GreenData:Menu) : Coffee(GreenData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class UnicornPink(PinkData:Menu) : Coffee(PinkData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class UnicornBlue(BlueData:Menu) : Coffee(BlueData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}