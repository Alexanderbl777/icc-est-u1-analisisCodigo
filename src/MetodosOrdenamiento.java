import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado:
    //Error en el return, debe devolver un tipo  de datp int[]
    //Solucion retorna un arreglo
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    

    // Método de burbuja tradicional con errores
    // Error encontrado:
    // Esta de manera descendente
    // cambiar ek operador para que ordene de manera ascendente

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }
    

    // Método de burbuja tradicional con errores
    // Error encontrado:
    //El segundo for tiene un error al que intentar comparar con un areglo fuera del limite
    // Restar al arreglo del segundo for i y 1
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }

    
    // Método de selección con errores
    // Error encontrado:
    // No tiene un return que retorno el arreglo
    // Retornanr el arreglo 
    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }

        return arreglo;

    }

    

    // Método de selección con errores
    // Error encontrado:
    // Error1 el segundo for esta disminuyendo j por el operador --
    // Solucion incrementar j++ para que vaya de uno en uno 
    // Error2 el indice es igual a el areglo j pero el arreglo j es con el cual debe comparar
    // Solucion en este caso si es j-- q va en en menos 1
    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j--;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    
    // Método de selección con errores
    // Error encontrado:
    // No se ordena correctamente los arreglos, se repite una variable  
    // solucion el arreglo con indice i es igual al arreglo con el indice menor.
    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[i];
            arreglo[i] = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = smallerNumber;
        }
        return arreglo;
    }

    
    // Método de inserción con errores
    // Error encontrado:
    // Se ordena de manera descendente 
    // Cambiar el signo de comprarcion para q se ordene de manera ascendente, >= y >
    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i+1] = arreglo[i];
                i--;
            }
            arreglo[i+1] = key;
        }
        return arreglo;
    }

   
    // Método de inserción con errores
    // Error encontrado:
    // El segundo for esta todo con respecto al arreglo j
    // Modificar el arreglo con i para mejor comparacion
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int actual = arreglo[j];

            int i = j - 1;
            for (; i >= 0 && arreglo[i] > actual; i--) {
                arreglo[i + 1] = arreglo[i];
            }
            arreglo[i+1] = actual;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:
    // Primer error la variable i es igual al areglo j 
    // debe ser igual a ael arreglo j -1 para poder comparar 
    // el orden del arreglo esta mal debe usarrse los operados >= y < para ordenar de manera ascendente 
    // el i se incrementa en 1
    // el i debe ir i-- 
    // retorna un arreglo que no es el adecuado
    // retornar el arreglo que se esta ordenando
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j-1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

}
