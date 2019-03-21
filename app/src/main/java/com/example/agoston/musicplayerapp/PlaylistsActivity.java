package com.example.agoston.musicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PlaylistsActivity extends AppCompatActivity {

    @BindView(R.id.nowPlayingButton)
    Button nowPlayingButton;
    @BindView(R.id.songsButton)
    Button songsButton;
    @BindView(R.id.playlistsButton)
    Button playlistsButton;
    @BindView(R.id.albumsButton)
    Button albumsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        ButterKnife.bind(this);

        ArrayList<Contents> playlist = new ArrayList<Contents>();
        playlist.add(new Contents("Playlist1", "by username"));
        playlist.add(new Contents("Playlist2", "by username"));
        playlist.add(new Contents("Playlist3", "by username"));
        playlist.add(new Contents("Playlist4", "by username"));
        CustomAdapter customAdapter = new CustomAdapter(this, playlist);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(customAdapter);
    }

    @OnClick(R.id.nowPlayingButton)
    public void nowPlayingButton(View view) {
        Intent i = new Intent(this, NowPlayingActivity.class);
        startActivity(i);
    }

    @OnClick(R.id.songsButton)
    public void songsButton(View view) {
        Intent i = new Intent(this, SongsActivity.class);
        startActivity(i);
    }

    @OnClick(R.id.albumsButton)
    public void albumsButton(View view) {
        Intent i = new Intent(this, AlbumsActivity.class);
        startActivity(i);
    }
}