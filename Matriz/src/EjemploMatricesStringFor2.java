public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        String [][] nombres = { {"Erik", "Andres"}, {"Francisco", "Gonzalo"}, {"Stuffmann", "Guarch"} };

        System.out.println("Iterando con Foreach: ");
        for(String[] fila: nombres){
            for (String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }

    }
}
