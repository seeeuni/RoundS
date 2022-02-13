fun main(){
    //for문 - 한번 동작할 때마다 순차적으로 대입
    val a1 = 1..10

    for(item in a1) {
        println("a1 : $item")
    }
    val a2 = 1..10 step 2
    for(item in a2) {
        println("a2 : $item")
    }

    println("----------------------")

    /* ..은 '증가'하면서 값에 도달하는지
    확인하는데 증가하도록 범위를 잡아서 실행 안함
    -> downTo로 변경
     */
    val a3 = 10 downTo 1
    for(item in a3){
        println("a3 : $item")
    }



    println("-----------------")
    /* while문 - 주어진 조건을 만족할 경우 반복
        조건식이 상단에 있으므로 조건식이 거짓이면 단 한번도 수행되지 않는다.
        끝까지 거짓이 되지 않으면 영원히 끝나지 않음
     */
    //var a5 = 100 (처음부터 거짓)
    var a5 = 0
    while(a5 < 10) {
        println("a5 : $a5")
        a5++
    }

    println("--------------------")
    /* do while문 - 주어진 조건을 만족할 경우 반복
    조건식이 하단에 있으므로 조건식이 거짓이라도 단 한번은 수행된다.
    끝까지 거짓이 되지 않으면 영원히 끝나지 않음
 */
    var a6 = 0

    do {
        println("a6 : $a6")
        a6++
}while(a6 < 10)

}
