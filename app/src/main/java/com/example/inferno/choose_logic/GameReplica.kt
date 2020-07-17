package com.example.inferno.choose_logic

class GameReplica : Replica {
    var gameName : String

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
        gameName : String
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
        this.gameName = gameName
    }
}