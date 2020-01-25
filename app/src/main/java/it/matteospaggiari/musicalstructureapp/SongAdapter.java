package it.matteospaggiari.musicalstructureapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param songs A List of Song objects to display in a list
     */
    public SongAdapter(@NonNull Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable final View convertView, @NonNull final ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_songs, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        final Song currentSong = getItem(position);

        // Find the TextView in the list_item_songs.xml layout with the ID song_text_view
        TextView songTitleTextView = listItemView.findViewById(R.id.song_text_view);
        // Get the Title from the current Song object and
        // set this on the TextView
        songTitleTextView.setText(currentSong.getTitle());

        // Find the TextView in the list_item_songs.xml layout with the ID artist_text_view
        TextView artistNameTextView = listItemView.findViewById(R.id.artist_text_view);
        // Get the Name of Artist from the current Artist object and
        // set this on the TextView
        artistNameTextView.setText(currentSong.getArtist().getName());

        // Find the TextView in the list_item_songs.xml layout with the ID album_text_view
        TextView albumTitleTextView = listItemView.findViewById(R.id.album_text_view);

        // Check if the song is part of an album
        if(currentSong.getAlbum() != null) {
            // Set the album title and make the TextView visible
            albumTitleTextView.setText("Album: "+currentSong.getAlbum().getTitle());
            albumTitleTextView.setVisibility(View.VISIBLE);
        } else {
            // Hide the TextView if the song is not part of an album
            albumTitleTextView.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 3 TextViews if Album is not null)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
