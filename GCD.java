package OlkaGCD;

public class GCD {

    public static String getGcd(int[] input) {
        int prevgcd = input[0];
        for (int i = 1; i < input.length; i++) {
            if (prevgcd > input[1]) {
                prevgcd=gcdRecursive(prevgcd, input[i]);
            }else{
                prevgcd=gcdRecursive(input[i],prevgcd);
            }
        }
        return String.valueOf(prevgcd);
    }

    public static int gcdRecursive(int bigger, int smaller) {
        int remainder = bigger % smaller;
        if (remainder == 0) {
            return smaller;
        } else {
            return gcdRecursive(smaller, remainder);
        }
    }
}