package com.example.agoston.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        ButterKnife.bind(this);

        ArrayList<Contents> songs = new ArrayList<Contents>();
        songs.add(new Contents("Song1", "Artist1"));
        songs.add(new Contents("Song2", "Artist1"));
        songs.add(new Contents("Song3", "Artist1"));
        songs.add(new Contents("Song4", "Artist2"));
        songs.add(new Contents("Song5", "Artist3"));
        songs.add(new Contents("Song6", "Artist3"));
        songs.add(new Contents("Song7", "Artist4"));
        songs.add(new Contents("Song8", "Artist4"));
        songs.add(new Contents("Song9", "Artist4"));

        CustomAdapter customAdapter = new CustomAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(customAdapter);
    }

    @OnClick(R.id.nowPlayingButton)
    public void nowPlayingButton(View view) {
        Intent i = new Intent(this, NowPlayingActivity.class);
        startActivity(i);
    }

    @OnClick(R.id.albumsButton)
    public void albumsButton(View view) {
        Intent i = new Intent(this, AlbumsActivity.class);
        startActivity(i);
    }

    @OnClick(R.id.playlistsButton)
    public void playlistsButton(View view) {
        Intent i = new Intent(this, PlaylistsActivity.class);
        startActivity(i);
    }
}