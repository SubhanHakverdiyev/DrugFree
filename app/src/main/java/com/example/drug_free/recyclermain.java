package com.example.drug_free;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclermain extends AppCompatActivity {
    RecyclerView mrecycler;
    holder adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.replacementmain);
        mrecycler=findViewById(R.id.rvv);
        mrecycler.setLayoutManager(new LinearLayoutManager(this));
        adapter=new holder(this,getMyList());
        mrecycler.setAdapter(adapter);

    }



    private ArrayList<Model> getMyList(){
       ArrayList<Model> models= new ArrayList<>();
      //First
       Model m= new Model();
       m.setDescription("Exercise! Exercising not only will strengthen your body, but also your willpower");
       m.setImg(R.drawable.ic_baseline_sports_tennis_24);
       models.add(m);
      //2nd
        m= new Model();
        m.setDescription("Imagine yourself as someone drug free! Positive thinking is only right way of thinking!\n");
        m.setImg(R.drawable.brain);
        models.add(m);

        //3rd
        m= new Model();
        m.setDescription("Engage with your loved ones! It's also proven that love-making produces similar effects in your brain as consuming drugs.");
        m.setImg(R.drawable.heart);
        models.add(m);

        //4th
        m= new Model();
        m.setDescription("Go out to nature! Try to take a stroll around the park in the sunny day. Nothing feels bettern than fresh air in your lungs.");
        m.setImg(R.drawable.nature);
        models.add(m);

        //5th
        m= new Model();
        m.setDescription("Listen to music! Hormones produced while listening to music can also substitute hormones produced by drug use.");
        m.setImg(R.drawable.ic_baseline_library_music_24);
        models.add(m);

        //6th
        m= new Model();
        m.setDescription("Meditate or Pray! Spiritual experiences may clear your mind and direct you to right path");
        m.setImg(R.drawable.meditation_concept_illustration_23_2148508591);
        models.add(m);

        //7th

        m= new Model();
        m.setDescription("Get information! Nowadays every information is accesible on internet and you can read experiences of other people, statistics and etc.");
        m.setImg(R.drawable.ic_baseline_info_24);
        models.add(m);

        //8th

        m= new Model();
        m.setDescription("Use our app and contact qualified people to get help.");
        m.setImg(R.drawable.drugfree);
        models.add(m);

     return models;

    }
}
