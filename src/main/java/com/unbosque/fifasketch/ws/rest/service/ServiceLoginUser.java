package com.unbosque.fifasketch.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.unbosque.fifasketch.dao.UsuarioDAO;
import com.unbosque.fifasketch.modelo.Usuario;
import com.unbosque.fifasketch.ws.rest.vo.VOUsuario;

@Path("/fifaSketch")
public class ServiceLoginUser {

	@POST
	@Path("/validarUsuario")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public VOUsuario validarUsuario(VOUsuario vo) {
		
		vo.setEstadoUsuario(false);
		UsuarioDAO user = new UsuarioDAO();
		Usuario userObj = null;
		
		userObj = user.validarUsuario(vo.getUsuario(), vo.getPassword());
		
		if (userObj != null) {
			vo.setEstadoUsuario(true);
			vo.setNombre(userObj.getNombre());
			vo.setApellido(userObj.getApellido());
			
		}

		vo.setPassword("**********");

		return vo;
	}
	
}
