public class TrailingZeros1 {
    public static void main(String[] args) {
        int arg = Integer.parseInt(args[0]);
        solution(arg);  
    }

    static int power(int b, int p){
        int k = 1;
        for(int i = 1; i<=p; i++){
            k*=b;
        }
        return k;
    }
    
    static int totDigi(int n){
        if(n<1) return 0;
        return 1+totDigi(n/10);
    }
    static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }

    static int check(int n, int x){
        int divisor = 0;
        for(int i = 1; i<x; i++){
            int dividend = power(10, i);
            int fact = n%dividend;
            if(fact==0){
                divisor = dividend;
            }
            
        }
        double d = Math.log10(divisor);
        return (int) d;
 
    }

    static void solution(int i){
        int n = fact(i);
        int x = totDigi(n);
        int res = check(n, x);
        System.out.println(res);

    }
}
