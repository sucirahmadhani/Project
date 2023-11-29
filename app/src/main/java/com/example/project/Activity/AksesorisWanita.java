package com.example.project.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.project.Adapter.Aksesoris;
import com.example.project.R;

import java.util.ArrayList;
import java.util.List;

public class AksesorisWanita extends AppCompatActivity {

    RecyclerView.LayoutManager layoutManager;
    Aksesoris aksesoris;

    List<Integer> aksesorisImage;
    List<String> descAksesoris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aksesoris_wanita);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewAksesorisWanita);
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        aksesorisImage = new ArrayList<>();
        aksesorisImage.add(R.drawable.aksesoris1);
        aksesorisImage.add(R.drawable.aksesoris2);
        aksesorisImage.add(R.drawable.aksesoris3);
        aksesorisImage.add(R.drawable.aksesoris4);
        aksesorisImage.add(R.drawable.aksesoris5);
        aksesorisImage.add(R.drawable.aksesoris6);

        descAksesoris = new ArrayList<>();
        descAksesoris.add("No Brand \n Size - \n Rp100.000");
        descAksesoris.add("No Brand \n Size - \n Rp130.000");
        descAksesoris.add("No Brand \n Size - \n Rp200.000");
        descAksesoris.add("No Brand \n Size - \n Rp250.000");
        descAksesoris.add("No Brand \n Size - \n Rp125.000");
        descAksesoris.add("No Brand \n Size - \n Rp210.000");


        aksesoris = new Aksesoris(this, aksesorisImage, descAksesoris);
        recyclerView.setAdapter(aksesoris);
        recyclerView.setHasFixedSize(true);
    }
}