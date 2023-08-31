package GestionEmpleados;

public class EmpleadoAsalariado extends Empleado implements Impuesto {



    //constructores
    public EmpleadoAsalariado(String nombre, int id, double sueldoBase)
    {
        super(nombre,id,sueldoBase);
    }


    //métodos implementados

    //método heredado de la superclase abstracta Empleado
    public double calcularSueldo(){
        return this.sueldoBase;
    }

    //método implementado de la interfaz Impuesto
    @Override
    public double calcularImpuesto() {
        return 0.1;
    }
}
