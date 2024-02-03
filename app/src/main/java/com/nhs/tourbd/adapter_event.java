package com.nhs.tourbd;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;


public class adapter_event extends FirebaseRecyclerAdapter<model_event,adapter_event.MyPlViewHolder> {

    public adapter_event(@NonNull FirebaseRecyclerOptions<model_event> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull MyPlViewHolder holder, int position, @NonNull model_event model) {

        holder.ev_title.setText(model.getEv_title());
        holder.ev_details.setText(model.getEv_details());
        holder.ev_time.setText(model.getEv_time());
        Glide.with(holder.ev_poster.getContext())
                .load(model.getEv_poster())
                .placeholder(R.mipmap.ic_launcher)
                .centerCrop()
                .error(R.mipmap.ic_launcher_round)
                .into(holder.ev_poster);

            holder.ev_poster.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    AppCompatActivity activity = (AppCompatActivity) view.getContext();
                    Intent intent = new Intent(activity,activity_event_open.class);

                }
            });

    }

    @NonNull
    @Override
    public MyPlViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View viewPL = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_item_event,parent,false);


        return new MyPlViewHolder(viewPL);
    }

    class MyPlViewHolder extends RecyclerView.ViewHolder{

        ImageView ev_poster;
        TextView ev_title,ev_details,ev_time;

        public MyPlViewHolder(@NonNull View itemView) {
            super(itemView);

            ev_poster = itemView.findViewById(R.id.id_ev_poster);
            ev_title = itemView.findViewById(R.id.id_ev_title);
            ev_time = itemView.findViewById(R.id.id_ev_time);
            ev_details = itemView.findViewById(R.id.id_ev_details);


        }
    }

}
