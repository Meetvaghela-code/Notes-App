package com.example.notes.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.notes.Model.Notes;

@Database(entities = {Notes.class}, version = 2, exportSchema = false)
public abstract class RoomDb extends RoomDatabase {

    private static RoomDb database;
    private static final String DATABASE_NAME = "NoteApp";

    // Synchronized method to get the instance of the database
    public synchronized static RoomDb getInstance(Context context) {
        if (database == null) {
            database = Room.databaseBuilder(context.getApplicationContext(),
                            RoomDb.class, DATABASE_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return database;
    }

    // Abstract method to get the DAO
    public abstract MainDAO mainDAO();
}
