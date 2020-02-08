package com.treinamento4

import kotlin.LazyThreadSafetyMode.PUBLICATION
import kotlin.properties.Delegates

fun main(){
//    var goku = SuperSayan("KA-ME-HA-ME-HAAAAAAAAA!!")
//    goku.doThePower()
//    var gokuSS2 = SuperSayanFaseTwo(goku)
//    gokuSS2.doThePower()
//    gokuSS2.teleport("namekusei")
//    println()

//    var c = mutableMapOf<String, Any?>()
//    c.set("a", 1)
//    c.set("b", 2)
//    c.set("c", 3)
//    c.set("d", 4)
//    c.set("e",null)
//
//    var testeDelegate = DelegateExample(c)

    var t = teste()
    println(t.nome)
    t.nome = "Carlão"

    var lazy = testeLazy(1)

    lazy.nome

    println(lazy.nome)
    println(lazy.nome)

}


class DelegateExample(map: MutableMap<String, Any?>) {
    var name: String by map
}

interface castavel{
    fun doThePower()
}

class testeLazy(id : Int) {
    val nome : String by lazy {
        println("oi + $id")
        "hello"
    }
}



class teste(){
    var nome : String by Delegates.observable("empty") {a,b, new -> changeAllParameters(new)}
}

fun changeAllParameters(b : String) = println(b)

class SuperSayan(var powerRoar : String) : castavel{
    override fun doThePower() {
        println("AHH $powerRoar")
    }
}

class SuperSayanFaseTwo(superSayanOne : castavel) : castavel by superSayanOne{
   fun teleport(where : String){
       println("teleporting to $where")
   }
}

