

fun main() {
    var obj1 = TestClass10()
    obj1.testMethod1()

    var obj2 = SubClass()
    obj2.subMethod1()
}

class TestClass10 (var a2:Int){
    //this : 객체 자기 자신을 지칭
    //super : 부모 영역 지칭
    var a1 = 100
    //보조생성자에서 주생성자 호출할 때 사용
    constructor() : this(100){

    }
    fun testMethod1() {
    //멤버변수보다 같은 메서드 안에 있는 변수가 우선
        var a1 = 200
        println("a1 : $a1")
        //메서드에 정의한 변수 = 멤버변수일 경우 this를 이용해서 객체의 멤버변수에 접근 가능
        println("this.a1 : ${this.a1}")
    //내부에 있는 testMethod2를 호출함
        fun testMethod2(){
            println("testMethod1 내부의 testMethod2")
        }
        testMethod2()
        //this를 이용해서 class에 정의한 testMethod2 호출 가능
        this.testMethod2()
    }

    fun testMethod2(){
        println("testMethod2")
    }
}
open class SuperClass{

    //변수에도 오버라이딩 개념 적용, open 써줘야함
    open var a1 = 100

    open fun superMethod1(){
        println("SuperClass의 SuperMethod1")
    }
}

class SubClass :SuperClass(){

    override var a1 = 1000
    fun subMethod1(){
        println("a1 : $a1")
        println("super.a1 : ${super.a1}")

        superMethod1()
    }

    override fun superMethod1(){
        println("SubClass의 superMethod1")
    }
}