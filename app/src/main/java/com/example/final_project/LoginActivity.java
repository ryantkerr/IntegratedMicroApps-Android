package com.example.final_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;
import android.view.MenuItem;

public class LoginActivity extends AppCompatActivity {

    TextView text1;
    TextView text2;
    Button login2;
    RadioButton radio1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //BackButton
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        text1=(TextView)findViewById(R.id.txt1);
        text2=(TextView)findViewById(R.id.txt2);
        login2=(Button)findViewById(R.id.button2);
        radio1=(RadioButton)findViewById(R.id.radio1);

        Bundle bundle=getIntent().getExtras();
        String data1=bundle.getString("user");
        String data2=bundle.getString("number");

        text1.setText(data1);
        text2.setText(data2);

    }

    //BackButton
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void movepage(View v) {
        if (radio1.isChecked()) {
            Intent next = new Intent(LoginActivity.this, MenuActivity.class);
            startActivity(next);
        }
        else {
            Toast.makeText(getBaseContext(), "Please click the circular button", Toast.LENGTH_SHORT).show();
        }
    }
}

