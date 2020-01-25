package it.matteospaggiari.musicalstructureapp;

/**
* {@link Song} represent a play_song that the user wants to listen.
 * It contains a title, Artist and possible Album of that play_song
*/
public class Song {

    /* Title of the Song */
    private String mTitle;

    /* Artist of the Song */
    private Artist mArtist;

    /* Album of the Song */
    private Album mAlbum;

    /* User favored play_song */
    private boolean mFavorite;

    public Song(String title) {
        mTitle = title;
    }

    public Song(String title, Artist artist) {
        mTitle = title;
        mArtist = artist;
    }

    public Song(String title, Artist artist, boolean isFavorite) {
        mTitle = title;
        mArtist = artist;
        mFavorite = isFavorite;
    }

    public Song(String title, Artist artist, Album album) {
        mTitle = title;
        mArtist = artist;
        mAlbum = album;
    }

    public Song(String title, Artist artist, Album album, boolean isFavorite) {
        mTitle = title;
        mArtist = artist;
        mAlbum = album;
        mFavorite = isFavorite;
    }

    /*
    * Get the Title of the Song.
    * */
    public String getTitle() {
        return mTitle;
    }

    /*
     * Get the Artist of the Song.
     * */
    public Artist getArtist() {
        return mArtist;
    }

    /*
     * Get the Album that contains the Song.
     * */
    public Album getAlbum() {
        return mAlbum;
    }

    /*
     * Is Favorite Song?
     * */
    public boolean isFavorite() {
        return mFavorite;
    }
}
