package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class cer extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> heading=new ArrayList<>();
    private ArrayList<String>description=new ArrayList<>();
    private ArrayList<Integer>image=new ArrayList<>();
    private recycleadapter adapter;
    RecyclerView rc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cer);

        recyclerView=findViewById(R.id.recycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(cer.this));

        heading.add("Harvard X");
        heading.add("Udemy");
        heading.add("Coding Ninja");
        heading.add("Coursera");
        heading.add("Udemy");
        heading.add("Udemy");

        description.add(" Exercising Leadership:Foundational Principles");
        description.add("Android App Development Master Course with Java");
        description.add("Java");
        description.add("Python");
        description.add("Web Development");
        description.add("Core Java");

        image.add(R.drawable.harvard);
        image.add(R.drawable.udemy);
        image.add(R.drawable.cn);
        image.add(R.drawable.coursera);
        image.add(R.drawable.udemy);
        image.add(R.drawable.udemy);

        adapter=new com.example.portfolio.recycleadapter(heading,description,image,cer.this);
        recyclerView.setAdapter(adapter);

    }

}