package com.unbosque.fifasketch.ws.rest.vo;

public class VOUsuario {
	
	private String usuario;
	private String password;
	private String nombre;
	private String apellido;
	private boolean EstadoUsuario;
	
	
	public boolean isEstadoUsuario() {
		return EstadoUsuario;
	}
	public void setEstadoUsuario(boolean estadoUsuario) {
		EstadoUsuario = estadoUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
