package src;

import src.Coche;

public class Lambo extends Coche {

    public Lambo(){
        super ("Lamborghini", 900, "negro", 3, 4);
    }

    @Override
    public void arrancar() {
        if(encendido==false){
            encendido=true;
            System.out.println("El Lambo marcha");
        }else{
            System.out.println("El Lambo ya estaba en marcha");
        }
    }

    @Override
    public void apagar(){
        if(encendido==true&&velocidad==0){
            encendido=false;
            System.out.println("El Lambo se apaga");
        }else{
            System.out.println("El Lambo ya estaba parado o esta en movimiento");
        }
    }


    @Override
    public void acelerar(){
        acelerar(acelerador);
        System.out.println("Tu velocidad actual es " + getVelocidad());
    }


    @Override
    public void frenar(){
        frenar(freno);
        System.out.println("Tu velocidad actual es " + getVelocidad());
    }
}
