package com.test.myapplication
class aa(MGC:Menu) {
    var b:Menu
    init {
        this.b=MGC
    }
    fun mm() :String {
        var basket = BasketSingletonClass.getInstance()
        basket.setMGC(b)
        var result=basket.getMGC()
        return "장바구니목록 : ${result.name}"
    }
}


class BasketSingletonClass private constructor() {
    private var mm=Menu("",0,"")



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
    fun setMGC(mgcMenu:Menu) {
        mm.name=mgcMenu.name
        mm.price=mgcMenu.price
        mm.description=mgcMenu.description
    }

    fun getMGC(): Menu{
        return this.mm
    }
}