import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        /*
        Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
        Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de
        notas 1, ademas mostrar el promedio total.
        Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una
        para realizar los cálculos (contadores, sumas).
        Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje
        de error finalizando el programa.
         */

        double notas [] = new double[20];
        Scanner sc = new Scanner(System.in);
        double mayores = 0;
        int cantidadmayores = 0;
        double inferiores = 0;
        int cantidadinferiores = 0;
        double notas1 = 0;
        int notas11 = 0;

        double count = notas.length;

        bucle:
        for (int i = 0; i < count; i++){
            System.out.println("Ingrese la nota (nota de 1 al 7): ");
            notas[i] = sc.nextDouble();


            if (notas[i] > 5){
                mayores += notas[i] ;
                cantidadmayores++;
            } else if (notas[i] < 4 && notas[i] > 1) {
                inferiores += notas[i];
                cantidadinferiores++;
            } else if (notas[i]<= 1) {
                notas1 += notas[i];
                notas11++;
            } else if (notas[i] == 0.0) {
                System.out.println("Error no s epuede introducir 0,0 en las notas");
                break bucle;
            }


        }

        double promediomayores = mayores / cantidadmayores;
        System.out.println("El promedio de las notas mayores a 5 es de: " + promediomayores);
        double promedioinferiores = inferiores / cantidadinferiores;
        System.out.println("El promedio de las notas menores a 4 es de: " + promedioinferiores);
        double promedio1 = notas1 / notas11;
        System.out.println("El promedio de las notas a 1 es de: " + promedio1);
        double promedioTotal = (mayores + inferiores + notas1) / (cantidadmayores + cantidadinferiores + notas11);
        System.out.println("\nEl promedio total es de: " + promedioTotal);


    }
}
