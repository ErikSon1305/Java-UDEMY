import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int numeros [] = new int[10];
        Scanner sc = new Scanner(System.in);
        int count = numeros.length;
        int menor=9999;

        primero:
        for (int i = 0; i < count; i++ ){

            System.out.println("Ingrese un numero:");
            numeros[i] = sc.nextInt();

            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }

        if (menor < 10){
            System.out.println("El número " + menor + " menor es menor que 10!");
        }else {
            System.out.println("El numero " + menor + "menor es igual o mayor que 10");

        }

    }
}
