package com.unbosque.fifasketch.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.unbosque.fifasketch.interfaceDao.IUsuarioDAO;
import com.unbosque.fifasketch.modelo.Usuario;
import com.unbosque.fifasketch.util.FifaSketchHibernateUtil;

public class UsuarioDAO implements IUsuarioDAO {

	@Override
	public Usuario validarUsuario(String InUsername, String InPassword) {
		
		Usuario obj = null;
		Session s = FifaSketchHibernateUtil.getSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		String hql = "FROM Usuario u WHERE u.username = :usuario and u.password = :contraseña";
				
		try {
			
			obj = (Usuario) s.createQuery(hql).setParameter("usuario", InUsername).setParameter("contraseña", InPassword).uniqueResult();
			t.commit();
			s.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			t.rollback();
		}
		
		return obj;
	}
		
}
