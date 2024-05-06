package com.guzya.home_worke77

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.guzya.home_worke77.databinding.ItemAestheticsBinding


class AestheticsAdapter : RecyclerView.Adapter<AestheticsAdapter.AestheticsViewHolder>() {

    private var _aestheticList = listOf<AestheticsModels>()

    fun setAppList(aestheticList: List<AestheticsModels>) {
        _aestheticList = aestheticList
    }

    inner class AestheticsViewHolder(private val binding: ItemAestheticsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(aestheticsModels: AestheticsModels) {
            binding.imageView.setImageResource(aestheticsModels.image)
            binding.textView.text = aestheticsModels.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AestheticsViewHolder {
        return AestheticsViewHolder(
            ItemAestheticsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return _aestheticList.size

    }

    override fun onBindViewHolder(holder: AestheticsViewHolder, position: Int) {
        holder.onBind(_aestheticList[position])
    }
}
