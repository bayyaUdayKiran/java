/*
 * All the factors of the number will always exists in pairs i.e, 8 = (1, 8), (2, 4).
 * So besides considering 4 factors while computing the solution we could consider the pairs that makes 2 factors to be counted as 1 pair, reducing the time complexity from 'n' to '√n'.
 * And considering few base case checks like if the number is divisible by 2 or 3, then the number would never be a prime.(except for the numbers 2 & 3)
 */
public class PrimeEffec {
    public static void main(String[] args) {
        int arg = Integer.parseInt(args[0]);
        System.out.println(isPrime(arg));
        
    }
    static boolean isPrime(int x){
        if(((x%2==0)&&(x!=2))||((x%3==0)&&(x!=3))) return false;
        for(int i = 2; (i*i)<x; i++){
            if(x%i==0) return false;
        }
        return true;

    }
}
