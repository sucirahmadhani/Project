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

public class Sepatu extends RecyclerView.Adapter <Sepatu.MyViewHolder> {

    List<String> descsepatu;
    List <Integer> sepatuImage;

    public Sepatu(Context ctx, List<Integer> sepatuImage, List<String> descsepatu) {
        this.descsepatu = descsepatu;
        this.sepatuImage = sepatuImage;
    }


    @NonNull
    @Override
    public Sepatu.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sepatu, parent, false);
        Sepatu.MyViewHolder myViewHolder = new Sepatu.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Sepatu.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(sepatuImage.get(position));
        holder.textView.setText(descsepatu.get(position));
    }

    @Override
    public int getItemCount() {
        return sepatuImage.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        public MyViewHolder (@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewSepatuWanita);
            textView = itemView.findViewById(R.id.textViewSepatuWanita);
        }
    }
}
