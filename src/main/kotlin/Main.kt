fun main () {

// 한 줄 주석입니다.

    /*
        여러 줄
        주석 입니다.
     */

    print("문자열 입니다")
    print("문자열 입니다")

    println("문자열입니다")
    println("문자열입니다")

    println("값 : ${100}")

    println("세미콜론 없음")
    println("세미콜론 있음")

    println("명령문1");println("명령문2");println("명령문3")

    // 정수 리터럴
    println(100)
    println(10000000000)
    println(10000000000L)
    //L 붙여도 되고 안붙여도 됨
    println(938_492_934_823)
    //세자리수마다 쉽게 구분하기 위함

    // 실수 리터럴
    println(11.11)
    println(22.22F)
    //F는 저장공간 줄이기 위함

    //문자 리터럴
    println("A")

    //문자열 리터럴
    println("문자열")

    // 논리 리터럴
    println(true)
    println(false)

    // Raw string
    println("동해물과 백두산이\n마르고 닳도록")
    println("동해물과 백두산이\n마르고 닳도록")

    println("""동해물과 백두산이
        |마르고 닳도록
        |하느님이 보우하사
        |우리나라 만세
    """.trimMargin())
    //자료형 : 기억공간에 저장되는 값의 형태
    /* var : 선언 이후 값을 다시 저장 가능
       val : 선언 이후 값을 다시 저장 불가능
       var/val 변수명:타입(자료형) = 값
     */
    println("-----------------------------------")

    val a1:Int = 100
    println("a1 : " + a1)
    println("al : ${a1}")
    println("al : $a1")
    //수식이나 연산자가 포함되어 있을경우가 아니라면 중괄호 생략 가능

    val a2 = 100
    //변수 선언시 자료형을 생략하면 저장하는 값에 따라 자동으로 결정된다.
    println("a2 : $a2")

    println("--------------------------------------")

    var a3:Int = 100
    val a4:Int = 100

    println("a3 : $a3")
    println("a4 : $a4")

    a3 = 200
    println("a3 : $a3")

    //val 변수는 값을 다시 저장하지 못한다.

    println("------------------------------")
    /* var/val 변수명:자료형 = 값 - null을 허용하지 않는 변수
       var/val 변수명:자료형? = 값 - null을 허용하는 변수
     */
    var a5:Int = 100
    var a6:Int? = null
    println("a5: $a5")
    println("a6: $a6")
    /* null 허용하는 변수는 null과 그외 값들을 모두 넣을수 있음
    그반대는 불가능
    */
    var a7:Int? = a5
    println("a7: $a7")

    /*var a8:Int = a6이면 오류 발생
    !!는 null을 허용하지 않는 변수로 바꿔줌
    */
    // var a8:Int = a6!! -> 실행안됨 why? 이미 a6은 null이기 때문

}

