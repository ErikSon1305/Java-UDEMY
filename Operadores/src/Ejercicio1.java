import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();

        String numero = (num1 > num2) ? "El numero 1 es mayor que el numero 2" : "El numero 2 es mayor que el numero 1";
        System.out.println("numero = " + numero);

        String resultado = (num1 > num2) ? num1 + " , " + num2 : num2 + " , " +num1;
        System.out.println("numero = " + numero);

        if (num1 > num2){
            System.out.println(num1 + " , " + num2);
        } else {
            System.out.println(num2 + " , " + num1);
        }
    }
}
