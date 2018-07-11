package com.anggit.hanacaraka;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1=(ImageView) findViewById(R.id.imageView1);
        ImageView imageView2=(ImageView) findViewById(R.id.imageView2);
        ImageView imageView3=(ImageView) findViewById(R.id.imageView3);
        ImageView imageView4=(ImageView) findViewById(R.id.imageView4);
        ImageView imageView5=(ImageView) findViewById(R.id.imageView5);
        ImageView imageView6=(ImageView) findViewById(R.id.imageView6);
        ImageView imageView7=(ImageView) findViewById(R.id.imageView7);
        ImageView imageView8=(ImageView) findViewById(R.id.imageView8);
        ImageView imageView9=(ImageView) findViewById(R.id.imageView9);
        ImageView imageView10=(ImageView) findViewById(R.id.imageView10);
        ImageView imageView11=(ImageView) findViewById(R.id.imageView11);
        ImageView imageView12=(ImageView) findViewById(R.id.imageView12);
        ImageView imageView13=(ImageView) findViewById(R.id.imageView13);
        ImageView imageView14=(ImageView) findViewById(R.id.imageView14);
        ImageView imageView15=(ImageView) findViewById(R.id.imageView15);
        ImageView imageView16=(ImageView) findViewById(R.id.imageView16);
        ImageView imageView17=(ImageView) findViewById(R.id.imageView17);
        ImageView imageView18=(ImageView) findViewById(R.id.imageView18);
        ImageView imageView19=(ImageView) findViewById(R.id.imageView19);
        ImageView imageView20=(ImageView) findViewById(R.id.imageView20);


        imageView1.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suaraha);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suarana);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suaraca);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suarara);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suaraka);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suarada);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suarata);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView8.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suarasa);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView9.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suarawa);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView10.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suarala);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView11.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suarapa);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView12.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suaradha);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView13.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suaraja);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView14.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suaraya);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView15.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suaranya);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView16.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suarama);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView17.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suaraga);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView18.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suaraba);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView19.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suaratha);
                mp.setVolume(1,1);
                mp.start();
            }
        });

        imageView20.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.suaranga);
                mp.setVolume(1,1);
                mp.start();
            }
        });


        Button button2 =(Button) findViewById(R.id.button1);

        button2.setOnClickListener(new View.OnClickListener() {



            public void onClick(View arg0) {

                //TODO Auto-generated method stub

                Intent i =new Intent(getApplicationContext(),lagu.class);

                startActivity(i);
            }

        });
    }
}
