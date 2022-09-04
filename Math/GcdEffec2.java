/*
 * Actually, the Modular Euclidean algorithm works logically similar to the non-mod algo..
 * Considering the equation "a = bq + r", where a = dividend, b = divisor, q = quotient & r = remainder..
 * If, a > b then a % b = (a - b)
 * And if, a < b then a % b = a
 * So whenever a > b, the next immediate recursive calls arg 'b' becomes the difference of a & b i.e, (a-b) and this is passed as 'a' for the next coming recursive call, this process is perfectly similar to a = (a-b), when a>b...
 * And whenever a < b, the next immediate recursive calls arg 'b' becomes 'a' of the current recursive call (since, a % b = a, when a < b) and this is as usually gets passed to the a of the next recursive call.. 
 */
public class GcdEffec2{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(gcd(a, b));
        
    }
    static int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b, a%b);
    }
}