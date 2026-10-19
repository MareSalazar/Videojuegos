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
    }

}
