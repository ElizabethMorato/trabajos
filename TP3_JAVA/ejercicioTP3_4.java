/*
Ejercicio 4: Registro de ventas diarias
Una tienda desea registrar las ventas realizadas cada día durante una
semana. El programa debe calcular el total de ventas al final de la semana.
Instrucciones:
 Usa un bucle para registrar las ventas diarias durante 7 días.
 Al final del bucle, muestra el total de ventas de la semana.
 */

import java.util.Scanner;

public class ejercicioTP3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalVentas,ventasDiarias;

        totalVentas = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Ingresa las ventas del día " + (i + 1) );
            ventasDiarias = Double.parseDouble(input.nextLine());
            totalVentas += ventasDiarias;
        }

        System.out.println("Total de ventas de la semana es de : " + totalVentas+ "pesos");
    }
}
