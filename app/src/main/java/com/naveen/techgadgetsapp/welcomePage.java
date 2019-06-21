package com.naveen.techgadgetsapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class welcomePage extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_welcome_page);

        //convert the gadgetItems string array in to a list
        List<String> gadgetItems = Arrays.asList(getResources().getStringArray(R.array.gadgetItems));

        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_welcome_page,R.id.gadgets,gadgetItems));
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        Intent itemIntent;
        switch(position){
            case 0:
                itemIntent=new Intent(welcomePage.this,GadgetActivity.class);
                //put the extras in to intent object
                itemIntent.putExtra(GadgetActivity.LBL_KEY,getResources().getString(R.string.speaker));
                itemIntent.putExtra(GadgetActivity.ID_KEY,Integer.toString(R.drawable.bluetooth_speaker));
                itemIntent.putExtra(GadgetActivity.BTN_KEY,getResources().getString(R.string.buttonWelcome));
                itemIntent.putExtra(GadgetActivity.URL_KEY,"https://www.amazon.com/dp/B07F9NGRKF/?tag=digitren08-20&ascsubtag=1561059706558m39j");
                break;
            case 1:
                itemIntent=new Intent(welcomePage.this,GadgetActivity.class);
                itemIntent.putExtra(GadgetActivity.LBL_KEY,getResources().getString(R.string.gameController));
                itemIntent.putExtra(GadgetActivity.ID_KEY,Integer.toString(R.drawable.game_controller));
                itemIntent.putExtra(GadgetActivity.BTN_KEY,getResources().getString(R.string.buttonWelcome));
                itemIntent.putExtra(GadgetActivity.URL_KEY,"https://www.amazon.com/NOKKOO-Wireless-Bluetooth-Controller-Indicator/dp/B07JGLQYNX/?tag=digitren08-20&ascsubtag=1561059706467ru03");
                break;
            case 2:
                itemIntent=new Intent(welcomePage.this,GadgetActivity.class);
                itemIntent.putExtra(GadgetActivity.LBL_KEY,getResources().getString(R.string.keyboard));
                itemIntent.putExtra(GadgetActivity.ID_KEY,Integer.toString(R.drawable.portable_keyboard));
                itemIntent.putExtra(GadgetActivity.BTN_KEY,getResources().getString(R.string.buttonWelcome));
                itemIntent.putExtra(GadgetActivity.URL_KEY,"https://www.amazon.com/Foldable-Bluetooth-Keyboard-Jelly-Comb/dp/B076V9Y2XZ?tag=digitren08-20&ascsubtag=1561059706545kdqc");
                break;
            case 3:
                itemIntent=new Intent(welcomePage.this,GadgetActivity.class);
                itemIntent.putExtra(GadgetActivity.LBL_KEY,getResources().getString(R.string.memoryCard));
                itemIntent.putExtra(GadgetActivity.ID_KEY,Integer.toString(R.drawable.memory_card));
                itemIntent.putExtra(GadgetActivity.BTN_KEY,getResources().getString(R.string.buttonWelcome));
                itemIntent.putExtra(GadgetActivity.URL_KEY,"https://www.amazon.com/Samsung-MicroSD-Adapter-MB-ME32GA-AM/dp/B06XWN9Q99?tag=digitren08-20&ascsubtag=15610597065478dq5");
                break;
            case 4:
                itemIntent=new Intent(welcomePage.this,GadgetActivity.class);
                itemIntent.putExtra(GadgetActivity.LBL_KEY,getResources().getString(R.string.battery));
                itemIntent.putExtra(GadgetActivity.ID_KEY,Integer.toString(R.drawable.power_bank));
                itemIntent.putExtra(GadgetActivity.BTN_KEY,getResources().getString(R.string.buttonWelcome));
                itemIntent.putExtra(GadgetActivity.URL_KEY,"https://www.amazon.com/Portable-Chargers-RAVPower-Technology-Smartphones/dp/B00ZZYBAI2?tag=digitren08-20&ascsubtag=1561059706535s0i5");
                break;
            default:
                Toast myToast=Toast.makeText(welcomePage.this,"Invalid choice made",Toast.LENGTH_LONG);
                myToast.show();
                itemIntent=null;
                break;
        }
        //start the activity via the itemIntentonly if there is one
        if(itemIntent!=null){
            startActivity(itemIntent);
        }
    }
}
