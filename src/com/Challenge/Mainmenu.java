package com.Challenge;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Mainmenu extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);
    
        Button bt1=(Button)findViewById(R.id.button1);
		bt1.setOnClickListener (new OnClickListener()
		{
			public void onClick(View v)
			{
				
				 Intent i = new Intent(Mainmenu.this, Single.class);
					startActivity(i);

			}
		});
		
		Button bt2=(Button)findViewById(R.id.button2);
		bt2.setOnClickListener (new OnClickListener()
		{
			public void onClick(View v)
			{
				
				 Intent i = new Intent(Mainmenu.this, Multi.class);
					startActivity(i);

			}
		});
		
		Button bt3=(Button)findViewById(R.id.button3);
		bt3.setOnClickListener (new OnClickListener()
		{
			public void onClick(View v)
			{
				
				 Intent i = new Intent(Mainmenu.this, Howto.class);
					startActivity(i);
			}
		});
    
    }
}