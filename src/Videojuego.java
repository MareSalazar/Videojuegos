public class Videojuego {
    //Atributos publicos
    public String nombre;
    public String genero;

    //Atributos acceso por default
    String version;
    boolean activo;

    public void mostrarInformacion(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Genero: "+ genero);
        System.out.println("Version: "+ version);
        System.out.println("Activo: "+ activo);
    }

    public void iniciar(){
        activo= true;
        System.out.println("El videojuego ha sido iniciado");
    }

    void cerrar(){
        activo= false;
        System.out.println("El videojuego ha sido cerrado");
    }

    void mostrarVersion(){
        System.out.println("La version del videojuego es: "+ version);
    }
}
