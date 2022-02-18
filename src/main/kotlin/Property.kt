fun main() {
    /*주 생성자의 매개 변수를 정의할 때 var,val를 지정하면 property로 작성된다.
    var :  getter,setter 모두 작성된다.
    val : getter만 작성된다.
     */
    val obj1 = TestClass1(100,200)
    println("obj1.a1 : ${obj1.a1}")
    println("obj1.a2 : ${obj1.a2}")

    obj1.a1 = 100
    println("obj1.a1 : ${obj1.a1}")
}

class TestClass1 (var a1:Int, val  a2:Int)