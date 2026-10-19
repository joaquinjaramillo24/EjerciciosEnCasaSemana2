public class Main {
    public static void main(String[] args) {

        Modulo login = new Modulo();
        Modulo inventario = new Modulo();
        Modulo reportes = new Modulo();

        login.nombre = "Login";
        login.lenguaje = "Java";
        login.version = "1.0";
        login.terminado = true;

        inventario.nombre = "Inventario";
        inventario.lenguaje = "Java";
        inventario.version = "0.8";
        inventario.terminado = false;

        reportes.nombre = "Reportes";
        reportes.lenguaje = "Python";
        reportes.version = "0.3";
        reportes.terminado = false;

        System.out.println("Información de los módulos:");
        login.mostrarInformacion();
        inventario.mostrarInformacion();
        reportes.mostrarInformacion();

        System.out.println("Estados iniciales:");
        login.mostrarEstado();
        inventario.mostrarEstado();
        reportes.mostrarEstado();

        System.out.println("Marcamos solamente Inventario como terminado\n");
        inventario.marcarTerminado();

        System.out.println("Estados finales:");
        login.mostrarEstado();
        inventario.mostrarEstado();
        reportes.mostrarEstado();

        System.out.println("Versiones:");
        login.mostrarVersion();
        inventario.mostrarVersion();
        reportes.mostrarVersion();
    }
}
 