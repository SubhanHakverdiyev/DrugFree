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
       m.setDescription("You can have sex");
       m.setImg(R.drawable.h);
       models.add(m);
      //2nd
        m= new Model();
        m.setDescription("You can have sex");
        m.setImg(R.drawable.h);
        models.add(m);

        //3rd
        m= new Model();
        m.setDescription("You can have sex");
        m.setImg(R.drawable.h);
        models.add(m);

        //4th
        m= new Model();
        m.setDescription("You can have sex");
        m.setImg(R.drawable.h);
        models.add(m);

        //5th
        m= new Model();
        m.setDescription("You can have sex");
        m.setImg(R.drawable.h);
        models.add(m);

        //6th
        m= new Model();
        m.setDescription("You can have sex");
        m.setImg(R.drawable.h);
        models.add(m);

        //7th

        m= new Model();
        m.setDescription("You can have sex");
        m.setImg(R.drawable.h);
        models.add(m);

        //8th

        m= new Model();
        m.setDescription("You can have sex");
        m.setImg(R.drawable.h);
        models.add(m);

     return models;

    }
}
