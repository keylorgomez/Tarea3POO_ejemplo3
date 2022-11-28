package ejemplo3;

public class Hambriento implements State{
    private Persona persona;
    @Override
    public void trabajar() {
        System.out.println("No quiero trabajar!");

    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo");
        persona.cambiarState(new Cansado());
    }

    @Override
    public void dormir() {
        System.out.println("No quiero dormir");

    }

    @Override
    public void comoEsta() {
        System.out.println("Quiero comer...");
    }


    @Override
    public void cambiarPersona(Persona persona) {
        this.persona=persona;
    }
}