package com.test.myapplication

import java.util.ArrayList


class MainMenu{
    private var select=0
    fun showMenu(){
        while(true){
            println("=================")
            println("   MEGA COFFEE")
            println("=================")
            println("==========")
            println("[MGC MENU]")
            println("==========")
            println("1. 커피      | COFFEE")
            println("2. 티        | TEA")
            println("3. 에이드    | ADE")
            println("4. 프라페    | FRAPPE")
            println("5. 음료      | BEVERAGE")
            println("6. 종료")
            println("==========")
            print("Select >> ")
            try {
                select= readLine()!!.toInt()
                when(select){
                    1 -> {
                        val cofInfo=cofInfo()
                        CoffeeMenu(cofInfo).detail()
                    }
                    2 -> {
                        val teaInfo=teaInfo()
                        TeaMenu(teaInfo).detail()
                    }
                    3 -> {
                        val adeInfo=adeInfo()
                        AdeMenu(adeInfo).detail()
                    }
                    4 -> {

                    }
                    5 -> {

                    }
                    6 -> {
                        System.exit(0)
                    }
                }
            } catch (e:java.lang.NumberFormatException) {
                println("숫자를 입력하세요")
            }
        }
    }

    fun cofInfo() : MutableList<Menu>{
        var cof= mutableListOf<Menu>()
        cof.add(Menu("아메리카노",3000,"에스프레소를 물에 희석해 마시는 방식의 커피"))
        cof.add(Menu("큐브라떼",4500,"작성중.."))
        cof.add(Menu("바닐라라떼",4000,"작성중.."))
        cof.add(Menu("바닐라아메리카노",3800,"작성중.."))
        cof.add(Menu("티라미수라떼",5000,"작성중.."))
        return cof
    }

    fun teaInfo() : MutableList<Menu>{
        var tea= mutableListOf<Menu>()
        tea.add(Menu("허니자몽블랙티",3000,"작성중.."))
        tea.add(Menu("사과유자차",4500,"작성중.."))
        tea.add(Menu("캐모마일",4000,"작성중.."))
        tea.add(Menu("복숭아아이스티",3800,"작성중.."))
        tea.add(Menu("레몬차",5000,"작성중.."))
        return tea
    }

    fun adeInfo() : MutableList<Menu>{
        var ade= mutableListOf<Menu>()
        ade.add(Menu("레몬에이드",3000,"작성중.."))
        ade.add(Menu("체리콕",4500,"작성중.."))
        ade.add(Menu("청포도에이드",4000,"작성중.."))
        ade.add(Menu("유니콘매직에이드(핑크)",3800,"작성중.."))
        ade.add(Menu("유니콘매직에이드(블루)",5000,"작성중.."))
        return ade
    }



}
