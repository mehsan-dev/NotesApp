package com.compose.notesApp.di

import android.app.Application
import androidx.room.Room
import com.compose.notesApp.feature_note.data.data_source.NotesDatabase
import com.compose.notesApp.feature_note.data.repository.NotesRepositoryImpl
import com.compose.notesApp.feature_note.domain.repository.NotesRepository
import com.compose.notesApp.feature_note.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesNotesDatabase(app: Application): NotesDatabase {
        return Room.databaseBuilder(
            app,
            NotesDatabase::class.java,
            NotesDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun providesNotesRepository(db: NotesDatabase): NotesRepository {
        return NotesRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun providesNotesUseCases(repository: NotesRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository)
        )
    }
}