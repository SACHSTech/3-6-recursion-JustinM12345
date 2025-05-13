package recursion;

public class SumOfDigits {
    public static int sumofDigits(int n){
        // base case
        if (n == 0){
            return n;
        }
        
        // recursive case
        return n % 10 + sumofDigits(n/10);
    }

    public static void main(String[] args){
        System.out.println(sumofDigits(1234));
    }
}
