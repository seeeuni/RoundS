//코틀린은 다중상속 지원 x 하나의 클래스가 두개 이상의 부모클래스를 가질 수 없음
/*인터페이스는 클래스가 아니므로 객체를 생성할 때 사용할 수 없다.
단, 클래스는 한개 이상의 인터페이스를 구현할 수 있으며 생성된 객체는 구현한
인터페이스형 참조변수에 담을 수 있다.
-인터페이스는 추상메서드와 일반메서드 모두를 구현해서 사용할 수 있다.
-인터페이스는 추상클래스와 목적이 비슷하지만, 하나의 클래스에 여러 인터페이스를
구현할 수 있는 장점을 가지고 있다.
 */
fun main(){
    val obj1 = TestClass11()
    val obj2 = TestClass12()
    testFun1(obj1)
    testFun2(obj2)

    val obj3 = TestClass13()
    val obj4 = TestClass14()

    testFun3(obj3)
    testFun4(obj4)
    val obj5 = TestClass15()
    testFun3(obj5)

}

open abstract class AbstractClass1{

    open abstract fun abstractMethod1()
}

open abstract class AbstractClass2{
    open abstract fun abstractMethod2()
}

fun testFun1(obj1:AbstractClass1){
    obj1.abstractMethod1()
}

fun testFun2(obj2:AbstractClass2){
    obj2.abstractMethod2()
}

class TestClass11 : AbstractClass1(){
    override fun abstractMethod1(){
        println("TestClass1의 abstractMethod1")
    }
}

class TestClass12 : AbstractClass2(){
    override fun abstractMethod2(){
        println("TestClass1의 abstractMethod1")
    }

}
//괄호 없음
interface Inter11{
    fun inter11Method1(){
        println("Inter11의 inter11Method1입니다")
    }
    fun inter11Method2()
}

interface Inter12{
    fun inter12Method1(){
        println("Inter12의 inter12Method1입니다")
    }
    fun inter12Method2()
}

fun testFun3(obj1:Inter11) {
    obj1.inter11Method1()
    obj1.inter11Method2()
}

fun testFun4(obj1:Inter12) {
    obj1.inter12Method1()
    obj1.inter12Method2()
}

class TestClass13 : Inter11{

    override fun inter11Method2(){
        println("TestClass13의 inter11Method2입니다")

    }
}

class TestClass14 : Inter12{

    override fun inter12Method2(){
        println("TestClass14의 inter12Method2입니다")

    }
}
// TestClass15를 갖고 객체를 만들었을때, Inter11타입에 넣을 경우 inter11Method2만 호출 가능
class TestClass15 : Inter11, Inter12{
    override fun inter11Method2(){
        println("TestClass15의 inter11Method2입니다")

    }
    override fun inter12Method2(){
        println("TestClass15의 inter12Method2입니다")

    }

}