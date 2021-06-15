package com.protom.ecommerce.entity;

import java.util.concurrent.atomic.AtomicInteger;

import com.protom.esercizi.es12.annotations.SkipField;

public class Product {

	private static final AtomicInteger COUNTER = new AtomicInteger();
	private final int id;
	private String marca;
	private Tipologia tipo;
	private double prezzo;
	private int magazzinoQuantity;
	private int vendutaQuantity;
	
	public Product(String inMarca, Tipologia inTipo, double inPrezzo, int inMag, int inVend) {
		this.marca = inMarca;
		this.tipo = inTipo;
		this.prezzo = inPrezzo;
		this.magazzinoQuantity = inMag;
		this.vendutaQuantity = inVend;
		
		id = COUNTER.incrementAndGet();
	}
	
	public Product() {
		id = COUNTER.incrementAndGet();
	}

	@SkipField(value = "")
	public double getPrezzo() {
		return prezzo;
	}

	public Product setPrezzo(double prezzo) {
		this.prezzo = prezzo;
		return this;
	}

	@SkipField(value = "UPPER")
	public String getMarca() {
		return marca;
	}
	
	public Product setMarca(String inMarca) {
		this.marca = inMarca;
		return this;
	}

	@SkipField(value = "")
	public Tipologia getTipo() {
		return tipo;
	}
	
	public Product setTipo(Tipologia t) {
		this.tipo = t;
		return this;
	}

	@SkipField(value = "")
	public int getQuantity() {
		return magazzinoQuantity;
	}

	
	public Product setQuantity(int magazzinoQuantity) {
		this.magazzinoQuantity = magazzinoQuantity;
		return this;
	}

	@SkipField(value = "")
	public int getVendutaQuantity() {
		return vendutaQuantity;
	}

	public Product setVendutaQuantity(int vendutaQuantity) {
		this.vendutaQuantity = vendutaQuantity;
		return this;
	}
	
	@SkipField(value = "****")
	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", marca=" + marca + ", tipo=" + tipo + ", prezzo=" + prezzo
				+ ", magazzinoQuantity=" + magazzinoQuantity + ", vendutaQuantity=" + vendutaQuantity + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
}
