package dao;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoDaoHashMap implements EmpleadoDao {
     private Map<Empleado,Empleado> empleados;

    

    public EmpleadoDaoHashMap() {
        this.empleados = new HashMap<>();
    }

    @Override
    public void add(Empleado empleado) {
       empleados.put(empleado, empleado);
    }

    @Override
    public void remove(int id) {
        Empleado emp = new Empleado(id);
        empleados.remove(emp);
    }

    @Override
    public void list() {
        System.out.println(empleados);
    }
    
}
