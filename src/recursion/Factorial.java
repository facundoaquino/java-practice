package recursion;

public class Factorial {
    public static void main(String[] args) {


        int result = Factorial.factorialRecursion(5);
        System.out.println("result = " + result);
    }

    private static int factorialRecursion( int n) {

        if(n-1 == 0) {
            return 1;
        }

        return Factorial.factorialRecursion(n-1) * n;
    }
}
