public class Main {
    public static void main(String[] args) {
        Polideportivo arrayPolideportivos[] = new Polideportivo[3];
        arrayPolideportivos[0] = new Polideportivo("Polideportivo Municipal", 1, 500);
        arrayPolideportivos[1] = new Polideportivo("Polideportivo Universitario", 2, 1000);
        arrayPolideportivos[2] = new Polideportivo("Polideportivo Privado", 3, 750);
        for(int i = 0; i < arrayPolideportivos.length; i++){
            System.out.println(arrayPolideportivos[i].toString());
        }   
        EdificioDeOficinas arrayEdificioDeOficinas[] = new EdificioDeOficinas[3];
        arrayEdificioDeOficinas[0] = new EdificioDeOficinas(10, 200);
        arrayEdificioDeOficinas[1] = new EdificioDeOficinas(20, 400);               
        arrayEdificioDeOficinas[2] = new EdificioDeOficinas(30, 600);
        for(int i = 0; i < arrayEdificioDeOficinas.length; i++){
            System.out.println(arrayEdificioDeOficinas[i].toString());
        }   
}
}
