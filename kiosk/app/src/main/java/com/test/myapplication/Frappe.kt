package com.test.myapplication

open class Frappe {
    fun frappeMenu() {
        var cookieFrappe = CookieFrappe()
        var realChocoFrappe = RealChocoFrappe()
        var mintFrappe = MintFrappe()
        var strawberryCheeseHolic = StrawberryCheeseHolic()
        var uniconFrappe = UniconFrappe()

        var cookieMenu = cookieFrappe.cookies
        var realMenu = realChocoFrappe.reals
        var mintMenu = mintFrappe.mints
        var strawberryMenu = strawberryCheeseHolic.strawberrys
        var uniconFrappeMenu = uniconFrappe.unicons

        println("=====프라페 메뉴입니다.=====")

        println("1. : ${cookieMenu.name}, 가격 : ${cookieMenu.price}, 설명: ${cookieMenu.description}")

        println("2. : ${realMenu.name}, 가격 : ${realMenu.price}, 설명: ${realMenu.description}")

        println("3. : ${mintMenu.name}, 가격 : ${mintMenu.price}, 설명: ${mintMenu.description}")

        println("4. : ${strawberryMenu.name}, 가격 : ${strawberryMenu.price}, 설명: ${strawberryMenu.description}")

        println("5. : ${uniconFrappeMenu.name}, 가격 : ${uniconFrappeMenu.price}, 설명: ${uniconFrappeMenu.description}")

        println("6. 취소")



    }
}