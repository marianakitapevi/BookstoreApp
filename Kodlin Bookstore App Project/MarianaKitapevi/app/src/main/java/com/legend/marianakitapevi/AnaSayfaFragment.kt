package com.legend.marianakitapevi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

private val Button.setOnClick: Unit
    get() {}


class AnaSayfaFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ana_sayfa, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        kitap_git.setOnClickListener() {
            val aksiyon_kitap = AnaSayfaFragmentDirections.actionAnaSayfaFragmentToKitaplarFragment()
            Navigation.findNavController(it).navigate((aksiyon_kitap))
        }

        dergi_git.setOnClickListener() {
            val aksiyon_dergi = AnaSayfaFragmentDirections.actionAnaSayfaFragmentToDergilerFragment()
            Navigation.findNavController(it).navigate((aksiyon_dergi))
        }

        blog_git.setOnClickListener() {
            val aksiyon_blog = AnaSayfaFragmentDirections.actionAnaSayfaFragmentToBlogFragment()
            Navigation.findNavController(it).navigate((aksiyon_blog))
        }

        yazarlar_git.setOnClickListener() {
            val aksiyon_yazar = AnaSayfaFragmentDirections.actionAnaSayfaFragmentToYazarlarFragment()
            Navigation.findNavController(it).navigate((aksiyon_yazar))
        }

        oneriler_git.setOnClickListener() {
            val aksiyon_oneri = AnaSayfaFragmentDirections.actionAnaSayfaFragmentToOnerilerFragment()
            Navigation.findNavController(it).navigate((aksiyon_oneri))
        }

        ozet_git.setOnClickListener() {
            val aksiyon_ozet = AnaSayfaFragmentDirections.actionAnaSayfaFragmentToOzetlerFragment()
            Navigation.findNavController(it).navigate((aksiyon_ozet))
        }

        sozler_git.setOnClickListener() {
            val aksiyon_sozler = AnaSayfaFragmentDirections.actionAnaSayfaFragmentToSozlerFragment()
            Navigation.findNavController(it).navigate((aksiyon_sozler))
                }

        yayinevi_git.setOnClickListener() {
            val aksiyon_yayinevi = AnaSayfaFragmentDirections.actionAnaSayfaFragmentToYayinEviFragment()
            Navigation.findNavController(it).navigate((aksiyon_yayinevi))
        }

        duyuru_git.setOnClickListener() {
            val aksiyon_duyuru = AnaSayfaFragmentDirections.actionAnaSayfaFragmentToDuyuruFragment()
            Navigation.findNavController(it).navigate((aksiyon_duyuru))
                }

        notlar_git.setOnClickListener() {
            val aksiyon_notlar = AnaSayfaFragmentDirections.actionAnaSayfaFragmentToNotAlFragment()
            Navigation.findNavController(it).navigate((aksiyon_notlar))
        }

        kategori_git.setOnClickListener() {
            val aksiyon_kategori = AnaSayfaFragmentDirections.actionAnaSayfaFragmentToKategorilerFragment()
            Navigation.findNavController(it).navigate((aksiyon_kategori))
        }
    }
}