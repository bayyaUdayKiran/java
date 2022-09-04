/*
 * As we already know that (a*b) = gcd(a, b) * lcm(a, b).
 * By this we can convey that lcm(a, b) = (a*b)/gcd(a, b).
 */

public class LcmEffec {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(lcm(a, b));
        
    }
    static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    static int lcm(int a, int b){
        return (a*b)/gcd(a, b);
    }
}
