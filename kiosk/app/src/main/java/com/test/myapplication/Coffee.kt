package com.test.myapplication

open class Coffee {



    fun coffeeMenu() {
        var americano = Americano()
        var cubeLatte = CubeLatte()
        var tiramisu = TiramisuLatte()
        var vinillaTe = VanillaLatte()
        var vinilaMerica = VanillaAmericano()

        var americanoMenu = americano.ame
        var cubeMenu = cubeLatte.cube
        var tiramisuMenu = tiramisu.tira
        var vinillaTeMenu = vinillaTe.vanilaTe
        var vanilAmericaMenu = vinilaMerica.vanilAmerica

        println("=====커피 메뉴입니다.=====")

        println("1. : ${americanoMenu.name}, 가격 : ${americanoMenu.price}, 설명: ${americanoMenu.description}")

        println("2. : ${cubeMenu.name}, 가격 : ${cubeMenu.price}, 설명: ${cubeMenu.description}")

        println("3. : ${tiramisuMenu.name}, 가격 : ${tiramisuMenu.price}, 설명: ${tiramisuMenu.description}")

        println("4. : ${vinillaTeMenu.name}, 가격 : ${vinillaTeMenu.price}, 설명: ${vinillaTeMenu.description}")

        println("5. : ${vanilAmericaMenu.name}, 가격 : ${vanilAmericaMenu.price}, 설명: ${vanilAmericaMenu.description}")

        println("6. 취소")



    }
}