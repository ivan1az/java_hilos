public class App {

    public static int h= 3;
    public static int n= 10;
    public static int x= 1;
     
    public static void main(String[] args) throws Exception {
        //matriz resultado
        double[] r = new double[h];
        Thread [] t = new Thread [h];
        
        //iniciamos nuestro arreglo de hilos
        for(int i=0;i<h;i++)
        {
            t[i]= new Thread(new Exponencial(i,n,x,r));
        }

        //creamos los hilos
        for(int i=0;i<h;i++)
        {
            t[i].start();
        }

        //esperamos a los hilos
        for(int i=0;i<h;i++)
        {
            t[i].join();
        }

        //imprimimos el resultado y lo sumamos
        double sumaresultadoHilos=0;
        for(int i=0;i<r.length;i++)
        {
            System.out.println("Hilo"+i + "es: "+r[i]);
            sumaresultadoHilos+= r[i];
        }
        System.out.println("La suma total es: "+ sumaresultadoHilos);
    }
}

