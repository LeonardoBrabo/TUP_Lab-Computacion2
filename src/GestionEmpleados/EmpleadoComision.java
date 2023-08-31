package GestionEmpleados;

public class EmpleadoComision extends Empleado implements Impuesto {

    //atributo propio de la subclase
    private double ventasRealizadas;



    //constructor de la subclase
    public EmpleadoComision(String nombre, int id, double sueldoBase,double ventasRealizadas){
        super(nombre,id,sueldoBase);
        this.ventasRealizadas = ventasRealizadas;
    }


    //método heredado de la superclase abstracta Empleado
    public double calcularSueldo(){
        return this.sueldoBase + ventasRealizadas;
    }


    //método implementado desde la interfaz Impuesto
    @Override
    public double calcularImpuesto() {
        return 0.08;
    }
}
