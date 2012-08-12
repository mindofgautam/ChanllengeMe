package com.Challenge;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Gameover  extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameover);
        Bundle bundle=getIntent().getExtras();
        final String s=bundle.getString("un");
        TextView tv=(TextView)findViewById(R.id.tView1);
        tv.setText(s);
        //Toast.makeText(this,s, Toast.LENGTH_SHORT).show();
    }


}
