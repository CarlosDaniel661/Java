package arreglos;

public class ArreglosUnidimensionales {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(" El tamaño del arreglo es: " + array.length );
        System.out.println("Acceder al valor de la posición 3 " + array[2]);


        boolean array2 [] = new boolean[6];
        System.out.println("Valor de la posición 1: " + array2[0]);

        //Cambiar el valor del elemento de una posición:

        array[0] = 100;
        System.out.println("El valor de la posición 1 es: " + array[0]);


        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento: " + i);
            System.out.println("Valor: " + array[i]);

        }
    }
}
