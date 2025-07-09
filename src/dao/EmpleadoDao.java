package dao;

import java.util.HashMap;

import models.Empleado;

public interface EmpleadoDao {

    void add(Empleado empleado);

    void remove(int id);

    void list();
    
}
