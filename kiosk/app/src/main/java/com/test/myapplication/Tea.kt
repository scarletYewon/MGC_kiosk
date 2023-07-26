package com.test.myapplication

open class Tea {

    fun teaMenu() {
        var appleCitronTea = AppleCitronTea()
        var chamomileTea = ChamomileTea()
        var tiramisu = TiramisuLatte()
        var peachIceTea = PeachIceTea()
        var honeyGrapefruitBlackTea = HoneyGrapefruitBlackTeaCoffee()

        var appleCitronTeaMenu = appleCitronTea.appleCitron
        var chamomileMenu = chamomileTea.chamomile
        var tiramisuMenu = tiramisu.tira
        var peachIceMenu = peachIceTea.peachIce
        var honeyGrapeMenu = honeyGrapefruitBlackTea.honeyGrape

        println("=====티 메뉴입니다.=====")

        println("1. : ${appleCitronTeaMenu.name}, 가격 : ${appleCitronTeaMenu.price}, 설명: ${appleCitronTeaMenu.description}")

        println("2. : ${chamomileMenu.name}, 가격 : ${chamomileMenu.price}, 설명: ${chamomileMenu.description}")

        println("3. : ${tiramisuMenu.name}, 가격 : ${tiramisuMenu.price}, 설명: ${tiramisuMenu.description}")

        println("4. : ${peachIceMenu.name}, 가격 : ${peachIceMenu.price}, 설명: ${peachIceMenu.description}")

        println("5. : ${honeyGrapeMenu.name}, 가격 : ${honeyGrapeMenu.price}, 설명: ${honeyGrapeMenu.description}")

        println("6. 취소")



    }
}