package com.example.inferno.choose_logic

open class Replica {
    //todo: добавить работу с хп  и предметами.
    //todo: переход к концовкам и мини-играм

    var replicaText: String
    var firstChoose: String
    var secondChoose: String
    var thirdChoose: String
    var fstLink: Int
    var scndLink: Int
    var thirdLink: Int
    var secondBtnIsVisible: Boolean = true
    var thirdBtnIsVisible: Boolean = true

    constructor(
        replicaText: String,
        firstChoose: String,
        secondChoose: String,
        thirdChoose: String,
        fstLink: Int,
        scndLink: Int,
        thirdLink: Int,
        secondBtnIsVisible: Boolean,
        thirdBtnIsVisible: Boolean
    ) {
        this.fstLink = fstLink
        this.scndLink = scndLink
        this.firstChoose = firstChoose
        this.secondChoose = secondChoose
        this.firstChoose = firstChoose
        this.thirdBtnIsVisible = thirdBtnIsVisible
        this.replicaText = replicaText
        this.thirdChoose = thirdChoose
        this.thirdLink = thirdLink
        this.secondBtnIsVisible = secondBtnIsVisible
    }


}
