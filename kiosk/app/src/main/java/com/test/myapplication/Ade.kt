package com.test.myapplication

open class Ade {
    fun adeMenu() {
        var lemonAde = LemonAde()
        var greenGrapeAde = GreenGrapeAde()
        var uniconMagicAdePink = UniconMagicAdePink()
        var uniconMagicAdeBlue = UniconMagicAdeBlue()
        var cherryCoke = CherryCoke()

        var lemonAdeMenu = lemonAde.lemonA
        var greenGrapeAdeMenu = greenGrapeAde.greenGrape
        var uniconMagicAdePinkMenu = uniconMagicAdePink.uniconPink
        var uniconMagicAdeBlueMenu = uniconMagicAdeBlue.uniconBlue
        var CherryCokeMenu = cherryCoke.cherry

        println("=====에이드 메뉴입니다.=====")

        println("1. : ${lemonAdeMenu.name}, 가격 : ${lemonAdeMenu.price}, 설명: ${lemonAdeMenu.description}")

        println("2. : ${greenGrapeAdeMenu.name}, 가격 : ${greenGrapeAdeMenu.price}, 설명: ${greenGrapeAdeMenu.description}")

        println("3. : ${uniconMagicAdePinkMenu.name}, 가격 : ${uniconMagicAdePinkMenu.price}, 설명: ${uniconMagicAdePinkMenu.description}")

        println("4. : ${uniconMagicAdeBlueMenu.name}, 가격 : ${uniconMagicAdeBlueMenu.price}, 설명: ${uniconMagicAdeBlueMenu.description}")

        println("5. : ${CherryCokeMenu.name}, 가격 : ${CherryCokeMenu.price}, 설명: ${CherryCokeMenu.description}")

        println("6. 취소")



    }
}