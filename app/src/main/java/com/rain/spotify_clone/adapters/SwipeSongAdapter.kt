package com.rain.spotify_clone.adapters

import androidx.recyclerview.widget.AsyncListDiffer
import com.rain.spotify_clone.R
import kotlinx.android.synthetic.main.list_item.view.tvPrimary

class SwipeSongAdapter : BaseSongAdapter(R.layout.swipe_item) {

    override val differ = AsyncListDiffer(this, diffCallback)

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = songs[position]
        holder.itemView.apply {
            val text = "${song.title} - ${song.artist}"
            tvPrimary.text = text

            setOnClickListener {
                onItemClickListener?.let { click ->
                    click(song)
                }
            }
        }
    }

}