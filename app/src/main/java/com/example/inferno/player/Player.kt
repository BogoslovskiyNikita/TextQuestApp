package com.example.inferno.player

class Player(hp: Int) {
    var hp: Int = 0
    var leftHand: Item? = null
    var rightHand: Item? = null
    var blanket = false
    var hpPic = "healf_bar_with_100_percents"

    init {
        this.hp = 100
    }

    fun addThing(thing: String): Boolean {
        val tr = true
        if (thing == "Blanket") {
            blanket = true
        } else if (thing == "Torch") {
            leftHand = Torch()
        } else if (thing == "FlashLight") {
            leftHand = FlashLight()
        } else if (leftHand == null) {
            when (thing) {
                "Knife" -> leftHand = Knife()
                "Gun" -> leftHand = Gun()
                "Cock" -> leftHand = Cock()
                "BloodyKnife" -> leftHand = BloodyKnife()
            }
        } else {
            when (thing) {
                "Knife" -> rightHand = Knife()
                "Gun" -> rightHand = Gun()
                "Cock" -> rightHand = Cock()
                "BloodyKnife" -> rightHand = BloodyKnife()
            }
        }

        return tr
    }

    fun addItem(name: String, hand: String) {
        if (name == "blanket") {
            blanket = true
        }
        else if (hand == "left") {
            when (name) {
                "Knife" -> leftHand = Knife()
                "Gun" -> leftHand = Gun()
                "Cock" -> leftHand = Cock()
                "BloodyKnife" -> leftHand = BloodyKnife()
                "Torch" -> leftHand = Torch()
                "FlashLight" -> leftHand = FlashLight()
                "SickHand" -> leftHand = SickHand()
            }
        }
        else if (hand == "right") {
            when (name) {
                "Knife" -> rightHand = Knife()
                "Gun" -> rightHand = Gun()
                "Cock" -> rightHand = Cock()
                "BloodyKnife" -> rightHand = BloodyKnife()
                "Torch" -> rightHand = Torch()
                "FlashLight" -> rightHand = FlashLight()
                "SickHand" -> rightHand = SickHand()
            }
        }
    }

    fun changeHp(hpCount: Int): Boolean {
        val tr = true
        hp += hpCount
        if (hp > 100) hp = 100
        when (hp) {
            100 -> hpPic = "healf_bar_with_100_percents"
            90 -> hpPic = "healf_bar_with_90_percents"
            80 -> hpPic = "healf_bar_with_80_percents"
            70 -> hpPic = "healf_bar_with_70_percents"
            60 -> hpPic = "healf_bar_with_60_percents"
            50 -> hpPic = "healf_bar_with_50_percents"
            40 -> hpPic = "healf_bar_with_40_percents"
            30 -> hpPic = "healf_bar_with_30_percents"
            20 -> hpPic = "healf_bar_with_20_percents"
            10 -> hpPic = "healf_bar_with_10_percents"
            0 -> hpPic = "healf_bar_with_0_percents"
        }
        return tr
    }

    // эта функция вызывается, когда нужно поставить иконку больной руки
    fun leftHandSick(): Boolean {
        val tr = true
        leftHand = SickHand()

        return tr
    }

//    fun checkItem(itemName : String) : Boolean {
//        if ()
//        if ((leftHand.name == itemName) || (rightHand.name = itemName)) {
//
//        }
//    }
}