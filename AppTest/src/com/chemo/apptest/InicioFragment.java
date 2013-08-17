package com.chemo.apptest;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.chemo.apptest.adapters.AdapterCanal;
import com.chemo.apptest.datadummy.Canal;

public class InicioFragment extends Fragment {
	private ArrayList<Canal> items_canales = new ArrayList<Canal>();
	private ListView lista;
	private Button btn_off;
	private Button btn_editar;
	private Button btn_config;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.home_fragment, container, false);
		
		items_canales.add( new Canal("Espectaculos", getResources().getDrawable(android.R.drawable.ic_delete)));
		items_canales.add( new Canal("Lo de hoy", getResources().getDrawable(android.R.drawable.ic_dialog_email)));
		items_canales.add( new Canal("Horoscopos", getResources().getDrawable(android.R.drawable.ic_input_add)));
		items_canales.add( new Canal("Cines", getResources().getDrawable(android.R.drawable.ic_menu_help)));
		items_canales.add( new Canal("Clima", getResources().getDrawable(android.R.drawable.ic_menu_gallery)));
		items_canales.add( new Canal("Deportes", getResources().getDrawable(android.R.drawable.ic_menu_recent_history)));
		items_canales.add( new Canal("El Fashonista", getResources().getDrawable(android.R.drawable.ic_menu_recent_history)));
		
		
		lista = (ListView) view.findViewById(R.id.list_canal);
		int[] colors = {0, 0xFFFF0000, 0}; // red for the example
		lista.setDivider(new GradientDrawable(Orientation.RIGHT_LEFT, colors));
		lista.setDividerHeight(3);
		lista.setCacheColorHint(Color.TRANSPARENT);
		
		Context context = getActivity().getApplicationContext();
        lista.setAdapter(new AdapterCanal(context, R.layout.item_canal, items_canales));
        lista.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				Context context = getActivity().getApplicationContext();
				Toast.makeText(context, "Sin funcionalidad", Toast.LENGTH_LONG).show();
			}
        });
        
        
        //Eventos botones
        btn_off = (Button) view.findViewById(R.id.btn_off_inicio);
        btn_off.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Context context = getActivity().getApplicationContext();
				Toast.makeText(context, "Sin funcionalidad", Toast.LENGTH_LONG).show();
			}
		});
        
        btn_editar = (Button) view.findViewById(R.id.btn_editar_inicio);
        btn_editar.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Context context = getActivity().getApplicationContext();
				Toast.makeText(context, "Sin funcionalidad", Toast.LENGTH_LONG).show();
			}
		});
        
        btn_config = (Button) view.findViewById(R.id.btn_config_inicio);
        btn_config.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Context context = getActivity().getApplicationContext();
				Toast.makeText(context, "Sin funcionalidad", Toast.LENGTH_LONG).show();
			}
		});
        
		return view;
	}
	
	
	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		items_canales.clear();
	}
	
	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		items_canales.clear();
	}
}
