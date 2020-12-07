package com.example.budayajawa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AboutUs extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_aboutus);

        Button abdhy = findViewById(R.id.abdhy);
        abdhy.setOnClickListener(this);
        Button moza = findViewById(R.id.moza);
        moza.setOnClickListener(this);
        Button safrina = findViewById(R.id.safrina);
        safrina.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.abdhy:
                Intent moveIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ozzas_/"));
                startActivity(moveIntent);
                break;
            case R.id.moza:
                Intent moveIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/samoedraaa/"));
                startActivity(moveIntent2);
                break;
            case R.id.safrina:
                Intent moveIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/safrinauriya/"));
                startActivity(moveIntent3);
                break;
        }
    }
}