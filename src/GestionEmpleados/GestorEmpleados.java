package GestionEmpleados;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorEmpleados {


    //atributo de Gestor Empleados
    private ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();;


    public GestorEmpleados(){
        listaEmpleados = new ArrayList<>();
    }
    public void agregarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }

    public void modificarEmpleado(int indice, Empleado nuevoEmpleado) {
        if (indice >= 0 && indice < listaEmpleados.size()) {
            listaEmpleados.set(indice, nuevoEmpleado);
        }
    }

    public void eliminarEmpleado(int indice) {
        if (indice >= 0 && indice < listaEmpleados.size()) {
            listaEmpleados.remove(indice);
        }
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : listaEmpleados) {
            System.out.println("Nombre: " + empleado.nombre + ", Sueldo: " + empleado.calcularSueldo());
        }
    }

    public void mostrarImpuestos() {
        for (Empleado empleado : listaEmpleados) {
            if (empleado instanceof Impuesto) {
                Impuesto impuesto = (Impuesto) empleado;
                System.out.println("Nombre: " + empleado.nombre + ", Impuesto: " + impuesto.calcularImpuesto());
            }
        }
    }

    public static void main(String[] args) {
        GestorEmpleados gestor = new GestorEmpleados();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Modificar Empleado");
            System.out.println("3. Eliminar Empleado");
            System.out.println("4. Mostrar Empleados y Sueldos");
            System.out.println("5. Mostrar Impuestos");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Tipo de Empleado (1: Por Horas, 2: Asalariado, 3: Comision): ");
                int tipoEmpleado = scanner.nextInt();
                System.out.print("Nombre: ");
                String nombre = scanner.next();
                System.out.print("ID: ");
                int id = scanner.nextInt();
                System.out.print("Sueldo Base: ");
                double sueldoBase = scanner.nextDouble();

                if (tipoEmpleado == 1) {
                    System.out.print("Horas Trabajadas: ");
                    int horasTrabajadas = scanner.nextInt();
                    Empleado empleado = new EmpleadoPorHoras(nombre, id, sueldoBase, horasTrabajadas);
                    gestor.agregarEmpleado(empleado);
                } else if (tipoEmpleado == 2) {
                    Empleado empleado = new EmpleadoAsalariado(nombre, id, sueldoBase);
                    gestor.agregarEmpleado(empleado);
                } else if (tipoEmpleado == 3) {
                    System.out.print("Ventas Realizadas: ");
                    double ventasRealizadas = scanner.nextDouble();
                    Empleado empleado = new EmpleadoComision(nombre, id, sueldoBase, ventasRealizadas);
                    gestor.agregarEmpleado(empleado);
                } else {
                    System.out.println("Opción inválida");
                }
            } else if (opcion == 2) {
                gestor.mostrarEmpleados();
                System.out.print("Índice del Empleado a Modificar: ");
                int indice = scanner.nextInt();

                if (indice >= 0 && indice < gestor.listaEmpleados.size()) {
                    Empleado empleado = gestor.listaEmpleados.get(indice);
                    System.out.print("Nuevo Nombre: ");
                    String nuevoNombre = scanner.next();
                    System.out.print("Nuevo Sueldo Base: ");
                    double nuevoSueldoBase = scanner.nextDouble();

                    if (empleado instanceof EmpleadoPorHoras) {
                        System.out.print("Nuevas Horas Trabajadas: ");
                        int nuevasHoras = scanner.nextInt();
                        empleado = new EmpleadoPorHoras(nuevoNombre, empleado.id, nuevoSueldoBase, nuevasHoras);
                    } else if (empleado instanceof EmpleadoAsalariado) {
                        empleado = new EmpleadoAsalariado(nuevoNombre, empleado.id, nuevoSueldoBase);
                    } else if (empleado instanceof EmpleadoComision) {
                        System.out.print("Nuevas Ventas Realizadas: ");
                        double nuevasVentas = scanner.nextDouble();
                        empleado = new EmpleadoComision(nuevoNombre, empleado.id, nuevoSueldoBase, nuevasVentas);
                    }

                    gestor.modificarEmpleado(indice, empleado);
                } else {
                    System.out.println("Índice inválido");
                }
            } else if (opcion == 3) {
                gestor.mostrarEmpleados();
                System.out.print("Índice del Empleado a Eliminar: ");
                int indice = scanner.nextInt();
                gestor.eliminarEmpleado(indice);
            } else if (opcion == 4) {
                gestor.mostrarEmpleados();
            } else if (opcion == 5) {
                gestor.mostrarImpuestos();
            } else if (opcion == 6) {
                break;
            } else {
                System.out.println("Opción inválida");
            }
        }

        System.out.println("¡Hasta luego!");
    }



}

