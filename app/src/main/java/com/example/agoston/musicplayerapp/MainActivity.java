package com.example.agoston.musicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.openNowPlaying)
    TextView openNowPlaying;
    @BindView(R.id.openSongs)
    TextView openSongs;
    @BindView(R.id.openAlbums)
    TextView openAlbums;
    @BindView(R.id.openPlaylist)
    TextView openPlaylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.openNowPlaying)
    public void openNowPlaying(View view) {
        Intent i = new Intent(this, NowPlayingActivity.class);
        startActivity(i);
    }

    @OnClick(R.id.openSongs)
    public void openSongs(View view) {
        Intent i = new Intent(this, SongsActivity.class);
        startActivity(i);
    }

    @OnClick(R.id.openAlbums)
    public void openAlbums(View view) {
        Intent i = new Intent(this, AlbumsActivity.class);
        startActivity(i);
    }

    @OnClick(R.id.openPlaylist)
    public void openPlaylist(View view) {
        Intent i = new Intent(this, PlaylistsActivity.class);
        startActivity(i);
    }
}