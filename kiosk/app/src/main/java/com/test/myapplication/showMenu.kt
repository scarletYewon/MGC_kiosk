package com.test.myapplication

fun showMenu(){
    println("===메인 메뉴 ===")
    println("1. 상세메뉴보기")
    println("2.종료")
    print("원하는 메뉴 번호를 입력하세요: ")

    val userInput = readLine() //사용자의 입력을 받습니다

    when (userInput?.toIntOrNull()) {
        1 -> showDetailMenu()
        2 -> showMenu()
        else ->{
            println("잘못된 입력입니다. 다시 시도해주세요")
            showMenu()
        }
    }
}

fun showDetailMenu() {
    println("=== 상세 메뉴 ===")
    println("1.Coffe 2.Tea 3.Ade 4.Frappe 5.Beverage")

    val userInput = readLine() //사용자의 입력을 받습니다

    when (userInput?.toIntOrNull()) {
        1 -> Coffee()
        2 -> Tea()
        3 -> Ade()
        4 -> Frappe()
        5 -> Beverage()
        else ->{
            println("잘못된 입력입니다. 다시 시도해주세요")
            showMenu()
        }
    }
}

fun Coffee(){

        println("1.아메리카노,2.큐브라떼,3.바닐라라떼,4.바닐라아메리카노,5.티라미수라떼")

        val userInput = readLine() //사용자의 입력을 받습니다
        when (userInput?.toIntOrNull()) {
            1 -> println("아메리카노의 가격은$4500원 입니다") //여기서 아메리카노와 가격을 ${name} , ${price}로 각각받아서 출력하는법,,? + class로 옮기는법

            else ->{
                println("잘못된 입력입니다. 다시 시도해주세요")
                showMenu()
            }
        }
    }

fun Tea(){
    println("1.허니자몽블랙티 2.사과유자차 3.캐모마일 4.복숭아아이스티 5.레몬차")
}
fun Ade(){
    println("1.레몬에이드 2.체리콕 3.청포도에이드 4.유니콘매직에이드(핑크) 5.유니콘매직에이드(블루)")
}
fun Frappe(){
    println("1.쿠키프라페 2.유니콘프라페 3.리얼초코프라페 4.민트프라페 5.스트로베리치즈홀릭")
}
fun Beverage(){
    println("1.고구마라떼 2.딸기라떼 3.녹차라떼 4.흑당버블밀크티라떼 5.토피넛 라떼")
}