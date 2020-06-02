package ec.edu.ups.dao;

import ec.edu.ups.jpa.JPADAOFactory;

//import ups.edu.mysql.jdbc.JPADAOFactory;

public abstract class DAOFactory {
	
    protected static DAOFactory factory = new JPADAOFactory();
    
    public static DAOFactory getDAOFactory(){
    	return factory;
    	}
    
    public abstract void createTables();
    
    public abstract ClienteDAO getClienteDAO();
    
    public abstract VehiculoDAO getVehiculoDAO();
    
    public abstract TicketDAO getTicketDAO();

}
