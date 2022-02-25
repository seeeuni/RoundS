/* 객체 타입 변환
상속 관계나 구현한 인터페이스 타입에 해당
부모 클래스 타입으로
자식 클래스 타입으로
구현한 인터페이스 타입으로
인터페이스를 구현한 클래스 타입으로
 */

fun main() {
    val obj1: SubClass5 = SubClass5()
    val obj2: SubClass6 = SubClass6()

    // 부모 클래스 타입 참조변수에 담는다.
    // 부모 클래스 타입으로 값의 형태가 변환되어 들어간다.
    // 스마트 캐스팅 발생
    val super5: SuperClass5 = obj1
    //스마트 캐스팅 발생
    val inter1: Inter1 = obj2

    /* 자식클래스에 담으려 할 때는 스마트 캐스팅이 일어나지 않음
       val obj3:SubClass1= super1
       val obj4:SubClass2 = inter1
     */
    println("------------------------")
    /* as 연산자
     지정된 클래스 타입(인터페이스 구현한 클래스 타입, 자기를 상속받은 자식 클래스)
     으로 강제 변환하는 연산자
     객체를 지정된 클래스 타입으로 변환하는 연산자
    객체가 지정된 클래스타입과 관계가 없을 경우 오류가 발생
    형변환이 발생한 참조 변수는 변환된 타입을 유지
     */
    super5 as SubClass5
    inter1 as SubClass6
    //super5.subMethod1()
    //inter1.subMethod2()
    //inter1 as SubClass1()

    println("------------------------")

    val obj3: SubClass5 = SubClass5()
    val chk1 = obj3 is SuperClass5
    println("chk1 : $chk1")

    //val chk2 = obj3 is Inter1

    val super7: SuperClass5 = obj3
    val chk3 = super7 is SubClass5
    println("chk3 : $chk3")

    if (super7 is SubClass5) {
        //super7 as SubClass5
        //is 연산자 값이 true라면 형변환이 가능한 상황이므로 스마트 캐스팅 발생
        super7.subMethod1()
    }
    //super7.subMethod1() -> 오류

    println("------------------")

    val obj10: SubClass5 = SubClass5()
    val obj11: SubClass6 = SubClass6()

    anyMethod(obj10)
    anyMethod(obj11)
    anyMethod(100)
    anyMethod("문자열")

    println("-----------------")
    val number1:Int = 100
    val number2:Long = number1.toLong()
    println("number2 : $number2")

    val str1:String = "100"
    val number3:Int = str1.toInt()
    println("number3: $number3")

    //val str2:String = "안녕하세요"
    //val number4:Int = str2.toInt()
    //println("number4: $number4")
}

open class SuperClass5
interface Inter1


class SubClass5 : SuperClass5(){
    fun subMethod1(){
        println("SubClass5의 subMethod1입니다")
    }
}
class SubClass6 : Inter1{
    fun subMethod2(){
        println("SubClass6의 subMethod2입니다")
    }
}

/* is 연산자
형변환이 가능하면 변환을 하고 true를 반환한다.
if문으로 구성하여 사용, if 문 내에서만 내에서만 변환된 타입을 사용하고
if 문을 나가게 되면 변환되기 전의 타입으로 다시 변경된다.
 */

/* Any 타입
 코틀린은 모든 클래스가 직접 혹은 간접적으로 Any 클래스를 상속받음
 따라서 모든 객체의 주소 값은 Any 타입 참조 변수에 담을 수 있다.
 Any 타입과 is 연산자를 활용하여 다양한 타입의 객체에 대응할 수 있는 코드를 만들 수 있다.

 */

fun anyMethod(obj:Any){
    if(obj is SubClass5) {
        obj.subMethod1()
    } else if (obj is SubClass6) {
        obj.subMethod2()
    } else if(obj is Int){
        println("정수입니다")
    } else if (obj is String) {
        println("문자열입니다")
    }
}

/*기본 타입의 형 변환
 코틀린에서는 기본 타입을 관리하는 객체의 타입을 변경하는 메서드를 제공한다.
 참조변수의 타입이 변경되는 것이 아닌 새로운 객체가 생성되어 반환된다.
 toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble(), toChar()
 */