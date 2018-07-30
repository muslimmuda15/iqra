package com.eka.iqra;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.media.MediaPlayer;


public class Asmaul extends Activity implements OnClickListener{
	private Button next,exit,close,back,satu,dua,tiga,empat,lima;
	MediaPlayer audioBackground;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.asmaul);
				
		satu = (Button) this.findViewById(R.id.button3);
        satu.setOnClickListener(new OnClickListener() {
       
                  @Override
                  public void onClick(View arg0) {
                      // TODO Auto-generated method stub
                      playSound(1);
                 }
              });
        
        dua = (Button) this.findViewById(R.id.button4);
        dua.setOnClickListener(new OnClickListener() {
       
                  @Override
                  public void onClick(View arg0) {
                      // TODO Auto-generated method stub
                      playSound(2);
                 }
              });
		
        tiga = (Button) this.findViewById(R.id.button5);
        tiga.setOnClickListener(new OnClickListener() {
       
                  @Override
                  public void onClick(View arg0) {
                      // TODO Auto-generated method stub
                      playSound(3);
                 }
              });
        
        empat = (Button) this.findViewById(R.id.button6);
        empat.setOnClickListener(new OnClickListener() {
       
                  @Override
                  public void onClick(View arg0) {
                      // TODO Auto-generated method stub
                      playSound(4);
                 }
              });
        
        lima = (Button) this.findViewById(R.id.button7);
        lima.setOnClickListener(new OnClickListener() {
       
                  @Override
                  public void onClick(View arg0) {
                      // TODO Auto-generated method stub
                      playSound(5);
                 }
              });
		
		
		//Memanggil file my_sound pada folder raw
//audioBackground = MediaPlayer.create(this, R.raw.a);
//Set looping ke true untukmengulang audio jikatelahselesai
//audioBackground.setLooping(false);
//Set volume audio agar berbunyi
//audioBackground.setVolume(1,1);
//Memulai audio
//audioBackground.start();
		
		back=(Button)findViewById(R.id.button8);
			back.setOnClickListener(this);
		close=(Button)findViewById(R.id.button2);
			close.setOnClickListener(this);
		next=(Button)findViewById(R.id.button1);
			next.setOnClickListener(this);	
			
			
	}
		protected void playSound(int i) {
		// TODO Auto-generated method stub
		
	}
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if (arg0==close){
				Intent myIntent = new Intent(arg0.getContext(),MainActivity.class);
		startActivityForResult(myIntent, 0);	
			}
			else
				if(arg0==next){
				Intent myIntent = new Intent(arg0.getContext(), Asmaul1.class);
				startActivityForResult(myIntent, 0);
				}
			else
				if(arg0==back){
					Intent myIntent = new Intent(arg0.getContext(), Menu.class);
					startActivityForResult(myIntent, 0);
					}
			else
	if(arg0==exit){
			moveTaskToBack(true);
			System.exit(0);
		}
			}
	}
