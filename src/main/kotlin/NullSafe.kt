/*!!연산자 : null을 허용하는 변수에 담긴 객체의 주소 값을
null을 허용하지 않는 형태의 값으로 변환하는 연산자이다.
변환 과정에서 null 값이 들어있을 경우 오류 발생
 -> 사용 권장x */

fun main(){
    testFun1("문자열")
    //testFun1(null)

    println("-----------------")

    testFun2("문자열")
    testFun2(null)

    println("--------------------")
    testFun3("문자열")
    testFun3(null)
}
//null값을 null을 허용하지 않는 형태로 변환해서 오류 발생
fun testFun1(str:String?) {
    val value1:String = str!!
    println("value1 : $value1")
}

/* ?:연산자 : null 아니면 원래 값, null이면 지정된 기본 값 반환
 */
fun testFun2(str:String?){
    val value1:String = str ?: "기본문자열"
    println("value1 : $value1 ")
}

/* ?.연산자 : null이 아니라면, 객체에 접근해서 메서드를 호출하거나 property를 사용한다.
    만약 참조변수에 null이 들어 있다면 그냥 null을 반환한다.
 */

fun testFun3(str:String?){
    println("str : $str")
    println("str length : ${str?.length}")
}