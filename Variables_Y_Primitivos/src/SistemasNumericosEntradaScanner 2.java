import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");

        // Declarar el numerDecimal fuera del try y catch para inicializar-lo en todo el programa.
        int numeroDecimal = 0; // inicializaremos con cero pa inicializar el numeroDecimal
        try{
            numeroDecimal = scanner.nextInt();// Cojiendo numero entero introducido   // Integer.parseInt(numeroStr); // Pasando de string a integer
        } catch(InputMismatchException e){ // Dentro del parentesis ponemos el error/excepcion también podemos poner Exception ya que todas las clases de exception siempre extienden de Exception
            System.out.println("Error debe ingresar un numero entero");
            main(args); //Llamamos al main para que no se quede en el error y vuelva a realizar todo el proceso
            System.exit(0); // Lo ponemos para decirle al sistema que si todo ha salido bien entonces que pare el proceso y finalmente finalize el main del catch
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal); // Pasando numero decimal a binario y declaracion en el String resultadoBinario

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal); // Pasando de decimal a octal y declaracion en el String resultadoOctal

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal); // Pasando de decimal a hexadecimal y declaracion en el String resultadoHex


        String mensaje = resultadoBinario;
               mensaje += "\n" + resultadoOctal;
               mensaje += "\n" + resultadoHex;
        System.out.println(mensaje);

    }
}
