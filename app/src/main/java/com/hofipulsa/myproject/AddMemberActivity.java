package com.hofipulsa.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hofipulsa.myproject.R;

public class AddMemberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_member);
        Button btnsubmit = (Button) findViewById(R.id.btnsubmit);
        final EditText addNama = (EditText) findViewById(R.id.addNama);
        final EditText addPhone = (EditText) findViewById(R.id.addPhone);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddMemberActivity.this,AddResultActivity.class);
                intent.putExtra("datasurvey1", addNama.getText().toString());
                intent.putExtra("datasurvey2", addPhone.getText().toString());
                intent.putExtra(AddResultActivity.DATAKIRIM,2);
                startActivity(intent);
            }
        });
    }
}
