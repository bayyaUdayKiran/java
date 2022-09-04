public class Prime {
    public static void main(String[] args) {
        int arg = Integer.parseInt(args[0]);
        System.out.println(isPrime(arg));
        
    }

    static boolean isPrime(int x){
        if(x == 1) return false;
        for(int i = 2; i<x; i++){
            if(x%i==0) return false;
        }
        return true;
    }
    
}
