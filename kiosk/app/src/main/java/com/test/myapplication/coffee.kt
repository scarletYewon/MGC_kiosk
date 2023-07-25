package com.test.myapplication

open class Coffee(coffees:Menu) {

    private val name:String
    private val price:Int
    private val description:String

    init {
        this.name=coffees.name
        this.price=coffees.price
        this.description=coffees.description
    }

    open fun displayInfo() {
        println("${name}을 선택하셨습니다.")
        println("가격 : ${price}")
        println("설명 : ${description}")
    }
}

class Americano(AmericanoData:Menu) : Coffee(AmericanoData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}


