package com.example.project.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project.R;

import java.util.List;

public class Bag extends RecyclerView.Adapter <Bag.MyViewHolder> {

    List<String> descBag;
    List <Integer> bagImage;

    public Bag(Context ctx, List<Integer> bagImage, List<String> descBag) {
        this.descBag = descBag;
        this.bagImage = bagImage;
    }


    @NonNull
    @Override
    public Bag.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bag, parent, false);
        Bag.MyViewHolder myViewHolder = new Bag.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Bag.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(bagImage.get(position));
        holder.textView.setText(descBag.get(position));
    }

    @Override
    public int getItemCount() {
        return bagImage.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        public MyViewHolder (@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewTasPria);
            textView = itemView.findViewById(R.id.textViewTasPria);
        }
    }
}
