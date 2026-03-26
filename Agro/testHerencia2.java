package Agro;

public class testHerencia2 {
    public static void main(String[] args) {
        ProductoFresco fresco = new ProductoFresco("2023-12-01", 1001, "2023-11-20", "Espana");
        ProductoRefrigerado refrigerado = new ProductoRefrigerado("2023-11-15", 2002, "ES-SAN-005");
        ProductoCongelado congelado = new ProductoCongelado("2024-05-10", 3003, -18.5);

        System.out.println("####GESTION DE PRODUCTOS AGROALIMENTARIOS####\n");
        
        fresco.mostrarInformacion();
        refrigerado.mostrarInformacion();
        congelado.mostrarInformacion();
    }
}
