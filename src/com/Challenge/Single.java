package com.Challenge;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Single extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single);
        
        Button bt1=(Button)findViewById(R.id.singlebutton1);
		bt1.setOnClickListener (new OnClickListener()
		{
			public void onClick(View v)
			{
				String s="1";
				Intent i = new Intent(Single.this, Singlegame.class);
				Bundle bundle = new Bundle(); 
				 bundle.putString("un",s);
				 i.putExtras(bundle);
				startActivity(i);

			}
		});
		
		 Button bt2=(Button)findViewById(R.id.singlebutton2);
			bt2.setOnClickListener (new OnClickListener()
			{
				public void onClick(View v)
				{
					String s="2";
					Intent i = new Intent(Single.this, Singlegame.class);
					Bundle bundle = new Bundle(); 
					 bundle.putString("un",s);
					 i.putExtras(bundle);
					startActivity(i);

				}
			});
    }
}