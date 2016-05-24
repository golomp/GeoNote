package com.maciej.geonote.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maciej.geonote.R;
import com.maciej.geonote.databinding.NotesListItemBinding;
import com.maciej.geonote.note.Note;
import com.maciej.geonote.viewmodel.NoteViewModel;

import java.util.ArrayList;

/**
 * Created by Maciej on 20.05.2016.
 */
public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesAdapterHolder> {
    private ArrayList<Note> notes;

    public NotesAdapter(ArrayList<Note> notes) {
        this.notes = notes;
    }

    @Override
    public NotesAdapterHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notes_list_item, parent, false);
        NotesAdapterHolder holder = new NotesAdapterHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(NotesAdapterHolder holder, int position) {
        final Note note = notes.get(position);
        holder.getBinding().setViewModel(new NoteViewModel(note.getTitle(), note.getData()));
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public static class NotesAdapterHolder extends RecyclerView.ViewHolder {
        private NotesListItemBinding binding;

        public NotesAdapterHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }

        public NotesListItemBinding getBinding() {
            return binding;
        }
    }
}
