package src;

import src.Coche;

public class Ferrari extends Coche {

    public Ferrari(){
        super("Ferrari", 1000,"rojo", 4, 3);
    }


    @Override
    public void arrancar() {
        if(encendido==false){
            encendido=true;
            System.out.println("El Ferrari marcha");
        }else{
            System.out.println("El Ferrari ya estaba en marcha");
        }
    }

    @Override
    public void apagar(){
        if(encendido==true&&velocidad==0){
            encendido=false;
            System.out.println("El Ferrari se apaga");
        }else{
            System.out.println("El Ferrari esta ya apagado o en movimiento");
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

