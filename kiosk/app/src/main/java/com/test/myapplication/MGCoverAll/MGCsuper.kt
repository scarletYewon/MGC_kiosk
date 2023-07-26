package com.test.myapplication.MGCoverAll

import com.test.myapplication.Menu

open class OverAll(coffees: Menu) {

    private val name:String
    private val price:Int
    private val description:String

    init {
        this.name=coffees.name
        this.price=coffees.price
        this.description=coffees.description
    }

    open fun displayInfo() {
        println("-${name} 선택-")
        println("가격 : ${price}")
        println("설명 : ${description}")
    }
}