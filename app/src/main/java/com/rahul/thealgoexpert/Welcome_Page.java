package com.rahul.thealgoexpert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Welcome_Page extends AppCompatActivity {

    private static  int SPLASH_SCREEN = 5000;

    Animation topAnim, bottomAnim;

    ImageView imageLogo, imageDS, imageAlgo;
    TextView tvDS, tvAlgo, tvSlogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome__page);

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        imageLogo = findViewById(R.id.ivLogo);
        imageDS = findViewById(R.id.ivDS);
        imageAlgo = findViewById(R.id.ivAlgo);
        tvAlgo = findViewById(R.id.tvAlgo);
        tvDS = findViewById(R.id.tvDS);
        tvSlogan = findViewById(R.id.tvSlogan);

        imageLogo.setAnimation(topAnim);
        imageDS.setAnimation(topAnim);
        imageAlgo.setAnimation(topAnim);

        tvDS.setAnimation(bottomAnim);
        tvAlgo.setAnimation(bottomAnim);
        tvSlogan.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Welcome_Page.this,GetStarted.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);

    }
}