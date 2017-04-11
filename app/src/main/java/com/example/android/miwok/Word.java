package com.example.android.miwok;

/**
 * Created by Liway on 4/5/2017.
 * Word class containing defaultTranslation and Miwok Translation of that word
 * Returns either word using getters
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mSoundResourceId;
    // resource id has non-negative values.
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * creates a new Word object
     * @param defaultTranslation word to be translated; already known to user e.g. English
     * @param miwokTranslation miwok translation of the default word
     */
    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
    }

    /**
     * creates a new Word object with image resource id
     * @param defaultTranslation word to be translated; already known to user e.g. English
     * @param miwokTranslation miwok translation of the default word
     * @param imageResourceId image resource id associated to the words
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,
                int soundResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
    }

    /**
     * @return default translation of the word
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * @return Miwok translation of the word
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /**
     * @return resource ID for the image associated to the word
     */
    public int getImageResourceId() { return mImageResourceId;}

    /**
     *
     * @return boolean if word object as a resource id associated with it
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * @return resource ID for the associated sound/miwok pronunciation of the word
     */
    public int getSoundResourceId(){ return mSoundResourceId;}
}
