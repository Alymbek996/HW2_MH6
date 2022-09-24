package com.geektech.hw2_mh6.fragments

import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.example.baselesson.base.BaseFragment
import com.example.baselesson.base.BaseViewModel
import com.example.baselesson.model.Image
import com.geektech.hw2_mh6.KEY
import com.geektech.hw2_mh6.R
import com.geektech.hw2_mh6.adapter.FirstAdapter
import com.geektech.hw2_mh6.databinding.FragmentFirstBinding

class FirstFragment : BaseFragment<FragmentFirstBinding, BaseViewModel>() {

    private val firstAdapter = FirstAdapter()
    private val list = ArrayList<Image>()
    override fun inflateVB(layoutInflater: LayoutInflater): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(layoutInflater)
    }

    override val viewModel: FirstViewModel by lazy {
        ViewModelProvider(requireActivity())[FirstViewModel::class.java]
    }
    private fun loadData(): ArrayList<Image> {
        list.apply {
            add(Image("https://www.youloveit.ru/uploads/gallery/main/46/youloveit_ru_naruto04.png",
                true))
            add(Image("https://w7.pngwing.com/pngs/108/909/png-transparent-angel-and-devil-decal-angel-devil-girl-2-car-angel-monochrome-sticker-fictional-character-thumbnail.png",
                true))
            add(Image("https://w7.pngwing.com/pngs/1013/125/png-transparent-itachi-uchiha-sasuke-uchiha-naruto-shippuden-ultimate-ninja-storm-3-naruto-shippuden-ultimate-ninja-storm-4-naruto-ultimate-ninja-itachi-black-hair-sasuke-uchiha-fictional-character-thumbnail.png",
                true))
            add(Image("https://w7.pngwing.com/pngs/164/403/png-transparent-kakashi-hatake-shino-aburame-naruto-vetores-3d-computer-graphics-photography-cartoon-thumbnail.png",
                true))
            add(Image("https://www.pngkit.com/png/full/50-500345_naruto-685-sasuke-and-sakura-by-steampunkskulls-sasuke.png",
                true))
            add(Image("https://www.clipartmax.com/png/middle/209-2096022_sasusaku-kid-by-malengil-sasuke-dan-sakura-png.png",
                true))
            add(Image("https://www.seekpng.com/png/detail/111-1110437_itachi-and-sasuke-png.png",
                true))
            add(Image("https://www.nicepng.com/png/detail/111-1110543_download-png-itachi-and-sasuke-manga.png",
                true))
            add(Image("https://w7.pngwing.com/pngs/151/217/png-transparent-minato-namikaze-kushina-uzumaki-naruto-uzumaki-naruto-shippūden-naruto-manga-cartoon-fictional-character.png",
                true))
            add(Image("https://www.kindpng.com/picc/m/222-2228493_minato-kushina-minato-kushina-and-naruto-hd-png.png",
                true))
            add(Image("https://i.pinimg.com/originals/11/77/d7/1177d7936cf509018406ffe494b941f7.png",
                true))
            add(Image("https://avatanplus.com/files/resources/original/5abbb1a84dd601626d2df97f.png",
                true))
            add(Image("https://w7.pngwing.com/pngs/731/444/png-transparent-itachi-uchiha-sasuke-uchiha-madara-uchiha-gaara-killer-bee-itachi-uchiha-black-hair-cartoons-cartoon-thumbnail.png",
                true))

            add(Image(" https://toppng.com/uploads/preview/jpg-library-kakashi-png-kakashi-hatake-anbu-chidori-11563205531nrd9n2g2li.png",
                true))

            add(Image("https://w7.pngwing.com/pngs/312/146/png-transparent-itachi-uchiha-sasuke-uchiha-gaara-obito-uchiha-kankuro-naruto-superhero-fictional-character-cartoon.png",
                true))
            add(Image(" https://www.kindpng.com/picc/m/157-1579248_itachi-uchiha-edo-tensei-render-itachi-uchiha-edo.png",
                true))
        }
        return list
    }

    override fun checkInternet() {

    }

    override fun initViewModel() {

    }

    override fun initListener() {
        binding.fab.setOnClickListener {
            val bundle = Bundle()
            bundle.putStringArrayList(KEY, firstAdapter.selectedList)
            navigate(R.id.secondFragment2, bundle)
        }
    }

    override fun initViews() {
        binding.recyclerView.adapter = firstAdapter

        if (list.isEmpty()){
            firstAdapter.addList(loadData())
        }
    }



}