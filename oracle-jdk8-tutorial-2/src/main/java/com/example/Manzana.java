package com.example;

import java.math.BigDecimal;

public class Manzana {
	
	/* Una clase bien diseñada es aquella que tiene todas sus propiedades
	 * privadas (modificador de acceso private) y se relaciona con el mundo 
	 * exterior mediante metodos getters and setters publicos */
	
	// Campos o propiedades de la clase (Lo que caracteriza al objeto que se va a crear 
	// a partir de esta plantilla, es decir, de esta clase)
	
	private String color;
	private String sabor;
	private String variedad;
	private double size;
	private double peso;
	private BigDecimal precio;
	
	// Los contructores (Metodos que tienen el mismo nombre que la clase)
	// y que son los que permiten crear o instanciar los objetos de este tipo de clase	
	
	public Manzana(String variedad, BigDecimal precio) {
		super();
		this.variedad = variedad;
		this.precio = precio;
	}



	public Manzana() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Manzana(String color, String sabor, String variedad) {
		super();
		this.color = color;
		this.sabor = sabor;
		this.variedad = variedad;
	}



	public Manzana(String color, String sabor, String variedad,
			double size, double peso, BigDecimal precio) {
		super();
		this.color = color;
		this.sabor = sabor;
		this.variedad = variedad;
		this.size = size;
		this.peso = peso;
		this.precio = precio;
	}



	public Manzana(String variedad) {
		super();
		this.variedad = variedad;
	}

	// Metodos getters and setters (metodos publicos para manejar las propiedades privadas)

	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getSabor() {
		return sabor;
	}



	public void setSabor(String sabor) {
		this.sabor = sabor;
	}



	public String getVariedad() {
		return variedad;
	}



	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}



	public double getSize() {
		return size;
	}



	public void setSize(double size) {
		this.size = size;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public BigDecimal getPrecio() {
		return precio;
	}



	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Manzana [color=" + color + ", sabor=" + sabor + ", variedad=" + variedad + ", size=" + size + ", peso="
				+ peso + ", precio=" + precio + "]";
	}


	// Otros metodos (No estan asociados a ninguna propiedad concreta, sino a varias)
	
	//aqui, 78787
	
	
	
	
	
	
	
	
	
	
}	
	