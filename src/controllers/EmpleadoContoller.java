package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.EmpleadoDao;
import models.Empleado;

public class EmpleadoContoller {
    private EmpleadoDao empleadoDao;


    public EmpleadoContoller(EmpleadoDao empleadoDao) {
        this.empleadoDao = empleadoDao;
    }

    public void crearEmpleado(Empleado empleado){
        
        empleadoDao.add(empleado);
    }

    public void eliminarEmpleado(int id){
        empleadoDao.remove(id);
    }

    public void listarEmpleados(){
       empleadoDao.list();

    }
}