package com.chemo.apptest.datadummy;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Canal {
	private String nombre;
	private Drawable icono;
	
	public Canal() {}

	public Canal(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Canal(String nombre, Drawable icono) {
		super();
		this.nombre = nombre;
		this.icono = icono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Drawable getIcono() {
		return icono;
	}

	public void setIcono(Drawable icono) {
		this.icono = icono;
	}
	
	
	
	
	
	

}
