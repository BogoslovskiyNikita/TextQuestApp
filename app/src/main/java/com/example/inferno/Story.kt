package com.example.inferno

data class StoryItem(
    var phrase : String,
    var answer1 : Answer?,
    var answer2: Answer?,
    var answer3: Answer?
)

data class Answer(
    var text : String,
    var next : StoryItem
)
