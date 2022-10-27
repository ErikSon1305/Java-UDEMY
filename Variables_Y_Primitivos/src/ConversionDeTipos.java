public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr); // Pasamos el numeroStr String a int
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr); // Pasamos el reslStr String a double
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr); // Pasamos el valor logicoStr String a boolean (solo acepta true o false)
        System.out.println("logicoBoolean = " + logicoBoolean);
        
        int otroNumeroInt = 100;
        System.out.println("ortoNumeroInt = " + otroNumeroInt);
        
        String otroNumeroStr = Integer.toString(otroNumeroInt); // Pasamos otroNumeroInt int a String
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt+10); // Pasamos otroNUmeroInt a String
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble); // Pasamos otroRealDouble a String
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f); // Pasamos el valor valueOf(1.23456e2f); = float a String
        System.out.println("otroRealStr = " + otroRealStr);
        
        // Conversion Entre Tipos Primitivos
        
        int i = 22768;
        short s = (short)i; // Cast = forzar conversion. Para eso se pone despues del '=' entre parentesis el tipo al que queremos convertir
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println("Valor maximo que puede soportar el Short es de: " + Short.MAX_VALUE);
        
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        char b = (char) i;
        System.out.println("b = " + b);

   }
}


