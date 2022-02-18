fun main (){
    /*문자열의 글자를 0부터 시작하는 인덱스 번호로 관리할 수 있음
    문자열은 불변형으로 가져다 사용하는 것만 가능하다.
    str1[0] = 'A' -> 불가능
     */

    val str1 = "안녕하세요"

    println("str1[0] : ${str1[0]}")
    println("str1[1] : ${str1[1]}")

    /*
        substring : 지정된 범위의 문자열 반환
        compareTo : 문자열 비교. 같으면 0, 음수나 양수면 다른 문자열
        두번째값으로 true를 넣어주면 대소문자 무시하고 비교
        split : 문자열을 지정된 구분자를 이용해 잘라낸다.

     */

    println("-------------------")

    val str2 = str1.substring(1..3)
    println("str : $str2")

    val str3 = "Hello World"
    val str4 = "hello World"

    println(str3.compareTo(str4,true))
    println(str3.compareTo(str4,true))
    println(str3.contentEquals(str4))

    println("---------------------")
    val str5 = "ab cd ef gh"
    val r1 = str5.split("")
    println("r1 : $r1")

    /*StringBuffer
       문자열은 + 연산자를 통해 합치면 문자열 객체가 계속 생성됨
       StringBuffer를 사용하면 관리하는 문자열을 직접 조작할 수 있음
       String은 지속적인 문자열 연산을 수해하면 메모리를 많이 사용하지만 원본이 유지된다.
       StringBuffer는 메모리를 절약할 수 있지만 원본을 유지할 수 없다.
     */

    println("---------------------")

    val str6 = "abc"
    val str7 = str6 + "def"
    println("str6 : $str6")
    println("str7 : $str7")


    val buffer1 = StringBuffer()
    buffer1.append("abc")
    buffer1.append(100)
    buffer1.append(11.11)
    println("buffer1 : $buffer1")

    buffer1.insert(3, "테스트")
    println("buffer1 : $buffer1")

    buffer1.delete(3, 6)
    println("buffer1 : $buffer1")

}