import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import clases.*;
public class main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException, FileNotFoundException {
        int opcion=1;
        String nombre="", dni="", edad="", DNIBusqueda="";

        while (opcion != 0) {
            mostrarMenu();
            System.out.println("Opción? ");
            opcion = leerOpcion(7); // hay 6 acciones principales sobre el inventario + terminar la aplicaciÃ³n
            switch(opcion) {
                case 0:	System.out.println("Termina la aplicación");
                    System.exit(0);
                case 1:
                    System.out.println("Introduce el nombre:");
                    while (true){
                        try{
                            nombre = in.nextLine();
                            break;
                        }catch (Exception e){
                            System.out.println("El nombre introducido es erroneo, introduce uno correcto");
                            in.nextLine();
                        }
                    }
                    System.out.println("Introduce el DNI:");
                    while (true){
                        try{
                            dni = in.nextLine();
                            break;
                        }catch (Exception e){
                            System.out.println("El dni introducido es erroneo, introduce uno correcto");
                            in.nextLine();
                        }
                    }
                    System.out.println("Introduce el edad:");
                    while (true){
                        try{
                            edad = in.nextLine();
                            break;
                        }catch (Exception e){
                            System.out.println("La nombre introducido es erronea, introduce una correcta");
                            in.nextLine();
                        }
                    }
                    Persona persona = new Persona(nombre,dni,edad);
                    Registro.guargarRegistro();
                    pause();
                    break;
                case 2:
                    System.out.println("Introduce un DNI");
                    DNIBusqueda = in.nextLine();
                    Registro.buscarPersona(DNIBusqueda);
                    break;
            }
        }
    }
    public static void mostrarMenu() {// ver productos del super ordenados
        System.out.println("====================================================================");
        System.out.println("=            MENU PRINCIPAL - GESTIÒN DE REGISTRO                =");
        System.out.println("====================================================================");
        System.out.println("            tecla:1   - Insertar persona");
        System.out.println("            tecla:2   - Mostrar personas");
        System.out.println("            tecla:3   - Actualizar existencias");
        System.out.println("            tecla:0   - Terminar");
        System.out.println("====================================================================");
    }

    private static int leerOpcion(int max) {
        boolean terminar = false;
        int n = 0;
        while (!terminar) {
            try {
                n = in.nextInt();
                in.nextLine();
                if (n>=max || n<0) {
                    throw new Exception();
                }
                terminar = true;
            } catch (Exception e) {
                System.out.println("Opción incorrecta! elije de nuevo");
                in.nextLine();
            }
        }
        return n;
    }
    private static void pause() {
        System.out.println("(pulsa 0 para continuar...");
        leerOpcion(1);
    }
}