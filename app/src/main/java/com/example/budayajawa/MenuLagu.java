package com.example.budayajawa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MenuLagu extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.item_lagu);

        Button btn1 = findViewById(R.id.btn_lagu1);
        btn1.setOnClickListener(this);
        Button btn2 = findViewById(R.id.btn_lagu2);
        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_lagu1:
                Intent moveIntent = new Intent(MenuLagu.this, Lagu1.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_lagu2:
                Intent moveIntent2 = new Intent(MenuLagu.this, Lagu2.class);
                startActivity(moveIntent2);
                break;

        }

    }
}