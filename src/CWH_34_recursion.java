public class CWH_34_recursion {
    // factorial(n) = n * n-1 * n-2 * ... * 1
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    // factorial(0) = 1
    // factorial(n) = n * factorial(n-1)
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            int product = 1;
            for (int i = 1; i <= n; i++) { // 1 to n
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("The value of factorial n is: "+ factorial(n));
        System.out.println("The value of factorial n is: "+ factorial_iterative(n));

    }
}
