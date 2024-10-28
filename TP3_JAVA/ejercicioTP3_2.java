/*
Ejercicio 2: Cálculo de salarios semanales
Una empresa desea calcular el salario semanal de sus empleados
basándose en las horas trabajadas y una tarifa fija por hora.
Instrucciones:
 Pide al usuario ingresar la cantidad de empleados.
 Para cada empleado, pide ingresar las horas trabajadas.
 Usa un bucle para calcular el salario de cada empleado (suponiendo
una tarifa fija de $15 por hora).
 */
import java.util.Scanner;

public class ejercicioTP3_2 {

    final static double TARIFA_POR_HORA = 15.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantEmpleados,contador,horasTrabajadas;
        double salario;

        System.out.println("Ingresa la cantidad de empleados:");
        cantEmpleados = Integer.parseInt(input.nextLine());
        contador = 0;   //inicializo el contador

        while (contador < cantEmpleados) {
            System.out.println("Ingresa las horas trabajadas por el empleado " + (contador + 1) + ":");
            horasTrabajadas = Integer.parseInt(input.nextLine());
            salario = horasTrabajadas * TARIFA_POR_HORA;
            System.out.println("El salario del empleado " + (contador + 1) + " es: " + salario+" pesos ");
            contador++;
        }
    }
}
