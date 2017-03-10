package com.example.lenovo.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final ImageView iv=(ImageView)findViewById(R.id.iv);
        Button alpha=(Button)findViewById(R.id.alpha);
        Button rotate=(Button)findViewById(R.id.rotate);
        Button scale=(Button)findViewById(R.id.scale);
        Button trnslate=(Button)findViewById(R.id.translate);
        Button blink=(Button)findViewById(R.id.blink);
        Button slide=(Button)findViewById(R.id.slide);



        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation an= AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);
                iv.startAnimation(an);
            }
        });


        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation an=AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                iv.startAnimation(an);
            }
        });


        scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation an=AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);
                iv.startAnimation(an);
            }
        });

        trnslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation an=AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate);
                iv.startAnimation(an);
            }
        });

        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation an=AnimationUtils.loadAnimation(MainActivity.this,R.anim.blink);
                iv.startAnimation(an);
            }
        });

        slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation an=AnimationUtils.loadAnimation(MainActivity.this,R.anim.slide);
                iv.startAnimation(an);
            }
        });
    }
}
