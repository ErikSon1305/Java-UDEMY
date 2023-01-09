import java.sql.SQLOutput;
import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {
    public static void main(String[] args) {

        double [] claseMatematicas, claseHistoria, claseLenguaje;
        int sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 notas  de estudiantes para matematicas:");
        for (int i = 0; i < claseMatematicas.length; i++){
            claseMatematicas[i] = s.nextDouble();
        }
        System.out.println("Ingrese 7 notas  de estudiantes para historia:");
        for (int i = 0; i < claseHistoria.length; i++){
            claseHistoria[i] = s.nextDouble();
        }
        System.out.println("Ingrese 7 notas  de estudiantes para lenguaje:");
        for (int i = 0; i < claseLenguaje.length; i++){
            claseLenguaje[i] = s.nextDouble();
        }

        for (int i  = 0; i < 7; i++){
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematicas = (sumNotasMatematicas / claseMatematicas.length);
        double promedioHistoria = (sumNotasHistoria / claseHistoria.length);
        double promedioLenguaje = (sumNotasLenguaje / claseLenguaje.length);

        System.out.println("Promedio de clase Matematicas: " +  promedioMatematicas);
        System.out.println("Promedio de clase Historia: " + promedioHistoria);
        System.out.println("Promedio de clase de Lenguaje: " +  promedioLenguaje);
        System.out.println("Promedio total del curso: " + ((promedioMatematicas + promedioHistoria + promedioLenguaje) / 3) );


        System.out.println("Ingrese el identificador del alumno (de 1 - 7) : ");
        int id = s.nextInt();
        double promedioAlumno = (claseHistoria[id-1] + claseMatematicas[id-1] + claseLenguaje[id-1]) / 3;
        System.out.println("Promedio alumno Num:" + id + " es de = " + promedioAlumno);

    }
}
