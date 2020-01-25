package it.matteospaggiari.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Intent Songs
        findViewById(R.id.song).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Initialize and reset user responses to 0
                Intent intent = new Intent(getApplicationContext(), SongsActivity.class);
                startActivity(intent);
            }
        });

        // Intent Albums
        findViewById(R.id.album).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Initialize and reset user responses to 0
                Intent intent = new Intent(getApplicationContext(), AlbumsActivity.class);
                startActivity(intent);
            }
        });

        // Intent Artist
        findViewById(R.id.artist).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Initialize and reset user responses to 0
                Intent intent = new Intent(getApplicationContext(), ArtistsActivity.class);
                startActivity(intent);
            }
        });

        // Intent Favorite Songs
        findViewById(R.id.favorite_songs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Initialize and reset user responses to 0
                Intent intent = new Intent(getApplicationContext(), FavoriteSongsActivity.class);
                startActivity(intent);
            }
        });
    }
}
