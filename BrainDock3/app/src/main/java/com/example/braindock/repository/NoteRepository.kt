package com.example.braindock.repository

import com.example.braindock.database.NoteDatabase
import com.example.braindock.model.Note

class NoteRepository (private val db: NoteDatabase){

    suspend fun insertNote(note: Note)=db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Note)=db.getNoteDao().deleteNote(note)
    suspend fun updateNote(note: Note)=db.getNoteDao().updateNote(note)


    fun getAllNotes()=db.getNoteDao().getAllNotes()
    fun searchNote(query: String?)= query?.let { db.getNoteDao().searchNote(it) }

}