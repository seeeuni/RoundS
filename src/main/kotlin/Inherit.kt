/* 상속 - 클래스를 설계할 때 다른 클래스가 가지고 있는 부분을 물려받는것
클래스마다 중복된 부분을 클래스 한 곳에 만들 수 있음
부모 클래스(SuperClas) - 자식 클래스(SubClass)
부모 클래스 : open 키워드 사용해야함 (final이 디폴트)
 */
fun main (){
    val s1 = SubClass1()
    println("s1.subMember1 : ${s1.subMember1}")
    s1.subMethod1()

    println("s1.superMember1 : ${s1.superMember1}")
    s1.superMethod1()
}

open class SuperClass1 {
    var superMember1 = 100

    fun superMethod1() {
        println("SuperClass1의 메서드 입니다")
    }
}
//반드시 부모 클래스의 생성자를 호출해야 함
class SubClass1 : SuperClass1() {
    val subMember1 = 200

    fun subMethod1(){
        println("SubClass1의 메서드 입니다")
    }
}
//부모 클래스에 매개변수 있는 생성자 정의했으므로,
// 자식 클래스에서 반드시 매개변수 값을 넘겨줘야함
open class SuperClass2(val a1:Int)

class SubClass2 : SuperClass2(100)

class SubClass3 : SuperClass2{
    constructor() : super(100)
}