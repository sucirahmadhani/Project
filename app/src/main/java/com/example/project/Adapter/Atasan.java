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

public class Atasan  extends RecyclerView.Adapter <Atasan.MyViewHolder> {

    List<String> descAtasan;
    List <Integer> atasanImage;

    public Atasan(Context ctx, List<Integer> atasanImage, List<String> descAtasan) {
        this.descAtasan = descAtasan;
        this.atasanImage = atasanImage;
    }


    @NonNull
    @Override
    public Atasan.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.atasan, parent, false);
        Atasan.MyViewHolder myViewHolder = new Atasan.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Atasan.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(atasanImage.get(position));
        holder.textView.setText(descAtasan.get(position));
    }

    @Override
    public int getItemCount() {
        return atasanImage.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        public MyViewHolder (@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewAtasanPria);
            textView = itemView.findViewById(R.id.textViewAtasanPria);
        }
    }
}

