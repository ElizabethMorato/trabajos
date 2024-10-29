/*Ejercicio 6: Cálculo de impuestos
Una pequeña empresa debe calcular el impuesto de venta para cada una
de las facturas emitidas.
**Instrucciones**:
- Crea un arreglo `facturas` con los montos de las facturas de los clientes.
- Escribe una función `calcularImpuesto` que aplique un 21% de impuesto
a cada factura.
 */
public class ejercTP4_6 {
    public static void main(String[] args) {
        double[] facturas = {100.00, 200.00, 300.00, 400.00, 500.00};
        calcularImpuesto(facturas);
    }

    public static void calcularImpuesto(double[] facturas) {
        System.out.println("Facturas con impuesto del 21%:");
        for (double factura : facturas) {
            double impuesto = factura * 0.21;
            double total = factura + impuesto;
            System.out.println("Factura: $" + factura + " - Impuesto: $" + impuesto + " - Total: $" + total);
        }
    }
}
