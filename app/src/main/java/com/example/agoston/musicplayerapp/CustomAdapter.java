package com.example.agoston.musicplayerapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Contents> {
    private static final String LOG_TAG = CustomAdapter.class.getSimpleName();

    public CustomAdapter(Activity context, ArrayList<Contents> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Contents currentContent = getItem(position);

        TextView itemTextView = listItemView.findViewById(R.id.item_1);
        itemTextView.setText(currentContent.getmContentItem1());

        TextView songArtistTextView = listItemView.findViewById(R.id.item_2);
        songArtistTextView.setText(currentContent.getmContentItem2());

        return listItemView;
    }
}