package com.compose.notesApp.feature_note.domain.use_case

import com.compose.notesApp.feature_note.domain.model.InvalidNoteException
import com.compose.notesApp.feature_note.domain.model.Note
import com.compose.notesApp.feature_note.domain.repository.NotesRepository

class AddNote(
    private val repository: NotesRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("Title is empty.")
        }
        if(note.description.isBlank()) {
            throw InvalidNoteException("Note's description is empty.")
        }
        repository.insertNote(note)
    }
}