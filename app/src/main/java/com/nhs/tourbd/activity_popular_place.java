package com.nhs.tourbd;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;


public class activity_popular_place extends AppCompatActivity {

    RecyclerView recyclerView2;

    adapter_populer_place adapter_popular_place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_popular_place);
        recyclerView2 = findViewById(R.id.recyView_popular_place);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));


        FirebaseRecyclerOptions<model_popupar_place> options =
                new FirebaseRecyclerOptions.Builder<model_popupar_place>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("popular_place"),model_popupar_place.class)
                        .build();


        adapter_popular_place = new adapter_populer_place(options);
        recyclerView2.setAdapter(adapter_popular_place);
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter_popular_place.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter_popular_place.stopListening();
    }
}