public class App {
    public static void main(String[] args) throws Exception {
        //crear una instancia de HiloR
        HiloR hiloR = new HiloR();
        
        // crear un hilo pasando la instancia de HiloR
        Thread hilo = new Thread(hiloR);

        //inciar hilo
        hilo.start();

        //mensaje del hilo principal
        System.out.println("Hilo principal en ejecucion");
    }
}
