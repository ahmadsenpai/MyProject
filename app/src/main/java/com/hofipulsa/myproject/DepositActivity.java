package com.hofipulsa.myproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class DepositActivity extends Activity {
    int jmlDeposit = 0;
    int harga = 100000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit);
        final TextView valueDeposit = (TextView) findViewById(R.id.valueDeposit);
        final TextView ttlDeposit = (TextView) findViewById(R.id.ttlDeposit);
        Button addDeposit = (Button) findViewById(R.id.addDeposit);
        Button minDeposit = (Button) findViewById(R.id.minDeposit);
        Button btnDeposit = (Button) findViewById(R.id.btnDeposit);

        minDeposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jmlDeposit > 0)
                    jmlDeposit--;
                valueDeposit.setText(String.valueOf(jmlDeposit));
            }
        });
        addDeposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jmlDeposit = Integer.parseInt(valueDeposit.getText().toString());
                jmlDeposit++;

                valueDeposit.setText(String.valueOf(jmlDeposit));
            }
        });
        btnDeposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int deposit=harga*jmlDeposit;
                ttlDeposit.setText("You Already Added Deposit\n"+deposit+"\nThank You");
            }
        });
    }

}