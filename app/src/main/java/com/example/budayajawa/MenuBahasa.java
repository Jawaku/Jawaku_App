package com.example.budayajawa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MenuBahasa extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.item_bahasa);

        Button btn1 = findViewById(R.id.btn_bahasa1);
        btn1.setOnClickListener(this);
        Button btn2 = findViewById(R.id.btn_bahasa2);
        btn2.setOnClickListener(this);
        Button btn3 = findViewById(R.id.btn_bahasa3);
        btn3.setOnClickListener(this);
        Button btn4 = findViewById(R.id.btn_bahasa4);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_bahasa1:
                Intent moveIntent = new Intent(MenuBahasa.this, Bahasa1.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_bahasa2:
                Intent moveIntent2 = new Intent(MenuBahasa.this, Bahasa2.class);
                startActivity(moveIntent2);
                break;
            case R.id.btn_bahasa3:
                Intent moveIntent3 = new Intent(MenuBahasa.this, Bahasa3.class);
                startActivity(moveIntent3);
                break;
            case R.id.btn_bahasa4:
                Intent moveIntent4 = new Intent(MenuBahasa.this, Bahasa4.class);
                startActivity(moveIntent4);
                break;
        }

    }
}