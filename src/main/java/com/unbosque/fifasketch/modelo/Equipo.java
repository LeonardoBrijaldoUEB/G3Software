package com.unbosque.fifasketch.modelo;
// Generated 30/04/2018 03:49:09 PM by Hibernate Tools 5.1.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Equipo generated by hbm2java
 */
public class Equipo implements java.io.Serializable {

	private Integer idEquipo;
	private Grupo grupo;
	private Pais pais;
	private Tecnico tecnico;
	private Integer puntajeRanking;
	private Integer puntajeTorneo;
	private Set partidosForEquipo1 = new HashSet(0);
	private Set partidosForEquipo2 = new HashSet(0);
	private Set participacioneses = new HashSet(0);
	private Set jugadors = new HashSet(0);

	public Equipo() {
	}

	public Equipo(Grupo grupo, Pais pais, Tecnico tecnico) {
		this.grupo = grupo;
		this.pais = pais;
		this.tecnico = tecnico;
	}

	public Equipo(Grupo grupo, Pais pais, Tecnico tecnico, Integer puntajeRanking, Integer puntajeTorneo,
			Set partidosForEquipo1, Set partidosForEquipo2, Set participacioneses, Set jugadors) {
		this.grupo = grupo;
		this.pais = pais;
		this.tecnico = tecnico;
		this.puntajeRanking = puntajeRanking;
		this.puntajeTorneo = puntajeTorneo;
		this.partidosForEquipo1 = partidosForEquipo1;
		this.partidosForEquipo2 = partidosForEquipo2;
		this.participacioneses = participacioneses;
		this.jugadors = jugadors;
	}

	public Integer getIdEquipo() {
		return this.idEquipo;
	}

	public void setIdEquipo(Integer idEquipo) {
		this.idEquipo = idEquipo;
	}

	public Grupo getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Tecnico getTecnico() {
		return this.tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Integer getPuntajeRanking() {
		return this.puntajeRanking;
	}

	public void setPuntajeRanking(Integer puntajeRanking) {
		this.puntajeRanking = puntajeRanking;
	}

	public Integer getPuntajeTorneo() {
		return this.puntajeTorneo;
	}

	public void setPuntajeTorneo(Integer puntajeTorneo) {
		this.puntajeTorneo = puntajeTorneo;
	}

	public Set getPartidosForEquipo1() {
		return this.partidosForEquipo1;
	}

	public void setPartidosForEquipo1(Set partidosForEquipo1) {
		this.partidosForEquipo1 = partidosForEquipo1;
	}

	public Set getPartidosForEquipo2() {
		return this.partidosForEquipo2;
	}

	public void setPartidosForEquipo2(Set partidosForEquipo2) {
		this.partidosForEquipo2 = partidosForEquipo2;
	}

	public Set getParticipacioneses() {
		return this.participacioneses;
	}

	public void setParticipacioneses(Set participacioneses) {
		this.participacioneses = participacioneses;
	}

	public Set getJugadors() {
		return this.jugadors;
	}

	public void setJugadors(Set jugadors) {
		this.jugadors = jugadors;
	}

}
