package me.yifeiyuan.hf.lifecycles

import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.LifecycleService

/**
 * Created by 程序亦非猿 on 2020/10/27.
 */
class MyLifecycleService : LifecycleService() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun onStart(intent: Intent?, startId: Int) {
        super.onStart(intent, startId)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent): IBinder? {
        return super.onBind(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}