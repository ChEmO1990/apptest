package com.chemo.apptest;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.chemo.apptest.adapters.AdapterNoticia;
import com.chemo.apptest.datadummy.Noticia;


public class CanalesFragment extends Fragment {
	private ListView lista;
	
	//Lista de elementos para la lista
	private ArrayList<Noticia> items_nocicias = new ArrayList<Noticia>();
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.canal_fragment, container, false);
        
		items_nocicias.add(new Noticia("Lo de hoy", "Se reúne EPN con gobernadores del PAN",
				getResources().getDrawable(R.drawable.p1)));
		
        items_nocicias.add(new Noticia("Deportes", "EL Tri vuelve a  confiar en sí mismo",
        		getResources().getDrawable(R.drawable.p2)));
        
        items_nocicias.add(new Noticia("Espectaculos", 
        		"El soldado Manning pide perdón por perjudicar a Estados Unidos",
        		getResources().getDrawable(R.drawable.p3)));
        
        items_nocicias.add(new Noticia("Lo de hoy", "Pide EU a PGR extradición de Caro Quintero",
        		getResources().getDrawable(R.drawable.p4)));
        
        items_nocicias.add(new Noticia("Lo de hoy", "Cisco despidirá a 4,000 personas",
        		getResources().getDrawable(R.drawable.p5)));
        
        items_nocicias.add(new Noticia("El fashonista", "47 millones de mexicanos tienen FaceBook",
        		getResources().getDrawable(R.drawable.p6)));
        
        items_nocicias.add(new Noticia("Espectaculos", "Cher, molesta por filtración de su nuevo tema",
        		getResources().getDrawable(R.drawable.p7)));
        
        items_nocicias.add(new Noticia("Lo de hoy", "Autoridades detienen a 46 personas de grupo de defensa en sureste de México",
        		getResources().getDrawable(R.drawable.p8)));
        
        
        
        lista = (ListView) view.findViewById(R.id.list_canales);
        int[] colors = {0, 0xFFFF0000, 0}; // red for the example
		lista.setDivider(new GradientDrawable(Orientation.RIGHT_LEFT, colors));
		lista.setDividerHeight(3);
		lista.setCacheColorHint(Color.TRANSPARENT);
		
        Context context = getActivity().getApplicationContext();
        lista.setAdapter(new AdapterNoticia(context, R.layout.item_noticia, items_nocicias));
        lista.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				Context context = getActivity().getApplicationContext();
				Toast.makeText(context, "Sin funcionalidad", Toast.LENGTH_LONG).show();
			}
        });    
		return view;
	}
	
	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		items_nocicias.clear();
	}
}
