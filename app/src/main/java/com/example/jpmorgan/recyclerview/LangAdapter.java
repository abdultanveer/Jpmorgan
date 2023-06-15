package com.example.jpmorgan.recyclerview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LangAdapter extends RecyclerView.Adapter<LangAdapter.LanViewHolder> {


    @NonNull
    @Override
    public LanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull LanViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class LanViewHolder extends RecyclerView.ViewHolder {

        public LanViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
