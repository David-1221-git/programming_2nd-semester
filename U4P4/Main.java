package U4P4;

public class Main {
    public static void main(String[] args) {
        HeroesDC superman = new HeroesDC("Clark Kent", "Superman", "Super fuerza, vuelo, visión de rayos X", "Tierra", "Kryptonian", "Ninguna", "Traje azul con capa roja");
        System.out.println("Identidad: " + superman.getIdentidad());
        System.out.println("Alias: " + superman.getAlias());
        System.out.println("Poder: " + superman.getPoder());
        System.out.println("Mundo: " + superman.getMundo());
        System.out.println("Raza: " + superman.getRaza());
        System.out.println("Arma: " + superman.getArma());
        System.out.println("Traje: " + superman.getTraje());
        superman.pelear("Puñetazo poderoso", 100);
        superman.volar("Vuelo supersónico");
        System.out.println("\n");
        HeroesDC batman = new HeroesDC("Bruce Wayne", "Batman", "Inteligencia, habilidades de combate, tecnología avanzada", "Tierra", "Humano", "Batarang, Batimóvil,Batplane", "Traje negro con capa");    
        System.out.println("Identidad: " + batman.getIdentidad());
        System.out.println("Alias: " + batman.getAlias());
        System.out.println("Poder: " + batman.getPoder());
        System.out.println("Mundo: " + batman.getMundo());
        System.out.println("Raza: " + batman.getRaza());
        System.out.println("Arma: " + batman.getArma());
        System.out.println("Traje: " + batman.getTraje());
        batman.pelear("Técnica de combate avanzada", 80);
        batman.volar("Batplane");
        System.out.println("\n");
        HeroesMarvel spiderman = new HeroesMarvel("Peter Parker", "Spider-Man", "Fuerza sobrehumana, agilidad, telarañas", "Tierra", "Humano", "Telarañas, traje con araña", "Traje rojo y azul con máscara");    
        System.out.println("Identidad: " + spiderman.getIdentidad());
        System.out.println("Alias: " + spiderman.getAlias());
        System.out.println("Poder: " + spiderman.getPoder());
        System.out.println("Mundo: " + spiderman.getMundo());
        System.out.println("Raza: " + spiderman.getRaza());
        System.out.println("Arma: " + spiderman.getArma());
        System.out.println("Traje: " + spiderman.getTraje());
        spiderman.pelear("Técnica de combate avanzada", 90);
        spiderman.volar("Vuelo con telarañas");
        System.out.println("\n");
        HeroesMarvel groot = new HeroesMarvel("Groot", "Groot", "Regeneración, fuerza sobrehumana, control de plantas", "Planeta X", "Flora colossus", "Ninguna", "Cuerpo de madera");    
        System.out.println("Identidad: " + groot.getIdentidad());
        System.out.println("Alias: " + groot.getAlias());
        System.out.println("Poder: " + groot.getPoder());
        System.out.println("Mundo: " + groot.getMundo());
        System.out.println("Raza: " + groot.getRaza());
        System.out.println("Arma: " + groot.getArma());
        System.out.println("Traje: " + groot.getTraje());
        groot.pelear("Golpe de rama", 70);
        groot.volar("No puede volar, pero puede saltar grandes distancias");
    }
}
