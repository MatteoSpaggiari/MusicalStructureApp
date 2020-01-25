package it.matteospaggiari.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<Album> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param albums A List of Albums objects to display in a list
     */
    public AlbumAdapter(@NonNull Context context, ArrayList<Album> albums) {
        super(context, 0, albums);
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
                    R.layout.list_item_albums, parent, false);
        }

        // Get the {@link Album} object located at this position in the list
        Album currentAlbum = getItem(position);

        // Find the ImageView in the list_item_albums.xml layout with the ID album_cover
        ImageView albumCoverImageView = listItemView.findViewById(R.id.album_cover);
        // Get the Resource ID Image from the current Album object and
        // set this on the ImageView
        albumCoverImageView.setImageResource(currentAlbum.getIdImage());

        // Find the TextView in the list_item_albums.xml layout with the ID album_title
        TextView albumTitleTextView = listItemView.findViewById(R.id.album_title);
        // Get the Title from the current Album object and
        // set this on the TextView
        albumTitleTextView.setText(currentAlbum.getTitle());

        // Find the TextView in the list_item_albums.xml layout with the ID album_artist
        TextView albumArtistTextView = listItemView.findViewById(R.id.album_artist);
        // Get the Name of Artist from the current Album Artist object and
        // set this on the TextView
        albumArtistTextView.setText(currentAlbum.getArtist().getName());

        // Find the TextView in the list_item_albums.xml layout with the ID album_number_songs
        TextView albumNumberSongsTextView = listItemView.findViewById(R.id.album_number_songs);
        // Get the Number Of Songs from the current Album object and
        // set this on the TextView
        String numberSongs = "Songs: "+(new Integer(currentAlbum.getNumberSongs()).toString());
        albumNumberSongsTextView.setText(numberSongs);

        // Find the TextView in the list_item_albums.xml layout with the ID album_year_publication
        TextView albumYearPublicationTextView = listItemView.findViewById(R.id.album_year_publication);
        // Get the Year of Publication of Album from the current Album object and
        // set this on the TextView
        String yearPublication = "Year: "+(new Integer(currentAlbum.getYearPublication()).toString());
        albumYearPublicationTextView.setText(yearPublication);

        // Return the whole list item layout (containing 4 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
