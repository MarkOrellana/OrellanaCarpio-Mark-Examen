package ec.edu.ups.jpa;

import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.entidades.Vehiculo;
import ec.edu.ups.jpa.JPAGenericDAO;

public class JPAVehiculoDAO extends JPAGenericDAO<Vehiculo, Integer> implements VehiculoDAO {

	public JPAVehiculoDAO() {
		super(Vehiculo.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTable() {
		// TODO Auto-generated method stub

	}

	@Override
	public Vehiculo findById(Integer id) {
		Vehiculo telefono = new Vehiculo();
		em.clear();
		String consulta = ("SELECT t FROM Telefono t WHERE t.id='" + id + "'");
		try {
			// telefono = (Telefono) em.createQuery(consulta).getSingleResult();
			telefono = (Vehiculo) em.createQuery(consulta).getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return telefono;
	}

	@Override
	public List<Vehiculo> findByUserId(String cedula) {
		List<Vehiculo> telefonos = new ArrayList<>();
		em.clear();
		String consulta = ("SELECT t FROM Vehiculo t WHERE t.cliente_cedula='" + cedula + "'");
		// Query query = em.createQuery( "SELECT t " + "FROM Telefono t " + "WHERE
		// t.usuario_cedula='"+cedula+"'");
		try {
			telefonos = (List<Vehiculo>) em.createQuery(consulta).getSingleResult();
			// List<Telefono> list=(List<Telefono>)query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return telefonos;
	}

	@Override
	public List<Vehiculo> find() {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

}
