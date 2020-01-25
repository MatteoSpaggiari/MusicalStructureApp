package it.matteospaggiari.musicalstructureapp;

/**
 * {@link Artist} represent a Artist.
 * It contains a Name, Number of Album, Year of Birth and Resource ID Image
 */
public class Artist {

    /* Name of the Artist */
    private String mName;

    /* Number of albums released */
    private int mNumberAlbums;

    /* Year of birth or creation Band */
    private int mYearBirth;

    /* Resousrce ID image */
    private int mIdImage;

    public Artist(String name) {
        mName = name;
    }

    public Artist(String name, int yearBirth, int numberAlbums, int idImage) {
        mName = name;
        mYearBirth = yearBirth;
        mNumberAlbums = numberAlbums;
        mIdImage = idImage;
    }

    /*
     * Get the Name of the Artist.
     * */
    public String getName() {
        return mName;
    }

    /*
     * Get the Year of Birth of the Artist.
     * */
    public int getYearBirth() {
        return mYearBirth;
    }

    /*
     * Get the Number of the Albums of the Artist.
     * */
    public int getNumberAlbums() {
        return mNumberAlbums;
    }

    /*
     * Get Resource ID Image.
     * */
    public int getIdImage() {
        return mIdImage;
    }
}
