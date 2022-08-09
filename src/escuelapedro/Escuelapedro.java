package escuelapedro;

import java.util.Scanner;

/**
 *
 * @author b4nz0k
 */
public class Escuelapedro {
    //Definimos la variable salir para saber si estara dentro o fuera del programa

    public static void main(String[] args) {
        boolean salir = false;
        int opcion;
        //Definimos una instancia llamada "entrada" con Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Selecciona una opcion de la lista");
        do {
            menu();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n# Has seleccionado Funciones");
                    menu2();
                case 2:
                    System.out.println("\n# Has seleccionado Recursividad");
                    menu2();
                    break;
                case 3:
                    System.out.println("\n# Has seleccionado Metodo de orientacion de insercion");
                    menu2();
                    break;
                case 4:
                    System.out.println("\n# Has seleccionado Metodo de orientacion de shell");
                    menu2();
                    break;
                case 5:
                    System.out.println("\n# Has seleccionado Lista de Personas");
                    menu2();
                    break;
                case 6:
                    System.out.println("\n# Has seleccionado Pilas");
                    menu2();
                    break;
                case 7:
                    System.out.println("\n# Has seleccionado Colas");
                    menu2();
                    break;
                case 8:
                    System.out.println("\n# Gracias por utilizar el sistema, hasta luego");
                    salir = true;
                    break;
                default:
                    System.out.println("#####  -- -- ####\n\nSolo Puedes seleccionar entre la opcion 1 y 8\n");
            }

        } while (!salir);

    }

    public static void menu() {
        //Separamos el codigo y ponemos el menu aparte
        System.out.print(
                "1.-Funciones.\n"
                + "2.-Recursividad.\n"
                + "3.-Metodo de orientacion de insercion.\n"
                + "4.-Metodo de orientacion de shell.\n"
                + "5.-Lista de Personas.\n"
                + "6.-Pilas.\n"
                + "7.-Colas.\n"
                + "8.-Salir.\n"
                + "Numero : ");
    }

    public static void menu2() {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;
        do {
            System.out.print(
                    "\n# ¿Quieres volver al menu principal o quieres terminar la aplicacion?"
                    + "\n[1] Volver al menu anterior"
                    + "\n[2] Salir de la Aplicacion\n"
                    + "\nNumero : ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\n# Has seleccionado Volver al menu anterior");
                    salir = true;
                    break;
                case 2:
                    System.out.println(
                            "\n# Has seleccionado Salir de la Aplicacion"
                            + "\n# Gracias por utilizar el sistema, hasta luego");
                    System.exit(0);
                    break;
                default:
                    System.out.println("#####  -- -- ####\n\nSolo Puedes seleccionar entre la opcion 1 y 2\n");
            }
        } while (!salir);

    }
}
