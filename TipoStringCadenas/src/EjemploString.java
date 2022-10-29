public class EjemploString {
    public static void main(String[] args) {

        String curso = "Programación Java"; // Creacion de forma literal, implicita
        String curso2 = new String("Programación Java"); // Creacion de forma explicita
        String curso2Min = new String("programación java");

        boolean esIgual = curso == curso2; // Compara si el objecto es el mismo
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equals(curso2); // Compara el valor de los objetos, true si son exactamente iguales
        System.out.println("curso.equals(curso2) = " + esIgual);
        
        esIgual = curso.equalsIgnoreCase(curso2Min); // Compara el valor de los objectos sin importar mayusculas o minusculas
        System.out.println("curso.equalsIgnoreCase(curso2Min) = " + esIgual);
        
        String curso3 = "Programación Java";
        esIgual = curso == curso3; // Compara y como sabe que es el mismo objeto literal pero en distintas variables que tienen el mismo contenido por lo que es true
        System.out.println("curso == curso3 = " + esIgual);
    }
    
}
