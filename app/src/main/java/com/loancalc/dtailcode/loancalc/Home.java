package com.loancalc.dtailcode.loancalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by sivarock on 8/1/2015.
 */
public class Home extends Activity {
    ImageView b;
    EditText amt,interest,dues;
    TextView t1;
    Button r1,r2,r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        amt = (EditText) findViewById(R.id.editText1);
        interest = (EditText) findViewById(R.id.editText2);
        dues = (EditText) findViewById(R.id.editText3);
        t1 = (TextView) findViewById(R.id.textView4);
        r1 = (Button) findViewById(R.id.resetbut1);
        r2 = (Button) findViewById(R.id.resetbut2);
        r3 = (Button) findViewById(R.id.resetbut3);

        r1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                amt.setText("");
            }

        });
        r2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                interest.setText("");
            }

        });
        r3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dues.setText("");
            }

        });

        final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String a="",i="",d="";
                a = amt.getText().toString();
                i = interest.getText().toString();
                d = dues.getText().toString();

                if((a == null) || (a.equals("")) || (a.equals("0")))
                {
                    amt.setError("Please enter valid amount");
                }else if((i == null) || (i.equals("")) || (i.equals("0")))
                {
                    interest.setError("Please enter valid interest");
                }else if((d == null) || (d.equals("")) || (d.equals("0")))
                {
                    dues.setError("Please enter valid dues");
                }else{
                    Double amt1 = Double.parseDouble(amt.getText().toString());
                    Double i1 = Double.parseDouble(interest.getText().toString());
                    Double d1 = Double.parseDouble(dues.getText().toString());

                    Double amt2 = amt1/d1;
                    Double i2 = i1/12;
                    Double tot = amt2 + ((amt1 * i2)/100);
                    String tot1 = String.format("%.2f", tot);
                    t1.setText(""+tot1);

                }

            }

        });

//        AdView mAdView = (AdView) findViewById(R.id.adView);

        /*final TelephonyManager tm = (TelephonyManager)getBaseContext().getSystemService(Context.TELEPHONY_SERVICE);
        String deviceid = tm.getDeviceId();*/

      /*  AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);*/

    }


}
