package com.rain.spotify_clone.exoplayer

import android.support.v4.media.MediaMetadataCompat
import com.rain.spotify_clone.data.entities.Song

fun MediaMetadataCompat.toSong() : Song? {
    return description?.let {
        Song(
            it.mediaId ?: "",
            it.title.toString(),
            it.mediaUri.toString(),
            it.iconUri.toString(),
            it.subtitle.toString(),
        )
    }
}