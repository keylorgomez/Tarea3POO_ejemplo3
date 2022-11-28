package ejemplo3;

public class Cansado implements State{
    private Persona persona;
    @Override
    public void trabajar() {
        System.out.println("No quiero trabajar!");

    }

    @Override
    public void comer() {
        System.out.println("No quiero comer");
    }

    @Override
    public void dormir() {
        System.out.println("Buenas noches");
        persona.cambiarState(new Durmiendo());
    }

    @Override
    public void comoEsta() {
        System.out.println("Tengo sueño...");
    }


    @Override
    public void cambiarPersona(Persona persona) {
        this.persona=persona;
    }
}