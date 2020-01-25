package it.matteospaggiari.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PlaySongActivity extends AppCompatActivity {

    TextView tvTitle;
    TextView tvArtist;
    TextView tvAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_song);

        // Get intent from the parent activity
        Intent intent = getIntent();

        // Get extra from the parent activity
        String title = intent.getStringExtra("title");
        String artist = intent.getStringExtra("artist");
        String album = intent.getStringExtra("album");

        // Get TextView by ID title_text_view
        tvTitle = findViewById(R.id.title_text_view);
        // Set text on the TextView by ID title_text_view
        tvTitle.setText(title);

        // Get TextView by ID artist_text_view
        tvArtist = findViewById(R.id.artist_text_view);
        // Set text on the TextView by ID artist_text_view
        tvArtist.setText(artist);

        // Get TextView by ID album_text_view
        tvAlbum = findViewById(R.id.album_text_view);

        if(tvAlbum != null) {
            // Set text on the TextView by ID album_text_view
            tvAlbum.setText(album);
            tvAlbum.setVisibility(View.VISIBLE);
        } else {
            tvAlbum.setVisibility(View.GONE);
        }
    }
}
