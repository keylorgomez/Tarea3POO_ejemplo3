package ejemplo3;

public class Persona {
    private State state;
    public Persona(){
        cambiarState(new ListoTrabajar());
    }
    public void cambiarState(State estado){
        this.state=estado;
        this.state.cambiarPersona(this);
    }

    public void trabajar(){
        this.state.trabajar();
    }
    public void comer(){
        this.state.comer();
    }
    public void dormir(){
        this.state.dormir();
    }
    public void comoEsta(){
        this.state.comoEsta();
    }

}

