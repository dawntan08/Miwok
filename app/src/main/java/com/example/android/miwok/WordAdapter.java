package com.example.android.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Liway on 4/5/2017.
 * custom ArrayAdapter; currently used to show two textViews
 */

public class WordAdapter extends ArrayAdapter<Word> {

    // for the color resource if for each list view
    private int mColorId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorId){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorId = colorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // sets the strings in the textviews as created in list_item to be the defaultword
        // and miwokword in the current Word object in the View position
        Word currentWord = getItem(position);
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text);
        defaultTextView.setText(currentWord.getDefaultTranslation());
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text);
        miwokTextView.setText(currentWord.getMiwokTranslation());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceId());
        }else{
            imageView.setVisibility(View.GONE);
        }
        View layout = (View) listItemView.findViewById(R.id.linear_layout);
        // need to use contextCompat to create the color
        int color = ContextCompat.getColor(getContext(), mColorId);
        layout.setBackgroundColor(color);
        return listItemView;
    }
}
