import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {
        String [] a = new String[4];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.print("Introduce el noombre o string: " + (i+1) + " : ");
            a[i] = s.next();
        }
        System.out.println("\r\nIngrese el String que quiere buscar: ");
        String string = s.next();
        int i = 0;
        for (; i < a.length && !a[i].equalsIgnoreCase(string); i++) {}
        if (i == a.length){
            System.out.println("No encontro el numero");
        } else if (a[i].equalsIgnoreCase(string) ){
            System.out.println("Numero encontrado en la posicion: " + (i+1));
        }


    }
}
