package src;

public class Bicicleta implements iMusicable{

    private String marca;
    private String color;
    protected int velocidad=0;
    protected int acelerar;
    protected int freno;


    public Bicicleta(String marca, String color, int acelerar, int freno) {

        this.marca=marca;
        this.color=color;
        this.acelerar=acelerar;
        this.freno=freno;
    }



    @Override
    public void iniciarReproduccion(){
        System.out.println("Reproduciendo música");
    }
    @Override
    public void detenerReproduccion(){
        System.out.println("Detener música");
    }
}
