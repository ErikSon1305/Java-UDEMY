import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {
        int [] a = new int [10];
        Scanner s = new Scanner(System.in);
        int auxiliar;
        for (int i = 0; i < a.length; i++){
            System.out.print("Ingrese el numero: ");
            a[i] = s.nextInt();

        }

        System.out.println();
        auxiliar = a[a.length-1];
        for (int i = a.length - 2; i >= 0; i--){
            a[i + 1] = a[i];
        }
        a[0] = auxiliar;

        System.out.println("Arreglo:");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }


    }
}
