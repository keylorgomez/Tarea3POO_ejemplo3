package ejemplo3;

public class ListoTrabajar implements State{
    private Persona persona;
    @Override
    public void trabajar() {
        System.out.println("Listo, trabajemos!");
        persona.cambiarState(new Hambriento());
    }

    @Override
    public void comer() {
        System.out.println("No quiero comer");
    }

    @Override
    public void dormir() {
        System.out.println("No quiero dormir");
    }

    @Override
    public void comoEsta() {
        System.out.println("Estoy listo para trabajar");
    }

    @Override
    public void cambiarPersona(Persona persona) {
        this.persona=persona;

    }
}
