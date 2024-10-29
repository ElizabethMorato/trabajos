/*Ejercicio 7: Descuento por compras grandes
Una tienda de ropa ofrece un 15% de descuento a las compras superiores
a $500.
**Instrucciones**:
- Crea un arreglo `compras` que almacene los montos de las compras de
los clientes.
- Escribe una función `aplicarDescuento` que aplique el descuento a las
compras que superen los $500.
 */
public class ejercTP4_7 {
    public static void main(String[] args) {
        double[] compras = {600.00, 400.00, 700.00, 300.00, 800.00};
        aplicarDescuento(compras);
    }

    public static void aplicarDescuento(double[] compras) {
        System.out.println("Compras con descuento del 15%:");
        for (double compra : compras) {
            if (compra > 500) {
                double descuento = compra * 0.15;
                double total = compra - descuento;
                System.out.println("Compra: $" + compra + " - Descuento: $" + descuento + " - Total: $" + total);
            }
        }
    }
}
