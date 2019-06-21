package com.naveen.techgadgetsapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GadgetActivity extends AppCompatActivity {
    public  static final String ID_KEY="RES ID",LBL_KEY="LABEL",BTN_KEY="BUTTON",URL_KEY="URL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gadget);
        //get the extras from the Intent
        Intent myIntent=getIntent();
        final Bundle myExtras=myIntent.getExtras();

        if(myExtras!=null){
            //get the string extra with the key LBL_KEY
            String res_label=myExtras.getString(LBL_KEY);
            final TextView titletextView=findViewById(R.id.gadgetTextView);
            titletextView.setText(res_label);

            //get the string extra with the key RES_ID
            String image_id=myExtras.getString(ID_KEY);
            //convert the resource ID from String to Integer
            int imageId=Integer.parseInt(image_id);

            final ImageView pictureImageView=(ImageView) findViewById(R.id.imageView2);
            pictureImageView.setImageResource(imageId);
            pictureImageView.setContentDescription(res_label);

            //get the string extra with the key BTN_KEY
            String button_label=myExtras.getString(BTN_KEY);
            final Button button=(Button) findViewById(R.id.button1);

            button.setText(button_label);
            //adding the eventhandler for the button
            View.OnClickListener gadgetdetailslistener=new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //creating the intent for the spotifybutton
                    Intent detailIntent=new Intent(Intent.ACTION_VIEW, Uri.parse(myExtras.getString(URL_KEY)));
                    startActivity(detailIntent);
                }
            };
            //setting onclicklistener to the buttons
            button.setOnClickListener(gadgetdetailslistener);
        }

    }
}
