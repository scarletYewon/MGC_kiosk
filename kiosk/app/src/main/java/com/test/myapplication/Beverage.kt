package com.test.myapplication

open class Beverage {

    fun beverageMenu() {
        var strawberryLatte = StrawberryLatte()
        var sweetpotatoLatte = SweetpotatoLatte()
        var toffeenutLatte = ToffeenutLatte()
        var blackSugarBubbleMilkTeaLatte = BlackSugarBubbleMilkTeaLatte()
        var greenTeaLatte = GreenTeaLatte()

        var strawberryLatteMenu = strawberryLatte.strawLattes
        var sweetpotatoLatteMenu = sweetpotatoLatte.sweets
        var toffeenutLatteMenu = toffeenutLatte.toffeenuts
        var blackSugarBubbleMilkTeaLatteMenu = blackSugarBubbleMilkTeaLatte.blacksugars
        var greenTeaLatteMenu = greenTeaLatte.greenTeas

        println("=====기타음료 메뉴입니다.=====")

        println("1. : ${strawberryLatteMenu.name}, 가격 : ${strawberryLatteMenu.price}, 설명: ${strawberryLatteMenu.description}")

        println("2. : ${sweetpotatoLatteMenu.name}, 가격 : ${sweetpotatoLatteMenu.price}, 설명: ${sweetpotatoLatteMenu.description}")

        println("3. : ${toffeenutLatteMenu.name}, 가격 : ${toffeenutLatteMenu.price}, 설명: ${toffeenutLatteMenu.description}")

        println("4. : ${blackSugarBubbleMilkTeaLatteMenu.name}, 가격 : ${blackSugarBubbleMilkTeaLatteMenu.price}, 설명: ${blackSugarBubbleMilkTeaLatteMenu.description}")

        println("5. : ${greenTeaLatteMenu.name}, 가격 : ${greenTeaLatteMenu.price}, 설명: ${greenTeaLatteMenu.description}")

        println("6. 취소")



    }
}