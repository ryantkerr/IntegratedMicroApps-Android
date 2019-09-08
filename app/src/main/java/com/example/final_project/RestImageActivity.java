package com.example.final_project;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.MenuItem;
import android.widget.ImageView;

public class RestImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restimage);

        //BackButton
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent in=getIntent();
        int index=in.getIntExtra("com.example.menuapp.ITEM_INDEX",-1);

        if(index>-1) {
            int pic=getImg(index);
            ImageView img=(ImageView)findViewById(R.id.imageView);
            scaleImg(img,pic);
        }
    }

    private int getImg(int index) {
        switch (index) {
            case 0:return R.drawable.hotandsoup;
            case 1:return R.drawable.springrolls;
            case 2:return R.drawable.grillingfish;
            default:return-1;
        }
    }

    private void scaleImg(ImageView img,int pic) {
        Display screen=getWindowManager().getDefaultDisplay();
        BitmapFactory.Options options=new BitmapFactory.Options();

        options.inJustDecodeBounds=true;
        BitmapFactory.decodeResource(getResources(),pic,options);

        int imgWidth=options.outWidth;
        int screenWidth=screen.getWidth();

        if(imgWidth>screenWidth){
            int ratio=Math.round((float)imgWidth/(float)screenWidth);
            options.inSampleSize=ratio;
        }

        options.inJustDecodeBounds=false;
        Bitmap scaleImg=BitmapFactory.decodeResource(getResources(),pic,options);
        img.setImageBitmap(scaleImg);
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

