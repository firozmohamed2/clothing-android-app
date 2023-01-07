package com.learn.dresscompany;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductViewHolder extends RecyclerView.ViewHolder {

    TextView titleTv,descriptionTv;
    ImageView imageView;


    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        titleTv=itemView.findViewById(R.id.title1);
        descriptionTv=itemView.findViewById(R.id.desc1);
       imageView=itemView.findViewById(R.id.img1);





    }
}
