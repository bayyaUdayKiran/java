public class Factors {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        factors(i);
        
    }

    static void factors(int n){
        for(int i = 1; i<=n; i++){
            if(n%i==0) System.out.println(i);
        }
    }
}
