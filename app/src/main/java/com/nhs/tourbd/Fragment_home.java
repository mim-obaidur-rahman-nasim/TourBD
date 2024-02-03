package com.nhs.tourbd;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_home extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_home() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_home.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_home newInstance(String param1, String param2) {
        Fragment_home fragment = new Fragment_home();
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

        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        ImageView imageView =  view.findViewById(R.id.home_explore);
        ImageView imageView2 =  view.findViewById(R.id.home_popular_place);
        ImageView imageView3 =  view.findViewById(R.id.home_hotel_resort);

        ImageView imageView4 =  view.findViewById(R.id.home_tour_plan);
        ImageView imageView5=  view.findViewById(R.id.home_travel_tips);
        ImageView imageView6=  view.findViewById(R.id.home_request);


        imageView.setOnClickListener(view1 -> {

            Intent intent = new Intent(getActivity(),activity_explore.class);
            // intent.putExtra("some","some data");
            startActivity(intent);

        });


        imageView2.setOnClickListener(view1 -> {


            Intent intent = new Intent(getActivity(),activity_popular_place.class);
            // intent.putExtra("some","some data");
            startActivity(intent);


        });

        imageView3.setOnClickListener(view1 -> {


            Intent intent = new Intent(getActivity(),activity_hotel_resorts.class);
            // intent.putExtra("some","some data");
            startActivity(intent);


        });


        imageView4.setOnClickListener(view1 -> {


            Intent intent = new Intent(getActivity(),activity_tour_plan.class);
            // intent.putExtra("some","some data");
            startActivity(intent);


        });

        imageView5.setOnClickListener(view1 -> {


            Intent intent = new Intent(getActivity(),activity_travel_tips.class);
            // intent.putExtra("some","some data");
            startActivity(intent);


        });


        imageView6.setOnClickListener(view1 -> {


            Intent intent = new Intent(getActivity(),activity_request.class);
            // intent.putExtra("some","some data");
            startActivity(intent);


        });






        return view;

    }
}
