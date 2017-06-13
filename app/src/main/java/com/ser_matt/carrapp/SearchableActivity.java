package com.ser_matt.carrapp;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SearchableActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_search);

        Intent search = getIntent();
        if (Intent.ACTION_SEARCH.equals(search.getAction())){
            String query = search.getStringExtra(SearchManager.QUERY);
            // TODO perform query here
        }
    }
}
