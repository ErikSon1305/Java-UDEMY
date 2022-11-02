public class Main {
    public static void main(String[] args) {

        //String
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        // Int
        int numero = 11;
        int numero2 = 5;

        boolean valor = true;

        if (valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }

        System.out.println("numero2 = " + numero2);

        var numero3 = 15;

        String nombre;

        nombre = "Erik";

        if (numero>10){
            nombre = "Stuffmann";
        }

        System.out.println("nombre = " + nombre);

        int edadPersona = 5;

        // Comento una sola linea
        
        /* Aquest comento un bloc
        sencer fins que es tanqui */

    }
}