import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        double litros = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los litros en el deposito (max 70, min 1): ");
        litros = sc.nextDouble();

        if (litros == 70){
            System.out.println("Estanque lleno");
        } else if (litros >= 60 && litros < 70 ) {
            System.out.println("Estanque casi lleno");
        } else if (litros >=40 && litros < 60) {
            System.out.println("Estanque 3/4");
        } else if (litros >=35 && litros < 40) {
            System.out.println("Medio Estanque");
        } else if (litros >= 20 && litros < 40) {
            System.out.println("Suficiente");
        } else if (litros >= 1 && litros < 20) {
            System.out.println("Insuficiente");
        } else{
            System.out.println("Deposito no puede ser mayor a 70\nRepita y vuelva a ingresar!");
            main();
        }


    }

    private static void main() {
        double litros = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el deposito actual (max 70, min 1): ");
        litros = sc.nextDouble();

        if (litros == 70){
            System.out.println("Estanque lleno");
        } else if (litros >= 60 && litros < 70 ) {
            System.out.println("Estanque casi lleno");
        } else if (litros >=40 && litros < 60) {
            System.out.println("Estanque 3/4");
        } else if (litros >=35 && litros < 40) {
            System.out.println("Medio Estanque");
        } else if (litros >= 20 && litros < 40) {
            System.out.println("Suficiente");
        } else if (litros >= 1 && litros < 20) {
            System.out.println("Insuficiente");
        } else{
            System.out.println("Deposito no puede ser mayor a 70");
            main();
        }
    }
}
