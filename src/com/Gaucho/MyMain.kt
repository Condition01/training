package com.Gaucho

import java.time.LocalDateTime
import java.time.LocalTime
import kotlin.random.Random


fun main(){
    var listOfItens = mutableListOf<Item?>()

    var firtDate = LocalDateTime.of( 2020,  1,  1, 8,  0)

    var idItemAndIdList = mutableListOf<Int>(1,1)

    for(i in 1..200){
        generateIdItenAndList(i, idItemAndIdList)
        var item : Item?
        insertNewItemsToList(listOfItens, idItemAndIdList, firtDate)
    }



//    var listOfItensOne = listOfItens.map{ it }
//        .filter { it!!.idList == 1 && it!!.id == 1}
//        .filter { it!!.dateTime.hour in 8..18 }
//        .filterNot { it!!.dateTime.hour == 18 && it!!.dateTime.minute != 0 }
//        .forEach{ println(it) }

    var listOfItensInRightTime = listOfItens.filter { it!!.dateTime.hour in 8..18 }
        .filterNot { it!!.dateTime.hour == 18 && it.dateTime.minute != 0 }
        .forEach{ println(it) }





    var mapItens = mutableMapOf<Item?, Boolean>()
    var mapTotalHours = mutableMapOf<Item?, Pair<Int,Int>>()
    var lastItem = Item(0,0, LocalDateTime.now())

    listOfItens.forEach {
        if(it == lastItem && mapItens[it] != null)
        mapItens = mutableMapOf()

    }

}

private fun insertNewItemsToList(
    listOfItens: MutableList<Item?>,
    idItemAndIdList: MutableList<Int>,
    firtDate: LocalDateTime
) {
    if (listOfItens.isEmpty()) {
        var item = Item(idItemAndIdList[0], idItemAndIdList[1], firtDate)
        listOfItens.add(item)
    } else {
        var item = Item(
            idItemAndIdList[0],
            idItemAndIdList[1],
            listOfItens.last()!!.dateTime.plusHours(Random.nextLong(6, 14)).plusMinutes(2)
        )
        listOfItens.add(item)
    }
}

private fun generateIdItenAndList(i: Int, idItemAndIdList: MutableList<Int>) {
    if (i != 0 && i % 50 == 0) {
        if (i % 100 == 0) {
            idItemAndIdList[0] += 1
            idItemAndIdList[1] = 1
        } else {
            idItemAndIdList[1] = 2
        }
    }
}

data class Item(
    var id : Int,
    var idList : Int,
    var dateTime: LocalDateTime
)