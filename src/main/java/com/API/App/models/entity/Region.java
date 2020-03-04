package com.API.App.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "regiones")
public class Region implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre_region;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre_region() {
		return nombre_region;
	}


	public void setNombre_region(String nombre_region) {
		this.nombre_region = nombre_region;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
