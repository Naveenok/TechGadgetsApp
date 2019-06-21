package com.naveen.techgadgetsapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating the button variable
        Button gadgetsExplorebtn=(Button) findViewById(R.id.buttonWelcome);

        //adding the eventhandler for the button
        View.OnClickListener gadgetsExplorelistener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creating the intent for the gadgets
                Intent gadgetsIntent=new Intent(MainActivity.this,welcomePage.class);
                startActivity(gadgetsIntent);
            }
        };
        //setting onclicklistener to the buttons
        gadgetsExplorebtn.setOnClickListener(gadgetsExplorelistener);
    }
}
