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

public class AtasanWanitaAdapter extends RecyclerView.Adapter <AtasanWanitaAdapter.MyViewHolder> {

    List <String> desctop;
    List <Integer> topImage;
    public AtasanWanitaAdapter(Context ctx, List<Integer> topImage, List<String> desctop) {
        this.desctop = desctop;
        this.topImage = topImage;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(topImage.get(position));
        holder.textView.setText(desctop.get(position));
    }

    @Override
    public int getItemCount() {
        return topImage.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        public MyViewHolder (@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewAtasanWanita);
            textView = itemView.findViewById(R.id.textViewAtasanWanita);
        }
    }
}
