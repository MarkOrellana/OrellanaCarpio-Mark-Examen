package ec.edu.ups.jpa;

import java.util.List;

import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.entidades.Ticket;

public class JPATicketDAO  extends JPAGenericDAO<Ticket, Integer> implements TicketDAO{

	public JPATicketDAO(Class<Ticket> persistentClass) {
		super(Ticket.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ticket findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> find() {
		// TODO Auto-generated method stub
		return null;
	}

}
