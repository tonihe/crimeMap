package ca.bcit.crimemap;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int SPLASH_TIME_OUT = 4000;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                Intent i=new Intent(SplashActivity.this,MainActivity.class);//Start Another Activity
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);
    }




}
