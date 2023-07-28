package com.test.myapplication

class Drink(name: String, price: Int, description: String): Menu(name, description){
    var price: Int

    init{
        this.price = price
        this.description = description
    }
    override fun displayInfo(){
        println("ID: $idx, 이름: $name, 가격: $price, 설명: [ $description]")
    }
}


//"아메리카노",2000,"메가MGC커피 블렌드 원두로 추출한 에스프레소에 물을 더한 커피"