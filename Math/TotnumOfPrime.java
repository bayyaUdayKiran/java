public class TotnumOfPrime {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        solution(i);

    }  

    static boolean isPrime(int x){
        if(((x%2==0)&&(x!=2))||((x%3==0)&&(x!=3))) return false;
        for(int i = 2; (i*i)<x; i++){
            if(x%i==0) return false;
        }
        return true;
    }
    
    static void solution(int n){
        for(int i = 2; i<=n; i++){
            if(isPrime(i)) System.out.println(i);
        }

    }
}
