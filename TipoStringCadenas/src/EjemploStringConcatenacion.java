public class EjemploStringConcatenacion {
    public static void main(String[] args) {

        String curso = "Programación Java"; // Creacion de forma literal, implicita
        String profesor = "Erik Stuffmann";
        
        String detalle = curso + " con el instructor " + profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(numeroA+numeroB + detalle);
        
        String detalle2 = curso.concat(" ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);
    }
    
}
