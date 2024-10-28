/*
Ejercicio 3: Control de inventario
Una tienda necesita revisar el inventario de sus productos y determinar si
algún artículo tiene menos de 5 unidades disponibles para realizar un
pedido.
Instrucciones:
 Pide al usuario ingresar el número de productos.
 Usa un bucle para ingresar la cantidad disponible de cada producto.
 Si algún producto tiene menos de 5 unidades, muestra un mensaje
indicando que es necesario realizar un pedido.
 */
import java.util.Scanner;

public class ejercicioTP3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numProductos,cantDisponible;

        System.out.println("Ingresa el número de productos:");
        numProductos = Integer.parseInt(input.nextLine());

        for (int i = 0; i < numProductos; i++) {
            System.out.println("Ingresa la cantidad disponible del producto " + (i + 1) + ":");
            cantDisponible = Integer.parseInt(input.nextLine());
            if (cantDisponible < 5) {
                System.out.println("Es necesario realizar un pedido para el producto " + (i + 1) );
            }
        }
    }
}
