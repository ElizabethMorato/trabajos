/*Ejercicio 8: Control de horas trabajadas
Una empresa de servicios necesita llevar el control de las horas trabajadas
por sus empleados durante una semana.
**Instrucciones**:
- Crea un arreglo `empleados` con los nombres de los empleados y otro
arreglo `horasTrabajadas` con las horas trabajadas en la semana.
- Escribe una función `calcularPagoSemanal` que calcule el pago semanal
(a razón de $15 por hora trabajada).
 */
public class ejercTP4_8 {
    public static void main(String[] args) {
        String[] empleados = {"Empleado A", "Empleado B", "Empleado C", "Empleado D"};
        int[] horasTrabajadas = {40, 35, 45, 50};
        calcularPagoSemanal(empleados, horasTrabajadas);
    }
    final static double TARIFA_POR_HORA = 15.0;

    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
       double pago;

        System.out.println("Pago semanal de los empleados:");
        for (int i = 0; i < empleados.length; i++) {
            pago = horasTrabajadas[i] * TARIFA_POR_HORA;
            System.out.println(empleados[i] + " - Pago semanal es de : $" + pago);
        }
    }
}
