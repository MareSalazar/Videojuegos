//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args){
        //Creamos los 3 objetos->Videojuegos
        Videojuego videojuego1= new Videojuego();
        Videojuego videojuego2= new Videojuego();
        Videojuego videojuego3= new Videojuego();

        //Vid 1
        videojuego1.nombre= "Minecraft";
        videojuego1.genero="Supervivencia";
        videojuego1.version="1.21";
        videojuego1.activo= false;

        //Vid 2
        videojuego2.nombre= "FIFA";
        videojuego2.genero="Deporte";
        videojuego2.version="25";
        videojuego2.activo= false;

        //Vid 3
        videojuego3.nombre= "Roblox";
        videojuego3.genero="Multijugador";
        videojuego3.version="2.0";
        videojuego3.activo= false;

        //Mostrar los datos

        System.out.println("Videojuego 1:");
        videojuego1.mostrarInformacion();

        System.out.println("\nVideojuego 2:");
        videojuego2.mostrarInformacion();

        System.out.println("\nVideojuego 3:");
        videojuego3.mostrarInformacion();

        //Comprobacion independencia
        System.out.println("Iniciando Minecraft (videojuego1)");
        videojuego1.iniciar();
        videojuego1.mostrarInformacion();
        videojuego1.mostrarVersion();

        System.out.println();

        System.out.println("\nEstado de FIFA");
        videojuego2.mostrarInformacion();
        videojuego2.mostrarVersion();

        System.out.println();

        System.out.println("\nEstado Roblox");
        videojuego3.mostrarInformacion();
        videojuego3.mostrarVersion();

        System.out.println();

        System.out.println("\nCerramos el primer videojuego Minecraft");
        videojuego1.cerrar();
        videojuego1.mostrarInformacion();

    }

}
