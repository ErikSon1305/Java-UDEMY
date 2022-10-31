import java.sql.SQLOutput;
import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

       /* String [] usernames = new String[2];
        String [] passwords = new String[2];
        usernames [0] = "Erik";
        passwords [0] = "12345";

        usernames [1] = "admin";
        passwords [1] = "12345"; */

        String [] usernames = {"Erik", "admin", "andres"};
        String [] passwords = {"123", "1234", "12345"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el username: ");
        String usuario = sc.nextLine();

        System.out.println("Ingrese el password: ");
        String passwordd = sc.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(usuario) && passwords[i].equals(passwordd)){
                esAutenticado = true;
                break;
            }
        }

        if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(usuario).concat(" !"));
        } else {
            System.out.println("Username o contraseña incorrecto!");
            System.out.println("Lo siento, requiere autenticación");
        }
    }
}
