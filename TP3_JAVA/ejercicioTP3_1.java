/* Ejercicio 1: Cálculo del tiempo dedicado a cada actividad
Un alumno quiere medir el tiempo total que dedica a sus actividades
académicas y personales durante el día.
Instrucciones:
 Pide al usuario que ingrese las horas dedicadas a cada actividad:
estudiar, hacer ejercicios, leer, y tiempo libre.
 Usa un bucle para registrar las horas y luego calcula el tiempo total
dedicado.
 */

import java.util.Scanner;

public class ejercicioTP3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalHoras = 0;
        int actividades = 4;
        int contador = 0;

        while (contador < actividades) {
            System.out.println("Ingresa las horas dedicadas a la actividad " + (contador + 1) + ":");
            int horas =Integer.parseInt(input.nextLine());
            totalHoras += horas;
            contador++;
        }

        System.out.println("El tiempo total dedicado a las actividades es: " + totalHoras + " horas.");
    }
}

