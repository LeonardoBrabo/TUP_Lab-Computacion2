package GestionEmpleados;

public abstract class Empleado {

    //atributos de super clase Empleado
    protected String nombre;
    protected int id;
    protected  double sueldoBase;

    //constructor superclase (nombre,id,sueldoBase);

    public Empleado(String nombre, int id, double sueldoBase){
        this.nombre = nombre;
        this.id = id;
        this.sueldoBase = sueldoBase;
    }

    //método abstracto de la super clase
    public abstract double calcularSueldo();


}
