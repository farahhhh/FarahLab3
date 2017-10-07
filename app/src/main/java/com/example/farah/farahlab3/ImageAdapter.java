package com.example.farah.farahlab3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by farah on 7/10/2017.
 */

public class ImageAdapter extends BaseAdapter{
    private Context mContext;

    public Integer[] mThumbIds= {
            R.drawable.beger1,
            R.drawable.beger2,
            R.drawable.beger3,
            R.drawable.beger4,
            R.drawable.beger5,
            R.drawable.beger6
    };

    public ImageAdapter(Context c){
        mContext = c;

    }

    @Override
    public int getCount(){
        return  mThumbIds.length;
    }

    @Override
    public Object getItem(int position){
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position){
        return 0;
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(150,150));
        return imageView;

    }
}
