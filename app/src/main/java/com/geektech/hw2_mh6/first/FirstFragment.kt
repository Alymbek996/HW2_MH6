package com.example.baselesson.ui.first

import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.example.baselesson.R
import com.example.baselesson.base.BaseFragment
import com.example.baselesson.base.BaseViewModel
import com.example.baselesson.databinding.FragmentFirstBinding
import com.example.baselesson.extension.KEY
import com.example.baselesson.model.Image

class FirstFragment : BaseFragment<FragmentFirstBinding, BaseViewModel>() {
    private val list = ArrayList<Image>()
    private val firstAdapter = FirstAdapter()

    override fun inflateVB(layoutInflater: LayoutInflater): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(layoutInflater)
    }

    override val viewModel: FirstViewModel by lazy {
        ViewModelProvider(requireActivity())[FirstViewModel::class.java]
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

    private fun loadData(): ArrayList<Image> {
        list.apply {
            add(Image("https://www.lamborghini.com/sites/it-en/files/DAM/lamborghini/facelift_2019/homepage/families-gallery/2022/04_12/family_chooser_tecnica_m.png",
                true))
            add(Image("https://flyclipart.com/thumbs/lamborghini-file-1596594.png",
            true))
            add(Image("https://www.pngall.com/wp-content/uploads/5/Lamborghini-Aventador-PNG-High-Quality-Image.png",
            true))
            add(Image("https://www.pngitem.com/pimgs/m/2-24592_lamborghini-aventador-car-lamborghini-huracxe1n-lamborghini-lamborghini-png.png",
            true))
            add(Image("https://www.seekpng.com/png/detail/373-3736496_lamborghini-veneno-png-lamborghini-veneno.png",
            true))
            add(Image("https://www.pngall.com/wp-content/uploads/11/Tuning-Car-PNG-Photo.png",
            true))
            add(Image("https://www.pngmart.com/files/4/Car-Transparent-PNG.png",
            true))
            add(Image("https://toppng.com/uploads/preview/car-11549451668kuvceywvwi.png",
            true))
            add(Image("https://www.freeiconspng.com/thumbs/car-png/land-rover-range-rover-car-png-25.png",
            true))
            add(Image("https://www.pngmart.com/files/4/Car-PNG-Transparent-Image.png",
            true))
            add(Image("https://www.prim-autorent.md/img/cars/16189920290294.jpg",
            true))
            add(Image("https://www.pngkey.com/png/detail/776-7768116_fast-car-png-black-maserati-png.png",
            true))
            add(Image("https://www.pngitem.com/pimgs/m/310-3107626_fast-car-png-transparent-png.png",
            true))
            add(Image("https://www.pngfind.com/pngs/m/75-759550_blue-race-car-png-transparent-blue-race-car.png",
            true))
            add(Image("https://w7.pngwing.com/pngs/401/90/png-transparent-2018-chevrolet-camaro-2017-chevrolet-camaro-car-2014-chevrolet-camaro-chevrolet-car-performance-car-vehicle.png",
            true))
            add(Image("https://static.wixstatic.com/media/2cd43b_52a2e10a6b83447993829f62a8336e44~mv2.png/v1/fill/w_320,h_190,q_90/2cd43b_52a2e10a6b83447993829f62a8336e44~mv2.png",
            true))
            add(Image("https://www.pngmart.com/files/10/Yellow-Ford-Mustang-PNG-Clipart.png",
            true))
            add(Image("https://static.wixstatic.com/media/2cd43b_46186463fee44203b688c56f0a692767~mv2.png/v1/fill/w_320,h_188,q_90/2cd43b_46186463fee44203b688c56f0a692767~mv2.png",
            true))
            add(Image("https://png.pngitem.com/pimgs/s/369-3699048_cincinnati-car-rental-dodge-charger-2018-hd-png.png",
            true))
            add(Image("https://e7.pngegg.com/pngimages/464/370/png-clipart-porsche-porsche.png",
            true))
            add(Image("https://img.favpng.com/19/25/12/2018-hyundai-elantra-gt-2018-hyundai-elantra-se-car-hyundai-genesis-png-favpng-jQJ8YZbdkwdjp8Qzu1UmYbuK4.jpg",
            true))
            add(Image("https://www.pngall.com/wp-content/uploads/7/White-Tesla-Electric-Car-PNG-High-Quality-Image.png",
            true))
            add(Image("https://www.pngmart.com/files/10/White-Rolls-Royce-Car-PNG-Clipart.png",
            true))
            add(Image("https://mpng.subpng.com/20180704/qes/kisspng-lincoln-town-car-ford-motor-company-lincoln-contin-vip-rent-a-car-5b3c6065425cf5.6390271915306834932718.jpg",
            true))
        }
        return list
    }
}