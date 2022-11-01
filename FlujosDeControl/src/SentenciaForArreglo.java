import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String [] nombres = {"Erik", "Sven", "Gemma", "Francisco"};

        int count = nombres.length;

        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase("gemma") ||
               nombres[i].equalsIgnoreCase("erik")){
                continue;
            }
            System.out.println(i + ".- " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Sven\" o \"Francisco\" :");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++){

            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema!");
        }


    }
}
