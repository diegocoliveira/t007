package br.unifor.chronotriggernotification.br.unifor.chronotriggernotification.activity

import android.app.Service
import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import br.unifor.chronotriggernotification.R
import br.unifor.chronotriggernotification.br.unifor.chronotriggernotification.service.ChronusService

class MainActivity : AppCompatActivity() {

    lateinit var chronusService: ChronusService

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val it = Intent(this, ChronusService::class.java)
        startService(it)
        bindService(it, serviceConnection, Service.BIND_AUTO_CREATE)

    }

    val serviceConnection: ServiceConnection = object : ServiceConnection {

        override fun onServiceConnected(name: ComponentName, service: IBinder) {
            val bind = service as ChronusService.LocalBind
            chronusService = bind.instance
        }

        override fun onServiceDisconnected(name: ComponentName) {

        }

    }

}

