import java.util.concurrent.Semaphore;

public class App {
    public static void main(String[] args) throws InterruptedException {
        int numHilos = 5;
        Semaphore[] semaphores = new Semaphore[numHilos];
        for (int i = 0; i < numHilos; i++) {
            semaphores[i] = new Semaphore(0);
        }
        semaphores[0].release(); // Iniciar el primer hilo

        Hilos[] hilos = new Hilos[numHilos];
        for (int i = 0; i < numHilos; i++) {
            hilos[i] = new Hilos(i, semaphores);
            hilos[i].start();
        }

        for (int i = 0; i < numHilos; i++) {
            hilos[i].join();
        }

        // Mostrar la salida del hilo número 4
        System.out.println("Salida del hilo número 4: " + hilos[4].getValue());
    }
}