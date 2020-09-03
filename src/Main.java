package src;

public class Main {
    public static void main(String[] args) {

        Coche Zentorno= new Lambo();
        /*Zentorno.arrancar();
        Zentorno.arrancar();

        Zentorno.apagar();
        Zentorno.apagar();

        Coche F10= new Ferrari();

        F10.arrancar();
        F10.arrancar();

        F10.apagar();
        F10.apagar();

        System.out.println("Marca: "+Zentorno.getMarca());
        System.out.println("Marca: "+F10.getMarca());

        System.out.println("Potencia: "+Zentorno.getCaballos()+" CV");
        System.out.println("Potencia: "+F10.getCaballos()+" CV");
*/
        Zentorno.acelerar();
        Zentorno.arrancar();
        Zentorno.acelerar();
        Zentorno.acelerar();
        Zentorno.frenar();
        Zentorno.apagar();
        Zentorno.frenar();
        Zentorno.frenar();
        Zentorno.apagar();

        Tombola tombola=new Tombola();
        Coche cocheNuevo=tombola.sortearCoche();

        cocheNuevo.arrancar();
        cocheNuevo.acelerar();
        cocheNuevo.frenar();
        cocheNuevo.apagar();






    }
}
