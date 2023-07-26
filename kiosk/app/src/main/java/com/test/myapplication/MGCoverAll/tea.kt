package com.test.myapplication.MGCoverAll

import com.test.myapplication.Menu

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
                        break
                    }
                }
            }catch (e:java.lang.NumberFormatException) {
                println("번호를 입력해주세요")
            }
        }
    }
}



class BlackTea(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class AppleCitronTea(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class Chamomile(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class PeachIceTea(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class LemonTea(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}