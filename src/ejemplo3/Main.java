package ejemplo3;

/**
 * Se desarrolla un programa en el que una persona puede realizar una serie
 * de actividades durante el día, como trabajar, dormir y comer. Pero para esto,
 * cada una de las clases debe implementar estas acciones. Para este problema se
 * debe hacer uso de una interface.
 */
public class Main {
    public static void main(String[] args) {
        Persona nuevaPersona= new Persona();
        new Menu(nuevaPersona).MostrarMenu();
    }

}