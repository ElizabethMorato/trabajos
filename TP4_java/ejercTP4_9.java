/*Ejercicio 9: Calcular el precio final con descuentos
Una empresa quiere calcular el precio final de sus productos después de
aplicar un descuento general del 10%.
**Instrucciones**:
- Crea un arreglo `preciosOriginales` que almacene el precio original de
varios productos.
- Escribe una función `calcularPrecioFinal` que aplique el descuento a
cada producto y devuelva el precio final.
 */

public class ejercTP4_9 {
    public static void main(String[] args) {
        double [] preciosOriginales = {100.00, 200.00, 300.00, 400.00, 500.00};

        calcularPrecioFinal(preciosOriginales);
    }
    final static double DESCUENTO=0.10;

    public static void calcularPrecioFinal(double[] preciosOriginales) {
        System.out.println("Precios finales con descuento del 10%:");
        double descuento,precioFinal;

        for (double precio : preciosOriginales) {
            descuento = precio * DESCUENTO;
            precioFinal = precio - descuento;
            System.out.println("El precio original es de : $" + precio + " - Descuento: $" + descuento + " = Precio final: $" + precioFinal);
        }
    }
}
