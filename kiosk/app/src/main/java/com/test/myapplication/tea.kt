package com.test.myapplication

class TeaMenu(info:MutableList<Menu>) {
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
                        BlackTea(info[sel-1]).displayInfo()
                        println("")
                    }
                    2 -> {
                        AppleCitronTea(info[sel-1]).displayInfo()
                        println("")
                    }
                    3 -> {
                        Chamomile(info[sel-1]).displayInfo()
                        println("")
                    }
                    4 -> {
                        PeachIceTea(info[sel-1]).displayInfo()
                        println("")
                    }
                    5 -> {
                        LemonTea(info[sel-1]).displayInfo()
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

open class Tea(teas:Menu) {

    private val name:String
    private val price:Int
    private val description:String

    init {
        this.name=teas.name
        this.price=teas.price
        this.description=teas.description
    }

    open fun displayInfo() {
        println("-${name} 선택-")
        println("가격 : ${price}")
        println("설명 : ${description}")
    }
}

class BlackTea(AmericanoData:Menu) : Coffee(AmericanoData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class AppleCitronTea(cubeLatteData:Menu) : Coffee(cubeLatteData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class Chamomile(VanillaLatteData:Menu) : Coffee(VanillaLatteData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class PeachIceTea(VanillaAmericanoData:Menu) : Coffee(VanillaAmericanoData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class LemonTea(TiramisuLatteData:Menu) : Coffee(TiramisuLatteData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}