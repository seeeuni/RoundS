/* 배열과 동일하게 인덱스 번호를 통해 객체를 관리한다.
    배열은 크기가 정해지면 변경할 수 없지만, List는 추가, 삭제 등이 가능하다.
    listOf : 불변형 리스트 생성
    mutableListOf : 가변형 리스트 생성
    emptyList : 비어있는 불변형 리스트를 생성
    listOfNotNull : null을 제외한 나머지만으로 리스트를 생성
 */

fun main(){
    //제네릭을 써주는 게 좋다! 값을 나열하지 않는 경우 추론이 불가능하므로 제네릭을 달아줘야함
    val list1 = listOf<Int>(10, 20, 30, 40, 50)
    val list2 = listOf<String>("문자열1", "문자열2", "문자열3")

    println("list1 : $list1")
    println("list2 : $list2")

    val list3 = mutableListOf<Int>()
    val list4 = mutableListOf("문자열1", "문자열2", "문자열3")


    println("list3 : $list3")
    println("list4 : $list4")

    for(item in list1){
        println("list1 : $item")
    }
/*메서드
    indexOf : 지정된 값의 인덱스 번호 반환. 값이 없을 경우 -1 반환
    lastIndexOf : 지정된 값이 마지막에 해당하는 값의 인덱스 번호를 반환. 값이 없을 경우 -1 반환
    subList : 지정된 범위의 값을 추출하여 새로운 리스트를 생성해 반환
 */

    println("-------------")

    val list7 = listOf(10, 20, 30, 10, 20, 30)

    val index1 = list7.indexOf(20)
    println("index1 : $index1")

    val index2 = list7.lastIndexOf(20)
    println("index3 : $index2")

    val list8 = list1.subList(1,3)
    println("list8 : $list8")

    /*가변형 리스트의 메서드
    add(객체) : 객체 추가
    add(인덱스, 객체) : 주어진 인덱스 위치에 객체를 삽입한다.
    remove(객체) : 주어진 객체 제거
    removeAt(인덱스) : 주어진 인덱스의 객체 제거
    set(인덱스, 객체) : 주어진 인덱스에 객체를 덮어씌운다.

     */

    println("-----------------------")

    println("list3 : $list3")
    list3.add(10)
    list3.add(20)
    list3.add(30)

    list3.addAll(listOf(40, 50, 60))
    println("list3: $list3")

    list3.add(1, 100)
    println("list3 : $list3")


}
