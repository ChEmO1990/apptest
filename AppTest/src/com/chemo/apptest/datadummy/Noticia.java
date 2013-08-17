package com.chemo.apptest.datadummy;

import android.graphics.drawable.Drawable;

public class Noticia {
	private String titulo;
	private String desc;
	private Drawable icono;
	
	public Noticia() {}

	
	public Noticia(String titulo, String desc) {
		super();
		this.titulo = titulo;
		this.desc = desc;
	}
	
	public Noticia(String titulo, String desc, Drawable icono) {
		super();
		this.titulo = titulo;
		this.desc = desc;
		this.icono = icono;
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

	public Drawable getIcono() {
		return icono;
	}

	public void setIcono(Drawable icono) {
		this.icono = icono;
	}
}
