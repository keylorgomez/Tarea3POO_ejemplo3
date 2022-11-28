package ejemplo3;

public interface State {
    void trabajar();
    void comer();
    void dormir();
    void comoEsta();

    void cambiarPersona(Persona persona);

}