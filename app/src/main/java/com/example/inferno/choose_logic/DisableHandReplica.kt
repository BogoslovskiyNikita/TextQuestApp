package com.example.inferno.choose_logic

class DisableHandReplica : Replica {
    var hpChange : Int

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
        hpChange: Int
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
    }
}