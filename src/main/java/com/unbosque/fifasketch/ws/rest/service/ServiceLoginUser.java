package com.unbosque.fifasketch.ws.rest.service;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.unbosque.fifasketch.ws.rest.vo.VOUsuario;

@Path("/fifaSketch")
public class ServiceLoginUser {

	@POST
	@Path("/validarUsuario")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOUsuario validarUsuario(VOUsuario vo) {
		vo.setEstadoUsuario(false);
		if (vo.getUsuario().equals("dranoel") && vo.getPassword().equals("12345")){
			vo.setEstadoUsuario(true);
		}
		
		vo.setPassword("**************");
		return vo;
	}
	
}
