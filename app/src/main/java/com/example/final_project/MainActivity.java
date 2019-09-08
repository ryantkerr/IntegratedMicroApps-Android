package com.example.final_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button login;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText)findViewById(R.id.name);
        password=(EditText)findViewById(R.id.pass);
        login=(Button)findViewById(R.id.button);
        image=(ImageView)findViewById(R.id.imageView1);
    }

    public void movepage(View v) {
        String stname = username.getText().toString();
        String stpassword = password.getText().toString();

        if (stname.equals("ryantkerr") && stpassword.equals("123456")) {
            Intent next = new Intent(MainActivity.this, LoginActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("user",stname);
            bundle.putString("number",stpassword);

            next.putExtras(bundle);
            startActivity(next);
        }
        else if (stname.equals("") || stpassword.equals("")) {
            Toast.makeText(getBaseContext(), "Enter Username and Password", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getBaseContext(), "Wrong Username and Password", Toast.LENGTH_SHORT).show();
        }
    }
}
