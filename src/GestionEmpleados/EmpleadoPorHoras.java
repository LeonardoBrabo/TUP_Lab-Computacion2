package GestionEmpleados;

public class EmpleadoPorHoras extends  Empleado implements Impuesto {

    private int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, int id, double sueldoBase , int horasTrabajadas)
    {
        super(nombre,id,sueldoBase);
        this.horasTrabajadas = horasTrabajadas;
    }



    //método heredado de la superclase abstracta Empleado
    public double calcularSueldo(){
        return this.sueldoBase * this.horasTrabajadas;
    }

    //método implementado desde la interfaz Impuesto
    public double calcularImpuesto() {
        return 0.05;
    }

}
