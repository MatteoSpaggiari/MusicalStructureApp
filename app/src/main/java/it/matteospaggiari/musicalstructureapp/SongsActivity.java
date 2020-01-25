package it.matteospaggiari.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    Artist queen;
    Artist mika;
    Artist bach;

    Album theGame;
    Album theWorks;
    Album theMiracle;
    Album lifeInCartoonMotion;
    Album theBoyWhoKnewTooMuch;
    Album theOriginOfLove;

    ArrayList<Song> songs;
    SongAdapter adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        // Create Artists
        queen = new Artist("Queen");
        mika = new Artist("Mika");
        bach = new Artist("Johann Sebastian Bach");

        // Create Albums
        theGame = new Album("The Game");
        theWorks = new Album("The Works");
        theMiracle = new Album("The Miracle");
        lifeInCartoonMotion = new Album("Life in Cartoon Motion");
        theBoyWhoKnewTooMuch = new Album("The Boy Who Knew Too Much");
        theOriginOfLove = new Album("The Origin of Love");

        // Create List of Songs
        songs = new ArrayList<Song>();

        // Add items at the list
        songs.add(new Song("Save Me", queen, theGame));
        songs.add(new Song("Radio Ga Ga", queen, theWorks));
        songs.add(new Song("I Want to Break Free", queen, theWorks));
        songs.add(new Song("Hammer to Fall", queen, theWorks));
        songs.add(new Song("Is This the World We Created...?", queen, theWorks));
        songs.add(new Song("I Want It All", queen, theMiracle));
        songs.add(new Song("Scandal", queen, theMiracle));
        songs.add(new Song("Grace Kelly", mika, lifeInCartoonMotion));
        songs.add(new Song("Happy Ending", mika, lifeInCartoonMotion));
        songs.add(new Song("Kick Ass (We Are Young)", mika, theBoyWhoKnewTooMuch));
        songs.add(new Song("Stardust", mika, theOriginOfLove));
        songs.add(new Song("Celebrate", mika, theOriginOfLove));
        songs.add(new Song("Symphony No. 9", bach));
        songs.add(new Song("BWV 532 - Prelude and Fugue in D major", bach));
        songs.add(new Song("BWV 234 - Mass in A major", bach));
        songs.add(new Song("BWV 525 - Sonata n.1 in Eb major", bach));

        // Create Adapter of Songs
        adapter = new SongAdapter(this, songs);

        // Get the ListView resource
        listView = findViewById(R.id.list);

        // Assign the adapter to the ListView
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Song} object at the given position the user clicked on
                Song song = songs.get(position);

                // Create intent and add extra content (title, artist)
                Intent intent = new Intent(getApplicationContext(), PlaySongActivity.class);
                intent.putExtra("title", song.getTitle());
                intent.putExtra("artist", song.getArtist().getName());

                // Check if the song is part of an album
                if(song.getAlbum() != null) {
                    // Send extra content (album title)
                    intent.putExtra("album", song.getAlbum().getTitle());
                }

                // Start the activity with intent
                getApplicationContext().startActivity(intent);
            }
        });

    }
}
