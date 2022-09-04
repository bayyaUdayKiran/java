public class TrailingZeros2 {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        solution(i);
         
    }
    static int fact(int n){
        int res = 1;
        for(int i = 1; i<n; i++){
            res*=i+1;
            System.out.println(res);
        }
        return res;
       
    } 

    static int check(int n){
        int count = 0;
        while(n%10==0){
            count++;
            n/=10;
        }
        return count;
    }

    static void solution(int i){
        int n = fact(i);
        int res = check(n);
        System.out.println(res); 

    }
    
}
