public class HiloR implements Runnable{
    @Override
    
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("Hilo desde hiloR en ejecuciopm"+i);
            try {
                Thread.sleep(1000);                
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido");            }
        }
    }

}