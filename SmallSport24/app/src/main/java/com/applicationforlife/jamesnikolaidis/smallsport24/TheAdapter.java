package com.applicationforlife.jamesnikolaidis.smallsport24;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by James Nikolaidis on 8/8/2016.
 */
public class TheAdapter extends ArrayAdapter<String> {
    public TheAdapter(Context context, String[] objects) {
        super(context, R.layout.adapter_fragment,objects);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View theView = theInflater.inflate(R.layout.adapter_fragment, parent, false);
          String Article = getItem(position);
          TextView theArticleView = (TextView) theView.findViewById(R.id.Article_TextView);
          theArticleView.setText(Article);
          return theView;
    }
}
