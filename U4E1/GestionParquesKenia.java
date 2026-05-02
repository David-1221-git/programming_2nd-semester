package U4E1;

public class GestionParquesKenia {
    public static void main(String[] args) {
        Parque[] parquesKenia = new Parque[5];

        parquesKenia[0] = new ReservaDeCaza("Tsavo East", 13747, 450, 150.0, "Rifle .308",
                new String[]{"Junio", "Julio", "Agosto"}, "Elefante", 2);
        parquesKenia[1] = new ReservaDeCaza("Maasai Mara", 1510, 300, 200.0, "Arco Compuesto",
                new String[]{"Septiembre", "Octubre"}, "Gacela", 5);

        parquesKenia[2] = new AreaProtegidaAcuatica("Lago Nakuru", 188, 400, 5000000, "WWF",
                3, 65.5, "Lago Principal", "Flamenco Rosado");
        parquesKenia[3] = new AreaProtegidaTerrestre("Monte Kenia", 715, 250, 8000000, "UNESCO",
                "Montañoso", 400.0, new String[]{"Leopardo", "Búfalo", "Antílope"}, 1200);
        parquesKenia[4] = new AreaProtegida("Aberdare", 766, 180, 3000000, "KWS"); 
        System.out.println("INFORMACIÓN COMPLETA DE TODOS LOS PARQUES");
        for (Parque p : parquesKenia) {
            System.out.println(p.toString());
            System.out.println("----------------------------------------");
        }
        System.out.println("\nNOMBRES DE LOS PARQUES ALMACENADOS");
        for (Parque p : parquesKenia) {
            System.out.println("- " + p.getNombre());
        }
        Visitable[] zonasVisitables = new Visitable[3];
        zonasVisitables[0] = (AreaProtegida) parquesKenia[2];
        zonasVisitables[1] = (AreaProtegida) parquesKenia[3];
        zonasVisitables[2] = (AreaProtegida) parquesKenia[4];

        System.out.println("\nZONAS VISITABLES E INFORMACIÓN");
        for (Visitable zona : zonasVisitables) {
            System.out.println(((Parque) zona).toString());
            System.out.println(">> " + zona.visitar());
            System.out.println("----------------------------------------");
        }
        System.out.println("\nPRUEBA INTERFACE CAZABLE");
        if (parquesKenia[0] instanceof Cazable) {
            Cazable zonaCaza = (Cazable) parquesKenia[0];
            System.out.println("Parque: " + zonaCaza.getNombreParque());
            System.out.println("Arma: " + zonaCaza.getTipoArma());
            System.out.println("Especie: " + zonaCaza.getEspecieCazada() + " (Max: " + zonaCaza.getCantidadEspecimenes() + " ejemplares)");
        }
    }
}
