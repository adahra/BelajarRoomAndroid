package com.andigobalsoft.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.andigobalsoft.myapplication.R;

class WordViewHolder extends RecyclerView.ViewHolder {
    private final AppCompatTextView wordItemView;

    private WordViewHolder(@NonNull View itemView) {
        super(itemView);
        wordItemView = itemView.findViewById(R.id.textView);
    }

    static WordViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new WordViewHolder(view);
    }

    public void bind(String text) {
        wordItemView.setText(text);
    }
}
