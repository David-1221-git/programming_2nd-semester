package U4P3;

public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Aragorn", "Espada de Narsil", 150);
        System.out.println("GUERRERO: " + guerrero.getNombre());
        System.out.println("Energía inicial: " + guerrero.getNivelEnergia());
        
        System.out.println("Combatiendo con 50 de energía...");
        System.out.println("Retorno de combatir: " + guerrero.combatir(50));
        System.out.println("Energía después de combatir: " + guerrero.getNivelEnergia());
        
        System.out.println(" Alimentándose con 30 de energía...");
        guerrero.alimentarse(30);
        System.out.println("Energía después de alimentarse: " + guerrero.getNivelEnergia());

        System.out.println("\n");

        Mago mago = new Mago("Gandalf", "Llamarada Blanca");
        System.out.println("MAGO: " + mago.getNombre());
        System.out.println("Energía inicial (fija en 100): " + mago.getNivelEnergia());
        
        System.out.println("Lanzando hechizo (encantar)...");
        System.out.println("Retorno de encantar: " + mago.encantar());
        System.out.println("Energía después de encantar: " + mago.getNivelEnergia());
        
        System.out.println("Alimentándose con 20 de energía...");
        mago.alimentarse(20);
        System.out.println("Energía después de alimentarse: " + mago.getNivelEnergia());
    }
}