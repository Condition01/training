package com.treinamento

import sun.misc.Version
import sun.reflect.generics.tree.Tree
import javax.swing.tree.TreeModel

fun main(){
//    val words = "The quick brown fox jumps over the lazy dog".split(" ")
//    val lengthsList = words.filter { println("filter: $it"); it.length > 3 }
//        .map { println("length: ${it.length}"); it.length }
//        .take(4)
//
//    println("Lengths of first 4 words longer than 3 chars:")
//    println(lengthsList)
    val list = listOf("Oi", "João", "Tudo", "Bem")
    list.filter {it.length > 2}.map { it.length }.take(1).forEach { println(it) }
}

inline fun sum(a : Int, summ : (Int) -> Int):Int{
    return summ(4);
}