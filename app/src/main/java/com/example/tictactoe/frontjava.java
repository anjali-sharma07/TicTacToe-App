package com.example.tictactoe;
import android.content.Intent;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;
import com.example.tictactoe.R;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Handler;

public class frontjava extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front);

        LottieAnimationView Id ;
        Id = findViewById(R.id.Id);
        Id.setAnimation(R.raw.tic_tac_toe_front);
        Id.playAnimation();
        Id.loop(true);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent next;
                next = new Intent(frontjava.this,MainActivity.class);

                startActivity(next);
                finish();
            }
        } , 3000);

    }
}