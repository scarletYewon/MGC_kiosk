package com.test.myapplication


class MainMenu{
    private var select=0
    val cof= mutableListOf<Coffee>()
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
                        coffeeMenu()
                    }
                    2 -> {

                    }
                    3 -> {

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

    fun coffeeMenu() {
        while(true){
            println("1. 아메리카노 | $ 3.0")
            println("2. 큐브라떼   | $ 4.5")
            println("3. 바닐라라떼 | $ 4.8")
            println("4. 바닐라아메리카노 | $ 3.8")
            println("5. 티라미수라떼 | $ 5.0")
            println("6. 이전")
            print("Select >> ")
            try {
                select= readLine()!!.toInt()
                when(select){
                    1 -> {
                        Americano(Menu("아메리카노",3000,"일반커피입니다.")).displayInfo()
                        System.exit(0)
                    }
                    2 -> {

                    }
                    3 -> {

                    }
                    4 -> {

                    }
                    5 -> {

                    }
                    6 -> {
                        showMenu()
                    }
                }
            } catch (e:java.lang.NumberFormatException) {
                println("숫자를 입력하세요")
            }
        }
    }
}
