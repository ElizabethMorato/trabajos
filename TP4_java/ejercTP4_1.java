/*Ejercicio 1: Cálculo de ingresos mensuales
Una pequeña tienda registra sus ventas diarias en un arreglo. Se necesita
escribir una función que use un bucle para calcular los ingresos totales
mensuales.
**Instrucciones**:
- Crea un arreglo `ventas` que almacene las ventas diarias de una tienda
durante 30 días.
- Escribe una función `calcularIngresosMensuales` que recorra el arreglo y
sume las ventas.
- Imprime el total de ingresos mensuales.

 */
public class ejercTP4_1 {
    public static void main(String[] args) {
        double[] ventas = new double[30];

        // Asignar valores a las ventas diarias
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = Math.random() * 1000; // Ejemplo de valores aleatorios
        }

        double ingresosMensuales = calcularIngresosMensuales(ventas);
        System.out.println("El total de ingresos mensuales es: $" + ingresosMensuales);
    }

    public static double calcularIngresosMensuales(double[] ventas) {
        double total;

        total = 0;
        for (double venta : ventas) {
            total += venta;
        }
        return total;
    }

}