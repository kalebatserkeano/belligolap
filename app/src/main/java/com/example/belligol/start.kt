package com.example.belligol

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.Navigation

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [start.newInstance] factory method to
 * create an instance of this fragment.
 */
class start : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    var currentscore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_start, container, false)

        //find the button and set its onclick
        view.findViewById<Button>(R.id.menuknop).setOnClickListener {
            //Use the navigation tree in the current view to navigate to the next page
            Navigation.findNavController(view).navigate(R.id.action_start2_to_menu)
        }

        view.findViewById<ImageButton>(R.id.belligol).setOnClickListener {
            currentscore++
            view.findViewById<TextView>(R.id.Goals).text = currentscore.toString()

        }

        return view
    }

}