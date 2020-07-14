package br.com.renandeldotti.testebar.fragone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import br.com.renandeldotti.testebar.MainActivity
import br.com.renandeldotti.testebar.R
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_first, container, false)

        val toolbar1: Toolbar = view.toolbar1
        (activity as MainActivity).setSupportActionBar(toolbar1)

        view.button_goto2.setOnClickListener {
            Toast.makeText(it.context, "Teste", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}