package it.matteospaggiari.musicalstructureapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    Artist queen;
    Artist mika;
    Artist bach;

    ArrayList<Album> albums;
    ArrayList<Song> songsTheGame;
    ArrayList<Song> songsTheWorks;
    ArrayList<Song> songsTheMiracle;
    ArrayList<Song> songsLifeInCartoonMotion;
    ArrayList<Song> songsTheBoyWhoKnewTooMuch;
    ArrayList<Song> songsTheOriginOfLove;
    AlbumAdapter adapterAlbum;
    ListView listViewAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        // Create Artists
        queen = new Artist("Queen");
        mika = new Artist("Mika");
        bach = new Artist("Johann Sebastian Bach");

        // Songs Album The Game
        songsTheGame = new ArrayList<Song>();
        songsTheGame.add(new Song("Play the Game"));
        songsTheGame.add(new Song("Dragon Attack"));
        songsTheGame.add(new Song("Another One Bites the Dust"));
        songsTheGame.add(new Song("Need Your Loving Tonight"));
        songsTheGame.add(new Song("Crazy Little Thing Called Love"));
        songsTheGame.add(new Song("Rock It (Prime Jive)"));
        songsTheGame.add(new Song("Don't Try Suicide"));
        songsTheGame.add(new Song("Sail Away Sweet Sister (To the Sister I Never Had)"));
        songsTheGame.add(new Song("Coming Soon"));
        songsTheGame.add(new Song("Save Me"));

        // Songs Album The Works
        songsTheWorks = new ArrayList<Song>();
        songsTheWorks.add(new Song("Radio Ga Ga"));
        songsTheWorks.add(new Song("Tear It Up"));
        songsTheWorks.add(new Song("It's a Hard Life"));
        songsTheWorks.add(new Song("Man on the Prowl"));
        songsTheWorks.add(new Song("Machines (or 'Back to Humans')"));
        songsTheWorks.add(new Song("I Want to Break Free"));
        songsTheWorks.add(new Song("Keep Passing the Open Windows"));
        songsTheWorks.add(new Song("Hammer to Fall"));
        songsTheWorks.add(new Song("Is This the World We Created...?"));

        // Songs Album The Miracle
        songsTheMiracle = new ArrayList<Song>();
        songsTheMiracle.add(new Song("Party"));
        songsTheMiracle.add(new Song("Khashoggi's Ship"));
        songsTheMiracle.add(new Song("The Miracle"));
        songsTheMiracle.add(new Song("I Want It All"));
        songsTheMiracle.add(new Song("The Invisible Man"));
        songsTheMiracle.add(new Song("Breakthru"));
        songsTheMiracle.add(new Song("Rain Must Fall"));
        songsTheMiracle.add(new Song("Scandal"));
        songsTheMiracle.add(new Song("My Baby Does Me"));
        songsTheMiracle.add(new Song("Was It All Worth It"));

        // Songs Album Life In Cartoon Motion
        songsLifeInCartoonMotion = new ArrayList<Song>();
        songsLifeInCartoonMotion.add(new Song("Grace Kelly"));
        songsLifeInCartoonMotion.add(new Song("Lollipop"));
        songsLifeInCartoonMotion.add(new Song("My Interpretation"));
        songsLifeInCartoonMotion.add(new Song("Love Today"));
        songsLifeInCartoonMotion.add(new Song("Relax, Take It Easy"));
        songsLifeInCartoonMotion.add(new Song("Any Other World"));
        songsLifeInCartoonMotion.add(new Song("Billy Brown"));
        songsLifeInCartoonMotion.add(new Song("Big Girl (You Are Beautiful)"));
        songsLifeInCartoonMotion.add(new Song("Stuck In the Middle"));
        songsLifeInCartoonMotion.add(new Song("Happy Ending"));
        songsLifeInCartoonMotion.add(new Song("Over My Shoulder"));

        // Songs Album The Boy Who Knew Too Much
        songsTheBoyWhoKnewTooMuch = new ArrayList<Song>();
        songsTheBoyWhoKnewTooMuch.add(new Song("We Are Golden"));
        songsTheBoyWhoKnewTooMuch.add(new Song("Blame It on the Girls"));
        songsTheBoyWhoKnewTooMuch.add(new Song("Rain"));
        songsTheBoyWhoKnewTooMuch.add(new Song("Dr. John"));
        songsTheBoyWhoKnewTooMuch.add(new Song("I See You"));
        songsTheBoyWhoKnewTooMuch.add(new Song("Blue Eyes"));
        songsTheBoyWhoKnewTooMuch.add(new Song("Good Gone Girl"));
        songsTheBoyWhoKnewTooMuch.add(new Song("Touches You"));
        songsTheBoyWhoKnewTooMuch.add(new Song("By the Time"));
        songsTheBoyWhoKnewTooMuch.add(new Song("One Foot Boy"));
        songsTheBoyWhoKnewTooMuch.add(new Song("Toy Boy"));
        songsTheBoyWhoKnewTooMuch.add(new Song("Pick Up Off the Floor"));

        // Songs Album The Origin Of Love
        songsTheOriginOfLove = new ArrayList<Song>();
        songsTheOriginOfLove.add(new Song("Origin of Love"));
        songsTheOriginOfLove.add(new Song("Lola"));
        songsTheOriginOfLove.add(new Song("Stardust"));
        songsTheOriginOfLove.add(new Song("Make You Happy"));
        songsTheOriginOfLove.add(new Song("Underwater"));
        songsTheOriginOfLove.add(new Song("Overrated"));
        songsTheOriginOfLove.add(new Song("Kids"));
        songsTheOriginOfLove.add(new Song("Love You When I'm Drunk"));
        songsTheOriginOfLove.add(new Song("Step With Me"));
        songsTheOriginOfLove.add(new Song("Popular Song"));
        songsTheOriginOfLove.add(new Song("Emily"));
        songsTheOriginOfLove.add(new Song("Heroes"));
        songsTheOriginOfLove.add(new Song("Celebrate"));

        // Create List of Album
        albums = new ArrayList<Album>();

        // Add items Album at the list
        albums.add(new Album("The Game", queen, songsTheGame,1980, R.drawable.queen_the_game));
        albums.add(new Album("The Works", queen, songsTheWorks, 1984, R.drawable.queen_the_works));
        albums.add(new Album("The Miracle", queen, songsTheMiracle, 1989, R.drawable.queen_the_miracle));
        albums.add(new Album("Life in Cartoon Motion", mika, songsLifeInCartoonMotion, 2007, R.drawable.mika_life_in_cartoon_motion));
        albums.add(new Album("The Boy Who Knew Too Much", mika, songsTheBoyWhoKnewTooMuch,2009, R.drawable.mika_the_boy_who_knew_too_much));
        albums.add(new Album("The Origin of Love", mika, songsTheOriginOfLove,2012, R.drawable.mika_the_origin_of_love));

        // Create Adapter of Album
        adapterAlbum = new AlbumAdapter(this, albums);

        // Get the ListView resource
        listViewAlbum = findViewById(R.id.list);

        // Assign the adapter to the ListView
        listViewAlbum.setAdapter(adapterAlbum);
    }
}
