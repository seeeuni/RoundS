/* Set
 객체를 이름이나 순서 등으로 관리하는 주체가 없는 컬렉션
 중복된 객체를 담을 수 없음
 순서에 관계 없고 중복된 객체를 담지 않을 경우 사용
 setOf : 불변형 set 생성
 mutableSetOf : 가변형 set 생성
 */

fun main (){
    val set1 = setOf(1, 5, 10, 5, 10)
    println("set1 : $set1")

    val set2 = mutableSetOf<Int>()
    println("set2 : $set2")

/* set은 관리 주체가 없으므로 객체를 직접 가져오는 메서드는 제공되지 않는다.
for문을 통해 객체를 순회해야 한다.
 */
    for(item in set1){
        println("item : $item")
    }


    /* add : 관리하는 객체 추가, 같은 객체일 경우 추가되지 않음
        remove : 관리하는 객체 제거

     */

    set2.add(10)
    //listOf, arrayOf, setOf 상관x
    set2.addAll(listOf(30, 40, 50))
    println("set2 : $set2")

    /* Set 변경
        toSet : 불변형 set으로 변환
        toMutableSet : 가변형 set으로 변환
        toList : 불변형 list로 변환
        toMutableList : 가변형 list로 변환

       List를 Set으로 변경

       toSet : 불변형 set으로 변경, 중복된 객체는 제거
       toMutableSet : 가변형 set으로 변경, 중복된 객체는 제거
     */

    val set3 = set1.toMutableSet()
    set3.add(1000)
    println("set3 : $set3")
}