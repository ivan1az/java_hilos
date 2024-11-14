public class Exponencial implements Runnable{
    private int id,n,x;
    private double[] r;
    
    public Exponencial (int id, int n, int x, double[]r)
    {
        this.id=id;
        this.n=n;
        this.x=x;
        this.r=r;
    }

    public int potencia(int b, int e)
    {
        int resultado=1;
        for(int i=0;i<e;i++)
        {
            resultado *=b;
        }

        return resultado;
    }

    public int factorial (int f)
    {
        int resultado=1;
        if(!(f==0))
        {
            for(int i=1;i<=f;i++)
            {
                resultado *=i;
            }
        }

        return resultado;
    }

    @Override
    public void run()
    {
        double sumaparcial=0;
        int h= r.length;
        int p= n+1;
        int b= p/h;
        int inicio = id*b;
        int fin = inicio+b;
        //int modulo =p%h;

        for(int i=inicio;i<fin;i++)
        {
            sumaparcial +=((potencia (x,i)/(double)factorial(n-id)));
        }
        r[id]=sumaparcial;
    }

}
