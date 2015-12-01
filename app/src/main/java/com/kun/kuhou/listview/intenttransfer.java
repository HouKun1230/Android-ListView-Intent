package com.kun.kuhou.listview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by kuhou on 30/11/2015.
 */
public class intenttransfer extends Activity {
   // public static String input;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        String input;
        Bundle extras = getIntent().getExtras();
        if(extras == null) {
            input= "empty";
        } else {
            input = extras.getString("number");
            Toast.makeText(getApplicationContext(),
                       "Click " + input, Toast.LENGTH_LONG)
                    .show();
        }
    }

}
