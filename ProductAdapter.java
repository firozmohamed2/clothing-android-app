package com.learn.dresscompany;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.BlankViewHolder> {

    List<ProductModel> list;
    int imageHeight,gridWidth,imageWidth;

    public ProductAdapter(List<ProductModel> list) {
        this.list = list;
    }







    @NonNull
    @Override
    public BlankViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.product_card,parent,false);
        gridWidth = parent.getContext().getResources().getDisplayMetrics().widthPixels;
        imageWidth = gridWidth/2;
        imageHeight = imageWidth*3/2;
        return new  BlankViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BlankViewHolder holder, int position) {
        ProductModel object= list.get(position);
        holder.productTitle.setText(object.getProductname());
        holder.productPrice.setText(object.getProductprice());
        Picasso.get().load(object.getImageurl()).placeholder(R.drawable.bgwh)
                .fit().into(holder.productImage);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class BlankViewHolder extends RecyclerView.ViewHolder  {

        ImageView productImage;
        TextView productTitle,productPrice;


        public BlankViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage=itemView.findViewById(R.id.img1);
            productTitle=itemView.findViewById(R.id.title1);
            productPrice=itemView.findViewById(R.id.desc1);

            productImage.requestLayout();
            productImage.getLayoutParams().width = imageWidth;
            productImage.getLayoutParams().height = imageHeight;



        }


    }
}