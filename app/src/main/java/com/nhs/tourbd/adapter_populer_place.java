package com.nhs.tourbd;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class adapter_populer_place extends FirebaseRecyclerAdapter<model_popupar_place,adapter_populer_place.myviewholder_populer_place> {


    public adapter_populer_place(@NonNull FirebaseRecyclerOptions<model_popupar_place> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull final myviewholder_populer_place holder, int position, @NonNull model_popupar_place model)
    {



        holder.pl_title.setText(model.getPlace_title());
        holder.pl_details.setText(model.getPlace_details());
        Glide.with(holder.pl_poster.getContext())
                .load(model.getPlace_pic1())
                .placeholder(R.mipmap.ic_launcher)
                .centerCrop()
                .error(R.mipmap.ic_launcher_round)
                .into(holder.pl_poster);
        holder.pl_poster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_popular_place.this,activity_populer_place_open.class);
            }
        });

    }

    @NonNull
    @Override
    public myviewholder_populer_place onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View viewP_L = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_item_main,parent,false);


        return new myviewholder_populer_place(viewP_L);
    }

    public class myviewholder_populer_place extends RecyclerView.ViewHolder
        {

            ImageView pl_poster;
            TextView pl_title,pl_details;



            public myviewholder_populer_place(@NonNull View itemView) {
                super(itemView);


                pl_poster = itemView.findViewById(R.id.id_pl_poster);
                pl_title = itemView.findViewById(R.id.id_pl_title);
                pl_details = itemView.findViewById(R.id.id_pl_details);
            }
        }

}
