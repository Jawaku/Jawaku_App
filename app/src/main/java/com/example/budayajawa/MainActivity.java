package com.example.budayajawa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.media.MediaPlayer;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView card1, card2, card3, card4;
    private ImageView img1;
    private Button aboutus;

    MediaPlayer audioBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.aksaraCard);
        card1.setOnClickListener(this);
        card2 = (CardView) findViewById(R.id.bahasaCard);
        card2.setOnClickListener(this);
        card3 = (CardView) findViewById(R.id.wayangCard);
        card3.setOnClickListener(this);
        card4 = (CardView) findViewById(R.id.laguCard);
        card4.setOnClickListener(this);
        img1 = (ImageView) findViewById(R.id.quiz);
        img1.setOnClickListener(this);
        aboutus = (Button) findViewById(R.id.aboutus);
        aboutus.setOnClickListener(this);


        //Memanggil file my_sound pada folder raw
        audioBackground = MediaPlayer.create(this, R.raw.backsound);
        //Set looping ke true untuk mengulang audio jika telah selesai
        audioBackground.setLooping(true);
        //Set volume audio agar berbunyi
        audioBackground.setVolume(1, 1);
        //Memulai audio
        audioBackground.start();


    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.aksaraCard:
                i = new Intent(this, MenuAksara.class);
                startActivity(i);
                break;
            case R.id.bahasaCard:
                i = new Intent(this, MenuBahasa.class);
                startActivity(i);
                break;
            case R.id.wayangCard:
                i = new Intent(this, MenuWayang.class);
                startActivity(i);
                break;
            case R.id.laguCard:
                i = new Intent(this, MenuLagu.class);
                startActivity(i);
                break;
            case R.id.quiz:
                i = new Intent(this, QuizActivity.class);
                startActivity(i);
                break;
            case R.id.aboutus:
                i = new Intent(this, AboutUs.class);
                startActivity(i);

        }
    }

}