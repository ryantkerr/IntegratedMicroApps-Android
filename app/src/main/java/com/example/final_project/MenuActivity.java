package com.example.final_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import android.content.Intent;

public class MenuActivity extends AppCompatActivity{

    Button fsuweb, resmenu, photoalb, calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        fsuweb=(Button)findViewById(R.id.goog1);
        resmenu=(Button)findViewById(R.id.res1);
        photoalb=(Button)findViewById(R.id.album1);
        calc=(Button)findViewById(R.id.calc1);

        //BackButton
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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

    public void movepage_web(View v) {
        Intent next = new Intent(MenuActivity.this, WebActivity.class);
        startActivity(next);
    }
    public void movepage_res(View v) {
        Intent next = new Intent(MenuActivity.this, RestActivity.class);
        startActivity(next);
    }
    public void movepage_album(View v) {
        Intent next = new Intent(MenuActivity.this, AlbumActivity.class);
        startActivity(next);
    }
    public void movepage_calc(View v) {
        Intent next = new Intent(MenuActivity.this, CalcActivity.class);
        startActivity(next);
    }
}
