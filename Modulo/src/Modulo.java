public class Modulo {

    public String nombre;
    public String lenguaje;
    String version;
    boolean terminado;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Lenguaje: " + lenguaje);
        System.out.println("Versión: " + version);
        System.out.println("Terminado: " + (terminado ? "Sí" : "No") + "\n");
    }

    public void marcarTerminado() {
        terminado = true;
        System.out.println("El módulo " + nombre + " fue marcado como terminado.\n");
    }

    void mostrarEstado() {
        System.out.println("Estado de " + nombre + ": " + (terminado ? "Terminado" : "En desarrollo"));
    }

    void mostrarVersion() {
        System.out.println("Versión de " + nombre + ": " + version);
    }
}
