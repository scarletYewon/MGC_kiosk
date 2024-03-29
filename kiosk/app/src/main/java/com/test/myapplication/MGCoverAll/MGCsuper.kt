package com.test.myapplication.MGCoverAll

import com.test.myapplication.BasketSingletonClass
import com.test.myapplication.Menu
import kotlinx.coroutines.*

open class OverAll(coffees: Menu) {
    private var info: Menu = coffees
    private var sel = 0

    private val name: String
    private val price: Int
    private val description: String


    init {
        this.name = coffees.name
        this.price = coffees.price
        this.description = coffees.description
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
        sel = readLine()!!.toInt()
        when (sel) {
            1 -> {
                print("${name} (이/가) 장바구니에 추가되었습니다.\n")
                var shopping = BasketSingletonClass.getInstance()
                shopping.mgcBasketAdd(info)
                println("장바구니에 추가중입니다..........\n3초만 기다려주세요!")
                var job = CoroutineScope(Dispatchers.Default).launch {
                    delay(1000)
                    println("2초만기다려주세요!")
                    delay(1000)
                    println("1초만기다려주세요!")
                    delay(1000)
                    println("< 추가완료 >")
                }
                runBlocking {
                    job.join()
                }
            }
            2 -> {
                print("취소되었습니다.")
            }
        }
    }
}