package com.alewitox.entity.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;



@Entity
@Table (name = "restaurantes")
public class Restaurantes implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_restaurantes")
	private int id;
	
	@Column
	@NotEmpty
	private String nombre;
	
	
	@Column
	@NotEmpty
	private String direccion;
	
	@Column
	@NotEmpty
	private String tipo_comida;
	
	public Restaurantes() {}

	public Restaurantes(int id, @NotEmpty String nombre, @NotEmpty String direccion, @NotEmpty String tipo_comida) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.tipo_comida = tipo_comida;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipo_comida() {
		return tipo_comida;
	}

	public void setTipo_comida(String tipo_comida) {
		this.tipo_comida = tipo_comida;
	}

	
}
