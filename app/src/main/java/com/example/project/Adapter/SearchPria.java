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

public class SearchPria extends RecyclerView.Adapter <SearchPria.MyViewHolder> {

    List<String> kategori;
    List <Integer> picture;

    public SearchPria(Context ctx, List<Integer> picture, List<String> kategori) {
        this.kategori = kategori;
        this.picture = picture;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_pria, parent, false);
        SearchPria.MyViewHolder myViewHolder = new SearchPria.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SearchPria.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(picture.get(position));
        holder.textView.setText(kategori.get(position));
    }

    @Override
    public int getItemCount() {
        return picture.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        public MyViewHolder (@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewSearchPria);
            textView = itemView.findViewById(R.id.textViewSearchPria);
        }
    }

}
