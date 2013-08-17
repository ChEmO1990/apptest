package com.chemo.apptest.adapters;

import java.util.ArrayList;

import com.chemo.apptest.R;
import com.chemo.apptest.adapters.AdapterNoticia.ViewHolder;
import com.chemo.apptest.datadummy.Canal;
import com.chemo.apptest.datadummy.Noticia;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterCanal extends ArrayAdapter {
	private ArrayList items;
	private Context context;
	
	public AdapterCanal(Context context, int textViewResourceId,ArrayList items) {
		super(context, textViewResourceId, items);
		this.context = context;
		this.items=items;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		
		if( convertView == null ) 
		{
			LayoutInflater vi = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = vi.inflate(R.layout.item_canal, null);
		
			holder = new ViewHolder();
			holder.imagen = (ImageView) convertView.findViewById(R.id.img_item_canal);
		    holder.titulo = (TextView) convertView.findViewById(R.id.titulo_item_canal);
		    holder.titulo.setTextColor(Color.parseColor("#FF8000"));
		    
		    convertView.setTag(holder);
		}
		else 
		{
			holder = (ViewHolder) convertView.getTag();
		}
		
	
			
		Canal n = (Canal) items.get(position);
		
		
		holder.titulo.setText(n.getNombre());
		holder.imagen.setImageDrawable(n.getIcono());
		
        return convertView;
	}
	
	class ViewHolder {
		ImageView imagen;
		TextView titulo;
	}

}
