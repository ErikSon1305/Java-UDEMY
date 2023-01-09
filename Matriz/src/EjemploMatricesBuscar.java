public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        int[][] matrizDeEnteros = { {1,50,65,19}, {20,21,22,23}, {50,55,60,77} };

        int elementoBuscar = 77;
        boolean encontrado = false;
        int i;
        int j = 0;

        buscar: for (i = 0; i < matrizDeEnteros.length; i++){
                    for (j = 0; j < matrizDeEnteros[i].length; j++){
                        if (matrizDeEnteros[i][j] == elementoBuscar){
                            encontrado = true;
                             break buscar;
                        }
                    }
                }
        String mensaje = "Encontrado " + elementoBuscar +  " en las coordenadas: " + i + "," + j;
        if (encontrado){
            System.out.println(mensaje);
        }else {
            System.out.println(elementoBuscar + " no se encontró en la matriz!");
        }


    }
}
