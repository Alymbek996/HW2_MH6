package com.example.baselesson.ui.first

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.baselesson.databinding.ItemImageBinding
import com.example.baselesson.extension.load
import com.example.baselesson.model.Image

class FirstAdapter : RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {

    private var list = arrayListOf<Image>()
    val selectedList = ArrayList<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        return FirstViewHolder(
            ItemImageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addList(list: ArrayList<Image>){
        this.list = list
        notifyDataSetChanged()
    }

    inner class FirstViewHolder(private var binding: ItemImageBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(image: Image) = with(binding){
            ivFirst.load(image.image)
            itemView.setOnClickListener {
                if (image.bool){
                    image.bool = false
                    ivBackground.isVisible = true
                    selectedList.add(image.image)
                } else {
                    image.bool = true
                    ivBackground.isVisible = false
                    selectedList.remove(image.image)
                }
            }
        }

    }
}

