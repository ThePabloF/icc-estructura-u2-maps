package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap(){

        System.out.println("RUN HASH MAP");
        System.out.println();
        Map<String,String> mapa = new HashMap<>();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "PC");
        System.out.println("-");


        System.out.println(mapa);
        System.out.println(mapa.keySet());

        for (String key : mapa.keySet()) {

            System.out.println(mapa.get(key));
        }

        System.out.println(mapa.get("001"));
                System.out.println(mapa.get("005"));

    }


    public void LinkedHashMap(){
        System.out.println("Probando LINKED HASH MAP");
                System.out.println();

        Map<Integer,String> mapa = new HashMap<>();
        mapa.put(-1, "Pablo");
        mapa.put(2, "Juan");
        mapa.put(3, "Pedro");
        mapa.put(4, "Felipe");
        mapa.put(5, "David");

        for (Integer key : mapa.keySet()) {
            System.out.println(mapa.get(key));
        }

    }

    public void runTreeMap(){
        System.out.println("RUN TREE MAP");
                System.out.println();

        Map<Integer,String> items = new TreeMap<>();

        items.put(3, "carro");
        items.put(6, "bicicleta");
        items.put(1, "moto");

        
        for (Integer key : items.keySet()) {
            System.out.println(items.get(key));
        }

    }

    public void runHashMapObj(){
        System.out.println("RUN HASH MAP  OBJ");
                System.out.println();

 
        Map<Empleado,Integer> empleados = new HashMap<>();
        
        empleados.put(new Empleado(1, "Juan", "Dev"),1200);
        empleados.put(new Empleado(2, "Juan", "Dev"),1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"),2000);
        empleados.put(new Empleado(1, "Juan", "Dev"),2500);

        System.out.println(empleados);

        for (Empleado key : empleados.keySet()) {
            System.out.println(empleados.get(key));
        }


        
    }


    public void runTreeMapObj(){
        System.out.println("RUN TREE MAP OBJ");
                System.out.println();

        Map<Empleado,Integer> empleados = new TreeMap<>();

         empleados.put(new Empleado(1, "Juan", "Dev"),1200);
        empleados.put(new Empleado(2, "Juan", "Dev"),1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"),2000);
        empleados.put(new Empleado(1, "Diego", "Dev"),1200);
       empleados.put(new Empleado(1, "Juan", "Senior"),3000);
        System.out.println(empleados);
    }
    

}
