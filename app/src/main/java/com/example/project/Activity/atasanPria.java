package com.example.project.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.project.Adapter.Aksesoris;
import com.example.project.Adapter.Atasan;
import com.example.project.R;

import java.util.ArrayList;
import java.util.List;

public class atasanPria extends AppCompatActivity {

    RecyclerView.LayoutManager layoutManager;
    Atasan atasan;

    List<Integer> atasanImage;
    List<String> descAtasan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atasan_pria);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewAtasanPria);
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        atasanImage = new ArrayList<>();
        atasanImage.add(R.drawable.atasan1);
        atasanImage.add(R.drawable.atasan2);
        atasanImage.add(R.drawable.atasan3);
        atasanImage.add(R.drawable.atasan4);
        atasanImage.add(R.drawable.atasan5);
        atasanImage.add(R.drawable.atasan6);


        descAtasan = new ArrayList<>();
        descAtasan.add("The Executive \n Size M \n Rp50.000");
        descAtasan.add("The Executive \n Size M \n Rp50.000");
        descAtasan.add("The Executive \n Size M \n Rp50.000");
        descAtasan.add("The Executive \n Size M \n Rp50.000");
        descAtasan.add("The Executive \n Size M \n Rp50.000");
        descAtasan.add("The Executive \n Size M \n Rp50.000");

        atasan = new Atasan(this, atasanImage, descAtasan);
        recyclerView.setAdapter (atasan);
        recyclerView.setHasFixedSize(true);
    }
}