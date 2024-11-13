public class App {
    public static void main(String[] args) throws Exception {
        //crear una instancia de HiloR
        HiloR hiloR = new HiloR();
        
        // crear un hilo pasando la instancia de HiloR
        Thread hilo = new Thread(hiloR);

        //inciar hilo
        hilo.start();

        try {
            //Esperar a que el hilo termine antes de continuar
            hilo.join();
        } catch (InterruptedException e) {
            System.out.println("El hilo principal fue interrumpido");
        }

        //mensaje del hilo principal
        System.out.println("Hilo principal continua despues de que HiloR ha terminado");
    }
}
