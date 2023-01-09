public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        String [][] nombres = new String [3][2];
        nombres[0][0] = "Erik";
        nombres[0][1] = "Andres";

        nombres[1][0] = "Francisco";
        nombres[1][1] = "Gonzalo";

        nombres[2][0] = "Stuffmann";
        nombres[2][1] = "Guarch";

        System.out.println("Iterando con For: ");
        for (int i = 0; i < nombres.length; i++){

            for (int j = 0; j < nombres[i].length; j++){
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nIterando con Foreach: ");
        for(String[] fila: nombres){
            for (String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }

    }
}
