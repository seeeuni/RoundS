import java.sql.DriverManager.println

fun main(){
    /* return문
    return은 값을 되돌려준다는 개념보단 다시 돌아간다는 개념
    돌아갈때 옆에 있는 값을 데리고 감
    return으로 되돌아가게 되면, 뒤에 코드가 있다고 하더라도 수행되지 않음
     */
    val r1 = testFun1(100)
    println("r1 : $r1")

    var r2 = testFun2(2)
    println("r2 : $r2")

    var r3 = testFun2(0)
    println("r3 : $r3")

    testFun3(100)
    testFun3(0)

    //break문 - 가장 가까운 반복문을 종료한다. 반복 횟수가 남아 있더라도 종료된다.

    println("-------------------")
    for(item in 1..10) {
        if(item > 5){
            break
        }
        println("item: $item")
    }
    //continue - continue 이후에 코드가 더 있더라도 다시 위로 올라가는 구문이다.
    //continue 이후의 코드를 무시하고 다음 반복으로 진행되도록 함
    println("-------------------")

    for (item in 1..10) {
//item을 2로 나눈 나머지가 0이라면, 즉 짝수이면 이라는 뜻
        if (item % 2 == 0) {
            continue
        }
        println("item : $item")
    }


}
fun testFun1(a1:Int) : Int {
    println("testFun1")
    return a1 + 100
}

fun testFun2(a1:Int) : Int {
    println("testFun2")
    if(a1 == 0) {
        return -1
    }
    else
    println("이 부분이 수행될까요?")
    return 100/a1

}


fun testFun3(a1:Int) {

    if(a1 == 0) {
        return
    }
    println("a1은 0이 아닙니다")
}

