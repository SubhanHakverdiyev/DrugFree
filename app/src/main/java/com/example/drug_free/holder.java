package com.example.drug_free;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class holder extends RecyclerView.Adapter<Recycleradapter> {

    Context c;
    ArrayList<Model> models;

    public holder(recyclermain recyclermain, ArrayList<Model> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public Recycleradapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.replacement,parent,false);
        return new Recycleradapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Recycleradapter holder, int position) {
          holder.des.setText(models.get(position).getDescription());
          holder.mimageview.setImageResource(models.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
