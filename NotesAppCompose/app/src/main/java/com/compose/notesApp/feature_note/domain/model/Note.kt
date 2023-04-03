package com.compose.notesApp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.compose.notesApp.ui.theme.*

@Entity
data class Note(
    val title: String,
    val description: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(LightYellow, Turquoise, LightViolet, BabyPink, SkyBlue)
    }
}

class InvalidNoteException(message: String): Exception(message)