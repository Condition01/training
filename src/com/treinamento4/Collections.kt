package com.treinamento4

fun main(){
//    val numbers = setOf(1, 2, 3)
////    println(numbers.map { it * 3 })
////    println(numbers.mapIndexed { idx, value -> value * idx }) //pega o idx e o valor e multiplica um pelo outro
////
////    val itens = listOf("one", "two", "three", "four")
////    var y = itens.associateWith { it.length }
////    println(itens.get(1))
////
////    val iteratorCole = setOf("one", "two", "three", "four")
////    val numbersIterator = iteratorCole.iterator()
////    while (numbersIterator.hasNext()) {
////        println(numbersIterator.next())
////    }

//    var c = listOf(1,2,3,4)
//    listIteratorCall(c)

    var p = Person("Carlos", Departament("IT", Person("Algusto", null)))
    var p2 = Person("Carlos", null)

    p2?.d?.head = Person("Outrora" , null )

    println(p2)

    var b : List<Int>? = null

    var size = b?.size ?: -1 //elvis

    var size2 = b!!.size //forcing null

    println(size)
}

fun <T>listIteratorCall(list : List<T>){
       val listIterator = list.listIterator()
    while (listIterator.hasNext()) listIterator.next()
    println("Iterating backwards:")
    while (listIterator.hasPrevious()) {
        print("Index: ${listIterator.previousIndex()}")
        println(", value: ${listIterator.previous()}")
    }
}

data class Person(
    var nome: String,
    var d : Departament?
)

data class Departament(
    var nome : String,
    var head : Person?
)