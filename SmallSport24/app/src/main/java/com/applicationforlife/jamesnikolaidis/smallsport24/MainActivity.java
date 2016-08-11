package com.applicationforlife.jamesnikolaidis.smallsport24;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] Articles_Analyzing = {"Masuaku sold on West Ham for a fee of 8Milion Pounds","The Portugal Coach is the new Olympiakos Coach"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView theList = (ListView) findViewById(R.id.List_View1);
        String[] Articles = {"Masuaku Sold For 10M", "Bento is the new Olympiakos Manager", "Panathinaikos want Gordon Schinderfelnd", "Olympiakos faces Arouka on Europa Leaque Qualified"};
        ListAdapter myAdapter = new TheAdapter(getApplicationContext(), Articles);
        theList.setAdapter(myAdapter);
        final String[] Articles_Analyzing = {"Masuaku sold on West Ham for a fee of 8Milion Pounds", "The Portugal Coach is the new Olympiakos Coach", "The Luis Bento is the new Portugal Manager of Olympiakos with his 4 assistants",
                "The Panathinaikos flert again the past Dinamo Mosqow center back"};
          final String[] Images  = {"C:\\Users\\James Nikolaidis\\AndroidStudioProjects\\SmallSport24\\app\\src\\main\\res\\drawable\\arthur_masuaku_west_ham_3760333.jpg","C:\\Users\\James Nikolaidis\\AndroidStudioProjects\\SmallSport24\\app\\src\\main\\res\\drawable\\bento.jpg"};

        theList.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this, MainFragment.class);
                intent.putExtra("FullArticle", Articles_Analyzing[i]);
                intent.putExtra("ArticleImage",Images);
                startActivity(intent);

            }
        });


        View mainView = (View) findViewById(R.id.MainActivity_Layout);
        mainView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_OUTSIDE)
                {
                    Toast.makeText(getApplicationContext(),"ACTION_OYTSIDE",Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });


    }



}
