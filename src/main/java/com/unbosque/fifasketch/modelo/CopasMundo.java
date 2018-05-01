package com.unbosque.fifasketch.modelo;
// Generated 1/05/2018 02:13:37 PM by Hibernate Tools 5.1.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * CopasMundo generated by hbm2java
 */
public class CopasMundo implements java.io.Serializable {

	private Integer idCopasMundo;
	private String anfitrion;
	private Integer ano;
	private Set participacioneses = new HashSet(0);

	public CopasMundo() {
	}

	public CopasMundo(String anfitrion) {
		this.anfitrion = anfitrion;
	}

	public CopasMundo(String anfitrion, Integer ano, Set participacioneses) {
		this.anfitrion = anfitrion;
		this.ano = ano;
		this.participacioneses = participacioneses;
	}

	public Integer getIdCopasMundo() {
		return this.idCopasMundo;
	}

	public void setIdCopasMundo(Integer idCopasMundo) {
		this.idCopasMundo = idCopasMundo;
	}

	public String getAnfitrion() {
		return this.anfitrion;
	}

	public void setAnfitrion(String anfitrion) {
		this.anfitrion = anfitrion;
	}

	public Integer getAno() {
		return this.ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Set getParticipacioneses() {
		return this.participacioneses;
	}

	public void setParticipacioneses(Set participacioneses) {
		this.participacioneses = participacioneses;
	}

}
