import java.util.Arrays;
import java.util.Scanner;

class Pruebas
{
    static void listar(String encabezado, int[] elementos) {
        System.out.println(encabezado);
        if (elementos.length == 0) return;
        System.out.print(elementos[0]);
        for (int n = 1; n < elementos.length; n++) System.out.print(", " + elementos[n]);
        System.out.println();
    }

    public static void main(String[] args) {
        int n1, n2, i3 = 0;
        //Zona codigo 
        Scanner in = new Scanner (System.in);
        System.out.println("Ingrese tamaño del arreglo A");
        n1 = in.nextInt();
        System.out.println("\nIngrese tamaño del arreglo B");
        n2 = in.nextInt();

        /* Matrices de datos */
        int[] v1 = new int[n1], v2 = new int[n2], v3 = new int[n1 + n2];

        //Lleno arreglo A
        System.out.println("\nArreglo A: ");
        for (int i = 0; i < n1; i++) {
            v1[i] = (int)Math.floor(Math.random()*50+1);
            /* Agregamos a la matriz final el elemento */
            v3[i3++] = v1[i];
        }
        listar("Listado A sin ordenar", v1);
        Arrays.sort(v1);
        listar("Listado A ordenado", v1);

        for (int i = 0; i < n2; i++) {
            v2[i] = (int)Math.floor(Math.random()*50+1); 
            /* Agregamos a la matriz final el elemento */
            v3[i3++] = v2[i];
        } 
        listar("Listado B sin ordenar", v2);
        Arrays.sort(v2);
        listar("Listado B ordenado", v2);

        listar("Listado COMPLETO sin ordenar", v3);
        Arrays.sort(v3);
        listar("Listado COMPLETO ordenado", v3);
        in.close();
    }
}