package com.treinamento4

fun main(){
    var list = mutableListOf(1,2,3)

    list.swap(0,1)

    list.map{it * 2}.forEach { println(it) }

    var g : guy? = guy("Carlão")
    g = null
    println(g.nulo())
}
fun <T>MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

fun guy?.nulo() : String{
    if(this == null) return "null" else return this.nome
}

class guy(var nome : String){
    fun teste(){println("oi eu sou $nome")}
}


