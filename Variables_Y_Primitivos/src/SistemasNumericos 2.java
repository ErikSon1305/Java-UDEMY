import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {


        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero"); // Pantalla para ingresar numero

        // Declarar el numerDecimal fuera para inicializar-lo en todo el programa.
        int numeroDecimal = 0; // inicializaremos con cero pa inicializar el numeroDecimal
        try{
            numeroDecimal = Integer.parseInt(numeroStr); // Pasando de string a integer
        } catch(NumberFormatException e){ // Dentro del parentesisi ponemos el error/excepcion
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero"); // Al aparecer el error saldra una ventana con el mensaje
            main(args); //Llamamos al main para que no se quede en el error y vuelva a realizar todo el proceso
            System.exit(0); // Lo ponemos para decirle al sistema que si todo ha salido bien entonces que pare el proceso y finalmente finalize el main del catch
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal); // Pasando numero decimal a binario y declaracion en el String resultadoBinario
        System.out.println(resultadoBinario); // Imprime en consola
        
        int numeroBinario = 0b11110; // poniendo 0b delante del numero le decimos a java de que se trata de un numero binario
        System.out.println("numeroBinario = " + numeroBinario);
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal); // Pasando de decimal a octal y declaracion en el String resultadoOctal
        System.out.println(resultadoOctal);

        int numeroOctal = 036; // añadir un 0 delante para especificar que es de tipo octal
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal); // Pasando de decimal a hexadecimal y declaracion en el String resultadoHex
        System.out.println(resultadoHex);
        
        int numerHex = 0x1e; // añadir 0x delante del numero para especificar que es hexadecimal
        System.out.println("numerHex = " + numerHex);

        String mensaje = resultadoBinario;
               mensaje += "\n" + resultadoOctal;
               mensaje += "\n" + resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
