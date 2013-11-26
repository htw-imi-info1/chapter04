
/**
 * Write a description of class ArrayExercises here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayExercises
{
    public ArrayExercises()
    {
    }

    public void printArrayWithForEach(int[] anArray){
        for(int number : anArray){
            System.out.println(number);
        }
    }
    public void printArray(int[] anArray){
        for(int i = 0; i < anArray.length; i++){
            System.out.println(i+": "+anArray[i]);
        }
    }

    public void printArray(){
        int[] numbers = { 4, 1, 22, 9, 14, 3, 9};
        printArray(numbers);
    }

    public int[] computeFibs(){
        int[] fib = new int[20];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++){
            fib[i] = fib[i-2]+fib[i-1];
        }
        return fib;
    }

    public void printFibs(){
        printArray(computeFibs());
    
    }
}
