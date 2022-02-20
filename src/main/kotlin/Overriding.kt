fun main(){
    val obj1:SubClass4 = SubClass4()
    println("obj1.subA1 : ${obj1.subA1}")
    obj1.subMethod1()

    println("obj1.superA1 : ${obj1.superA1}")
    obj1.superMethod1()
}

open class SuperClass4 {

    var superA1 = 100

   open fun superMethod1(){
        println("SuperClass1의 superMethod1 입니다")
    }
}

class SubClass4 : SuperClass4() {

    var subA1 = 200

    fun subMethod1(){
        println("SubClass1의 subMethod1 입니다")
    }

    override fun superMethod1(){
        println("응 니가 써놓은거 내가 바꿈ㅋ ")
    }
}