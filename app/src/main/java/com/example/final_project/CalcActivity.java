package com.example.final_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class CalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        //BackButton
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button AddBtn=(Button)findViewById(R.id.AddBtn);
        AddBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                EditText FirstEditText = (EditText) findViewById(R.id.FirstEditText);
                EditText SecondEditText = (EditText) findViewById(R.id.SecondEditText);
                TextView ResultTextView = (TextView) findViewById(R.id.ResultTextView);

                int num1 = Integer.parseInt(FirstEditText.getText().toString());
                int num2 = Integer.parseInt(SecondEditText.getText().toString());
                int result = num1 + num2;

                ResultTextView.setText(result + ""); //Output results


            }
        });

        Button SubBtn=(Button)findViewById(R.id.SubBtn);
        SubBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                EditText FirstEditText = (EditText) findViewById(R.id.FirstEditText);
                EditText SecondEditText = (EditText) findViewById(R.id.SecondEditText);
                TextView ResultTextView = (TextView) findViewById(R.id.ResultTextView);

                int num1 = Integer.parseInt(FirstEditText.getText().toString());
                int num2 = Integer.parseInt(SecondEditText.getText().toString());
                int result = num1 - num2;

                ResultTextView.setText(result + ""); //Output results

            }
        });

        Button MultBtn=(Button)findViewById(R.id.MultBtn);
        MultBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                EditText FirstEditText = (EditText) findViewById(R.id.FirstEditText);
                EditText SecondEditText = (EditText) findViewById(R.id.SecondEditText);
                TextView ResultTextView = (TextView) findViewById(R.id.ResultTextView);

                int num1 = Integer.parseInt(FirstEditText.getText().toString());
                int num2 = Integer.parseInt(SecondEditText.getText().toString());
                int result = num1 * num2;

                ResultTextView.setText(result + ""); //Output results

            }
        });

        Button DivBtn=(Button)findViewById(R.id.DivBtn);
        DivBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                EditText FirstEditText = (EditText) findViewById(R.id.FirstEditText);
                EditText SecondEditText = (EditText) findViewById(R.id.SecondEditText);
                TextView ResultTextView = (TextView) findViewById(R.id.ResultTextView);

                int num1 = Integer.parseInt(FirstEditText.getText().toString());
                int num2 = Integer.parseInt(SecondEditText.getText().toString());
                int result = num1 / num2;

                ResultTextView.setText(result + ""); //Output results

            }
        });
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
}

