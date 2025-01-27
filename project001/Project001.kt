package project001

import java.io.*
/*
I do not actually know how to start this project.
So let us start with the input.
*/
fun main() {

    val filePath = readln()
    val docs = File(filePath)
    val result = docs.delete()
    val check = {
        if (result) println("The file has been successfully deleted.")
        else println("The file does not exist.")
    }
    check()
}