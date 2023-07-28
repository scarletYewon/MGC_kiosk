package com.test.myapplication

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MegaThread : Thread() {
    override fun run() {
        val basket = BasketSingletonClass.getInstance()
        while (true) {
            val cnt = basket.mgcBasketSize()
            println("\n( 현재 주문 현황 : ${cnt}잔 )")
            runBlocking {
                launch {
                    delay(5000)
                }
            }
        }
    }
}