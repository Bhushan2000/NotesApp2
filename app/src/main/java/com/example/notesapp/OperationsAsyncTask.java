package com.example.notesapp;

import android.os.AsyncTask;

public class OperationsAsyncTask extends AsyncTask<Note, Void, Void> {
    //    this class is parent class for Three different AsyncTask  for update delete edit
    NoteDAO mNoteDao;

    public OperationsAsyncTask(NoteDAO mNoteDao) {
        this.mNoteDao = mNoteDao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        return null;
    }
}
