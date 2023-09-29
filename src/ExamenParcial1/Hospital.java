package ExamenParcial1;

import java.util.ArrayList;
import java.util.Scanner;

interface informacion{
    public void verHistorialDeEventos();

}

class Persona{
    private String nombre;
    private int dni;
    private String fechaDeNacimiento;

    public Persona(String nombre, int dni, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }
}

class Historial{
    private String fecha;
    private String observaciones;


    Historial(){

    }
    public Historial(String fecha, String observaciones) {
        this.fecha = fecha;
        this.observaciones = observaciones;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        observaciones = observaciones;
    }


}

class Paciente extends Persona implements informacion{
    private int telefono;
    private int tipoSangre;
    private ArrayList <Historial> HistorialMedicoPaciente;

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setTipoSangre(int tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getTipoSangre() {
        return tipoSangre;
    }

    public ArrayList <Historial> getHistorialMedicoPaciente() {
        return HistorialMedicoPaciente;
    }

    public void setHistorialMedicoPaciente(ArrayList <Historial> historialMedicoPaciente) {
        HistorialMedicoPaciente = historialMedicoPaciente;
    }

    public Paciente(String nombre, int dni, String fechaDeNacimiento, int telefono, int tipoSangre) {
        super(nombre, dni, fechaDeNacimiento);
        this.telefono = telefono;
        this.tipoSangre = tipoSangre;
        this.HistorialMedicoPaciente = new ArrayList<Historial>();
    }


    @Override
    public void verHistorialDeEventos() {
        //visualización del historial medico del paciente.
    }
}

class Doctor extends Persona {
    private String especialidad;

    public Doctor(String nombre, int dni, String fechaDeNacimiento, String especialidad) {
        super(nombre, dni, fechaDeNacimiento);
        this.especialidad = especialidad;
    }

}

// Resto del código

class Hospital {
    private ArrayList<Paciente> pacientes;

    public Hospital() {

        this.pacientes = new ArrayList<>();
    }

    //registrar un nuevo Paciente.
    public void registrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Nuevo paciente registrado en el hospital.");
    }

    //actualizar info paciente.
    public void actualizarInformacionPaciente(int dni,String nombre, int numTelefono, int tipo,String fecha) {
        for (Paciente paciente : pacientes) {
            if (paciente.getDni() == dni) {
                paciente.setTelefono(numTelefono);
                paciente.setNombre(nombre);
                paciente.setTipoSangre(tipo);
                paciente.setFechaDeNacimiento(fecha);
            }
        }
        System.out.println("Paciente con DNI " + dni + " no encontrado.");
    }
    public void cargarHistorialMedico(int dni, String fecha, String observacion) {
        for (Paciente paciente : pacientes) {
            if (paciente.getDni() == dni) {
                paciente.getHistorialMedicoPaciente();
                System.out.println("Historial médico actualizado para el paciente con DNI " + dni);
                return;
            }
        }
        System.out.println("Paciente con DNI " + dni + " no encontrado.");
    }
}
    class Main {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            Hospital hospital1 = new Hospital();

            int opcion;
            do {
                System.out.println("Menú:");
                System.out.println("1. Listar Doctores");
                System.out.println("2. Registrar un nuevo paciente");
                System.out.println("3. Actualizar información personal de un paciente..");
                System.out.println("4. Consultar el historial médico de un paciente..");
                System.out.println("5. Nuevo historial para un paciente. ");
                System.out.println("6. Guardar Historial de pacientes en archivo");
                System.out.println("7. Cargar Historial de pacientes desde archivo");
                System.out.println("8. Salir");
                System.out.print("Elija una opción: ");
                System.out.println("Ingrese Opcion:");
                opcion = scanner.nextInt();

                String nom;
                int dni;
                String fecha;
                int tel;
                int tipo;

                switch (opcion){
                    case 1:
                        //hospital1.listarDoctores();
                        break;
                    case 2:
                        System.out.println("Ingrese nombre paciente:");
                         nom = scanner.next();
                        System.out.println("Ingrese dni");
                         dni = scanner.nextInt();
                        System.out.println("Ingrese fecha de nacimiento");
                         fecha = scanner.next();
                        System.out.println("Telefono:");
                         tel = scanner.nextInt();
                        System.out.println("tipo de sangre:");
                         tipo = scanner.nextInt();
                        hospital1.registrarPaciente(new Paciente(nom,dni,fecha,tel,tipo));
                        break;
                    case 3:
                        System.out.println("Ingrese dni de paciente a actualizar:");
                        dni = scanner.nextInt();
                        System.out.println("Nombre nuevo:");
                        nom = scanner.next();
                        System.out.println("Ingrese fecha de nacimiento");
                        fecha = scanner.next();
                        System.out.println("Telefono:");
                        tel = scanner.nextInt();
                        System.out.println("tipo de sangre:");
                        tipo = scanner.nextInt();
                        hospital1.actualizarInformacionPaciente( dni, nom,tel,tipo, fecha);
                        break;
                    case 4:
                        //consultar el historial  medico de un paciente.
                        break;
                    case 5:
                        System.out.println("Ingrese el dni de quien quiere cargar su historial medico.");
                       // hospital1.cargarHistorialMedico();
                    break;
                    case 6: break;
                    case 7: break;
                    case 8:
                        break;
                }


            } while (opcion == 8);

        }
    }



