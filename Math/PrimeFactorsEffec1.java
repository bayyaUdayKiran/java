public class PrimeFactorsEffec1 {
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
        if(n<=1) return;
        for(int i = 2; i*i<=n; i++){
            if(!(isPrime(i))) continue;
            while(n%i==0){
                System.out.println(i);
                n/=i;
            }
        }

        if(n>1) System.out.println(n);
    }
}
