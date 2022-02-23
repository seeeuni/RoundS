/* 객체 타입 변환
상속 관계나 구현한 인터페이스 타입에 해당
부모 클래스 타입으로
자식 클래스 타입으로
구현한 인터페이스 타입으로
인터페이스를 구현한 클래스 타입으로
 */

fun main(){
    val obj1:SubClass5 = SubClass5()
    val obj2:SubClass6 = SubClass6()

    // 부모 클래스 타입 참조변수에 담는다.
    // 부모 클래스 타입으로 값의 형태가 변환되어 들어간다.
    // 스마트 캐스팅 발생
    val super5:SuperClass5 = obj1
    //스마트 캐스팅 발생
    val inter1:Inter1 = obj2

    /* 자식클래스에 담으려 할 때는 스마트 캐스팅이 일어나지 않음
       val obj3:SubClass1= super1
       val obj4:SubClass2 = inter1
     */
}

open class SuperClass5
interface Inter1


class SubClass5 : SuperClass5()
class SubClass6 : Inter1