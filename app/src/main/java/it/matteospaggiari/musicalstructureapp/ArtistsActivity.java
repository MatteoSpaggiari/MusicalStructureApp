package it.matteospaggiari.musicalstructureapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    ArrayList<Artist> artists;
    ArtistAdapter adapterArtist;
    ListView listViewArtist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        // Create List of Artists
        artists = new ArrayList<Artist>();

        // Add items Artist at the list
        artists.add(new Artist("Queen", 1970, 23, R.drawable.queen));
        artists.add(new Artist("Mika", 1983, 7, R.drawable.mika));
        artists.add(new Artist("Johann Sebastian Bach", 1685, 46, R.drawable.bach));

        // Create Adapter of Artist
        adapterArtist = new ArtistAdapter(this, artists);

        // Get the ListView resource
        listViewArtist = findViewById(R.id.list);

        // Assign the adapter to the ListView
        listViewArtist.setAdapter(adapterArtist);
    }
}
