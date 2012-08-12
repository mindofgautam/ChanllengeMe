package com.Challenge;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.gesture.Gesture;
import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import android.gesture.GestureOverlayView;
import android.gesture.GestureOverlayView.OnGesturePerformedListener;
import android.gesture.Prediction;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Singlegame  extends Activity implements OnGesturePerformedListener{
	TextView t1;
int x,y;
int matter[]=new int[7];int i=1,count=0;
	private GestureLibrary gestureLib;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	t1=(TextView)findViewById(R.id.textView1);
    	 Bundle bundle=getIntent().getExtras();
         final String s=bundle.getString("un");
    	 Random randomGenerator2 = new Random();
    	 x = randomGenerator2.nextInt(15)+10;
    	y=x;
    	
    	
    	 Toast.makeText(this,String.valueOf(x), Toast.LENGTH_SHORT).show();
         matter[0]=x;
    	 while(x>3)
         {
        	 x=x-4;
        	 if(x==0)
        		 break;
        	 matter[i]=x;
        	 Toast.makeText(this,String.valueOf(matter[i]), Toast.LENGTH_SHORT).show();
        	 count++;
        	 i++;
        }
        
         
		GestureOverlayView gestureOverlayView = new GestureOverlayView(this);
		View inflate = getLayoutInflater().inflate(R.layout.singlegame, null);
		gestureOverlayView.addView(inflate);
		gestureOverlayView.addOnGesturePerformedListener(this);
		gestureLib = GestureLibraries.fromRawResource(this, R.raw.gestures);
		if (!gestureLib.load()) {
			finish();
		}
		setContentView(gestureOverlayView);
        //setContentView(R.layout.singlegame);
    
    
    }

	@Override
	public void onGesturePerformed(GestureOverlayView overlay, Gesture gesture) {
		t1=(TextView)findViewById(R.id.textView1);
		// TODO Auto-generated method stub
		ArrayList<Prediction> predictions = gestureLib.recognize(gesture);
		for (Prediction prediction : predictions) {
		//Prediction prediction = null;
		if (prediction.score > 1.0) {
				Toast.makeText(this, prediction.name, Toast.LENGTH_SHORT)
						.show();
				if(prediction.name.equals("one"))
				{
					Toast.makeText(this, prediction.name, Toast.LENGTH_SHORT)
					.show();
					int tmp=Integer.parseInt(t1.getText().toString());
				
					tmp=tmp+1;
				t1.setText(tmp+"");
				if(tmp>=y)
				{
					Toast.makeText(this,"You Won!!", Toast.LENGTH_SHORT)
					.show();
					String s="You Won!!!";
					Intent i = new Intent(Singlegame.this, Gameover.class);
					Bundle bundle = new Bundle(); 
					 bundle.putString("un",s);
					 i.putExtras(bundle);
					startActivity(i);
				}
				///main algo
				
				for(int k=count;k>=0;k--)
				{
					if(tmp==matter[k])
					{
						 Random randomGenerator22 = new Random();
				    	int l = randomGenerator22.nextInt(3)+1;

						Toast.makeText(this,"Computer added "+String.valueOf(l), Toast.LENGTH_SHORT)
						.show();
				    	tmp=tmp+l;
				    	t1.setText(tmp+"");
				    	if(tmp>=y)
						{
							Toast.makeText(this,"Computer Won!!", Toast.LENGTH_SHORT)
							.show();
							String s="Computer Won!!!";
							Intent i = new Intent(Singlegame.this, Gameover.class);
							Bundle bundle = new Bundle(); 
							 bundle.putString("un",s);
							 i.putExtras(bundle);
							startActivity(i);
						}
				    	break;
					}
					else if(tmp<matter[k])
					{
						int hi=matter[k]-tmp;
						Toast.makeText(this,"Computer added "+String.valueOf(hi), Toast.LENGTH_SHORT)
						.show();
						tmp=matter[k];
						t1.setText(tmp+"");
						if(tmp>=y)
						{
							Toast.makeText(this,"Computer Won!!", Toast.LENGTH_SHORT)
							.show();
							String s="Computer Won!!!";
							Intent i = new Intent(Singlegame.this, Gameover.class);
							Bundle bundle = new Bundle(); 
							 bundle.putString("un",s);
							 i.putExtras(bundle);
							startActivity(i);
						}
						break;
					}
				
				}
				
				
				
				
				
				Toast.makeText(this,"end", Toast.LENGTH_SHORT)
				.show();
				}
				if(prediction.name.equals("two"))
				{
					Toast.makeText(this, prediction.name, Toast.LENGTH_SHORT)
					.show();
					int tmp=Integer.parseInt(t1.getText().toString());
				
					tmp=tmp+2;
				t1.setText(tmp+"");
				if(tmp>=y)
				{
					Toast.makeText(this,"You Won!!", Toast.LENGTH_SHORT)
					.show();
					String s="You Won!!!";
					Intent i = new Intent(Singlegame.this, Gameover.class);
					Bundle bundle = new Bundle(); 
					 bundle.putString("un",s);
					 i.putExtras(bundle);
					startActivity(i);
				}
				
				//main algo
				for(int k=count;k>=0;k--)
				{
					if(tmp==matter[k])
					{
						 Random randomGenerator22 = new Random();
				    	int l = randomGenerator22.nextInt(3)+1;

						Toast.makeText(this,"Computer added "+String.valueOf(l), Toast.LENGTH_SHORT)
						.show();
				    	tmp=tmp+l;
				    	t1.setText(tmp+"");
				    	if(tmp>=y)
						{
							Toast.makeText(this,"Computer Won!!", Toast.LENGTH_SHORT)
							.show();
							String s="Computer Won!!!";
							Intent i = new Intent(Singlegame.this, Gameover.class);
							Bundle bundle = new Bundle(); 
							 bundle.putString("un",s);
							 i.putExtras(bundle);
							startActivity(i);
						}
				    	break;
					}
					else if(tmp<matter[k])
					{
						int hi=matter[k]-tmp;
						Toast.makeText(this,"Computer added "+String.valueOf(hi), Toast.LENGTH_SHORT)
						.show();
						tmp=matter[k];
						t1.setText(tmp+"");
						if(tmp>=y)
						{
							Toast.makeText(this,"Computer Won!!", Toast.LENGTH_SHORT)
							.show();
							String s="Computer Won!!!";
							Intent i = new Intent(Singlegame.this, Gameover.class);
							Bundle bundle = new Bundle(); 
							 bundle.putString("un",s);
							 i.putExtras(bundle);
							startActivity(i);
						}
						break;
					}
				
				}
				Toast.makeText(this,"end", Toast.LENGTH_SHORT)
				.show();
				}
				if(prediction.name.equals("three"))
				{
					Toast.makeText(this, prediction.name, Toast.LENGTH_SHORT)
					.show();
					int tmp=Integer.parseInt(t1.getText().toString());
				
					tmp=tmp+3;
				t1.setText(tmp+"");
				if(tmp>=y)
				{
					Toast.makeText(this,"You Won!!", Toast.LENGTH_SHORT)
					.show();
					String s="You Won!!!";
					Intent i = new Intent(Singlegame.this, Gameover.class);
					Bundle bundle = new Bundle(); 
					 bundle.putString("un",s);
					 i.putExtras(bundle);
					startActivity(i);
				}
				
///main algo
				
				for(int k=count;k>=0;k--)
				{
					if(tmp==matter[k])
					{
						 Random randomGenerator22 = new Random();
				    	int l = randomGenerator22.nextInt(3)+1;

						Toast.makeText(this,"Computer added "+String.valueOf(l), Toast.LENGTH_SHORT)
						.show();
				    	tmp=tmp+l;
				    	t1.setText(tmp+"");
				    	if(tmp>=y)
						{
							Toast.makeText(this,"Computer Won!!", Toast.LENGTH_SHORT)
							.show();
							String s="Computer Won!!!";
							Intent i = new Intent(Singlegame.this, Gameover.class);
							Bundle bundle = new Bundle(); 
							 bundle.putString("un",s);
							 i.putExtras(bundle);
							startActivity(i);
						}
				    	break;
					}
					else if(tmp<matter[k])
					{
						int hi=matter[k]-tmp;
						Toast.makeText(this,"Computer added "+String.valueOf(hi), Toast.LENGTH_SHORT)
						.show();
						tmp=matter[k];
						t1.setText(tmp+"");
						if(tmp>=y)
						{
							Toast.makeText(this,"Computer Won!!", Toast.LENGTH_SHORT)
							.show();
							String s="Computer Won!!!";
							Intent i = new Intent(Singlegame.this, Gameover.class);
							Bundle bundle = new Bundle(); 
							 bundle.putString("un",s);
							 i.putExtras(bundle);
							startActivity(i);
						}
						break;
					}
				
				}
				Toast.makeText(this,"end", Toast.LENGTH_SHORT)
				.show();
				}
				
				break;
				
				}
		}
	}
}
