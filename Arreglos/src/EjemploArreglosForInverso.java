import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {


        //String [] productos = new String [7];

        String [] productos = {"Kingston Pendrive 64GB","Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook","Macbook Pro",
                "Chromecast 4ta generación","Bicicleta Oxford" };

        int count = productos.length;
        /*
        productos [0] = "Kingston Pendrive 64GB";
        productos [1] = "Samsung Galaxy";
        productos [2] = "Disco Duro SSD Samsung Externo";
        productos [3] = "Asus Notebook";
        productos [4] = "Macbook Pro";
        productos [5] = "Chromecast 4ta generación";
        productos [6] = "Bicicleta Oxford";
         */

        Arrays.sort(productos); // Ordena alfabeticamente de la A a la Z

        System.out.println("\nUsando For\n");
        for (int i = 0; i < count; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("\nUsando For Inverso\n");
        for (int i = 0; i < count; i++){
            System.out.println("para i = " + (count-1-i) + " valor: " + productos[count-1-i] );
        }

        System.out.println("\nUsando For Inverso2\n");
        for (int i = count-1; i >= 0; i--){
            System.out.println("para i = " + i + " valor: " + productos[i] );
        }

    }
}
