package com.iamdj;

class Main {

    // Returns value of Binomial Coefficient C(n, k)
    static long binomialCoeff(int n, int k) {
        long res = 1;

        // Since C(n, k) = C(n, n-k)
        if (k > n - k)
            k = n - k;

        // Calculate value of [n*(n-1)*---*(n-k+1)] / [k*(k-1)*---*1]
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }

        return res;
    }

    // A Binomial coefficient based function to find nth catalan number in O(n) time
    static long catalan(int n) {

        // Calculate value of 2nCn
        long c = binomialCoeff(2 * n, n);

        // return 2nCn/(n+1)
        return c / (n + 1);
    }

    // Function to find possible ways to put balanced
    // parenthesis in an expression of length n
    static long findWays(int n)
    {
        // If n is odd, not possible to
        // create any valid parentheses
        if ((n & 1) != 0)
            return 0;

        // Otherwise return n/2'th Catalan Numer
        return catalan(n / 2);
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        int n = 6;
        System.out.println("Total possible expressions of length " +
                n + " is " + findWays(6));
    }
} 