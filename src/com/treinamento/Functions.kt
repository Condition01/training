package com.treinamento

import com.sun.org.apache.xalan.internal.lib.ExsltDynamic.max
import java.util.stream.Stream

fun main() {
//    println("o expoente é ${powerOf(2, 4)}")
//
//    println(makeATeste(valor = 11.3))
//
//    println(B().foo())
//
//    foo(qux = {println("sou lindao")})
//
//    var a = arrayOf(2,2,2)
//    printList(strings = *arrayOf("oi","Oi"))
//
//    println(teste(1))
//
//    var lista = asList(1, *a,2,3)
//    lista.forEach{println("valor : $it")}
//
//    println(3.shl(2))
//
//    println(findFixPoint())

//    println(powerOf(2, 3 ))
//

}

val eps = 1E-10 // "good enough", could be 10^-15

tailrec fun findFixPoint(x: Double = 1.0): Double
        = if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))

fun double(number : Int) : Int{
    return number*2
}

tailrec fun powerOf(number: Int, exponent : Int): Int {
    if (exponent == 1) return number else return number * powerOf(number, exponent - 1)
}

fun makeATeste(nome: String = "Carlao", valor: Double?, len : Int = nome.length) : Teste {
    println("O tamanho do nome $nome é $len")
    var t = Teste(nome, valor)
    return t
}

data class Teste(var nome : String, var valor : Double?)

open class A {
    open fun foo(i: Int = 10) { /*...*/ }
}

class B : A() {
    override fun foo(i: Int) { println(i) }  // o valor default da classe mãe vai ser herdado também
}
fun foo(bar: Int = 0, baz: Int = 1, qux: () -> Unit) {
    qux()
}

fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' ') {
/*...*/
}

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

class Box<T>(t: T) {
    var value = t
}

fun printList(vararg strings: String){
    strings.forEach{println(it)}
}

fun teste(x: Int) = x.plus(1)


infix fun Int.shl(x: Int) = x*2 //concatena as chamadas

fun teste(){

    fun teste2(){
        println("funfou")
    }
}





