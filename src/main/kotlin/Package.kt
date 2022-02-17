import kr.co.softcampus.pkg1.TestClass2
import kr.co.softcampus.pkg2.TestClass3
import kr.co.softcampus.pkg2.TestClass4
//import kr.co.softcampus.pkg2.*
//위의 경우, 다른 패키지 안에 같은 클래스 있으면 구분 불가능 -> 클래스 이름도 겹치지 않도록 하기
fun main() {
//패키지 내에 있는 클래스 사용시에는 반드시 패키지 명을 명시해야함

    val obj1: kr.co.softcampus.pkg1.TestClass1 = kr.co.softcampus.pkg1.TestClass1()
    obj1.testMethod1()

    kr.co.softcampus.pkg1.testFunction1()

    //import를 사용해 패키지를 명시하면 코드 내에서 패키지명을 생략할 수 있다.
    val obj2: TestClass2 = TestClass2()
    obj2.testMethod2()

    kr.co.softcampus.pkg1.testFunction2()

    val obj3 = TestClass3()
    val obj4 = TestClass4()

    obj3.testMethod3()
    obj4.testMethod4()
}
