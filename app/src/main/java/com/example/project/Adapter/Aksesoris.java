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

public class Aksesoris extends RecyclerView.Adapter <Aksesoris.MyViewHolder> {

    List<String> descAksesoris;
    List <Integer> aksesorisImage;

    public Aksesoris(Context ctx, List<Integer> aksesorisImage, List<String> descAksesoris) {
        this.descAksesoris = descAksesoris;
        this.aksesorisImage = aksesorisImage;
    }


    @NonNull
    @Override
    public Aksesoris.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.aksesoris, parent, false);
        Aksesoris.MyViewHolder myViewHolder = new Aksesoris.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Aksesoris.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(aksesorisImage.get(position));
        holder.textView.setText(descAksesoris.get(position));
    }

    @Override
    public int getItemCount() {
        return aksesorisImage.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        public MyViewHolder (@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewAksesorisWanita);
            textView = itemView.findViewById(R.id.textViewAksesorisWanita);
        }
    }
}
