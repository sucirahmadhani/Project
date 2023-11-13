package com.example.project.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.project.Adapter.AtasanWanitaAdapter;
import com.example.project.Adapter.Sepatu;
import com.example.project.R;

import java.util.ArrayList;
import java.util.List;

public class SepatuWanita extends AppCompatActivity {

    RecyclerView.LayoutManager layoutManager;
    Sepatu sepatu;

    List<Integer> sepatuImage;
    List<String> descsepatu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepatu_wanita);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewSepatuWanita);
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        sepatuImage = new ArrayList<>();
        sepatuImage.add(R.drawable.sepatu1);
        sepatuImage.add(R.drawable.sepatu2);
        sepatuImage.add(R.drawable.sepatu3);
        sepatuImage.add(R.drawable.sepatu4);
        sepatuImage.add(R.drawable.sepatu5);
        sepatuImage.add(R.drawable.sepatu6);

        descsepatu = new ArrayList<>();
        descsepatu.add("PVRA \n Size 37 \n Rp100.000");
        descsepatu.add("Fitflop \n Size 38 \n Rp150.000");
        descsepatu.add("Tory Burch \n Size 37 \n Rp300.000");
        descsepatu.add("Buccheri \n Size 39 \n Rp200.000");
        descsepatu.add("Melissa \n Size 38 \n Rp100.000");
        descsepatu.add("Vince \n Size 37 \n Rp175.000");

        sepatu = new Sepatu(this, sepatuImage, descsepatu);
        recyclerView.setAdapter(sepatu);
        recyclerView.setHasFixedSize(true);
    }
}