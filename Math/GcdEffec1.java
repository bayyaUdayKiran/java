public class GcdEffec1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(gcd(a, b));
        
    }
    static int gcd(int a, int b){
        while(a!=b){
            if(a>b) a = a-b;
            else b = b-a;
        }
        return a;
    }
}
