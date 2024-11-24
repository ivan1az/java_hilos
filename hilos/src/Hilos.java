import java.util.concurrent.Semaphore;

public class Hilos extends Thread {
    private int id;
    private static int data;
    private static Semaphore[] semaphores;

    public Hilos(int id, Semaphore[] semaphores) {
        this.id = id;
        Hilos.semaphores = semaphores;
    }

    @Override
    public void run() {
        try {
            semaphores[id].acquire();
            if (id == 0) {
                data = (int) (Math.random() * 100);
                System.out.println("Hilo " + id + " generó el número: " + data);
            } else {
                System.out.println("Hilo " + id + " recibió el número: " + data);
            }
            semaphores[(id + 1) % semaphores.length].release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}