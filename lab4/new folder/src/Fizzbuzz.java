public class Fizzbuzz{
    public static void main(String[] args) 
  {
    fizzBuzz(100);
  }
    
    public void fizzbuzz(){
        fizzbuzz(1, 100);
    }

    public void fizzbuzz(int n){
        for (int i = 1; i <= n; i++) 
    {
        if(((n % 3) == 0) && ((n % 5 ==0))){
            System.out.println("FizzBuzz");
        }
        else if((n % 3) == 0){
            System.out.println("Fizz");
        }
        else if(n % 5 ==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(n);
        }
    }
    }
    public void fizzbuzz(int n, int m){
        int[] array = {n, m}; 
        return fizzbuzz(x);
    }
}