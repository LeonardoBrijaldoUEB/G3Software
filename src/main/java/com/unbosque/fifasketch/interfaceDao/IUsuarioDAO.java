package com.unbosque.fifasketch.interfaceDao;
import com.unbosque.fifasketch.modelo.Usuario;

public interface IUsuarioDAO {
	
		public Usuario validarUsuario(String username, String password);

}
