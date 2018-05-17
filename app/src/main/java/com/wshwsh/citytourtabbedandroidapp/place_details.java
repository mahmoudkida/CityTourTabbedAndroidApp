package com.wshwsh.citytourtabbedandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class place_details extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_details);
        TextView placeName = findViewById(R.id.placeName);
        TextView placeLoc = findViewById(R.id.placeLocation);
        TextView placeDesc = findViewById(R.id.placeDesc);
        Intent intent = getIntent();
        placeName.setText(intent.getStringExtra("placeName"));
        placeLoc.setText(intent.getStringExtra("placeLoc"));
        placeDesc.setText(intent.getStringExtra("placeDesc"));
        if (intent.hasExtra("placeImage")) {
            ImageView placeImage = findViewById(R.id.featuredImage);
            placeImage.setImageResource(intent.getIntExtra("placeImage", 0));
        }
    }
}
