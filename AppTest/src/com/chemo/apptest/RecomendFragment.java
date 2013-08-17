package com.chemo.apptest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.TextView;
import android.widget.Toast;

import com.chemo.apptest.adapters.ImageAdapter;


public class RecomendFragment extends Fragment implements OnItemClickListener {
	private static final String tag = "Main";
    private Gallery _gallery;
    private ImageAdapter _imageAdapter;
    private TextView titulo;
    private TextView desc;
    
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, 
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.recomend_fragment, container, false);
		
		titulo = (TextView) view.findViewById(R.id.titulo_recomend);
		desc = (TextView) view.findViewById(R.id.desc_recomend);
		
		
		
		Context context = getActivity().getApplicationContext();
        _gallery = (Gallery) view.findViewById(R.id.gallery1);
        _imageAdapter = new ImageAdapter(context);
        _gallery.setAdapter(_imageAdapter);
        _gallery.setOnItemClickListener(RecomendFragment.this);
        
		
		return view;   	
	}
	
    @Override
    public void onItemClick(AdapterView arg0, View view, int position, long duration)
        {
            int resourcId = (Integer) _imageAdapter.getItem(position);
            Drawable drawable = getResources().getDrawable(resourcId);
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), resourcId);

            Context context = getActivity().getApplicationContext();
            
            switch( position )
            {
            case 0:
            	titulo.setText("Se reúne EPN con gobernadores del PAN");
            	desc.setText("El presidente Enrique Peña Nieto se reunió la noche del miércoles "
				+ "con seis gobernadores panistas, así como con su dirigente nacional,"
				+ " Gustavo Madero. El encuentro se llevó a cabo en la Residencia Oficial "
				+ "de Los Pinos");
            	break;
            	
            case 1:
            	titulo.setText("El Tri vuelve a confiar en sí mismo");
            	desc.setText("México se reencontró con el futbol, la confianza y la contundencia "
        				+ "al menos por 45 minutos, tiempo en el que superó con claridad a "
        				+ "Costa de Marfil, combinado al que se impuso 4-1. "
        				+ "El resultado inyectó de confianza a José Manuel de la Torre");
            	break;
            	
            case 2:
            	titulo.setText("El soldado Manning pide perdón por perjudicar a Estados Unidos");
            	desc.setText("Autoridades militares estadounidenses intentan averiguar si Bradley Manning "
        				+ "dio señales de ira o de tener problemas mentales antes de filtrar la "
        				+ "información secreta a WikiLeaks, informó su abogado el lunes.");
            	break;
            	
            case 3:
            	titulo.setText("Pide EU a PGR extradición de Caro Quintero");
            	desc.setText("El secretario de Relaciones Exteriores de México, José Antonio Meade, "
        				+ "declaró hoy que el Estado mexicano no está de acuerdo con la liberación "
        				+ "del narcotraficante Caro Quintero, y que intentará dejar sin "
        				+ "efecto la decisión del juez.");
            	break;
            	
            	
            case 4:
            	titulo.setText("Cisco despedirá a 4,000 personas");
            	desc.setText("El fabricante de chips busca reducir costos ante la demanda "
        				+ "incierta por sus productos; la compañía pronostica un crecimiento"
        				+ " en sus ventas de hasta 5% en el actual trimestre.");
            	break;
            	
            	
            case 5:
            	titulo.setText("47 millones de mexicanos tienen Facebook");
            	desc.setText("Unos 28 millones de usuarios se conectan diariamente a la red social, "
        				+ "según datos de la empresa; Brasil es el mayor mercado en Latinoamérica, "
        				+ "aunque la India lo superó como el número dos global.");
            	break;
            	
            	
            case 6:
            	titulo.setText("Cher, molesta por filtración de su nuevo tema");
            	desc.setText("La cantante estadounidense Cher se molestó por la filtración en Internet "
        				+ "de su nueva canción The greatest thing , la cual interpreta a dueto "
        				+ "con la neoyorquina Lady Gaga. ");
            	break;
            	
            case 7:
            	titulo.setText("Autoridades detienen a 46 personas de grupo de defensa en suroeste de México");
            	desc.setText("El Ejército y la Policía de México detuvieron a 46 personas de un "
        				+ "grupo de autodefensa indígena que se formó en julio pasado en el "
        				+ "municipio de Aquila, en la costa del suroccidental estado de Michoacán, "
        				+ "informaron hoy fuentes oficiales.");
            	break;     	
            }
        }
}
