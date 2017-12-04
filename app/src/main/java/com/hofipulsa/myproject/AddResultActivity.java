package com.hofipulsa.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AddResultActivity extends AppCompatActivity {

    public static String DATAKIRIM = "datakirim";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_result);
        Button btnBack = (Button) findViewById(R.id.btnBack);

        TextView resName = (TextView) findViewById(R.id.resName);
        String pesan10 = getIntent().getStringExtra("datasurvey1");
        int pesan1 = (int) getIntent().getSerializableExtra(DATAKIRIM);
        resName.setText(pesan10);

        TextView resPhone = (TextView) findViewById(R.id.resPhone);
        String pesan20 = getIntent().getStringExtra("datasurvey2");
        int pesan2 = (int) getIntent().getSerializableExtra(DATAKIRIM);
        resPhone.setText(pesan20);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Back to Home", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
