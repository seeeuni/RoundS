import java.sql.DriverManager.println

fun main() {
    val a1 = 2

    when(a1) {
        1-> println("a1은 1입니다")
        2-> {
            println("수행되는 코드")
            println("a1은 2입니다")
        }
        else -> println("a1은 1,2가 아닙니다.")
    }
}