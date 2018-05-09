package com.unbosque.fifasketch.ws.rest.service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.unbosque.fifasketch.dao.UsuarioDAO;
import com.unbosque.fifasketch.modelo.Usuario;


@Path("fifaSketch")
public class ServiceLoginUser {

	@GET
	@Path("validarUsuario")
	@Produces({ MediaType.TEXT_PLAIN })
	public String validarUsuario() {
		
		System.out.println("Aqui estoy");
//		vo.setEstadoUsuario(false);
//		UsuarioDAO user = new UsuarioDAO();
//		Usuario userObj = null;
//		
//		userObj = user.validarUsuario(vo.getUsername(), vo.getPassword());
//		
//		if (userObj != null) {
//			vo.setEstadoUsuario(true);
//			vo.setNombre(userObj.getNombre());
//			vo.setApellido(userObj.getApellido());
//			
//		}
//
//		vo.setPassword("**********");

		return "kjñlkjñlkjñl";
	}
	
}
