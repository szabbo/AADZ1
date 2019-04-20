package exercises

import kotlin.random.Random

/*
Create a collection of integers

Use Random to fill the collection with 100 random numbers between 1 and 100.

Go through the collection from start to end and print its elements up to the point where an element is less than or equal to 10
 */

fun main() {
    val newCollection: List<Int> = List(100) { Random.nextInt(1, 100)}

    for (item in newCollection){
        when{
            item <= 10 -> println(item)
            else -> println("Number $item is bigger than 10")
        }
    }
}