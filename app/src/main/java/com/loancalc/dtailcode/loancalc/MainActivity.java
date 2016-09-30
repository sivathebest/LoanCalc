package com.loancalc.dtailcode.loancalc;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {
    ImageView b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (ImageView) findViewById(R.id.image_mainscreen);

        Thread thread=new Thread() {
            public void run() {
                try {
                    Thread.sleep(3500);
                    startActivity(new Intent(MainActivity.this, Home.class));

//					overridePendingTransition(R.anim.slide_in_left,
//							R.anim.slide_out_left);

                } catch (InterruptedException e) {
                    e.toString();
                    e.printStackTrace();
                } finally {
                    // dialog.dismiss();
                }
            }
        };
        thread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();

        System.out.println("->>>>>ANTONY>>>>>>>>>>INSIDE ONPAUSE");
        finish();
    }

}
