package ec.edu.ups.Test;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.entidades.Cliente;
import ec.edu.ups.entidades.Vehiculo;

public class Test {

	public static void main(String[] args) {

		ClienteDAO cli = DAOFactory.getDAOFactory().getClienteDAO();
		Cliente cliente1 = new Cliente("0102863693", "Mark", "Cuenca", "09898854540");
		Cliente cliente2 = new Cliente("0102863694", "Daniel", "Cuenca", "09898854540");
		Cliente cliente3 = new Cliente("0102863695", "Pedro", "Cuenca", "09898854540");
		cli.create(cliente1);
		cli.create(cliente2);
		cli.create(cliente3);
		VehiculoDAO veh=DAOFactory.getDAOFactory().getVehiculoDAO();
		Vehiculo vehiculo1=new Vehiculo("ABC0011","NISSAN","2019",cliente1);
		Vehiculo vehiculo2=new Vehiculo("ABC0010","NISSAN","2019",cliente2);
		Vehiculo vehiculo3=new Vehiculo("ABC0009","NISSAN","2019",cliente3);
		veh.create( vehiculo1);
		veh.create( vehiculo2);
		veh.create( vehiculo3);
		
		//veh.findByUserId("0102863693");
		
		
	}

}
