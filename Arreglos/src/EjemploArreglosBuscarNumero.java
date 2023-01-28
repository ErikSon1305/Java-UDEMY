import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {
        int [] a = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.print("Introduce el numero: " + (i+1) + " : ");
            a[i] = s.nextInt();
        }
        System.out.println("\r\nIngrese el numero que quiere buscar: ");
        int numero = s.nextInt();
        int i = 0;
        while (i < a.length && a[i] != numero) {
            i++;
        }
        if (i == a.length){
            System.out.println("No encontro el numero");
        } else if (a[i] == numero) {
            System.out.println("Numero encontrado en la posicion: " + (i+1));
        }


    }
}
