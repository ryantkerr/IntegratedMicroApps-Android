package com.example.final_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class RestActivity extends AppCompatActivity {

    ListView myListView;
    String[] items;
    String[] prices;
    String[] descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest);

        //BackButton
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Resources res=getResources();
        myListView=(ListView)findViewById(R.id.myListView);
        items=res.getStringArray(R.array.items);
        prices=res.getStringArray(R.array.prices);
        descriptions=res.getStringArray(R.array.descriptions);

        ItemAdapter itemAdapter=new ItemAdapter(this,items,prices,descriptions);
        myListView.setAdapter(itemAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent showDetailActivity=new Intent(getApplicationContext(),RestImageActivity.class);

                showDetailActivity.putExtra("com.example.menuapp.ITEM_INDEX",i);

                startActivity(showDetailActivity);

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
