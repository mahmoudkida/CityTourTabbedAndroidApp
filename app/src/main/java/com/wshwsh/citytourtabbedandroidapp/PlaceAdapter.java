package com.wshwsh.citytourtabbedandroidapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_item, parent, false);
        }
        Place currentPlace = getItem(position);
        TextView placeTitle = listItemView.findViewById(R.id.PlaceTitle);
        placeTitle.setText(currentPlace.getNameResourceId());
        TextView placeTAddress = listItemView.findViewById(R.id.PlaceAddress);
        placeTAddress.setText(currentPlace.getAddressResourceId());
        ImageView imageView = listItemView.findViewById(R.id.PlaceImage);
        // Check if an image is provided for this place or not
        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlace.getImageeResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
