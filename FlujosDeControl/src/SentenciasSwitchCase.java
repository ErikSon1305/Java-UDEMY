import java.util.Scanner;

public class SentenciasSwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mes = 0;
        System.out.println("Ingrese el numero de mes 1-12: ");
        mes = sc.nextInt();

        String nombreMes = null;

        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";
        }

        System.out.println("nombreMes = " + nombreMes);


        int num = 1;
        switch (num){
            case 0:
                System.out.println("El numero es cero");
                break;
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
        }

        String nombre = "Erik";

        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido!");
                break;
            case "Erik":
                System.out.println("Hola " + nombre + " , bienvenido!");
                break;
            case "pepe":
                System.out.println("Hola Pepe, bienvenido!");
                break;
            default:
                System.out.println("Usuario desconocido!");
        }
    }
}
