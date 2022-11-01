public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14, j = 8, k = 20;

        double promedio = (i + j + k) / 3; // La división siempre tiene prioridad debemos poner parentesis para especificar la prioridasd.
        System.out.println("promedio = " + promedio);

        promedio = i + j + k / 3d * 10; /* Primero divide, despues ultiplica y despues suma. Pero simplemente porque si encuentra una division o una multiplicacion
                                            lo que encuentre primero lo hara y depues sumara */

        promedio = ++i + j-- + k / 3d * 10; // 
    }
}
