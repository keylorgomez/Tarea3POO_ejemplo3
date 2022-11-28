package ejemplo3;

import java.util.Timer;
import java.util.TimerTask;

public class Durmiendo implements State{
    private Persona persona;
    @Override
    public void trabajar() {

    }

    @Override
    public void comer() {
    }

    @Override
    public void dormir() {
    }

    @Override
    public void comoEsta() {
        System.out.println("Durmiendo...");
    }


    @Override
    public void cambiarPersona(Persona persona) {
        this.persona=persona;

        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Durmiendo.this.persona.cambiarState(new ListoTrabajar());
            }
        },4000);
    }

}