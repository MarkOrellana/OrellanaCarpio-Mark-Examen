package ec.edu.ups.dao;

import java.util.List;

import ec.edu.ups.dao.GenericDAO;
import ec.edu.ups.entidades.Vehiculo;

public interface VehiculoDAO extends GenericDAO<Vehiculo, Integer>{
    public abstract List<Vehiculo> findByUserId(String cedula);
}
