public class Main {
    public static void main(String[] args) {

        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();

        tarea1.titulo = "Diseñar pantalla de inicio";
        tarea1.responsable = "Ana";
        tarea1.horasEstimadas = 3.5;
        tarea1.completada = false;

        tarea2.titulo = "Crear base de datos";
        tarea2.responsable = "Luis";
        tarea2.horasEstimadas = 6;
        tarea2.completada = false;

        tarea3.titulo = "Escribir pruebas";
        tarea3.responsable = "Marta";
        tarea3.horasEstimadas = 4.5;
        tarea3.completada = false;

        System.out.println("Información de las tareas:");
        tarea1.mostrarInformacion();
        tarea2.mostrarInformacion();
        tarea3.mostrarInformacion();

        System.out.println("Responsables:");
        tarea1.mostrarResponsable();
        tarea2.mostrarResponsable();
        tarea3.mostrarResponsable();

        System.out.println("Completamos solamente la tarea 2\n");
        tarea2.completar();

        System.out.println("Estados finales:");
        tarea1.mostrarEstado();
        tarea2.mostrarEstado();
        tarea3.mostrarEstado();
    }
}