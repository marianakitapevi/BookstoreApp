package com.legend.marianakitapevi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation


class KayitOlFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kayit_ol, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        kaydet_butonu.setOnClickListener() {
            val aksiyon_kaydet = KayitOlFragmentDirections.actionKayitOlFragmentToAcilisFragment()
            Navigation.findNavController(it).navigate((aksiyon_kaydet))
        }
    }



}