package com.example.final_project;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter {

    private Context mContext;
    private int[] mImageIds=new int[] {R.drawable.redvalley1,R.drawable.redvalley2,R.drawable.redvalley3,R.drawable.redvalley4,R.drawable.redvalley5};

    ImageAdapter(Context context){
        mContext=context;
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView=new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView,0);
        return imageView;

    }

    @Override
    public void destroyItem(ViewGroup container,int position,Object object) {
        container.removeView((ImageView) object);
    }
}
