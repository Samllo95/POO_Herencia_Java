
package Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Guitarra*******************************");
        Guitarra myguit=new Guitarra(4, "G554", 1997, "Guitarras Juan Estruch");
        System.out.println(myguit.fabricante);
        System.out.println(myguit.year);
        System.out.println(myguit.modelo);
        System.out.println(myguit.numeroCuerdas);
        System.out.println(myguit.sonidoInstrum());
        System.out.println(myguit.afinarCuerdas());
        
        System.out.println("\nPiano*******************************");
        Piano mypian=new Piano("Clasico", "P007", 2000, "Baldwin Piano Company");
        System.out.println(mypian.fabricante);
        System.out.println(mypian.modelo);
        System.out.println(mypian.year);
        System.out.println(mypian.tipoPiano);
        System.out.println(mypian.tocarMelodia());
        
        System.out.println("\nTrompeta*******************************");
        Trompeta mytromp=new Trompeta("Cobre", "T31", 1910, "Stomvi");
        System.out.println(mytromp.fabricante);
        System.out.println(mytromp.modelo);
        System.out.println(mytromp.year);
        System.out.println(mytromp.materialFabricacion);
        System.out.println(mytromp.soplarTrompeta());
        System.out.println(mytromp.sonidoInstrum());
        
    }
}
