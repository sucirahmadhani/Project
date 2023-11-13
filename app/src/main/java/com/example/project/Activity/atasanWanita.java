package com.example.project.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.project.Adapter.AtasanWanitaAdapter;
import com.example.project.R;

import java.util.ArrayList;
import java.util.List;

public class atasanWanita extends AppCompatActivity {

    RecyclerView.LayoutManager layoutManager;
    AtasanWanitaAdapter atasanWanitaAdapter;

    List<Integer> topImage;
    List<String> desctop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atasan_wanita);


        RecyclerView recyclerView = findViewById(R.id.recyclerViewAtasanWanita);
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        topImage = new ArrayList<>();
        topImage.add(R.drawable.baju1);
        topImage.add(R.drawable.baju2);
        topImage.add(R.drawable.baju3);
        topImage.add(R.drawable.baju4);
        topImage.add(R.drawable.baju5);
        topImage.add(R.drawable.baju6);


        desctop = new ArrayList<>();
        desctop.add("The Executive \n Size M \n Rp50.000");
        desctop.add("Nevada \n Size L \n Rp50.000");
        desctop.add("No Brand \n Size M \n Rp40.000");
        desctop.add("H&M \n Size L \n Rp100.000");
        desctop.add("No Brand \n Size L \n Rp150.000");
        desctop.add("Pull&Bear \n Size M \n Rp200.000");

        atasanWanitaAdapter = new AtasanWanitaAdapter(this, topImage, desctop);
        recyclerView.setAdapter(atasanWanitaAdapter);
        recyclerView.setHasFixedSize(true);
    }
}