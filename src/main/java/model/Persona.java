package model;

import java.io.Serializable;

public class Persona {
	
	private int id;
	private String cedula;
	private String direccion;
	private String tipoDireccion;
	private String nombre;
	public Persona(int id, String cedula, String direccion, String tipoDireccion, String nombre) {
		super();
		this.id = id;
		this.cedula = cedula;
		this.direccion = direccion;
		this.tipoDireccion = tipoDireccion;
		this.nombre = nombre;
	}
	public Persona() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTipoDireccion() {
		return tipoDireccion;
	}
	public void setTipoDireccion(String tipoDireccion) {
		this.tipoDireccion = tipoDireccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
