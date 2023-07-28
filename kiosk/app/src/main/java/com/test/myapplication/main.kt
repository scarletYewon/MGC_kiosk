package com.test.myapplication

val menus: MutableList<Menu> = ArrayList()
val drinks: MutableList<Drink> = ArrayList()
fun main(){
    init()
}
fun init(){
    //메뉴추가
    menus.add(Menu("Coffee", "커피"))
    menus.add(Menu("TEA", "티"))
    menus.add(Menu("ADE", "에이드"))
    menus.add(Menu("FRAPPE", "프라페"))
    menus.add(Menu("BEVERAGE", "음료"))
    menus.add(Menu("Cancel", "종료"))

    //커피 종류 추가
    drinks.add(Drink("아메리카노",2000,"메가MGC커피 블렌드 원두로 추출한 에스프레소에 물을 더한 커피"))
    drinks.add(Drink("큐브라떼",4200,"연유를 섞은 라떼에 에스프레소를 얼린 커피큐브를 올려 녹을수록 더 진한 라떼"))
    drinks.add(Drink("바닐라라떼",3400,"바닐라의 짙은 향과 풍부한 폼 밀크의 조화가 인상적인 달콤한 라떼"))
    drinks.add(Drink("바닐라아메리카노",2700,"아메리카노에 바닐라의 부드러운 향과 달콤함을 조화롭게 담아낸 커피"))
    drinks.add(Drink("티라미수라떼",3900,"에스프레소와 티라미수 소스, 우유 그리고 풍미를 더해주는 달달한 크림까지 곁들여 완성한 티라미수 라떼"))



}