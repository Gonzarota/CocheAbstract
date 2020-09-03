package src;

import java.util.Enumeration;

public class Tombola {

    public Coche sortearCoche(){
        int numAleatorio=(int)(Math.random()*10);
        if(numAleatorio<5){
            return new Ferrari();
        }else{
            return new Lambo();
        }
    }
}
