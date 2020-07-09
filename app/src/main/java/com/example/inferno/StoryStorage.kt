package com.example.inferno

class StoryStorage {

    companion object {
        fun getStorage() : List<StoryItem> = listOf(
            StoryItem("реплика1", "ответ1", "ответ2", null),
            StoryItem("реплика1", "ответ1", "ответ2", "ответ3"),
            StoryItem("реплика1", "ответ1", "ответ2", "ответ3")
        )
    }
}