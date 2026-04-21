package U4P5;

public class Main {
    public static void main(String[] args) {
        Futbolista futbolista1 = new Futbolista(1, "Lionel", "Messi", 36, 10, "Delantero", 5, 20, "Madrid", "Argentina", "España", "Santiago Bernabéu", "Ciudad Deportiva");
        Entrenador entrenador1 = new Entrenador(2, "Diego", "Maradona", 60, "ARG", 5, 20, "Madrid", "Argentina", "España", "Santiago Bernabéu", "Ciudad Deportiva");
        Masajista masajista1 = new Masajista(3, "Pablo", "Aimar", 45, "Licenciado en Fisioterapia", 20, 5, 20, "Madrid", "Argentina", "España", "Santiago Bernabéu", "Ciudad Deportiva");

        System.out.println("Futbolista:");
        futbolista1.concentrarse();
        futbolista1.viajar();
        futbolista1.entrenar();
        futbolista1.jugarPartido();

        System.out.println("\nEntrenador:");
        entrenador1.concentrarse();
        entrenador1.viajar();
        entrenador1.entrenar();
        entrenador1.jugarPartido();
        System.out.println("\nMasajista:");
        masajista1.concentrarse();
        masajista1.viajar();
        masajista1.entrenar();
        masajista1.jugarPartido();
    }
    
}
