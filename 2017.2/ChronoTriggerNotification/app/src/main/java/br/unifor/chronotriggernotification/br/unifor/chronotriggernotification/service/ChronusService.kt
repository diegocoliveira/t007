package br.unifor.chronotriggernotification.br.unifor.chronotriggernotification.service

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import java.util.concurrent.TimeUnit

class ChronusService : Service() {

    private val binder = LocalBind()
    lateinit var thread:Thread
    var count = 0;
    var stopped = true

    override fun onBind(intent: Intent): IBinder? {
        return binder
    }


    fun startCounter(){

        stopped = false

        thread = Thread(Runnable {
            while(!stopped){
                TimeUnit.MILLISECONDS.sleep(1);
                count +=1
            }
        })

        thread.start()

    }

    fun stopCounter(){
        if(!stopped){
            stopped = true
            thread.join()
        }
    }

    fun resetCounter(){
        if(stopped){
            count = 0
        }
    }

    inner class LocalBind : Binder() {
        val instance: ChronusService
            get() = this@ChronusService
    }

}
