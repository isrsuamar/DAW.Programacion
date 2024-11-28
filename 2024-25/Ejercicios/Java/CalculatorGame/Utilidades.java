public class Utilidades 
{
      // Método para comprobar si un número está en un array
      public static boolean comprobarNumeroExisteEnArray(int[] numeros, int numero, int longitud) {
        for (int i = 0; i < longitud; i++) {
            if (numeros[i] == numero) {
                return true;
            }
        }
        return false;
    }

    // Método para agregar un número al array
    public static int[] insertarNumeroEnArray(int[] array, int nuevoNumero, int longitud) {
        array[longitud] = nuevoNumero;
        return array;
    }

    // Método para obtener números relacionados según la disposición de la calculadora
    public static int[] obtenerNumerosRelacionados(int numero) {
        switch (numero) {
            case 1: return new int[]{2, 3, 4, 7};
            case 2: return new int[]{1, 3, 5, 8};
            case 3: return new int[]{1, 2, 6, 9};
            case 4: return new int[]{1, 5, 6, 7};
            case 5: return new int[]{2, 4, 6, 8};
            case 6: return new int[]{3, 4, 5, 9};
            case 7: return new int[]{1, 4, 8, 9};
            case 8: return new int[]{2, 5, 7, 9};
            case 9: return new int[]{3, 6, 7, 8};
            default: return new int[]{};
        }
    }
}
