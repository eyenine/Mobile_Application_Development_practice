package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    Button btnBlink;
    TextView txtBlink;
    Animation animBlink;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBlink=(Button) findViewById(R.id.btn_blink);
        txtBlink=(TextView) findViewById(R.id.txt_blink);
        animBlink= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);

        btnBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtBlink.setVisibility(View.VISIBLE);
                txtBlink.startAnimation(animBlink);
            }
        });



    }
}