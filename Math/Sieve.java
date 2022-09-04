import java.util.Arrays;
public class Sieve {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n];
        solution(arr, n);
        
    }

    static boolean isPrime(int x){
        if(((x%2==0)&&(x!=2))||((x%3==0)&&(x!=3))) return false;
        for(int i = 2; (i*i)<x; i++){
            if(x%i==0) return false;
        }
        return true;

    }

    static void manipulate(boolean arr[], int n){
        for(int i = 2; (i*i)<n; i++){
            if(isPrime(i)){
                for(int j = i; (i*j)<n; j++){
                    int k = i*j;
                    arr[k] = false;
                }
            }
        }
    }

    static void solution(boolean arr[], int n){
        Arrays.fill(arr, true);
        manipulate(arr, n);
        for(int i = 2; i<n; i++) if(arr[i]) System.out.println(i);
        
        

    }
}
