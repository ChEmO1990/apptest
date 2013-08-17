package com.chemo.apptest.datadummy;

import android.graphics.drawable.Drawable;

public class NoticiaPopular {
	private String titulo;
	private String desc;
	private Drawable icono;
	private float rating;
	
	public NoticiaPopular() {}

	public NoticiaPopular(String titulo, String desc, Drawable icono,
			float rating) {
		super();
		this.titulo = titulo;
		this.desc = desc;
		this.icono = icono;
		this.rating = rating;
	}
	
	public NoticiaPopular(String titulo, String desc, float rating) {
		super();
		this.titulo = titulo;
		this.desc = desc;
		this.rating = rating;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
	
	public Drawable getIcono() {
		return icono;
	}

	public void setIcono(Drawable icono) {
		this.icono = icono;
	}
}