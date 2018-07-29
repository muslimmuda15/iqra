package com.eka.iqra;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;

public class Menu extends Activity implements View.OnClickListener{
	private Button b1,b2,b3,b4,b5;
	MediaPlayer audioBackground;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		
		//Memanggil file my_sound pada folder raw
//audioBackground = MediaPlayer.create(this, R.raw.gab);
//Set looping ke true untukmengulang audio jikatelahselesai
//audioBackground.setLooping(false);
//Set volume audio agar berbunyi
//audioBackground.setVolume(1,1);
//Memulai audio
//audioBackground.start();
		
		b1=(Button)findViewById(R.id.button1);
			b1.setOnClickListener(this);
		b2=(Button)findViewById(R.id.button2);
			b2.setOnClickListener(this);
		b3=(Button)findViewById(R.id.button3);
			b3.setOnClickListener(this);
		b4=(Button)findViewById(R.id.button4);
			b4.setOnClickListener(this);
		b5=(Button)findViewById(R.id.button5);
			b5.setOnClickListener(this);
		
	}
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if (arg0==b1){
				Intent myIntent = new Intent(arg0.getContext(),PilAsmahul.class);
		startActivityForResult(myIntent, 0);	
			}
			else
				if(arg0==b2){
			Intent myIntent = new Intent(arg0.getContext(),Hijaiyah.class);
			startActivityForResult(myIntent, 0);
			}
			else
				if(arg0==b3){
				Intent myIntent = new Intent(arg0.getContext(), MainActivity.class);
				startActivityForResult(myIntent, 0);
				}				
			else
				if (arg0==b5){
			Intent myIntent = new Intent(arg0.getContext(),PilIqra.class);
			startActivityForResult(myIntent, 0);	
		}
		if(arg0==b4){
			
			moveTaskToBack(true);
			
			System.exit(0);
			
		}
			}
	}
