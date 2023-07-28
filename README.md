# MGC_kiosk

**팀원 : 이예원 김현걸 남윤희 윤동현 임두형**

**깃허브 : https://github.com/scarletYewon/MGC_kiosk**
**노션 : https://www.notion.so/scarletyewon/5-5-d1de9486375a43bea409ef097f46dfdc**


![img](https://github.com/scarletYewon/MGC_kiosk/assets/81704418/6ba421d1-3e8a-40d3-b49a-6c6f618b5cdd)

# 데이터값

<img width="991" alt="스크린샷 2023-07-27 오후 4 19 50" src="https://github.com/scarletYewon/MGC_kiosk/assets/81704418/286f328d-09a3-4e96-a6b1-000fd19eadff">


# 파일 목록

*( 각 코드 스니펫 캡션 참고 )*

## Package[MGCCoverAll]

### coffee.kt

```kotlin
package com.test.myapplication.MGCoverAll

import com.test.myapplication.Menu

class CoffeeMenu(info:MutableList<Menu>) {
    private var sel=0
    private val info:MutableList<Menu>
    private var cnt=0
    init {
        this.info=info
    }
    fun detail() {
        while(true){
                println("[ COFFEE 메뉴 ]")
                for(i in info){
                    println("${++cnt}. ${i.name} | $ ${i.price} | ${i.description}")
                    if(cnt==5){
                        cnt=0
                    }
                }
                println("0. 이전")
                print("select >> ")
            try {
                sel= readLine()!!.toInt()
                when(sel) {
                    1 -> {
                        Americano(info[sel-1]).displayInfo()
                        println("")
                    }
                    2 -> {
                        CubeLatte(info[sel-1]).displayInfo()
                        println("")
                    }
                    3 -> {
                        VanillaLatte(info[sel-1]).displayInfo()
                        println("")
                    }
                    4 -> {
                        VanillaAmericano(info[sel-1]).displayInfo()
                        println("")
                    }
                    5 -> {
                        TiramisuLatte(info[sel-1]).displayInfo()
                        println("")
                    }
                    0 -> {
                        break
                    }
                }
            }catch (e:java.lang.NumberFormatException) {
                println("번호를 입력해주세요")
            }
        }
    }
}

class Americano(AmericanoData: Menu) : OverAll(AmericanoData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class CubeLatte(cubeLatteData: Menu) : OverAll(cubeLatteData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class VanillaLatte(VanillaLatteData: Menu) : OverAll(VanillaLatteData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class VanillaAmericano(VanillaAmericanoData: Menu) : OverAll(VanillaAmericanoData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class TiramisuLatte(TiramisuLatteData: Menu) : OverAll(TiramisuLatteData) {
    override fun displayInfo() {
        super.displayInfo()
    }
}
```

### tea.kt

```kotlin
package com.test.myapplication.MGCoverAll

import com.test.myapplication.Menu

class TeaMenu(info:MutableList<Menu>) {
    private var sel=0
    private val info:MutableList<Menu>
    private var cnt=0
    init {
        this.info=info
    }
    fun detail() {
        while(true){
            println("[ TEA 메뉴 ]")
            for(i in info){
                println("${++cnt}. ${i.name} | $ ${i.price} | ${i.description}")
                if(cnt==5){
                    cnt=0
                }
            }
            println("0. 이전")
            print("select >> ")
            try {
                sel= readLine()!!.toInt()
                when(sel) {
                    1 -> {
                        BlackTea(info[sel-1]).displayInfo()
                        println("")
                    }
                    2 -> {
                        AppleCitronTea(info[sel-1]).displayInfo()
                        println("")
                    }
                    3 -> {
                        Chamomile(info[sel-1]).displayInfo()
                        println("")
                    }
                    4 -> {
                        PeachIceTea(info[sel-1]).displayInfo()
                        println("")
                    }
                    5 -> {
                        LemonTea(info[sel-1]).displayInfo()
                        println("")
                    }
                    0 -> {
                        break
                    }
                }
            }catch (e:java.lang.NumberFormatException) {
                println("번호를 입력해주세요")
            }
        }
    }
}

class BlackTea(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class AppleCitronTea(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class Chamomile(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class PeachIceTea(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class LemonTea(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}
```

### ade.kt

```kotlin
package com.test.myapplication.MGCoverAll

import com.test.myapplication.Menu

class AdeMenu(info:MutableList<Menu>) { 
    private var sel=0
    private val info:MutableList<Menu> 
    private var cnt=0
    init {
        this.info=info
    }
    fun detail() {
        while(true){
            println("[ ADE 메뉴 ]")
            for(i in info){
                println("${++cnt}. ${i.name} | $ ${i.price} | ${i.description}")
                if(cnt==5){
                    cnt=0
                }
            }
            println("0. 이전")
            print("select >> ")
            try {
                sel= readLine()!!.toInt()
                when(sel) {
                    1 -> {
                        LemonAde(info[sel-1]).displayInfo()
                        println("")
                    }
                    2 -> {
                        CherryCoke(info[sel-1]).displayInfo()
                        println("")
                    }
                    3 -> {
                        GreenGrapeAde(info[sel-1]).displayInfo()
                        println("")
                    }
                    4 -> {
                        UnicornPink(info[sel-1]).displayInfo()
                        println("")
                    }
                    5 -> {
                        UnicornBlue(info[sel-1]).displayInfo()
                        println("")
                    }
                    0 -> {
                        break
                    }
                }
            }catch (e:java.lang.NumberFormatException) {
                println("번호를 입력해주세요")
            }
        }
    }
}

class LemonAde(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class CherryCoke(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class GreenGrapeAde(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class UnicornPink(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class UnicornBlue(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}
```

### frappe.kt

```kotlin
package com.test.myapplication.MGCoverAll

import com.test.myapplication.Menu

class FrappeMenu(info:MutableList<Menu>) {
    private var sel=0
    private val info:MutableList<Menu>
    private var cnt=0
    init {
        this.info=info
    }
    fun detail() {
        println("[ FRAPPE 메뉴 ]")
        while(true){
            for(i in info){
                println("${++cnt}. ${i.name} | $ ${i.price} | ${i.description}")
                if(cnt==5){
                    cnt=0
                }
            }
            println("0. 이전")
            print("select >> ")
            try {
                sel= readLine()!!.toInt()
                when(sel) {
                    1 -> {
                        CookieFrappe(info[sel-1]).displayInfo()
                        println("")
                    }
                    2 -> {
                        UnicornFrappe(info[sel-1]).displayInfo()
                        println("")
                    }
                    3 -> {
                        RealChocoFrappe(info[sel-1]).displayInfo()
                        println("")
                    }
                    4 -> {
                        MintFrappe(info[sel-1]).displayInfo()
                        println("")
                    }
                    5 -> {
                        CheeseHolic(info[sel-1]).displayInfo()
                        println("")
                    }
                    0 -> {
                        break
                    }
                }
            }catch (e:java.lang.NumberFormatException) {
                println("번호를 입력해주세요")
            }
        }
    }
}

class CookieFrappe(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class UnicornFrappe(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class RealChocoFrappe(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class MintFrappe(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class CheeseHolic(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}
```

### beverage.kt

```kotlin
package com.test.myapplication.MGCoverAll

import com.test.myapplication.Menu

class BeverageMenu(info:MutableList<Menu>) {
    private var sel=0
    private val info:MutableList<Menu>
    private var cnt=0
    init {
        this.info=info
    }
    fun detail() {
        while(true){
            println("[ BEVERAGE 메뉴 ]")
            for(i in info){
                println("${++cnt}. ${i.name} | $ ${i.price} | ${i.description}")
                if(cnt==5){
                    cnt=0
                }
            }
            println("0. 이전")
            print("select >> ")
            try {
                sel= readLine()!!.toInt()
                when(sel) {
                    1 -> {
                        SweetPotatoLatte(info[sel-1]).displayInfo()
                        println("")
                    }
                    2 -> {
                        StrawberryLatte(info[sel-1]).displayInfo()
                        println("")
                    }
                    3 -> {
                        GreenTeaLatte(info[sel-1]).displayInfo()
                        println("")
                    }
                    4 -> {
                        BlackBubble(info[sel-1]).displayInfo()
                        println("")
                    }
                    5 -> {
                        NutLatte(info[sel-1]).displayInfo()
                        println("")
                    }
                    0 -> {
                        break
                    }
                }
            }catch (e:java.lang.NumberFormatException) {
                println("번호를 입력해주세요")
            }
        }
    }
}

class SweetPotatoLatte(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class StrawberryLatte(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class GreenTeaLatte(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class BlackBubble(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}

class NutLatte(Data: Menu) : OverAll(Data) {
    override fun displayInfo() {
        super.displayInfo()
    }
}
```

### MGCsuper.kt

```kotlin
package com.test.myapplication.MGCoverAll

import com.test.myapplication.BasketSingletonClass
import com.test.myapplication.Menu
import kotlinx.coroutines.*

open class OverAll(coffees: Menu) {
    private var info:Menu=coffees
    private var sel=0

    private val name:String
    private val price:Int
    private val description:String

    init {
        this.name=coffees.name
        this.price=coffees.price
        this.description=coffees.description
    }

    open fun displayInfo() {
        println("-${name} 선택-")
        println("가격 : $ ${price}")
        println("설명 : ${description}")
        println("")
        println("${name} | $ ${price} | ${description}")
        menuCheck()
    }

    fun menuCheck() {
        println("위 메뉴를 장바구니에 추가하시겠습니까?")
        println("1. 확인     2. 취소")
        print(">> ")
        sel= readLine()!!.toInt()
        when(sel){
            1 -> {
                print("${name} (이/가) 장바구니에 추가되었습니다.\n")
                var shopping=BasketSingletonClass.getInstance()
                shopping.mgcBasketAdd(info)
                println("장바구니에 추가중입니다..........\n3초만 기다려주세요!")
                var job = CoroutineScope(Dispatchers.Default).launch {
                    delay(1000)
                    println("2초만기다려주세요!")
                    delay(1000)
                    println("1초만기다려주세요!")
                    delay(1000)
                    println("< 추가완료 >")
                }
                runBlocking {
                    job.join()
                }
            }
            2 -> {
                print("취소되었습니다.")
            }
        }
    }
}
```

## main.kt

```kotlin
package com.test.myapplication

fun main(){
    val menuSelect=MainMenu()
    val megaThread = MegaThread()
    megaThread.start()
    menuSelect.showMenu()
}
```

## menu.kt

```kotlin
package com.test.myapplication

data class Menu(
    var name : String,
    var price : Int,
    var description : String,
)
```

## showMenu.kt

```kotlin
package com.test.myapplication

import com.test.myapplication.MGCoverAll.AdeMenu
import com.test.myapplication.MGCoverAll.BeverageMenu
import com.test.myapplication.MGCoverAll.CoffeeMenu
import com.test.myapplication.MGCoverAll.FrappeMenu
import com.test.myapplication.MGCoverAll.TeaMenu
import kotlinx.coroutines.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.concurrent.thread

class MainMenu{
    private var select=0
    fun showMenu(){
        while(true){
            println("=====================")
            println("   [ MEGA COFFEE ]")
            println("=====================")
            println("1. 커피      | COFFEE")
            println("2. 티        | TEA")
            println("3. 에이드    | ADE")
            println("4. 프라페    | FRAPPE")
            println("5. 음료      | BEVERAGE")
            println("6. 장바구니")
            println("7. 주문하기")
            println("8. 종료")
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
                        val frappeInfo=frappeInfo()
                        FrappeMenu(frappeInfo).detail()
                    }
                    5 -> {
                        val beverageInfo=beverageInfo()
                        BeverageMenu(beverageInfo).detail()
                    }
                    6 -> {
                        val basket=BasketSingletonClass.getInstance()
                        basket.mgcBasketInfo()
                        println("")
                    }
                    7 -> {
                        val todayDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern(
                            "yyyy-MM-dd HH:mm:ss"))
                        val now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHmm"))!!.toInt()
                        val basket=BasketSingletonClass.getInstance()
                        basket.mgcBasketInfo()
                        var total=basket.mgcBasketTotal()
                        println("주문하시겠습니까?")
                        println("1. 확인    2. 메뉴판")
                        print(" >> ")
                        select= readLine()!!.toInt()
                        when(select){
                            1 -> {
                                if(now in 2310..2320){
                                    println("현재 시각은 ${todayDate.slice(IntRange(11,15))}입니다.")
                                    println("은행 점검 시간은 23시 10분 ~ 23시 20분이므로 결제할 수 없습니다.")
                                    System.exit(0)
                                }
                                val withdrawRange = (3000..10000)
                                val withdraw = withdrawRange.random()
                                println("현재 잔액은 $ ${withdraw}")
                                if(total>withdraw){
                                    println("현재 잔액은 ${withdraw} 으로 ${total-withdraw}이 부족해서 주문할 수 없습니다.")
                                }else if(total<withdraw){
                                    println("결제되었습니다. ${todayDate}")
                                    println("남은 잔액 $ ${withdraw-total}")
                                }
                                println("")
                                println("이용해주셔서 감사합니다.")
                                System.exit(0)
                            }
                        }
                    }
                    8 -> {
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
        cof.add(Menu("아메리카노",2000,"메가MGC커피 블렌드 원두로 추출한 에스프레소에 물을 더한 커피"))
        cof.add(Menu("큐브라떼",4200,"연유를 섞은 라떼에 에스프레소를 얼린 커피큐브를 올려 녹을수록 더 진한 라떼"))
        cof.add(Menu("바닐라라떼",3400,"바닐라의 짙은 향과 풍부한 폼 밀크의 조화가 인상적인 달콤한 라떼"))
        cof.add(Menu("바닐라아메리카노",2700,"아메리카노에 바닐라의 부드러운 향과 달콤함을 조화롭게 담아낸 커피"))
        cof.add(Menu("티라미수라떼",3900,"에스프레소와 티라미수 소스, 우유 그리고 풍미를 더해주는 달달한 크림까지 곁들여 완성한 티라미수 라떼"))
        return cof
    }

    fun teaInfo() : MutableList<Menu>{
        var tea= mutableListOf<Menu>()
        tea.add(Menu("허니자몽블랙티",3700,"달콤한 꿀청에 재운 자몽에 홍차의 부드러움을 어우른 상큼한 과일티"))
        tea.add(Menu("사과유자차",3500,"애플티의 향긋함과 유자청의 상큼달콤함을 한컵에 담아낸 과일티"))
        tea.add(Menu("캐모마일",2500,"마음을 진정 시켜주는 산뜻한 풀내음을 느낄 수 있는 허브티"))
        tea.add(Menu("복숭아아이스티",3000,"깊은 맛의 홍차와 달콤한 복숭아의 은은한 향이 어우러진 시원한 여름철 인기 음료"))
        tea.add(Menu("레몬차",3300,"상큼한 레몬의 맛과 향을 오롯이 살린 비타민C 가득한 과일티"))
        return tea
    }

    fun adeInfo() : MutableList<Menu>{
        var ade= mutableListOf<Menu>()
        ade.add(Menu("레몬에이드",3500,"시트러스향 가득한 레몬의 상큼함과 톡쏘는 탄산의 상쾌함이 만난 청량 에이드"))
        ade.add(Menu("체리콕",3300,"체리의 새콤함과 청량감을 동시에 즐길 수 있는 환상적인 에이드"))
        ade.add(Menu("청포도에이드",3500,"산뜻한 청포도와 상쾌한 탄산의 달달한 조화가 인상적인 에이드"))
        ade.add(Menu("유니콘매직에이드(핑크)",3800,"섞으면 마법처럼 색이 변하는 재미에 레몬의 상큼함으로 입까지 즐거운 이색 에이드"))
        ade.add(Menu("유니콘매직에이드(블루)",3800,"섞으면 마법처럼 색이 변하는 재미에 라임의 청량함으로 입까지 즐거운 이색 에이드"))
        return ade
    }

    fun frappeInfo() : MutableList<Menu>{
        var frappe= mutableListOf<Menu>()
        frappe.add(Menu("쿠키프라페",3900,"바삭하고 달콤한 오레오와 고소한 우유, 부드러운 바닐라향의 조화를 느낄 수 있는 프라페"))
        frappe.add(Menu("유니콘프라페",4800,"핑크빛 보라빛 그 중간 어딘가에 오묘하게 파란 시럽이 줄줄 떨어지는 스무디"))
        frappe.add(Menu("리얼초코프라페",3900,"진한 초코소스와 부드러운 바닐라향의 만남으로 질리지 않는 달콤함을 완성한 프라페"))
        frappe.add(Menu("민트프라페",3900,"상쾌한 민트에 달콤하게 씹히는 재미를 더한 초콜릿칩의 즐거운 하모니가 매력적인 프라페"))
        frappe.add(Menu("스트로베리치즈홀릭",4500,"상큼한 딸기 요거트 스무디 위에 고급스런 맛의 치즈케이크가 듬뿍 올라가 먹는 재미를 배가한 스무디"))
        return frappe
    }

    fun beverageInfo() : MutableList<Menu>{
        var beverage= mutableListOf<Menu>()
        beverage.add(Menu("고구마라떼",3500,"달콤하고 고소한 고구마와 부드러운 우유가 만나 누구나 즐기기 좋은 든든한 라떼"))
        beverage.add(Menu("딸기라떼",3700,"산뜻하고 달콤한 딸기가 부드러운 우유와 어우러져 더욱 기분 좋게 즐기는 아이스 라떼"))
        beverage.add(Menu("녹차라떼",3500,"향긋한 녹차에 우유를 더해 입 안에 부드러운 푸릇함을 선물하는 라떼"))
        beverage.add(Menu("흑당버블밀크티라떼",3800,"티바론 얼그레이 홍차의 깊은 맛을 살린 밀크티 라떼에 진한 흑당과 흑당 버블의 달콤함을 채운 음료"))
        beverage.add(Menu("토피넛라떼",3800,"은은하게 퍼지는 카라멜의 달달한 향기와 견과의 고소함을 한입에 즐길 수 있는 라떼"))
        return beverage
    }
}
```

## basket.kt

```kotlin
package com.test.myapplication

class BasketSingletonClass private constructor() {
    private val basketInfo = mutableListOf<Menu>()

    companion object {
        @Volatile private var instance: BasketSingletonClass? = null

        fun getInstance(): BasketSingletonClass {
            if(instance == null) {
                synchronized(this) {
                    instance = BasketSingletonClass()
                }
            }
            return instance!!
        }
    }
    fun mgcBasketAdd(mgc:Menu) {
        basketInfo.add(mgc)
    }
    fun mgcBasketInfo() {
        println("- 장바구니 목록 -")
        for(i in basketInfo){
            println("${i.name} | $ ${i.price}")
        }
        if(basketInfo.isEmpty()){
            println("장바구니가 비었습니다.")
        }
    }
    fun mgcBasketTotal() : Int{
        var hap=0
        for(i in basketInfo){
            hap+=i.price
        }
        return hap
    }
    fun mgcBasketSize() : Int{
        return basketInfo.size
    }
}
```

## thread.kt

```kotlin
package com.test.myapplication

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MegaThread : Thread(){
    override fun run() {
        val basket=BasketSingletonClass.getInstance()
        while (true) {
            val cnt = basket.mgcBasketSize()
            println("\n( 현재 주문 현황 : ${cnt}잔 )")
            runBlocking {
                launch {
                    delay(5000)
                }
            }
        }
    }
}
```

# 실행화면
![%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-07-27_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_4 19 50](https://github.com/scarletYewon/MGC_kiosk/assets/81704418/9df9dfcb-7834-45a4-aa3c-ce6c5cf9a77f)

**Lv5_2 예외처리**

![%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-07-27_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_4 28 13](https://github.com/scarletYewon/MGC_kiosk/assets/81704418/a5cea892-0295-44f4-bede-0ad45498d532)
