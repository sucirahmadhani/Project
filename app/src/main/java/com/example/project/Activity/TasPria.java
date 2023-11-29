package com.example.project.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.project.Adapter.Bag;
import com.example.project.R;

import java.util.ArrayList;
import java.util.List;

public class TasPria extends AppCompatActivity {

    RecyclerView.LayoutManager layoutManager;
    Bag bag;

    List<Integer> bagImage;
    List<String> descBag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tas_pria);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewTasPria);
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        bagImage = new ArrayList<>();
        bagImage.add(R.drawable.bag1);
        bagImage.add(R.drawable.bag2);
        bagImage.add(R.drawable.bag3);
        bagImage.add(R.drawable.bag4);
        bagImage.add(R.drawable.bag5);
        bagImage.add(R.drawable.bag6);


        descBag = new ArrayList<>();
        descBag.add("Nevada Sport \n Size - \n Rp70.000");
        descBag.add("Travel Time \n Size - \n Rp80.000");
        descBag.add("No Brand \n Size - \n Rp90.000");
        descBag.add("Cardinal \n Size - \n Rp70.000");
        descBag.add("No Brand \n Size - \n Rp100.000");
        descBag.add("No Brand \n Size - \n Rp50.000");

        bag = new Bag (this, bagImage, descBag);
        recyclerView.setAdapter (bag);
        recyclerView.setHasFixedSize(true);
    }
}