package com.example.inferno.choose_logic

import com.example.inferno.player.Item

class SpecialReplica : Replica {
    var hpChange : Int = 0
    var leftHandNewItem : Item
    var rightHandNewItem : Item
    var goToKNB : Boolean = false
    var goToGoodEnd : Boolean = false
    var goToHalfKingdom : Boolean = false
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
        hpChange : Int,
        leftHandNewItem : Item,
        rightHandNewItem : Item,
        goToKNB : Boolean,
        goToGoodEnd : Boolean,
        goToHalfKingdom : Boolean
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
        this.hpChange = hpChange
        this.leftHandNewItem = leftHandNewItem
        this.rightHandNewItem = rightHandNewItem
        this.goToKNB = goToKNB
        this.goToGoodEnd = goToGoodEnd
        this.goToHalfKingdom = goToHalfKingdom
    }
}