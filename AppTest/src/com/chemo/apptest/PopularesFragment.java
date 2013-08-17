package com.chemo.apptest;

import java.util.ArrayList;

import com.chemo.apptest.adapters.AdapterNoticia;
import com.chemo.apptest.adapters.AdapterPopular;
import com.chemo.apptest.datadummy.Noticia;
import com.chemo.apptest.datadummy.NoticiaPopular;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


public class PopularesFragment extends Fragment {
	private ListView lista;
	private ArrayList<NoticiaPopular> items_populares = new ArrayList<NoticiaPopular>();
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.popular_fragment, container, false);
		
		//LLenamos de informacion
		items_populares.add( new NoticiaPopular("Se reúne EPN con gobernadores del PAN", 
				"El presidente Enrique Peña Nieto se reunió la noche del miércoles "
				+ "con seis gobernadores panistas, así como con su dirigente nacional,"
				+ " Gustavo Madero. El encuentro se llevó a cabo en la Residencia Oficial "
				+ "de Los Pinos", getResources().getDrawable(R.drawable.p1),
				5.0f));
		
		items_populares.add( new NoticiaPopular("El Tri vuelve a confiar en sí mismo", 
				"México se reencontró con el futbol, la confianza y la contundencia "
				+ "al menos por 45 minutos, tiempo en el que superó con claridad a "
				+ "Costa de Marfil, combinado al que se impuso 4-1. "
				+ "El resultado inyectó de confianza a José Manuel de la Torre", 
				getResources().getDrawable(R.drawable.p2),
				5.0f));
		
		items_populares.add( new NoticiaPopular("El soldado Manning pide perdón por perjudicar a Estados Unidos", 
				"Autoridades militares estadounidenses intentan averiguar si Bradley Manning "
				+ "dio señales de ira o de tener problemas mentales antes de filtrar la "
				+ "información secreta a WikiLeaks, informó su abogado el lunes.", 
				getResources().getDrawable(R.drawable.p3),
				3.0f));
		
	
		items_populares.add( new NoticiaPopular("Pide EU a PGR extradición de Caro Quintero", 
				"El secretario de Relaciones Exteriores de México, José Antonio Meade, "
				+ "declaró hoy que el Estado mexicano no está de acuerdo con la liberación "
				+ "del narcotraficante Caro Quintero, y que intentará dejar sin "
				+ "efecto la decisión del juez.", 
				getResources().getDrawable(R.drawable.p4),
				4.0f));
		
		items_populares.add( new NoticiaPopular("Cisco despedirá a 4,000 personas", 
				"El fabricante de chips busca reducir costos ante la demanda "
				+ "incierta por sus productos; la compañía pronostica un crecimiento"
				+ " en sus ventas de hasta 5% en el actual trimestre.",
				getResources().getDrawable(R.drawable.p5),
				4.0f));
		
		items_populares.add( new NoticiaPopular("47 millones de mexicanos tienen Facebook", 
				"Unos 28 millones de usuarios se conectan diariamente a la red social, "
				+ "según datos de la empresa; Brasil es el mayor mercado en Latinoamérica, "
				+ "aunque la India lo superó como el número dos global.", 
				getResources().getDrawable(R.drawable.p6),
				3.0f));
		
		items_populares.add( new NoticiaPopular("Cher, molesta por filtración de su nuevo tema",
				"La cantante estadounidense Cher se molestó por la filtración en Internet "
				+ "de su nueva canción The greatest thing , la cual interpreta a dueto "
				+ "con la neoyorquina Lady Gaga. ", 
				getResources().getDrawable(R.drawable.p7),
				5.0f));
		
		
		
		items_populares.add( new NoticiaPopular("Autoridades detienen a 46 personas de grupo de defensa en suroeste de México", 
				"El Ejército y la Policía de México detuvieron a 46 personas de un "
				+ "grupo de autodefensa indígena que se formó en julio pasado en el "
				+ "municipio de Aquila, en la costa del suroccidental estado de Michoacán, "
				+ "informaron hoy fuentes oficiales.", 
				getResources().getDrawable(R.drawable.p8),
				4.0f));
		
		
		
        
        Context context = getActivity().getApplicationContext();
        lista = (ListView) view.findViewById(R.id.list_popular);
        lista.setAdapter(new AdapterPopular(context, R.layout.item_popular, items_populares));
        lista.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				
			}
        });
		return view;  	
	}
	
	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		items_populares.clear();
	}
}
