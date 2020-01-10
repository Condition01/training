package com.treinamento

import java.awt.Button

typealias oie = (Int) -> Unit

//fun main(): Long {

//    var teste = a()
//    var lista = listOf(1,2,3,4)
//    val square: oie
//    square = ::testeNumber
//    println(square(1))
//
//    val intFunction: (Int) -> Int = IntTransformer()
//
//    println(intFunction(12) )
//
//    var a = Singleton.instance
//
//    var b = {i : Int -> i + 10}
//
//    println("b = $b")
//
//    println(a)


//    val funLit : String.() -> Unit = {println(this)}
//
//    println(funLit("Oiii"))


//}


fun main() {

//    var value : (Int, Long) -> Long = {a,b -> (a+b).toLong()}
//
//    println(value(1,2L))
//
//    val stringPlus: (String, String) -> String = String::plus
//    val intPlus: Int.(Int) -> Int = Int::plus
//
//    println(stringPlus.invoke("<", ">"))
//
//    val sum = { x : Int, y : Int -> x + y }
//
//    println(sum(4,4))
//
    var list = listOf(1,2,3,4)
//
//    var prod = list.fold(1){acc,e -> acc * e}
//
//    println(prod)
//
//    list = list.map{it * 2}
//
//    println("")
//
//    list.filter { it > 2 }.forEach{print(it)}

    var u = list.filter {
        val shouldFilter = it > 0
        shouldFilter
    }


    var person = Person("Carlão", 22)
    var person2 = Person("Maria", 21)
    var person3 = Person("Adalberto", 20)

    var (nome,idade) = person

    println("O nome é $nome e a idade é $idade")
}

data class Person(var nome : String, var idade : Int)




fun testeNumber(value: Int) {
    println(value.plus(1))

}

class IntTransformer : (Int) -> Int {
    override operator fun invoke(x: Int): Int = x + 1
}

class Singleton private constructor() {

    private object HOLDER {
        val INSTANCE = Singleton()
    }

    companion object {
        val instance: Singleton by lazy { HOLDER.INSTANCE }
    }
}


class a {
    var teste: Int = 0

    init {
        println("eu inicializei")
    }


}

