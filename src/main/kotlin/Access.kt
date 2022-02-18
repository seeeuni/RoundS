import kr.co.softcampus.pkg3.InternalClass2
import kr.co.softcampus.pkg3.PublicClass2
/*class에 정의한 모든 멤버변수들은 private가 붙는다.
    private가 붙으면 외부에서 접근할 수 없음
 */
//getter, setter메서드를 통해서 접근할 수 있음(?)
/*private : 외부에서 객체 생성 불가능
  public : 외부에서 객체 생성 가능(기본)
  protected : 클래스에 지정할 수 없음
  internal : 모듈이 같을 경우에만 객체 생성 가능
 */

fun main(){

    /* private class는 외부에서 사용이 불가능하다.
    val obj1 = PrivateClass1()
     */
    val obj2 = PublicClass1()
    val obj3 = InternalClass1()
    /* private class는 외부에서 사용할 수 없다.
    val obj4 = PrivateClass2()
     */
    val obj5 = PublicClass2()
    val obj6 = InternalClass2()
}

/* -객체가 가지고 있는 변수는 메서드에 구현한 코드가 정상적으로 동작하기 위한 데이터를 담고 있음
    -변수에 엉뚱한 데이터가 담긴다면 구현한 코드가 정상적으로 동작한다고 하더라도
    정상적인 결과가 나올 수 없게 됨
    -캡슐화 : 변수의 직접적인 접근을 차단하여 외부에서 값을 변경하지 못하도록 막는 것
    -Property : 캡슐화가 적용된 변수에 대해 메서드를 통해 값을 설정하거나
    가져다 사용할 수 있도록 구성한 것
    -setter : 변수에 값을 넣는 메서드
    -getter : 변수가 가지고 있는 값을 반환하는 메서드
    => <property 작성 방법>
        -private 키워드를 변수에 설정하여 외부에서 접근하지 못하도록 막는다.
        -변수들 중에 외부에 공개하고자 하는 변수에 대해 setter와 getter를 지정한다.
        (코틀린에서는 멤버 변수 정의하면 property 형태로 만들어짐)
 */