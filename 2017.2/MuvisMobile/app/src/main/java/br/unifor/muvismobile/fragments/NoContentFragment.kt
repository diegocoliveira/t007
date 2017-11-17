package br.unifor.muvismobile.fragments

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import br.unifor.muvismobile.R


class NoContentFragment : Fragment(), View.OnClickListener {

    lateinit var mFloatButton:FloatingActionButton

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater?.inflate(R.layout.fragment_no_content, container, false)

        mFloatButton = view!!.findViewById(R.id.no_action_float_button)
        mFloatButton.setOnClickListener(this)

        return view

    }

    override fun onClick(v: View?) {
        val snack = Snackbar.make(v!!, "Float button foi clicado!!!", Snackbar.LENGTH_LONG)
        snack.setAction("Desfazer",{ Toast.makeText(context, "ABCD", Toast.LENGTH_SHORT).show()})
        snack.show()
    }

}