public class SentenciasSwitchCase {
    public static void main(String[] args) {

        int num = 1;
        switch (num){
            case 0:
                System.out.println("El numero es cero");
                break;
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
        }

        String nombre = "Erik";

        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido!");
                break;
            case "Erik":
                System.out.println("Hola " + nombre + " , bienvenido!");
                break;
        }
    }
}
