package br.unifor.muvismobile.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import br.unifor.muvismobile.R
import br.unifor.muvismobile.database.MovieDAO
import br.unifor.muvismobile.fragments.NoContentFragment

class MainActivity : AppCompatActivity() {

    lateinit var mMovieDAO: MovieDAO
    lateinit var mFragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mFragmentManager = supportFragmentManager

        mMovieDAO = MovieDAO(this)
        if (mMovieDAO.findAll().size > 0) {
            //TODO: Carregar o fragmento de listagem de filmes
        } else {
            val noContent = NoContentFragment()
            val fragmentTransaction = mFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.main_content, noContent)
            fragmentTransaction.commitNow()
        }


    }
}
