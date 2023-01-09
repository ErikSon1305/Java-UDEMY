public class EjemploArreglosForOrdenamientoBurbuja {
   public static void arregloInverso(String[] arreglo){

        int count2 = arreglo.length;
        int count = arreglo.length;
        for (int i = 0; i < count2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[count-1-i];
            arreglo[i] = inverso;
            arreglo[count-1-i] = actual;
            count2--;
        }
    }
    public static void sortBurbuja(Object[] arreglo){

       int total = arreglo.length;
       int contador = 0;

        for (int i = 0; i < total; i++){

            for (int j = 0; j < total -1 -i; j++){
                if (((Comparable)arreglo[j+1]).compareTo(arreglo[j]) > 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }
    public static void main(String[] args) {

        String [] productos = {"Kingston Pendrive 64GB","Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook","Macbook Pro",
                "Chromecast 4ta generación","Bicicleta Oxford" };

        int total = productos.length;


        sortBurbuja(productos);


        System.out.println("\nUsando For\n");
        for (int i = 0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);

        }

        Integer [] numeros = new Integer [4];

        int total2 = numeros.length;;
        int contador = 0;

        numeros [0] = 10;
        numeros [1] = Integer.valueOf("7");
        numeros [2] = 35;
        numeros [3] = -1;

        sortBurbuja(numeros);

        for (int i = 0; i < total2; i++){
            System.out.println("i = " + i + ": " + numeros[i]);
        }


        //sortBurbuja(numeros);


    }
}
