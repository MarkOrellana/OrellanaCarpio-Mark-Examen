package ec.edu.ups.jpa;


import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.jpa.JPAClienteDAO;
import ec.edu.ups.jpa.JPAVehiculoDAO;
import ec.edu.ups.jpa.JPATicketDAO;


public class JPADAOFactory extends DAOFactory{
	
	public JPADAOFactory() {
		// TODO Auto-generated constructor stub
	}

    @Override
    public void createTables() {
        this.getClienteDAO().createTable();
        this.getVehiculoDAO().createTable();
        //this.getTicketDAO().createTable();
    }
    @Override
    public VehiculoDAO getVehiculoDAO() {
        return new JPAVehiculoDAO();
    }
    
    @Override
    public TicketDAO getTicketDAO() {
        return new JPATicketDAO(null);
    }

	@Override
	public ClienteDAO getClienteDAO() {
		// TODO Auto-generated method stub
		return new JPAClienteDAO();
	}
    
}
