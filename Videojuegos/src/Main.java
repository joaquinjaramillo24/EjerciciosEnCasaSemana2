public class Main {
    public static void main(String[] args) {

    Videojuego juego1 = new Videojuego();
    Videojuego juego2 = new Videojuego();
    Videojuego juego3 = new Videojuego();

    juego1.nombre = "Minecraft";
    juego1.genero = "Sandbox";
    juego1.version = "1.20.4";
    juego1.activo = false;

    juego2.nombre = "Hollow Knight";
    juego2.genero = "Aventura";
    juego2.version = "1.5.78";
    juego2.activo = false;

    juego3.nombre = "Celeste";
    juego3.genero = "Plataformas";
    juego3.version = "1.4.0";
    juego3.activo = false;

    System.out.println("Estado inicial:");
    juego1.mostrarInformacion();
    juego2.mostrarInformacion();
    juego3.mostrarInformacion();

    juego1.iniciar();

    System.out.println("Después de iniciar el juego 1:");
    juego1.mostrarInformacion();
    juego2.mostrarInformacion();
    juego3.mostrarInformacion();

    juego1.cerrar();

    System.out.println("Versiones:");
    juego1.mostrarVersion();
    juego2.mostrarVersion();
    juego3.mostrarVersion();
}
}
 