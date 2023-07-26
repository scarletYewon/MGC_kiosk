package com.test.myapplication.MGCoverAll

import com.test.myapplication.Menu
import com.test.myapplication.aa

open class OverAll(coffees: Menu) {
    private var sel=0

    private val name:String
    private val price:Int
    private val description:String

    private val a1=aa(coffees)

    init {
        this.name=coffees.name
        this.price=coffees.price
        this.description=coffees.description
    }

    open fun displayInfo() {
        println("-${name} 선택-")
        println("가격 : $ ${price}")
        println("설명 : ${description}")
        println("")
        println("${name} | $ ${price} | ${description}")
        menuCheck()
    }

    fun menuCheck() {
        println("위 메뉴를 장바구니에 추가하시겠습니까?")
        println("1. 확인     2. 취소")
        print(">> ")
        sel= readLine()!!.toInt()
        when(sel){
            1 -> {
                print("${name} (이/가) 장바구니에 추가되었습니다.\n")
                println(a1.mm())
            }
            2 -> {
                print("취소되었습니다.")
            }
        }
    }
}