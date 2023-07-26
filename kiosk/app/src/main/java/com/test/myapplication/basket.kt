package com.test.myapplication
class Basket(MGC:Menu) {
    private var basketinfo:Menu
    init {
        this.basketinfo=MGC
    }
//    fun basketInfo() :String {
//        var basket = BasketSingletonClass.getInstance()
//
////        basket.setMGC(basketinfo)
////        var result=basket.getMGC()
////        return "장바구니목록 : ${result.name}"
//    }
}


class BasketSingletonClass private constructor(mgcMenu:Menu) {
    private lateinit var basketList : MutableList<Menu>
    private val mgcMenu : Menu

    init {
        this.mgcMenu=mgcMenu
    }

    companion object {
        @Volatile private var instance: BasketSingletonClass? = null

        fun getInstance(): BasketSingletonClass {
            if(instance == null) {
                synchronized(this) {
//                    instance = BasketSingletonClass()
                }
            }
            return instance!!
        }
    }
//    fun setMGC(mgcMenu:Menu) {
//
//    }

//    fun getMGC(): Menu{
//
//    }
}