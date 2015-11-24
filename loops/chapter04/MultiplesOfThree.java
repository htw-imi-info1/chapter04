
public class MultiplesOfThree
{
    public static void loopFor(){
        for(int n = 3; n <= 100;n+=3){
            System.out.println(n);
        }
    }
     public static void loopFor(int max){
        for(int n = 3; n <= max;n+=3){
            System.out.println(n);
        }
    }

    public static void loopWhile(){
        int n = 3;
        while(n <= 100){
            System.out.println(n);
            n= n +3;
        }
    }
}
