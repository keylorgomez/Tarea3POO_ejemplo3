package ejemplo3;

import java.util.Scanner;

public class Menu {
    Persona persona;

    public Menu(Persona persona) {
        this.persona = persona;
    }

    public void MostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String mensajeOpciones = "Escoja una opción: \n" +
                "1) Comer\n" +
                "2) Dormir\n" +
                "3) Trabajar\n" +
                "4) Como se encuentra?\n" +
                "5) Salir";

        do {
            System.out.println(mensajeOpciones);
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    persona.comer();
                    break;
                case 2:
                    persona.dormir();
                    break;
                case 3:
                    persona.trabajar();
                    break;
                case 4:
                    persona.comoEsta();
                    break;
                case 5:
                    System.out.println("Hasta pronto!");
                    System.exit(0);
                default: System.out.println("Opción no válida");
            }
        }while (opcion!=5);
    }
}
