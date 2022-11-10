import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {


        String [] productos = new String [7];
        int count1 = productos.length;

        productos [0] = "Kingston Pendrive 64GB";
        productos [1] = "Samsung Galaxy";
        productos [2] = "Disco Duro SSD Samsung Externo";
        productos [3] = "Asus Notebook";
        productos [4] = "Macbook Pro";
        productos [5] = "Chromecast 4ta generación";
        productos [6] = "Bicicleta Oxford";

        Arrays.sort(productos); // Ordena alfabeticamente de la A a la Z

        System.out.println("\nUsando For\n");
        for (int i = 0; i < count1; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("\nUsando Foreach\n");
        for (String prod: productos){
            System.out.println("prod = " + prod);
        }

        System.out.println("\nUsando While\n");
        int i = 0;
        while (i < count1){
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("\nUsando DoWhile\n");
        int j = 0;
        do {
            System.out.println("Para indice " + i + " : " + productos[j]);
            j++;
        }while (j < count1);


        int [] numeros = new int [10];
        int count2 = numeros.length;

        for (int k = 0; k < count2; k++){
            numeros[k] = k * 3;
        }

        for (int k = 0; k < count2; k++){
            System.out.println("numeros = " + numeros[k]);
        }


    }
}
