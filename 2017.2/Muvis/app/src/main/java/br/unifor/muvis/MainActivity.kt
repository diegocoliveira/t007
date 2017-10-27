package br.unifor.muvis

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import br.unifor.muvis.database.CategoryDAO
import br.unifor.muvis.entity.Category

class MainActivity : AppCompatActivity() {

    lateinit var mToolbar:Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mToolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(mToolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item?.itemId){

            R.id.action_favorite -> { Toast.makeText(this, "Informação", Toast.LENGTH_SHORT).show()}
            R.id.action_favorite1 -> { Toast.makeText(this, "Informação1", Toast.LENGTH_SHORT).show()}
            R.id.action_favorite2 -> { Toast.makeText(this, "Informação2", Toast.LENGTH_SHORT).show()}
            R.id.action_settings -> { Toast.makeText(this, "Ajuda", Toast.LENGTH_SHORT).show()}
            R.id.action_settings1 -> { Toast.makeText(this, "Ajuda1", Toast.LENGTH_SHORT).show()}
            R.id.action_settings2 -> { Toast.makeText(this, "Ajuda2", Toast.LENGTH_SHORT).show()}
            R.id.action_settings3 -> { Toast.makeText(this, "Ajuda3", Toast.LENGTH_SHORT).show()}

        }

        return true
    }

}
