package com.applicationforlife.jamesnikolaidis.smallsport24;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by James Nikolaidis on 8/8/2016.
 */
public class MainFragment extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.articles_layout);
        Intent theIntent = getIntent();
        String FullArticle = theIntent.getStringExtra("FullArticle");
       String Article_Iamges = theIntent.getStringExtra("ArticleImage");
        TextView article_view = (TextView) findViewById(R.id.Article_Text_View);
        ImageView article_image = (ImageView)findViewById(R.id.Article_Images);
     //  int imageid = getResources().getIdentifier(Article_Iamges,null,null);
        article_view.setText(FullArticle);
       article_image.setImageResource(R.drawable.arthur_masuaku_west_ham_3760333);
        Toast.makeText(getApplicationContext(),FullArticle,Toast.LENGTH_SHORT).show();


    }

    public void Clicked(View view) {
        Toast.makeText(getApplicationContext(),"Hey ypu Clicked On Facebook Icon",Toast.LENGTH_SHORT).show();
    }
}
