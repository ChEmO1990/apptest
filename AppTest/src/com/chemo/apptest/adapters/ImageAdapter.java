package com.chemo.apptest.adapters;

import com.chemo.apptest.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
 
public class ImageAdapter extends BaseAdapter
    {
        private Context _context = null;
        private final int[] imageIds = { 
        		R.drawable.p1,
        		R.drawable.p2, 
        		R.drawable.p3, 
        		R.drawable.p4, 
        		R.drawable.p5, 
        		R.drawable.p6, 
        		R.drawable.p7,
        		R.drawable.p8 

        };
        
        public ImageAdapter(Context context)
            {
                this._context = context;
 
            }
 
        @Override
        public int getCount()
            {
                return imageIds.length;
            }
 
        @Override
        public Object getItem(int index)
            {
                return imageIds[index];
            }
 
        @Override
        public long getItemId(int index)
            {
                return index;
            }
 
        @Override
        public View getView(int postion, View view, ViewGroup group)
            {
                ImageView imageView = new ImageView(_context);
 
                imageView.setImageResource(imageIds[postion]);
                imageView.setScaleType(ScaleType.FIT_XY);
                imageView.setLayoutParams(new Gallery.LayoutParams(400, 400));
                return imageView;
            }
    }