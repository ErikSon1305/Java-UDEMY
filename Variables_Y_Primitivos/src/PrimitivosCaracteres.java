public class PrimitivosCaracteres {
    public static void main(String[] args) {

        char caracter = '\u0040'; // en unicode = @
        var decimal = 64; // en entero = @
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = ' ';
        char retroceso = '\b'; // Eliminara el contenido anterior x ejemplo la tecla borrar
        char tabulador = '\t'; // Añadira una tabulacion espacio tecla flechas
        char nuevaLinea = '\n'; // Ara un salto de linea
        char retornoCarro = '\r'; // = System.lineSeparator()

        System.out.println("char corresponde en byte:" + System.lineSeparator() + Character.BYTES);
        System.out.println("Char corresponde en bites = " + Character.SIZE);
        System.out.println("Char.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Char.MAX_VALUE = " + Character.MAX_VALUE);

    }
}
