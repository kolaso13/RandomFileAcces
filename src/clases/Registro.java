package clases;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Registro {

    private static Path pathArchivo = Path.of("src/file/productos.txt");

    private static ArrayList<Persona> Registro;
    private static Registro instance;

    private Registro(){
        Registro = new ArrayList<Persona>();
    }

    public static Registro getInstance() {
        if (instance == null) {
            instance = new Registro();
        }
        return instance;
    }

    public static void cargarRegistro(){
        String.format("%1$-"+22+"s","juan");
    }

    public static void InsertarRegistro(){}

    public static void guargarRegistro(){
        try {
            Files.writeString(pathArchivo, "");
            Registro.forEach(person -> {
                try {
                    Files.writeString(pathArchivo, person + System.lineSeparator(), StandardOpenOption.APPEND);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
