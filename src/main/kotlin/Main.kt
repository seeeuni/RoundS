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

    test1()
    test2(100,11.11)
    //값을 넣으면 자동으로 매개변수가 뭔지(a1, a2) 보여줌
    val k1:Int = 100
    val k2:Double = 11.11
    test2(k1, k2)


    test2(500, 55.55)
    test2(a2=66.66, a1=600)

    test3(100,55.55)
    test3(100)
    test3(a2=66.66)


    val r1:Int = test4(100,200)
    val r2:Int = test4(1000,2000)
    println("r1 : $r1")
    println("r2 : $r2")

    test5()
    test6()
    test7()
    test7(100)
    test7(11.11)
    test7(100,200)

    test8()
    //test9()
}
    //함수
fun test1(){
    println("test1 호출")
        println("-------------------------")
}
    //매개변수 "변수명:자료형"

fun test2(a1:Int, a2:Double){
    println("test2 호출")
    println("a1 : $a1")
    println("a2 : $a2")
    println("------------------------")


}
//기본값 설정시 값을 전달하지 않으면 기본 값이 매개변수에 설정됨
fun test3(a1:Int = 0, a2:Double = 0.0){
    println("test3이 호출되었습니다")
    println("a1 : $a1")
    println("a2 : $a2")
    println("-------------")
}

//반환 타입
fun test4(a1:Int, a2:Int) : Int{
    val result:Int = a1 + a2
    return result
}
// Unit은 반환할 값이 없다는 의미 -> 생략가능
fun test5() : Unit {
    println("test5 호출")
    println("-----------------------")
}

fun test6() {
    println("test6 호출")
    println("----------------")
}

//함수의 오버로딩 - 매개변수의 자료형을 다르게해서 같은 이름, 여러함수 정의

fun test7() {
    println("test7 호출 - 매개변수 없음")
    println("--------------")
}

fun test7(a1:Int) {
    println("test7 호출 - 매개변수 한개(Int)")
    println("--------------")
}

fun test7(a1:Double) {
    println("test7 호출 - 매개변수 한개(Double)")
    println("--------------")
}

fun test7(a1:Int, a2:Int){
    println("test7 호출 - 매개변수 두개")
    println("---------------------")
}

//지역함수 - 함수 내에 정의한 함수 / 함수를 정의한 함수 안에서만 호출 가능
fun test8() {
    println("test8 호출")
    fun test9() {
        println("test9 호출")
    }
        test9()
    }
