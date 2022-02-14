fun main(){
/*객체 : 매개체 하나의 정보와 기능을 관리하는 것
객체는 클래스를 통해 생성가능, 같은 형태의 객체가 다수 필요하다면
같은 클래스로 객체를 무수히 만들어 사용하면 된다.
TestClass(): 객체
객체를 사용하려면 어디에 있는지 알아야함 -> 주소가 변수에 담김 */
    val obj1:TestClass1 = TestClass1()
        println("obj1 : $obj1")
    //같은 클래스를 갖고 만들어도 다른 객체이므로 주소가 다름
    val obj2 = TestClass1()
        println("obj1 : $obj2")
    val obj3 = obj1
    println("obj3 : $obj3")

    val obj4 = TestClass2()
    println("obj4 : $obj4")

    val obj5 = TestClass3()
    //연산자 -> 중괄호 필요
    println("obj5.a1 : ${obj5.a1}")
    println("obj5.a2 : ${obj5.a2}")

    //obj5.a1 = 100
    obj5.a2 = 200
    println("obj5.a2 : ${obj5.a2}")

    obj5.testMethod1()
    obj5.testMethod2()
}

class TestClass1{

}

//class 안에 내용 없을 때 중괄호 생략 가능
class TestClass2

class TestClass3{
    //멤버 변수
    val a1 = 0
    var a2 = 0

    //멤버 메서드
    fun testMethod1(){
        println("testMethod1")
    }
    fun testMethod2(){
        println("testMethod2")
    }
}

