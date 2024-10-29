/*
Ejercicio 4: Cálculo de descuentos para fidelización
Una empresa ofrece descuentos a sus clientes dependiendo de la cantidad
de compras que han realizado. Si han comprado más de 10 veces, reciben
un 10% de descuento.
**Instrucciones**:
- Crea un arreglo `clientes` y otro `compras` que almacene la cantidad de
compras de cada cliente.
- Escribe una función `calcularDescuentos` que recorra el arreglo y aplique
el descuento a los clientes que califiquen.
¡Claro! Aquí tienes cinco ejercicios adicionales en Java, orientados a
pequeñas empresas y enfocados en bucles y funciones.
 */
public class ejercTP4_4  {
    public static void main(String[] args) {
        String[] clientes = {"Cliente A", "Cliente B", "Cliente C", "Cliente D"};
        int[] compras = {12, 8, 15, 5};
        calcularDescuentos(clientes, compras);
    }

    public static void calcularDescuentos(String[] clientes, int[] compras) {
        System.out.println("Clientes con descuento:");
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                System.out.println(clientes[i] + " - Descuento del 10%");
            }
        }
    }
}
