package com.treinamento

fun main(){
    var t = Text("Carlão")
    var c = compare()
    demo(c)
}

interface Source<out T> {
    fun nextT(): T
}

fun demo(strs: Source<String>) : Source<Any>{
    val objects: Source<Any> = strs // This is OK, since T is an out-parameter
    return objects
}

class Text (var nome : String) : Source<String>{
    override fun nextT(): String {
        return nome
    }

}

interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}

class compare () : Comparable<Number> {
    override fun compareTo(other: Number): Int {
        return 1
    }


}


fun demo(x: Comparable<Number>) {
    x.compareTo(1.0) // 1.0 has type Double, which is a subtype of Number
    // Thus, we can assign x to a variable of type Comparable<Double>
    val y: Comparable<Int> = x // OK!
    println(y.compareTo(1/2))
}


//os tipos genericos são divididos em dois parametros, os consumidos e os produzidos
//pra fazer or produzidos utilizamos o out antes do tipo generico, logo podemos incrementar esses elementos por
//elementos variantes
//os produzidos são