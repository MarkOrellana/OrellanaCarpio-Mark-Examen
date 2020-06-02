package ec.edu.ups.dao;

import java.util.List;

import ec.edu.ups.dao.GenericDAO;
import ec.edu.ups.entidades.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente, String> {
	
	public abstract Cliente findUser(String correo, String pass);
    public abstract List<Cliente> findByIdOrMail(String context);

}
