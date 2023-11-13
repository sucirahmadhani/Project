package com.example.project.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.project.Adapter.SearchPria;
import com.example.project.Adapter.SearchWanita;
import com.example.project.R;

import java.util.ArrayList;
import java.util.List;

public class search extends AppCompatActivity {

    RecyclerView.LayoutManager layoutManager;
    SearchWanita searchWanita;
    SearchPria searchPria;

    List <Integer> gambar;
    List <String> kategori;
    List <Integer> picture;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        recyclerViewSearchWanita();
        recyclerViewSearchPria();
    }

    private void recyclerViewSearchWanita() {
        RecyclerView recyclerView = findViewById(R.id.recyclerViewSearchWanita);
        layoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(layoutManager);

        gambar = new ArrayList<>();
        gambar.add(R.drawable.baju7);
        gambar.add(R.drawable.bawahan);
        gambar.add(R.drawable.tas);
        gambar.add(R.drawable.sepatu);
        gambar.add(R.drawable.aksesoris);

        kategori = new ArrayList<>();
        kategori.add("Atasan");
        kategori.add("Bawahan");
        kategori.add("Tas");
        kategori.add("Sepatu");
        kategori.add("Aksesoris");

        searchWanita = new SearchWanita(this, gambar, kategori);
        recyclerView.setAdapter(searchWanita);
        recyclerView.setHasFixedSize(true);
    }

    private void recyclerViewSearchPria(){
        RecyclerView recyclerView = findViewById(R.id.recyclerViewSearchPria);
        layoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(layoutManager);

        picture = new ArrayList<>();
        picture.add(R.drawable.shirt1);
        picture.add(R.drawable.pants);
        picture.add(R.drawable.backpack);
        picture.add(R.drawable.shoes);
        picture.add(R.drawable.watch);


        searchPria = new SearchPria(this, picture, kategori);
        recyclerView.setAdapter(searchPria);
        recyclerView.setHasFixedSize(true);
    }
}