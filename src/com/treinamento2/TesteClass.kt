package com.treinamento2

open class TesteClass {
    companion object{
        val id = "oi"
    }
    val t1 : String = ""
    val t2 : String = ""
    val t3 : Int = 0
}

class TesteClass3 : TesteClass() {

}

data class TesteClass2(val x1 : String, val x2 : String)

fun main(){
//    val c = ::TesteClass
//    val t3 = TesteClass3()
//    println(t3::class.qualifiedName)

//    val t = listOf("1","2")
//    val s = 1000.toString(8)
//    val isEmptyStringList: List<String>.() -> Boolean = List<String>::isEmpty
////    println(t::isEmpty)
////    println(isEmptyStringList)
//    val predicate: (String) -> Boolean = ::isOdd
//    println(predicate("2"))
//    println(isEmptyStringList(t)).
    println(isT<String>())
}

inline fun <reified T> isT() : Boolean = 1 is T

fun isOdd(s: String): Boolean = s.length % 2 == 0

