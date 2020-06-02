package ec.edu.ups.jpa;

import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.entidades.Cliente;
import ec.edu.ups.jpa.JPAGenericDAO;

public class JPAClienteDAO extends JPAGenericDAO<Cliente, String> implements ClienteDAO {

	public JPAClienteDAO() {
		super(Cliente.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTable() {
		// TODO Auto-generated method stub

	}

	@Override
	public Cliente findById(String id) {
		Cliente user = new Cliente();
		em.clear();
		String consulta = ("SELECT u FROM Usuario u WHERE u.cedula='" + id + "'");
		try {
			user = (Cliente) em.createQuery(consulta).getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return user;
	}

	@Override
	public Cliente findUser(String correo, String pass) {
		Cliente user = new Cliente();
		em.clear();
		String consulta = ("SELECT u FROM Usuario u WHERE u.correo='" + correo + "'and u.pass='" + pass + "'");
		try {
			user = (Cliente) em.createQuery(consulta).getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return user;
	}

	@Override
	public List<Cliente> findByIdOrMail(String context) {
		List<Cliente> users = new ArrayList<>();
		//em.getTransaction().begin();
		em.clear();
		if (context.equals("all")) {
			users = (List<Cliente>) em.createQuery("FROM Usuario u").getResultList();
		} else {
			String jpql = "FROM Usuario u WHERE u.cedula='" + context + "'OR u.correo='" + context + "'";
			users = (List<Cliente>) em.createQuery(jpql).getResultList();
		}
		return users;
	}

	@Override
	public List<Cliente> find() {
		List<Cliente> usuarios = new ArrayList<>();
		em.clear();
		String consulta = ("SELECT u FROM Usuario u");
		try {
			//usuarios = (List<Usuario>) em.createQuery(consulta).getSingleResult();
			usuarios = (List<Cliente>) em.createQuery(consulta).getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return usuarios;
	}
}
