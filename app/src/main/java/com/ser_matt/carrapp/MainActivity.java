package com.ser_matt.carrapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO move this to Parser
        final Button searchButton = (Button) findViewById(R.id.searchButton);
        // Listen for button presses and output whatever is entered into the search bar
        searchButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                EditText inputSearch = (EditText) findViewById(R.id.carSearch);
                String search = inputSearch.getEditableText().toString();

                // Output for debugging
                TextView output = (TextView) findViewById(R.id.outputBox);
                output.setText(search);
            }
        });

    }
}
