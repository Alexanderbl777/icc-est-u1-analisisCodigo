import java.util.Random;

public class BenchMarking {
    private MetodosOrdenamiento mO;
    public BenchMarking(){

        
        long currentMilles = System.currentTimeMillis();
        long currentName = System.nanoTime();
        mO = new MetodosOrdenamiento();
        int[] arreglo = generarArregloAleatorio(1000);
        Runnable tarea =()-> mO.burbujaTradicional(arreglo);
        double tiempoDuracionMili = medirConCurrentMilles(tarea);
        double tiempoDuracionNano = medirConCurrentTime(tarea);
        System.out.println(currentMilles);
        System.out.println(currentName);
        System.out.println("Tiempo en mili segundos: "+ tiempoDuracionMili+" Tiempo duracion en nano Segundos: "+ tiempoDuracionNano);
    }

    public int[] generarArregloAleatorio(int tamanio){
        int[] arreglo = new int[tamanio];
        Random random = new Random();
        for(int i =0; i< tamanio; i++){
            arreglo[i]= random.nextInt(100000000);
        }
        return arreglo;
    }

    public double medirConCurrentMilles(Runnable tarea){
        long inicio = System.currentTimeMillis();
        tarea.run();
        long fin = System.currentTimeMillis();
        double tiempoSegundos = (fin-inicio)/1000.0;
        return tiempoSegundos;
    }

    public double medirConCurrentTime(Runnable tarea){
        long inicio = System.nanoTime();
        tarea.run();
        long fin = System.nanoTime();
        double tiempoSegundos = (fin-inicio)/1_000_000_000.0;
        return tiempoSegundos;
    }
}
