public class PrimitivosEnteros {
    public static void main(String[] args) {

        //Byte
        byte numeroByte = 127; // Minimo -128 y maximo 127.
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo Byte corresponde en byte a" + Byte.BYTES);
        System.out.println("Tipo Byte corresponde en bites a" + Byte.SIZE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);

        //Short
        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo Short corresponde en byte a" + Short.BYTES);
        System.out.println("Tipo Short corresponde en bites a" + Short.SIZE);
        System.out.println("Valor maximo de un Short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un Short: " + Short.MIN_VALUE);

        //Int
        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo Int corresponde en byte a" + Integer.BYTES);
        System.out.println("Tipo Int corresponde en bites a" + Integer.SIZE);
        System.out.println("Valor maximo de un Int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un Int: " + Integer.MIN_VALUE);

        //Long
        long numeroLong = 9223372036854775807l; // añadir L para convertir la literal int a tipo long
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a" + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a" + Long.SIZE);
        System.out.println("Valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long: " + Long.MIN_VALUE);

        //Var
        var numeroVar = 9223372036854775808f;

    }
}
