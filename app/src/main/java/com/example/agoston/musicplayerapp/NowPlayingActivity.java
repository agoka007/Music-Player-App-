package com.example.agoston.musicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NowPlayingActivity extends AppCompatActivity {

    @BindView(R.id.rewindButton)
    ImageView rewindButton;
    @BindView(R.id.playButton)
    ImageView playButton;
    @BindView(R.id.forwardButton)
    ImageView forwardButton;
    @BindView(R.id.songsButton)
    Button songsButton;
    @BindView(R.id.playlistsButton)
    Button playlistButton;
    @BindView(R.id.albumsButton)
    Button albumsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.rewindButton)
    public void rewindButton(View view) {
        Toast.makeText(NowPlayingActivity.this,
                "Rewind the music.", Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.playButton)
    public void playButton(View view) {
        Toast.makeText(NowPlayingActivity.this,
                "Play the music.", Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.forwardButton)
    public void forwardButton(View view) {
        Toast.makeText(NowPlayingActivity.this,
                "Forward the music.", Toast.LENGTH_LONG).show();
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

    @OnClick(R.id.playlistsButton)
    public void playlistsButton(View view) {
        Intent i = new Intent(this, PlaylistsActivity.class);
        startActivity(i);
    }
}