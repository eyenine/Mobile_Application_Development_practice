package com.example.all_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btnBlink,btnBounce,btnFadeIn,btnFadeOut,btnMove,btnRotate,btnSlideUp,btnSlideDown,btnZoomIn,btnZoomOut,btnTogether,btnSeq;
    TextView txtBlink,txtBounce,txtFadeIn,txtFadeOut,txtMove,txtRotate,txtSlideUp,txtSlideDown,txtZoomIn,txtZoomOut,txtTogether,txtSeq;
    Animation animBlink,animBounce,animFadeIn,animFadeOut,animMove,animRotate,animSlideUp,animSlideDown,animZoomIn,animZoomOut,animTogether,animSeq;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Blink
        btnBlink=(Button) findViewById(R.id.btnBlink);
        txtBlink=(TextView) findViewById(R.id.txt_blink);
        animBlink= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);

        btnBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtBlink.setVisibility(View.VISIBLE);
                txtBlink.startAnimation(animBlink);


            }
        });

        //bounce
        btnBounce=(Button) findViewById(R.id.btnBounce);
        txtBounce=(TextView) findViewById(R.id.txt_bounce);
        animBounce=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);

        btnBounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtBounce.startAnimation(animBounce);
            }
        });

        //fade in
        btnFadeIn=(Button) findViewById(R.id.btn_fade_in);
        btnFadeOut=(Button) findViewById(R.id.btnFadeOut);
        txtFadeIn=(TextView) findViewById(R.id.txt_fade_in);
        txtFadeOut=(TextView) findViewById(R.id.txt_fade_out);
        animFadeIn=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        animFadeOut=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);

        btnFadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFadeIn.setVisibility(View.VISIBLE);
                txtFadeIn.startAnimation(animFadeIn);
            }
        });

        btnFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFadeOut.setVisibility(View.VISIBLE);
                txtFadeOut.startAnimation(animFadeOut);
            }
        });

        //move
        btnMove=(Button) findViewById(R.id.btnMove);
        txtMove=(TextView) findViewById(R.id.txt_move);
        animMove=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMove.startAnimation(animMove);
            }
        });

        //rotate
        btnRotate=(Button) findViewById(R.id.btnRotate);
        txtRotate=(TextView) findViewById(R.id.txt_rotate);
        animRotate=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtRotate.startAnimation(animRotate);
            }
        });


        //slide up and slide down
        btnSlideUp=(Button) findViewById(R.id.btnSlideUp);
        btnSlideDown=(Button) findViewById(R.id.btnSlideDown);
        txtSlideUp=(TextView) findViewById(R.id.txt_slide_up);
        txtSlideDown=(TextView) findViewById(R.id.txt_slide_down);
        animSlideUp=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
        animSlideDown=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);



        btnSlideUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSlideUp.startAnimation(animSlideUp);
            }
        });

        btnSlideDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSlideDown.startAnimation(animSlideDown);
            }
        });

        //zoom in and zoom out
        btnZoomIn=(Button) findViewById(R.id.btnZoomIn);
        btnZoomOut=(Button) findViewById(R.id.btnZoomOut);
        txtZoomIn=(TextView) findViewById(R.id.txt_zoom_in);
        txtZoomOut=(TextView) findViewById(R.id.txt_zoom_out);
        animZoomIn=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        animZoomOut=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);

        btnZoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtZoomIn.setVisibility(View.VISIBLE);
                txtZoomIn.startAnimation(animZoomIn);
            }
        });

        btnZoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtZoomOut.setVisibility(View.VISIBLE);
                txtZoomOut.startAnimation(animZoomOut);
            }
        });

        //together
        btnTogether=(Button) findViewById(R.id.btnTogether);
        txtTogether=(TextView) findViewById(R.id.txt_tog);
        animTogether=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.together);

        btnTogether.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTogether.startAnimation(animTogether);
            }
        });


        //sequential
        btnSeq=(Button) findViewById(R.id.btnSequential);
        txtSeq=(TextView) findViewById(R.id.txt_seq);
        animSeq=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequential);

        btnSeq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSeq.startAnimation(animSeq);
            }
        });

    }
}