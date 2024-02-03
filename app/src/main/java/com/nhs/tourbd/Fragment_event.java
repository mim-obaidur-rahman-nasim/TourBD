package com.nhs.tourbd;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;


public class Fragment_event extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    RecyclerView recview;
    adapter_event adapter_event;


    public Fragment_event() {


    }


    public static Fragment_event newInstance(String param1, String param2) {
        Fragment_event fragment = new Fragment_event();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_event, container, false);

        recview = (RecyclerView)view.findViewById(R.id.recyView_event);

        recview.setLayoutManager(new LinearLayoutManager(getContext()));

        FirebaseRecyclerOptions<model_event> options =
                new FirebaseRecyclerOptions.Builder<model_event>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("event"),model_event.class)
                        .build();

        adapter_event = new adapter_event(options);
        recview.setAdapter(adapter_event);

        return view;
    }



    @Override
    public void onStart() {
        super.onStart();
        adapter_event.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        adapter_event.stopListening();
    }
}