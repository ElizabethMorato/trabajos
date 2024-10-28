/*
Ejercicio 5: Cálculo de horas extras
Una empresa desea calcular las horas extras trabajadas por sus
empleados. Si un empleado trabaja más de 40 horas en la semana, las
horas adicionales se consideran horas extras.
Instrucciones:
 Pide al usuario ingresar el número de empleados.
 Usa un bucle para ingresar las horas trabajadas por cada empleado.
 Si un empleado trabajó más de 40 horas, calcula y muestra las horas
extras.
 */
import java.util.Scanner;

public class ejercicioTP3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numEmpleados,contador,horasTrabajadas,horasExtras;

        System.out.println("Ingresa el número de empleados:");
        numEmpleados = Integer.parseInt(input.nextLine());
        contador = 0;

        do {
            System.out.println("Ingresa las horas trabajadas por el empleado " + (contador + 1) + ":");
            horasTrabajadas = Integer.parseInt(input.nextLine());
            if (horasTrabajadas > 40) {
                horasExtras = horasTrabajadas - 40;
                System.out.println("El empleado " + (contador + 1) + " trabajo " + horasExtras + " horas extras.");
            }
            contador++;
        } while (contador < numEmpleados);
    }
}

