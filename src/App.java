import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;
import dao.EmpleadoDao;
import dao.EmpleadoDaoHashMap;
import dao.EmpleadoDaoTreeMap;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Pablo Feijo"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();

        mapa.runHashMap();
        mapa.LinkedHashMap();
        mapa.runTreeMap();
        mapa.runHashMapObj();
        mapa.runTreeMapObj();



        EmpleadoDao empleadoDAOHash = new EmpleadoDaoHashMap();
        EmpleadoContoller empleadoContoller = new EmpleadoContoller(empleadoDAOHash);

        EmpleadoDao empleadoDAOTree =  new EmpleadoDaoTreeMap();
        EmpleadoContoller empleadoContoller2 = new EmpleadoContoller(empleadoDAOTree);


        Empleado emp1 =  new Empleado(5, "Pedro", "Dev");
        Empleado emp2 =  new Empleado(3, "Juan", "Dev");
        Empleado emp3 =  new Empleado(1, "Jose", "Dev");
        Empleado emp4 =  new Empleado(2, "Pedro", "Dev");
        Empleado emp5 =  new Empleado(4, "Pedro", "Dev");

        empleadoContoller.crearEmpleado(emp1);
        empleadoContoller.crearEmpleado(emp2);
        empleadoContoller.crearEmpleado(emp3);
        empleadoContoller.crearEmpleado(emp4);
        empleadoContoller.crearEmpleado(emp5);
        
        empleadoContoller2.crearEmpleado(emp1);
        empleadoContoller2.crearEmpleado(emp2);
        empleadoContoller2.crearEmpleado(emp3);
        empleadoContoller2.crearEmpleado(emp4);
        empleadoContoller2.crearEmpleado(emp5);

        empleadoContoller.listarEmpleados();
        empleadoContoller2.listarEmpleados();
    }

    private static void runEmpleadoExample() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
