package com.example.inferno.choose_logic

 class Replics{
     var replics : HashMap<Int, Replica> = HashMap()

     init {
         var r1 = Replica("куда перейти?", "выбор1", "выбор2", "-1", 1,
             2, -1, true, true)
         var r2 = Replica("как жить?", "выбор1", "выбор2", "-1", 1,
             2, -1, true, false)
         replics.set(1, r1)
         replics.set(2, r2)
     }

 }