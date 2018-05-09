package com.unbosque.fifasketch.ws.rest.filter;

import java.io.IOException;
import java.util.Base64;
import java.util.Optional;
import java.util.StringTokenizer;

import javax.annotation.Priority;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import com.unbosque.fifasketch.interfaceDao.IUsuarioDAO;



@Provider
@Priority(Priorities.AUTHENTICATION)
public class UserValidationFilter implements ContainerRequestFilter {

	private IUsuarioDAO iu;

	public UserValidationFilter() {

		try {

			InitialContext inConte = new InitialContext();
			iu = (IUsuarioDAO) inConte.lookup("java:global/G3Software/services/IUsuarioDAO");

		} catch (NamingException e) {
			
			e.printStackTrace();
		}

	}

	@Override
	public void filter(ContainerRequestContext request) throws IOException {
		
		System.out.println("Filtrando");
		Optional<String> oUserCredentials = Optional.ofNullable(request.getHeaderString("Authentication"));
		

		if (oUserCredentials.isPresent()) {

			String credentialCodeficated = (oUserCredentials.get()).split("\\s")[1];
			String credential = new String(Base64.getDecoder().decode(credentialCodeficated.getBytes()));
			StringTokenizer sTokenizer = new StringTokenizer(credential, ":");

			String userToken = sTokenizer.nextToken();
			String passwordToken = sTokenizer.nextToken();
			
			iu.validarUsuario(userToken, passwordToken);

			System.out.println(userToken + "password: " + passwordToken);

		} else {
			request.abortWith(Response.status(Response.Status.FORBIDDEN).build());
		}

	}
}
