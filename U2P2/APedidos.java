package U2P2;
/*Codigo: U2P2.Pedidos (Constructores)
Por: Merino Dominguez David */
public class APedidos {
    
    public void ejecutar() {
        System.out.println("\nSISTEMA DE PEDIDOS DEL RESTAURANTE\n");
        System.out.println("[Caso 1] Pedido: Solo Primer Plato");
        Pedido p1 = new Pedido("Sopa de Tomate", 5.50);
        p1.imprimir();
        System.out.println("[Caso 2] Pedido: Primer + Segundo Plato");
        Pedido p2 = new Pedido("Ensalada Cesar", 7.00, "Lomo Saltado", 15.50);
        p2.imprimir();
        System.out.println("[Caso 3] Pedido: Menu Completo");
        Pedido p3 = new Pedido("Consome", 4.00, "Pescado Frito", 18.00, 
                               "Jugo de Maracuya", 3.50, "Flan de Coco", 5.00);
        p3.imprimir();
        System.out.println("[Caso 4] Pedido: Primer Plato + Bebida");
        Pedido p4 = new Pedido("Entrada Fria", 6.00, "Coca Cola", 2.50, true);
        p4.imprimir();
        System.out.println("[Caso 5] Pedido: Primer + Bebida + Postre");
        Pedido p5 = new Pedido("Tequeños", 8.00, "Limonada", 3.00, "Helado", 4.50);
        p5.imprimir();
    }

    public static void main(String[] args) {
        APedidos app = new APedidos();
        app.ejecutar();
    }
}