package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Registro {

    private static Path pathArchivo = Path.of("src/file/file.txt");
    private static ArrayList<Persona> RegistroL;
    private static Registro instance;
    private Registro(){}
    public static void cargarRegistro(){}
    public static void guargarRegistro() throws IOException {
        RandomAccessFile accederFichero  = new RandomAccessFile(new File(pathArchivo.toUri()), "rws");
        accederFichero.seek( accederFichero.length());
        accederFichero.write(String.format("%1$-" + 22 + "s", (Persona.getNombre())).getBytes(),0,22);
        accederFichero.write(String.format(" ").getBytes(), 0,1);
        accederFichero.write(String.format("%1$-" + 3 + "s", (Persona.getEdad())).getBytes(),0,3);
        accederFichero.write(String.format(" ").getBytes(), 0,1);
        accederFichero.write(String.format("%1$-" + 10 + "s", (Persona.getDni())).getBytes(),0,9);
        accederFichero.write(String.format("\n").getBytes(), 0,1);
    }
    public static void buscarPersona(String dni){

    }

}
