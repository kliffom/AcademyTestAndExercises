package com.protom.esercizi.es12.entity;

import java.util.Date;

import com.protom.esercizi.es12.annotations.*;

public class User {

	private String nome;
	private String cognome;
	
	private Date dataNascita;
	
	private String username;
	private String password;
	
	
	public String getNome() {
		return nome;
	}
	
	public User setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public User setCognome(String cognome) {
		this.cognome = cognome;
		return this;
	}
	
	@SkipNull @DateFormat(format = "dd-MM-yyyy")
	public Date getDataNascita() {
		return dataNascita;
	}
	
	public User setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
		return this;
	}
	
	public String getUsername() {
		return username;
	}
	
	public User setUsername(String username) {
		this.username = username;
		return this;
	}
	
	@Skip
	public String getPassword() {
		return password;
	}
	
	public User setPassword(String password) {
		this.password = password;
		return this;
	}
	
	
}
