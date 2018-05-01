package com.unbosque.fifasketch.modelo;
// Generated 1/05/2018 02:13:37 PM by Hibernate Tools 5.1.7.Final

import java.util.Date;

/**
 * Partido generated by hbm2java
 */
public class Partido implements java.io.Serializable {

	private Integer idPartido;
	private Equipo equipoByEquipo1;
	private Equipo equipoByEquipo2;
	private FaseTorneo faseTorneo;
	private Date fechapartido;
	private Integer golesequipo1;
	private Integer golesequipo2;

	public Partido() {
	}

	public Partido(Equipo equipoByEquipo1, Equipo equipoByEquipo2, FaseTorneo faseTorneo, Date fechapartido,
			Integer golesequipo1, Integer golesequipo2) {
		this.equipoByEquipo1 = equipoByEquipo1;
		this.equipoByEquipo2 = equipoByEquipo2;
		this.faseTorneo = faseTorneo;
		this.fechapartido = fechapartido;
		this.golesequipo1 = golesequipo1;
		this.golesequipo2 = golesequipo2;
	}

	public Integer getIdPartido() {
		return this.idPartido;
	}

	public void setIdPartido(Integer idPartido) {
		this.idPartido = idPartido;
	}

	public Equipo getEquipoByEquipo1() {
		return this.equipoByEquipo1;
	}

	public void setEquipoByEquipo1(Equipo equipoByEquipo1) {
		this.equipoByEquipo1 = equipoByEquipo1;
	}

	public Equipo getEquipoByEquipo2() {
		return this.equipoByEquipo2;
	}

	public void setEquipoByEquipo2(Equipo equipoByEquipo2) {
		this.equipoByEquipo2 = equipoByEquipo2;
	}

	public FaseTorneo getFaseTorneo() {
		return this.faseTorneo;
	}

	public void setFaseTorneo(FaseTorneo faseTorneo) {
		this.faseTorneo = faseTorneo;
	}

	public Date getFechapartido() {
		return this.fechapartido;
	}

	public void setFechapartido(Date fechapartido) {
		this.fechapartido = fechapartido;
	}

	public Integer getGolesequipo1() {
		return this.golesequipo1;
	}

	public void setGolesequipo1(Integer golesequipo1) {
		this.golesequipo1 = golesequipo1;
	}

	public Integer getGolesequipo2() {
		return this.golesequipo2;
	}

	public void setGolesequipo2(Integer golesequipo2) {
		this.golesequipo2 = golesequipo2;
	}

}
