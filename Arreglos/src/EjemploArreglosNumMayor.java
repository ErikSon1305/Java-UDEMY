import java.util.Scanner;

public class EjemploArreglosNumMayor {
    public static void main(String[] args) {
        int [] a = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrse 5 enteros");
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        int mayor = 0;
        for (int i = 1; i < a.length; i++){
            mayor = (a[mayor] >  a[i]) ? mayor: i;
        }

        System.out.println("mayor = " + a[mayor]);

    }
}
