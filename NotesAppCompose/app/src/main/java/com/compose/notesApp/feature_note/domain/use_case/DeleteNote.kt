package com.compose.notesApp.feature_note.domain.use_case

import com.compose.notesApp.feature_note.domain.model.Note
import com.compose.notesApp.feature_note.domain.repository.NotesRepository

class DeleteNote(
    private val repository: NotesRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}