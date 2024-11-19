/*
* Una matriz mágica es una matriz cuadrada en la que la suma de los números en cada fila, cada columna 
* y ambas diagonales principales es la misma. En otras palabras, todos los totales suman lo mismo. 
* 
* Para que una matriz sea considerada mágica, se deben cumplir las siguientes condiciones:

*  - La suma de los elementos en cada fila debe ser igual.
*  - La suma de los elementos en cada columna debe ser igual.
*  - La suma de los elementos en la diagonal principal (de izquierda a derecha) debe ser igual.
*  - La suma de los elementos en la diagonal secundaria (de derecha a izquierda) debe ser igual.
* 
* Todos los elementos de la matriz deben ser números enteros positivos y distintos.
* 
*          
*       8  1  6
        3  5  7
        4  9  2
*/
public class MatrizMagica
{
    public static void main(String[] args) 
    {
        // int[][] matriz = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };
        int[][] matriz = { { 16, 21, 10 }, { 5, 6, 26 }, { 40, 90, 22 } };

        boolean magica = true;

        int tamanyoMatriz = matriz.length;

        int[] sumas = new int[tamanyoMatriz * 2 + 2];

        for (int i = 0; i < tamanyoMatriz; i++) 
        {
            for (int j = 0; j < tamanyoMatriz; j++) {
                // SUMAS DE FILAS
                // (posiciones: 0-2 => sumas de las filas) => i = 0; sumas[0] = 15
                sumas[i] = sumas[i] + matriz[i][j];

                // SUMAS DE COLUMNAS
                sumas[i + tamanyoMatriz] += matriz[j][i];

                // SUMA DE DIAGONAL PRINCIPAL
                if (i == j) {
                    sumas[tamanyoMatriz * 2] += matriz[i][j];
                }

                // SUMA DE DIAGONAL SECUNDARIA
                if (i + j == tamanyoMatriz - 1) {
                    sumas[tamanyoMatriz * 2 + 1] += matriz[i][j];
                }
            }
        }
        
        int sumaPrimeraFila = sumas[0];

        for (int i = 1; i < sumas.length; i++) 
        {
            if(sumas[i] != sumaPrimeraFila)
            {
                magica = false;
                break;
            }    
        }

        // Devolver el resultado si la matriz es o no mágics
        if(magica)
        {
            System.out.println("La matriz es magica.");
        }
        else
        {
            System.out.println("La matriz no es magica");
        }
        
    }
}