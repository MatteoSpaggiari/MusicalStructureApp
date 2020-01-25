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

public class ArtistAdapter extends ArrayAdapter<Artist> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param artists A List of Artists objects to display in a list
     */
    public ArtistAdapter(@NonNull Context context, ArrayList<Artist> artists) {
        super(context, 0, artists);
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
                    R.layout.list_item_artists, parent, false);
        }

        // Get the {@link Artist} object located at this position in the list
        Artist currentArtist = getItem(position);

        // Find the ImageView in the list_item_artists.xml layout with the ID artist_image
        ImageView artistImageImageView = listItemView.findViewById(R.id.artist_image);
        // Get the Resource ID Image from the current Artist object and
        // set this on the ImageView
        artistImageImageView.setImageResource(currentArtist.getIdImage());

        // Find the TextView in the list_item_artists.xml layout with the ID artist_name
        TextView albumTitleTextView = listItemView.findViewById(R.id.artist_name);
        // Get the Name from the current Artist object and
        // set this on the TextView
        albumTitleTextView.setText(currentArtist.getName());

        // Find the TextView in the list_item_artists.xml layout with the ID artist_year_birth
        TextView artistYearBirthTextView = listItemView.findViewById(R.id.artist_year_birth);
        // Get the Year of Birth of Artist from the current Artist object and
        // set this on the TextView
        String yearBirth = "Year: "+(new Integer(currentArtist.getYearBirth()).toString());
        artistYearBirthTextView.setText(yearBirth);

        // Find the TextView in the list_item_artists.xml layout with the ID artist_number_albums
        TextView artistNumberAlbumsTextView = listItemView.findViewById(R.id.artist_number_albums);
        // Get the Number of Albums of Artist from the current Artist object and
        /// set this on the TextView
        String numberAlbums = "Albums: "+(new Integer(currentArtist.getNumberAlbums()).toString());
        artistNumberAlbumsTextView.setText(numberAlbums);

        // Return the whole list item layout (containing 3 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
