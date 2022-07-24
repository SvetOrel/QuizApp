package com.example.quizapp

import android.app.Service
import android.content.Intent
import android.content.res.AssetFileDescriptor
import android.media.MediaPlayer
import android.os.IBinder

class BackgroundSoundService : Service() {

    internal lateinit var player: MediaPlayer
    override fun onBind(arg0: Intent): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        player = MediaPlayer.create(this,R.raw.music3)
        player.setVolume(200f, 200f)
        player.isLooping = true
    }

    override fun onStart(intent: Intent, startId: Int) {
        player.start()
    }

    override fun onDestroy() {
        player.stop()
        player.release()
    }
}