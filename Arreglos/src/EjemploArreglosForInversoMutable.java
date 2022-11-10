import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
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
    public static void main(String[] args) {

        String [] productos = {"Kingston Pendrive 64GB","Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook","Macbook Pro",
                "Chromecast 4ta generación","Bicicleta Oxford" };

        int count = productos.length;

        Arrays.sort(productos); // Ordena alfabeticamente de la A a la Z
        arregloInverso(productos);

        //Collections.reverse(Arrays.asList(productos));
        System.out.println("\nUsando For\n");
        for (int i = 0; i < count; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

    }
}
