package com.unbosque.fifasketch.modelo;
// Generated 30/04/2018 03:49:09 PM by Hibernate Tools 5.1.7.Final

import java.util.Date;

/**
 * Jugador generated by hbm2java
 */
public class Jugador implements java.io.Serializable {

	private Integer idJugador;
	private Equipo equipo;
	private String nombre;
	private String apellidos;
	private Date fechaNac;
	private Integer puntajeJugador;

	public Jugador() {
	}

	public Jugador(Equipo equipo, String nombre, String apellidos) {
		this.equipo = equipo;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Jugador(Equipo equipo, String nombre, String apellidos, Date fechaNac, Integer puntajeJugador) {
		this.equipo = equipo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		this.puntajeJugador = puntajeJugador;
	}

	public Integer getIdJugador() {
		return this.idJugador;
	}

	public void setIdJugador(Integer idJugador) {
		this.idJugador = idJugador;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNac() {
		return this.fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public Integer getPuntajeJugador() {
		return this.puntajeJugador;
	}

	public void setPuntajeJugador(Integer puntajeJugador) {
		this.puntajeJugador = puntajeJugador;
	}

}
