fun main() {

    //추상클래스는 직접적인 객체생성 불가능
    //val obj1 = Super1()
    //testFun1(obj1)

    val obj2 = Sub1()
    testFun1(obj2)

    val obj3 = Sub2 ()
    testFun1(obj3)
}

open abstract class Super1{

    fun method1(){
        println("Super1의 method1 입니다")
    }

    open abstract fun method2()
        // println("Super1의 method2 입니다")

}

class Sub1 : Super1(){
    override fun method2(){
        println("Sub1의 method2 입니다")
    }
}
/*testFun1은 Super1을 참조변수에 담음, Sub1은 Super1을 상속받음
-> testFun1은 Sub1을 갖고 만든 객체의 주소 값은 부모클래스형 참조변수에 담을 수 있음
 */
class Sub2 : Super1(){
    //오버라이딩 안하면 부모가 가진 메서드 호출
    //추상메서드일 경우, 상속받은 클래스에서 '무조건' 메서드를 오버라이딩 해야함
    override fun method2(){
        println("Sub2의 method2입니다")
    }

}
fun testFun1(obj1:Super1){
    obj1.method1()
    obj1.method2()
}