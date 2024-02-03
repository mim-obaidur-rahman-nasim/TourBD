package com.nhs.tourbd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_populer_place_open extends AppCompatActivity {


    double p_lat,p_long;
    ImageView place_pic1,place_pic2,place_pic3,place_pic4,place_pic5;
    TextView p_title,p_details,p_details_2,p_details_22,p_details_3,p_details_33,p_details_4,p_details_44,p_details_5,p_details_55,footer_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_populer_place_open);

        place_pic1=findViewById(R.id.place_pic1);
        place_pic2=findViewById(R.id.place_pic2);
        place_pic3=findViewById(R.id.place_pic3);
        place_pic4=findViewById(R.id.place_pic4);
        place_pic5=findViewById(R.id.place_pic5);

        p_title=findViewById(R.id.p_title);
        p_details=findViewById(R.id.p_details);
        p_details_2=findViewById(R.id.p_details_2);
        p_details_22=findViewById(R.id.p_details_22);
        p_details_3=findViewById(R.id.p_details_3);
        p_details_33=findViewById(R.id.p_details_33);
        p_details_4=findViewById(R.id.p_details_4);
        p_details_44=findViewById(R.id.p_details_44);
        p_details_5=findViewById(R.id.p_details_5);
        p_details_55=findViewById(R.id.p_details_55);

        footer_text.findViewById(R.id.footer_text);








    }
}