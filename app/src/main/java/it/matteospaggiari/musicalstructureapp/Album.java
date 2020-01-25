package it.matteospaggiari.musicalstructureapp;

import java.util.ArrayList;

/**
 * {@link Album} represent a Album of an Artist.
 * It contains a title, Artist and list of Songs, Year Publication and Resource ID Image
 */
public class Album {

    /* Title of the album */
    private String mTitle;

    /* Artist of the album */
    private Artist mArtist;

    /* Songs in the Album */
    private ArrayList<Song> mSongs;

    /* Year of publication */
    private int mYearPublication;

    /* Resousrce ID image */
    private int mIdImage;

    public Album(String title) {
        mTitle = title;
    }

    public Album(String title, Artist artist, ArrayList<Song> songs, int yearPublication, int idImage) {
        mTitle = title;
        mArtist = artist;
        mSongs = songs;
        mYearPublication = yearPublication;
        mIdImage = idImage;
    }

    /*
     * Get the Title of the Album.
     * */
    public String getTitle() {
        return mTitle;
    }

    /*
     * Get the Artist of the Album.
     * */
    public Artist getArtist() {
        return mArtist;
    }

    /*
     * Get the list of Songs on the Album.
     * */
    public ArrayList<Song> getSongs() {
        return mSongs;
    }

    /*
     * Get Number of the Songs in the Album.
     * */
    public int getNumberSongs() {
        return mSongs.size();
    }

    /*
     * Get Year of Publication of the Album.
     * */
    public int getYearPublication() { return mYearPublication; }

    /*
     * Get Resource ID Image.
     * */
    public int getIdImage() {
        return mIdImage;
    }

}
