package com.hofipulsa.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class TransactionActivity extends AppCompatActivity {
    int jmlqtyTsel, jmlqtyXl, jmlqtyIsat, jmlqtyAxis, jmlqtyThree = 0;
    int harga = 0;
    CheckBox boxTsel, boxXl, boxIsat, boxAxis,boxThree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        final TextView qtyTsel = findViewById(R.id.qtyTsel);
        final TextView qtyXl = findViewById(R.id.qtyXl);
        final TextView qtyIsat = findViewById(R.id.qtyIsat);
        final TextView qtyAxis = findViewById(R.id.qtyAxis);
        final TextView qtyThree = findViewById(R.id.qtyThree);
        Button btnPlusTsel = findViewById(R.id.plusTsel);
        Button btnMinTsel = findViewById(R.id.minTsel);
        Button btnPlusXl = findViewById(R.id.plusXl);
        Button btnMinXl = findViewById(R.id.minXl);
        Button btnPlusIsat = findViewById(R.id.plusIsat);
        Button btnMinIsat = findViewById(R.id.minIsat);
        Button btnPlusAxis = findViewById(R.id.plusAxis);
        Button btnMinAxis = findViewById(R.id.minAxis);
        Button btnPlusThree = findViewById(R.id.plusThree);
        Button btnMinThree = findViewById(R.id.minThree);
        Button order = (Button) findViewById(R.id.order);
        Button reset = (Button) findViewById(R.id.reset);
        final TextView total = findViewById(R.id.total);
        final EditText nama = findViewById(R.id.nama);
        boxTsel = findViewById(R.id.boxTsel);
        boxXl = findViewById(R.id.boxXl);
        boxIsat = findViewById(R.id.boxIsat);
        boxAxis = findViewById(R.id.boxAxis);
        boxThree = findViewById(R.id.boxThree);
        btnMinTsel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jmlqtyTsel > 0)
                    jmlqtyTsel--;
                qtyTsel.setText(String.valueOf(jmlqtyTsel));
            }
        });
        btnPlusTsel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                jmlqtyTsel = Integer.parseInt(qtyTsel.getText().toString());
                jmlqtyTsel++;

                qtyTsel.setText(String.valueOf(jmlqtyTsel));

            }
        });
        btnMinXl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jmlqtyXl > 0)
                    jmlqtyXl--;
                qtyXl.setText(String.valueOf(jmlqtyXl));
            }
        });
        btnPlusXl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                jmlqtyXl = Integer.parseInt(qtyXl.getText().toString());
                jmlqtyXl++;

                qtyXl.setText(String.valueOf(jmlqtyXl));
            }
        });
        btnMinIsat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jmlqtyIsat > 0)
                    jmlqtyIsat--;
                qtyIsat.setText(String.valueOf(jmlqtyIsat));
            }
        });
        btnPlusIsat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                jmlqtyIsat = Integer.parseInt(qtyIsat.getText().toString());
                jmlqtyIsat++;

                qtyIsat.setText(String.valueOf(jmlqtyIsat));
            }
        });
        btnMinAxis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jmlqtyAxis > 0)
                    jmlqtyAxis--;
                qtyAxis.setText(String.valueOf(jmlqtyAxis));
            }
        });
        btnPlusAxis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                jmlqtyAxis = Integer.parseInt(qtyAxis.getText().toString());
                jmlqtyAxis++;

                qtyAxis.setText(String.valueOf(jmlqtyAxis));

            }
        });
        btnMinThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jmlqtyThree > 0)
                    jmlqtyThree--;
                qtyThree.setText(String.valueOf(jmlqtyThree));
            }
        });
        btnPlusThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                jmlqtyThree = Integer.parseInt(qtyThree.getText().toString());
                jmlqtyThree++;

                qtyThree.setText(String.valueOf(jmlqtyThree));
            }
        });
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int payment=totalharga(harga);
                String name=nama.getText().toString();
                total.setText("Dear "+name.toUpperCase()+ " Your Total Order is "+payment+ "\nThank You");
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             qtyTsel.setText("0");
             qtyXl.setText("0");
             qtyIsat.setText("0");
             qtyAxis.setText("0");
             qtyThree.setText("0");
            }
        });
    }

    private int totalharga(int pesan){
        int harga=0;
        if (boxTsel.isChecked())
            harga+=55000*jmlqtyTsel;
        if (boxXl.isChecked())
            harga+=75000*jmlqtyXl;
        if (boxIsat.isChecked())
            harga+=60000*jmlqtyIsat;
        if (boxAxis.isChecked())
            harga+=35000*jmlqtyAxis;
        if (boxThree.isChecked())
            harga+=45000*jmlqtyThree;
        return (harga*pesan)+harga;
    }
}