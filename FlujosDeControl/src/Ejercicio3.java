import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        /*
        Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin
        usar el símbolo de multiplicación (*).
        Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta
        los unarios, donde menos por menos es positivo.
         */

        // Acabar de mirar
        int num1 = 0;
        int num2 = 0;
        int multi = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();

        if (num1 < 0) {
            for (int i = 0; i < num2; i++) {
                multi += num1;
            }
        } else if (num2 < 0) {

            for (int i = 0; i < num1; i++) {
                multi += num2;
            }
        }
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es de " + multi);
    }


}
