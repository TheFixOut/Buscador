package model;

import java.util.Arrays;

public class Pagina {
	private String nombre;
	private String url;
	private String[] seo;
	private String descripcion;
	public Pagina(String nombre, String url, String[] seo, String descripcion) {
		super();
		this.nombre = nombre;
		this.url = url;
		this.seo = seo;
		this.descripcion = descripcion;
	}
	public Pagina() {}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String[] getSeo() {
		return seo;
	}
	public void setSeo(String[] seo) {
		this.seo = seo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Pagina [nombre=" + nombre + ", url=" + url + ", seo=" + Arrays.toString(seo) + ", descripcion="
				+ descripcion + "]";
	};
	
	
}
