package com.wshwsh.citytourtabbedandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList places = new ArrayList<Place>();
        places.add(new Place(R.string.alourjuan, R.string.alourjuanLoc, R.string.alourjuanDesc, R.drawable.alourjouan));
        places.add(new Place(R.string.globe, R.string.globeloc, R.string.globedesc, R.drawable.globe));
        View rootView = inflater.inflate(R.layout.restaurants_fragment, container, false);
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        // palce_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.restaurantsListView);
        // {@link ListView} will display list items for each {@link palce} in the list.
        listView.setAdapter(adapter);
        // Set a click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Place place = (Place) places.get(position);
                Intent intent = new Intent(getContext(), place_details.class);
                intent.putExtra("placeName", getResources().getString(place.getNameResourceId()));
                intent.putExtra("placeLoc", getResources().getString(place.getAddressResourceId()));
                intent.putExtra("placeDesc", getResources().getString(place.getDescriptionResourceId()));
                intent.putExtra("placeImage", place.getImageeResourceId());
                startActivity(intent);
            }
        });
        // Inflate the layout for this fragment
        return rootView;
    }
}