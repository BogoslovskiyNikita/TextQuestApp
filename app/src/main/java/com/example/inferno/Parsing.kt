package com.example.inferno

import android.os.Build
import androidx.annotation.RequiresApi
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*


object Parsing {

    //"D:\\Java projects\\PrntscBot\\src\\main\\java\\test\\1.txt"
    var pathTemplate = "text\\"

    @RequiresApi(Build.VERSION_CODES.O)
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        var choose = 1
        var currentPath = pathTemplate + "1.txt"

        while (true) {
            val ll = getListOfReplics(currentPath)
            for (i in 0 until ll.size - 1) {
                println(ll[i])
            }
            choose = `in`.nextInt()
            currentPath =
                pathTemplate + getNextFileNumber(currentPath, choose) + ".txt"
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun getNextFileNumber(filePath: String, choosenNumber: Int): Int {
        val ll = getListOfReplics(filePath)
        return ll[ll.size - 1].split(" ").toTypedArray()[choosenNumber - 1].toInt()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getListOfReplics(filePath: String): LinkedList<String> {
        var content = ""
        try {
            content = String(Files.readAllBytes(Paths.get(filePath)))
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return LinkedList(
            Arrays.asList(
                *content.split(
                    "\n"
                ).toTypedArray()
            )
        )
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun storyItemFromLL(ll : LinkedList<String>) : List<StoryItem>{
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
