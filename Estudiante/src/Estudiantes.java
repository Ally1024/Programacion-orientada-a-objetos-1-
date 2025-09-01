public class Estudiantes {
    private String nombre;
    private String matricula;
    private double promedio;

    // Constructor
    public Estudiantes(String nombre, String matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    // Método para indicar si aprobó
    public void verificarAprobacion() {
        if (promedio >= 70) {
            System.out.println(nombre + " ha aprobado.");
        } else {
            System.out.println(nombre + " no ha aprobado.");
        }
    }

    // Método main para probar
    public static void main(String[] args) {
        Estudiantes estudiante1 = new Estudiantes("Luis", "2025-001", 85);
        Estudiantes estudiante2 = new Estudiantes("Maria", "2025-002", 65);

        estudiante1.verificarAprobacion();
        estudiante2.verificarAprobacion();
    }
}
