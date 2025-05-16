package recursion;

public class ToBinary {
    public static String toBinary(int n){
        // base case
        if (n == 0){
            return "";
        }

        if (n%2 == 0){
            return toBinary(n/2) + "0";
        }
        else {
            return toBinary(n/2) + "1";
        }
    }

    public static void main(String[] args){
        System.out.println(toBinary(45));
    }
}

