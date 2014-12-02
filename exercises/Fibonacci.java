
public class Fibonacci
{
    private long[] fib = new long[40];

    public Fibonacci()
    {
        fill();
    }

    public void fill(){
        fib[0] = 0;
        fib[1] = 1;

        for(int n = 2; n<fib.length; n++){
            // fib[2] = fib[0]+fib[1];
            // fib[3] = fib[1]+fib[2];
            fib[n] = fib[n-2]+fib[n-1];
        }

        
    }
    public void print(){
        System.out.println("hallo");
        for(int i = 0;i<fib.length;i++){
            System.out.println("Fib "+i+": "+fib[i]);
        }
    }
   
}
