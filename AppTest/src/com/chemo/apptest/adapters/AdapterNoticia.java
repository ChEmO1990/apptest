package com.chemo.apptest.adapters;


import java.util.ArrayList;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chemo.apptest.R;
import com.chemo.apptest.datadummy.Noticia;

public class AdapterNoticia extends ArrayAdapter {
	private ArrayList items;
	private Context context;
	
	public AdapterNoticia(Context context, int textViewResourceId,ArrayList items) {
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
			convertView = vi.inflate(R.layout.item_noticia, null);
		
			holder = new ViewHolder();
			holder.imagen = (ImageView) convertView.findViewById(R.id.img_item_canal);
		    
			holder.titulo = (TextView) convertView.findViewById(R.id.titulo_item_noticia);
		    holder.titulo.setTextColor(Color.BLACK);
		    
		    holder.desc = (TextView) convertView.findViewById(R.id.desc_item_noticia);
		    holder.desc.setTextColor(Color.BLACK);
		    
		    holder.promocion = (LinearLayout) convertView.findViewById(R.id.linear_promocion);
		    
		
		    convertView.setTag(holder);
		}
		else 
		{
			holder = (ViewHolder) convertView.getTag();
		}
		
		Noticia n = (Noticia) items.get(position);
		
		//Colocamos un banner de publicidad
		if( position % 7 == 0 ) {
			holder.imagen.setVisibility(ImageView.INVISIBLE);
			holder.titulo.setVisibility(TextView.INVISIBLE);
			holder.desc.setVisibility(TextView.INVISIBLE);	
			
			holder.promocion.setBackgroundResource(R.drawable.images);
		}
		else {
			holder.imagen.setBackgroundDrawable(n.getIcono());
			holder.titulo.setText(n.getTitulo());
			holder.desc.setText(n.getDesc());
		
		}
		
		
		
		
		
        return convertView;
	}
	
	class ViewHolder {
		ImageView imagen;
		TextView titulo;
		TextView desc;
		LinearLayout promocion;
	}
}
