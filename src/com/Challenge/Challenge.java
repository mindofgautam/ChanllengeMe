package com.Challenge;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

public class Challenge extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        SystemClock.sleep(5000);
        Intent i = new Intent(Challenge.this, Mainmenu.class);
		startActivity(i);
		
    }
}