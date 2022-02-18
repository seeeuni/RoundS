/* Map : 객체를 이름을 통해 관리하는 컬렉션
    -mapOf : 불변형 Map을 생성
    -mutableMapOf :가변형 Map을 생성.

 */

fun main() {
    //이름과 객체 타입 두가지 제네릭 명시(생략 가능)
    val map1 = mapOf<String, Int>("key1" to 10, "key2" to 20, "key3" to 30)
    println("map1 : $map1")

    val map2 = mutableMapOf<String, Int>()
    println("map2 : $map2")

    val map3 = mapOf<String, Any>("key1" to 10, "key2" to 11.11, "key3" to true)
    println("map3 : $map3")

    println("----------------------")

    println("map1 key1 : ${map1.get("key1")}")
    println("map1 key2 :${map1["key2"]}1")

    /* 기타 메서드
    size : 관리하는 요소의 개수
    keys : key를 배열로 반환
    values : 객체들을 배열로 반환
    containsKey : 지정된 이름으로 저장된 객체가 있는지 확인
    containsValue : 지정된 값으로 저장된 객체가 있는지 확인
     */

    /* 가변형 Map의 메서드
    put : 객체를 추가한다. 기존 이름과 동일할 경우 덮어씌운다.
    remove : 주어진 이름으로 저장된 객체를 제거한다.

     */

    map2.put("key1", 100)
    println("map2 : $map2")
    //대괄호로도 가능
    map2["key2"] = 200
    println("map2 : $map2")

    map2.put("key1",1000)
    map2["key2"] = 2000
    println("map2 : $map2")

    /* toMap : 불변형 Map을 생성해 반환
       toMutableMap : 가변형 Map을 생성해 반환환
    */

    val map100 = map1.toMutableMap()
    map100["key100"] = 1000
    println("map100 : $map100")
}

