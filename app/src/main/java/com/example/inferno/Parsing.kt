package com.example.inferno

import android.os.Build
import androidx.annotation.RequiresApi
import java.io.BufferedReader
import java.io.File
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*


object Parsing {

    //"D:\\Java projects\\PrntscBot\\src\\main\\java\\test\\a1.txt"
    var pathTemplate = "text\\"

    @RequiresApi(Build.VERSION_CODES.O)
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        var choose = 1
        var currentPath = pathTemplate + "a1.txt"

//        while (true) {
//            val ll = getListOfReplics(currentPath)
//            for (i in 0 until ll.size - 1) {
//                println(ll[i])
//            }
//            choose = `in`.nextInt()
//            currentPath =
//                pathTemplate + getNextFileNumber(currentPath, choose) + ".txt"
//        }
        val testIS: InputStream =
            File("C:\\Users\\Nikita\\AndroidStudioProjects\\Inferno\\app\\src\\main\\res\\raw\\a1.txt").inputStream()
        print(getListOfReplics(testIS))
    }

//    @RequiresApi(Build.VERSION_CODES.O)
//    private fun getNextFileNumber(filePath: String, choosenNumber: Int): Int {
//        val ll = getListOfReplics(InputStream(filePath))
//        return ll[ll.size - 1].split(" ").toTypedArray()[choosenNumber - 1].toInt()
//    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getListOfReplics(inputStream: InputStream): LinkedList<String> {
        val reader = inputStream.bufferedReader()
        val ll = LinkedList<String>()
        var line: String
        while (reader.readLine().also { line = it } != null) {
            ll.add(line)
        }
        return ll
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun storyItemFromLL(ll: LinkedList<String>): List<StoryItem> {
        var list = mutableListOf(StoryItem(ll[0], null, null, null))
        for (i in 1 until ll.size - 2) {
            list.add(StoryItem(ll[i], null, null, null))
        }
        var answers = ll[ll.size - 1].split(" \" \" ")
        if (answers.size == 1)
            list.add(StoryItem(null, answers[0], null, null))

        if (answers.size == 2)
            list.add(StoryItem(null, answers[0], answers[1], null))

        if (answers.size == 3)
            list.add(StoryItem(null, answers[0], answers[1], answers[2]))
        return list.toList()
    }
}
