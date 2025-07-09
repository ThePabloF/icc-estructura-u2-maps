package dao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class EmpleadoDaoTreeMap implements EmpleadoDao {
    private Map<Empleado,Empleado> empleados;

    

    public EmpleadoDaoTreeMap() {
        this.empleados = new TreeMap<>();
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
