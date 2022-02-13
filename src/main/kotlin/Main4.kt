fun main() {
    val a1 = 2

    when(a1) {
        1 -> println("a1은 1입니다")
        2 -> {
            println("수행되는 코드")
            println("a1은 2입니다")
        }
        3 -> println("a1은 3입니다")
        else -> println("a1은 1, 2, 3이 아닙니다다")
   }

    val a2 = 3
    when(a2) {
        1,2 -> println("a2은 1이거나 2입니다")
        3,4 -> println("a2은 3이거나 4입니다")
        5,6 -> println("a2은 5이거나 6입니다")
    }
    //실수, 문자열도 가능

    val a5 = 5
    when(a5) {
        in 1..3 -> println("a5는 1~3사이의 숫자입니다")
        in 4..6 -> println("a5는 4~6사이의 숫자입니다")
        in 1..6 -> println("a5는 1~6사이의 숫자입니다")
        else -> println("a5는 1~6사이의 숫자가 아닙니다다")
   }

    val str1 = setValue(1)
    val str2 = setValue(2)
    val str3 = setValue(3)
    println("str1 : $str1")
    println("str2 : $str2")
    println("str3 : $str3")

}

fun setValue(a1 : Int) = when(a1) {
    1 -> "문자열1"
    2 -> "문자열2"
    else -> "그 외의 문자열"
    //else를 반드시 써야함
}