package src;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class Coche implements iMusicable{

    protected boolean encendido;
    private String marca;
    private int caballos;
    private String color;
    protected int velocidad=0;
    protected int acelerador;
    protected int freno;


    public Coche(String marca,int caballos, String color, int acelerador, int freno) {
        this.encendido=false;
        this.marca=marca;
        this.caballos=caballos;
        this.color=color;
        this.acelerador=acelerador;
        this.freno=freno;
    }

    public abstract void arrancar();
    public abstract void apagar();

    public abstract void acelerar();
    public abstract void frenar();

    public void acelerar(int acelerador){
        if(encendido) {
            velocidad = velocidad + acelerador;
        }else{
            System.out.println("El coche está apagado");
        }
    }

    public void frenar(int freno){
        if(velocidad!=0){
            velocidad=velocidad-freno;
            if(velocidad<0){
                velocidad=0;
            }
        }else{
            System.out.println("El coche está ya parado");
        }
    }

    @Override
    public void iniciarReproduccion(){
        System.out.println("Reproduciendo música");
    }
    @Override
    public void detenerReproduccion(){
        System.out.println("Detener música");
    }



    public String getMarca() {
        return marca;
    }
    public int getCaballos() {
        return caballos;
    }
    public String getColor() {
        return color;
    }
    public int getVelocidad(){
        return velocidad;
    }
}
