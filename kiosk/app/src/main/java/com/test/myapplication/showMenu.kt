package com.test.myapplication

import com.test.myapplication.MGCoverAll.AdeMenu
import com.test.myapplication.MGCoverAll.BeverageMenu
import com.test.myapplication.MGCoverAll.CoffeeMenu
import com.test.myapplication.MGCoverAll.FrappeMenu
import com.test.myapplication.MGCoverAll.TeaMenu


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
                        val frappeInfo=frappeInfo()
                        FrappeMenu(frappeInfo).detail()
                    }
                    5 -> {
                        val beverageInfo=beverageInfo()
                        BeverageMenu(beverageInfo).detail()
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
