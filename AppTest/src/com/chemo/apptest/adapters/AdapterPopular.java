package com.chemo.apptest.adapters;

import java.util.ArrayList;

import com.chemo.apptest.R;
import com.chemo.apptest.datadummy.Noticia;
import com.chemo.apptest.datadummy.NoticiaPopular;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class AdapterPopular extends ArrayAdapter {
	private ArrayList items;
	private Context context;
	
	public AdapterPopular(Context context, int textViewResourceId,ArrayList items) {
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
			convertView = vi.inflate(R.layout.item_popular, null);
		
			holder = new ViewHolder();
			holder.imagen = (ImageView) convertView.findViewById(R.id.img_item_popular);
		    
			holder.titulo = (TextView) convertView.findViewById(R.id.titulo_item_popular);
		    holder.titulo.setTextColor(Color.BLACK);
		    
		    holder.desc = (TextView) convertView.findViewById(R.id.desc_item_popular);
		    holder.desc.setTextColor(Color.parseColor("#FF8000"));
		    
		    holder.estrellas = (RatingBar) convertView.findViewById(R.id.stars_item_popular);
		    
		    convertView.setTag(holder);
		}
		else 
		{
			holder = (ViewHolder) convertView.getTag();
		}
			
		NoticiaPopular n = (NoticiaPopular) items.get(position);
		
		holder.imagen.setBackgroundDrawable(n.getIcono());
		holder.titulo.setText(n.getTitulo());
		holder.desc.setText(n.getDesc());
		
		//Pintamos las barras
		holder.estrellas.setRating(n.getRating());
       
       
        return convertView;
	}
	
	class ViewHolder {
		ImageView imagen;
		TextView titulo;
		TextView desc;
		RatingBar estrellas;
	}
}
