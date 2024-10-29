/*Ejercicio 3: Gestión de clientes
Una pequeña empresa de servicios tiene una lista de clientes a los que
debe enviar facturas, pero quiere procesar solo aquellos que tengan
facturas pendientes por más de $500.
**Instrucciones**:
- Crea un arreglo `clientes` que almacene los nombres de los clientes y un
arreglo `facturasPendientes` con el monto de sus facturas pendientes.
- Escribe una función `enviarFacturas` que imprima los nombres de los
clientes con facturas mayores a $500.
 */
public class ejercTP4_3 {
    public static void main(String[] args) {
        String[] clientes = {"Cliente A", "Cliente B", "Cliente C", "Cliente D"};
        double[] facturasPendientes = {600.00, 300.00, 700.00, 400.00};
        enviarFacturas(clientes, facturasPendientes);
    }

    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas mayores a $500:");
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {
                System.out.println(clientes[i] + " - Factura: $" + facturasPendientes[i]);
            }
        }
    }
}
