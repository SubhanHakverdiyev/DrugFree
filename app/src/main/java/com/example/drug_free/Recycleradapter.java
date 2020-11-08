package com.example.drug_free;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Recycleradapter  extends RecyclerView.ViewHolder{

    ImageView mimageview;
    TextView des;

    public Recycleradapter(@NonNull View itemView) {
        super(itemView);

        this.mimageview=itemView.findViewById(R.id.iv_image);
        this.des=itemView.findViewById(R.id.description);

    }
}
