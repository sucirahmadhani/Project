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

public class SearchWanita extends RecyclerView.Adapter <SearchWanita.MyViewHolder> {

    List <String> kategori;
    List <Integer> gambar;

    public SearchWanita(Context ctx, List<Integer> gambar, List<String> kategori) {
        this.kategori = kategori;
        this.gambar = gambar;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_wanita, parent, false);
        SearchWanita.MyViewHolder myViewHolder = new SearchWanita.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SearchWanita.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(gambar.get(position));
        holder.textView.setText(kategori.get(position));
    }

    @Override
    public int getItemCount() {
        return gambar.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        public MyViewHolder (@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewSearchWanita);
            textView = itemView.findViewById(R.id.textViewSearchWanita);
        }
    }

}
