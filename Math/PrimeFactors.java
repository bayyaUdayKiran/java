public class PrimeFactors {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        primeFact(i);
        
    }

    static boolean isPrime(int x){
        if(((x%2==0)&&(x!=2))||((x%3==0)&&(x!=3))) return false;
        for(int i = 2; (i*i)<x; i++){
            if(x%i==0) return false;
        }
        return true;

    }

    static void primeFact(int n){
        for(int i = 2; i<n; i++){
            if(isPrime(i)){
                int x = i;
                while(n%x==0){
                    System.out.println(i);
                    x*=i;//Checking wether n is divisible for the powers of i and if so print i again i.e, 2^3 = 2*2*2...
                }
            } 
        }
    }
}
