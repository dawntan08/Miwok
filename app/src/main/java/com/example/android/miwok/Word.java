package com.example.android.miwok;

/**
 * Created by Liway on 4/5/2017.
 * Word class containing defaultTranslation and Miwok Translation of that word
 * Returns either word using getters
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    /**
     * creates a new Word object
     * @param defaultTranslation word to be translated; already known to user e.g. English
     * @param miwokTranslation miwok translation of the default word
     */
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * @return default translation of the word
     *
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     *
     * @return Miwok translation of the word
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
