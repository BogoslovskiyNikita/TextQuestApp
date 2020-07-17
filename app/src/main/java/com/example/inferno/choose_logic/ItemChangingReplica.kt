package com.example.inferno.choose_logic

import com.example.inferno.player.Item

class ItemChangingReplica : Replica{
    var item : Item
    var hand : String

    constructor(
        replicaText: String,
        firstChoose: String,
        secondChoose: String,
        thirdChoose: String,
        fstLink: Int,
        scndLink: Int,
        thirdLink: Int,
        secondBtnIsVisible: Boolean,
        thirdBtnIsVisible: Boolean,
        item : Item,
        hand : String
    ) : super(
        replicaText,
        firstChoose,
        secondChoose,
        thirdChoose,
        fstLink,
        scndLink,
        thirdLink,
        secondBtnIsVisible,
        thirdBtnIsVisible
    ) {
        this.item = item
        this.hand = hand
    }
}