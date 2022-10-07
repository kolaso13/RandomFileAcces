package clases;

public class Persona {
    private static String nombre;
    private static String dni;
    private static String edad;

    public Persona(String name, String dni, String age) {
        this.nombre = name;
        this.dni = dni;
        this.edad = age;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public static String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public static String imprimir(){
        return nombre + dni + edad;
    }
}