package com.example.budayajawa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MenuWayang extends AppCompatActivity implements View.OnClickListener {
    private CardView card1,card2,card3,card4,card5,card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.item_wayang);

        card1 = (CardView) findViewById(R.id.yudistiraCard);
        card1.setOnClickListener(this);
        card2 = (CardView) findViewById(R.id.bimaCard);
        card2.setOnClickListener(this);
        card3 = (CardView) findViewById(R.id.arjunaCard);
        card3.setOnClickListener(this);
        card4 = (CardView) findViewById(R.id.nakulaCard);
        card4.setOnClickListener(this);
        card5 = (CardView) findViewById(R.id.sadewaCard);
        card5.setOnClickListener(this);
        card6 = (CardView) findViewById(R.id.kresnaCard);
        card6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.yudistiraCard: i = new Intent(this, Wayang1.class);
                startActivity(i);
                break;
            case R.id.bimaCard: i = new Intent(this, Wayang2.class);
                startActivity(i);
                break;
            case R.id.arjunaCard: i = new Intent(this, Wayang3.class);
                startActivity(i);
                break;
            case R.id.nakulaCard: i = new Intent(this, Wayang4.class);
                startActivity(i);
                break;
            case R.id.sadewaCard: i = new Intent(this, Wayang5.class);
                startActivity(i);
                break;
            case R.id.kresnaCard: i = new Intent(this, Wayang6.class);
                startActivity(i);
                break;

        }
    }
}