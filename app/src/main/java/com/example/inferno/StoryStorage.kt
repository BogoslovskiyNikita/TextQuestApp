package com.example.inferno

class StoryStorage {

    companion object {
        fun getStorage() : List<StoryItem> = listOf(
            StoryItem("стартовая реплика",
                Answer("ответ1", StoryItem("реплика, к которой ведет ответ1",
                    null,
                    null,
                    null)),
                Answer("ответ2", StoryItem("реплика, к которой ведет ответ2",
                    null,
                    null,
                    null)),
                null)
        )
    }
}