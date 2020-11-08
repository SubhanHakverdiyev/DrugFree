package com.example.drug_free;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Media extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[]={R.drawable.requiem_for_a_dream, R.drawable.trainspoting, R.drawable.tarnation, R.drawable.how_to_murder_your_life, R.drawable.portrait_of_an_addict_as_a_young_man};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        recyclerView =findViewById(R.id.recyclerView);

        s1=getResources().getStringArray(R.array.media);
        s2=getResources().getStringArray(R.array.description);

        Adapter Adapter= new Adapter(this, s1, s2, images);
        recyclerView.setAdapter(Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}