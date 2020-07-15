package com.example.inferno

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyService : Service() {
    var player: MediaPlayer? = null
    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onCreate() {
        player = MediaPlayer.create(this, R.raw.inferno_theme)
        player!!.isLooping = true // зацикливаем
    }

    override fun onDestroy() {
        player!!.stop()
    }

    override fun onStart(intent: Intent, startid: Int) {
        player!!.start()
    }

    companion object {
        private const val TAG = "MyService"
    }
}