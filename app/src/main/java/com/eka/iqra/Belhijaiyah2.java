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


public class Belhijaiyah2 extends Activity implements OnClickListener{
	private Button next,exit,close,back,hi1,hi2,hi3,hi4,hi5,hi6,hi7,hi8,hi9,hi10,
	hi11,hi12,hi13,hi14,hi15,hi16,hi17,hi18,hi19,hi20,hi21;
	MediaPlayer audioBackground;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.asmaul);
				
		hi1 = (Button) this.findViewById(R.id.button3);
        hi1.setOnClickListener(new OnClickListener() {
       
                  @Override
                  public void onClick(View arg0) {
                      // TODO Auto-generated method stub
                      playSound(1);
                 }
              });
        
        hi2 = (Button) this.findViewById(R.id.button4);
        hi2.setOnClickListener(new OnClickListener() {
       
                  @Override
                  public void onClick(View arg0) {
                      // TODO Auto-generated method stub
                      playSound(2);
                 }
              });
		
        hi3 = (Button) this.findViewById(R.id.button5);
        hi3.setOnClickListener(new OnClickListener() {
       
                  @Override
                  public void onClick(View arg0) {
                      // TODO Auto-generated method stub
                      playSound(3);
                 }
              });
		
        hi4 = (Button) this.findViewById(R.id.button6);
        hi4.setOnClickListener(new OnClickListener() {
       
                  @Override
                  public void onClick(View arg0) {
                      // TODO Auto-generated method stub
                      playSound(4);
                 }
              });
        
        hi5 = (Button) this.findViewById(R.id.button7);
        hi5.setOnClickListener(new OnClickListener() {
       
                  @Override
                  public void onClick(View arg0) {
                      // TODO Auto-generated method stub
                      playSound(5);
                 }
              });
       
        hi6 = (Button) this.findViewById(R.id.button8);
        hi6.setOnClickListener(new OnClickListener() {
       
                  @Override
                  public void onClick(View arg0) {
                      // TODO Auto-generated method stub
                      playSound(6);
                 }
              });
        
        hi7 = (Button) this.findViewById(R.id.button9);
        hi7.setOnClickListener(new OnClickListener() {
       
                  @Override
                  public void onClick(View arg0) {
                      // TODO Auto-generated method stub
                      playSound(7);
                 }
              });
        
        hi8 = (Button) this.findViewById(R.id.button10);
        hi8.setOnClickListener(new OnClickListener() {
       
                  @Override
                  public void onClick(View arg0) {
                      // TODO Auto-generated method stub
                      playSound(8);
                 }
              });
        
        hi9 = (Button) this.findViewById(R.id.button11);
        hi9.setOnClickListener(new OnClickListener() {
       
                  @Override
                  public void onClick(View arg0) {
                      // TODO Auto-generated method stub
                      playSound(9);
                 }
              });

        hi16 = (Button) this.findViewById(R.id.button18);
        hi16.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(16);
            }
        });

        hi17 = (Button) this.findViewById(R.id.button19);
        hi17.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(17);
            }
        });

        hi18 = (Button) this.findViewById(R.id.button20);
        hi18.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(18);
            }
        });

        hi19 = (Button) this.findViewById(R.id.button21);
        hi19.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(19);
            }
        });

        hi20 = (Button) this.findViewById(R.id.button22);
        hi20.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(20);
            }
        });

        hi21 = (Button) this.findViewById(R.id.button23);
        hi21.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                playSound(21);
            }
        });
        
        
		
//Memanggil file my_sound pada folder raw
//audioBackground = MediaPlayer.create(this, R.raw.a);
//Set looping ke true untukmengulang audio jikatelahselesai
audioBackground.setLooping(false);
//Set volume audio agar berbunyi
audioBackground.setVolume(1,1);
//Memulai audio
audioBackground.start();
		
		back=(Button)findViewById(R.id.button3);
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