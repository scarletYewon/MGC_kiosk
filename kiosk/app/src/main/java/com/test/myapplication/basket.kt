package com.test.myapplication



class BasketSingletonClass private constructor() {
    private val basketInfo = mutableListOf<Menu>()



    companion object {
        @Volatile private var instance: BasketSingletonClass? = null


        fun getInstance(): BasketSingletonClass {
            if(instance == null) {
                synchronized(this) {
                    instance = BasketSingletonClass()
                }
            }
            return instance!!
        }
    }
    fun mgcBasketAdd(mgc:Menu) {
        basketInfo.add(mgc)
    }
    fun mgcBasketInfo() {
        println("- 장바구니 목록 -")
        for(i in basketInfo){
            println("${i.name} | $ ${i.price}")
        }
        if(basketInfo.isEmpty()){
            println("장바구니가 비었습니다.")
        }
    }
}