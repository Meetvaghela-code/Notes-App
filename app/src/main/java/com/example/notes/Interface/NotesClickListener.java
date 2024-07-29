package com.example.notes.Interface;

import androidx.cardview.widget.CardView;

import com.example.notes.Model.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongPress(Notes notes, CardView cardView);
}
