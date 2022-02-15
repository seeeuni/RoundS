/* 생성자
    - 객체 생성 시 자동으로 수행될 코드를 작성하는 곳
    - 값을 셋팅하고 삭제하는 목적
    - 메서드와 비슷해 보이지만 반환 타입이 없어 메서드라고 부르지 않는다.
    init 코드 블록 - 자동으로 처리되는 코드
 */

fun main(){
    val obj1 = TestClass4()
    println("obj1 : $obj1")

    println("------------------------")

    val obj2 = TestClass5()
    println("obj2 : $obj2")
    println("obj2.v1 : ${obj2.v1}")
    println("obj2.v2 : ${obj2.v2}")

    val obj3 = TestClass5(100, 200)
    println("obj3 : $obj3")
    println("obj3.v1 : $obj3.v1")
    println("obj3.v2 : $obj3.v1")

    println("------------------------------")

    val obj4 = TestClass6(100, 200)
    val obj5 = TestClass7(1000, 2000)
    println("obj4.a1 : ${obj4.a1}")
    println("obj4.a2 : ${obj4.a2}")

    println("obj5.a1 : ${obj5.a1}")
    println("obj5.a2 : ${obj5.a2}")

    println("--------------------")
    val obj6 = TestClass8(100,200)
    println("obj6.a1 : ${obj6.a1}")
    println("obj6.a2 : ${obj6.a2}")

    println("-------------------")
    val obj7 = TestClass8(100)


}

class TestClass4 {
//method로 만들면 호출하지 않으면 동작안함
    init{
        println("객체가 생성되는 자동으로 동작되는 부분입니다")
    }

}

class TestClass5 {
    var v1:Int = 0
    var v2:Int = 0
//둘 중 하나가 동작, 보조 생성자
   constructor() {
        println("매개 변수가 없는 생성자")
   }

    constructor(a1:Int, a2: Int){
        println("매개 변수가 두 개인 생성자")
        v1 = a1
        v2 = a2
    }
}
//기본 생성자(주 생성자) : class 옆에 변수 정의 & var나 val 붙이면 멤버 변수까지 정의
class TestClass6 constructor (var a1:Int, val a2:Int)
class TestClass7 (var a1:Int, val a2:Int)


/*주 생성자 먼저 수행 -> init 코드 블록 수행
=> a1, a2에 값이 들어가서 출력
 */
class TestClass8 (var a1:Int, val a2:Int){

    init {
        println("init 코드 수행")
        println("a1 : $a1")
        println("a2 : $a2")
    }
//보조 생성자는 무조건 주생성자 호출해야함, var 쓸수 없음 -> 흐름파악하기기
   constructor(a1:Int) : this(a1, 100) {
        println("보조 생성자 호출")
    }
}

