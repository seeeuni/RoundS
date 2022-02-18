import kr.co.softcampus.pkg3.InternalClass2
import kr.co.softcampus.pkg3.PublicClass2
//class에 정의한 모든 멤버변수들은 private가 붙는다.
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