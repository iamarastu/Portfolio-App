package com.example.portfolio;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recycleadapter extends RecyclerView.Adapter<recycleadapter.certviewholder>{
    private ArrayList<String> heading;
    private ArrayList<String>description;
    private ArrayList<Integer>image;
    private Context context;

    public recycleadapter(ArrayList<String> heading, ArrayList<String> description, ArrayList<Integer> image, Context context) {
        this.heading = heading;
        this.description = description;
        this.image = image;
        this.context = context;
    }



    @NonNull
    @Override
    public certviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_cert,parent,false);

        return new certviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull certviewholder holder, @SuppressLint("RecyclerView") int position) {

        holder.textView.setText(heading.get(position));
        holder.textView2.setText(description.get(position));
        holder.image.setImageResource(image.get(position));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==0)
                {
                    Toast.makeText(context, "hello", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }





    @Override
    public int getItemCount() {

        return heading.size();
    }

    public class certviewholder extends RecyclerView.ViewHolder {

        private TextView textView,textView2;
        private ImageView image;
        private CardView cardView;
        public certviewholder(@NonNull View itemView) {
            super(itemView);


            textView=itemView.findViewById(R.id.certhead);
            textView2=itemView.findViewById(R.id.certdis);
            image=itemView.findViewById(R.id.profile_image);
            cardView=itemView.findViewById(R.id.cardview);
        }
    }

}

