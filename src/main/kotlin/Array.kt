fun main() {
    val array1 = arrayOf(10, 20, 30, 40, 50)
    println("array1 : $array1")
    println("array1 : ${array1.contentToString()}")

    val array2 = arrayOf(100, 11.11, "문자열", true)
    println("array2 : ${array2.contentToString()}")

    val array3 = intArrayOf(10, 20, 30, 40, 50)
    val array4 = doubleArrayOf(11.11, 22.22, 33.33, 44.44, 55.55)
    val array5 = arrayOf<String>("문자열", "문자열2", "문자열3")
    println("array3 : ${array3.contentToString()}")
    println("array4 : ${array4.contentToString()}")
    println("array5 : ${array5.contentToString()}")

    val array6 = Array(5, { 0 })
    println("array6 : ${array6.contentToString()}")

    val array7 = Array(5) { it * 2 }
    println("array7 : ${array7.contentToString()}")

    println("---------------------")

    for (item in array1) {
        println("array1 : $item")
    }

    println("---------------------")

    val array8 = arrayOf(arrayOf(10, 20, 30), arrayOf(40, 50, 60), arrayOf(70, 80, 90))
    println("array8 : $array8")
    println("array8 : ${array8.contentToString()}")
    //다차원 배열일 경우 DeepToString 사용하는 것이 좋음
    println("array8 : ${array8.contentDeepToString()}")

    for(item1 in array8){
        for(item2 in item1){
            println("item2 : $item2")
        }
    }

    println("-------------------")
    println("array1 0 : ${array1[0]}")
    println("array1 1 : ${array1[1]}")
    println("array1 2 : ${array1.get(2)}")
    println("array1 3 : ${array1.get(3)}")

    println("---------------------")

    println("array1 : ${array1.contentToString()}")
    array1[0] = 100
    array1.set(1,200)
    println("array1 : ${array1.contentToString()}")

    println("-------------------------")
    println("array1 size : ${array1.size}")

    /* 메서드 정리
    plus : 요소 추가한 새로운 배열 만들어 반환
    spliceArray : 지정된 범위의 요소를 관리하는 배열을 만들어 반환
    first : 제일 앞의 값 반환
    last : 제일 마지막 값 반환
    indexOf : 지정된 값의 index 반환
    average : 평균 값 반환
    count : 요소의 개수 반환
    contains : 지정된 값이 포함되어 있는지 반환
    sortedArray : 오름차순 정렬된 배열 반환
    sortedArrayDescending : 내림차순 정렬된 배열 반환
    */

    array1.plus(60)
    println("array1 : ${array1.contentToString()}")
}
