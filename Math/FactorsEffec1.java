public class FactorsEffec1 {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        factors(i);
        
    }

    static void factors(int n){
        int almega = 0;
        for(int i = 1; i*i<=n; i++){
            if(n%i==0) System.out.println(i);
            //if(i!=(n/i)) System.out.println(n/i);
            almega = i;
        }

        for(int i = almega; i>=1; i--){
            if(n%i==0) System.out.println(n/i);
        }

        
    }
}
