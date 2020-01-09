package com.treinamento

import java.awt.Button
typealias oie = (Int)-> Unit
fun main(){

    var teste = a()
    var lista = listOf(1,2,3,4)
    val square: oie
    square = ::testeNumber
    println(square(1))
}

fun testeNumber(value : Int){
    println(value.plus(1))

}


class a {
    var teste : Int = 0

    init{
       println("eu inicializei")
    }


}

