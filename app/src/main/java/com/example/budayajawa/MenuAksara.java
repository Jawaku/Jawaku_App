package com.example.budayajawa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MenuAksara extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.item_aksara);

        Button btn1 = findViewById(R.id.button_aksara1);
        btn1.setOnClickListener(this);
        Button btn2 = findViewById(R.id.button_aksara2);
        btn2.setOnClickListener(this);
        Button btn3 = findViewById(R.id.button_aksara3);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_aksara1:
                Intent moveIntent = new Intent(MenuAksara.this, Aksara1.class);
                startActivity(moveIntent);
                break;
            case R.id.button_aksara2:
                Intent moveIntent2 = new Intent(MenuAksara.this, Aksara2.class);
                startActivity(moveIntent2);
                break;
            case R.id.button_aksara3:
                Intent moveIntent3 = new Intent(MenuAksara.this, Aksara3.class);
                startActivity(moveIntent3);
                break;
        }
    }
}