
// Fibonacci Series using Dynamic Programming:
class Main {

    static int fibonacci(int n) {
        /* Declare an array to store Fibonacci numbers. */
        int[] f = new int[n+2]; // case, n = 0
        int i;

        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) {
       /* Add the previous 2 numbers in the series and store it */
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }

    
    public static void main (String... args) {

        int n = 9;
        int result = fibonacci(n);

        System.out.println(result);


    }
} 