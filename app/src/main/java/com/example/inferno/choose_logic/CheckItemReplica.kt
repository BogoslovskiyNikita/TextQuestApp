package com.example.inferno.choose_logic

class CheckItemReplica : Replica {
    var expectItemName: String

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
        expectItemName: String
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
        this.expectItemName = expectItemName;
    }

}