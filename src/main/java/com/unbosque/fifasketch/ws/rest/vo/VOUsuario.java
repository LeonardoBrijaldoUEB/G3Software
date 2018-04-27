package com.unbosque.fifasketch.ws.rest.vo;

public class VOUsuario {
	
	private String usuario;
	private String password;
	private boolean estadoUsuario;
	
	
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
	public boolean isEstadoUsuario() {
		return estadoUsuario;
	}
	public void setEstadoUsuario(boolean estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}
	

}
