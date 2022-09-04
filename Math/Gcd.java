public class Gcd {
    public static void main(String[] args) {
        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);

        System.out.println(gcd(arg1, arg2));
        
    }
    static int gcd(int a, int b){
        int r = Math.min(a, b);//Cause larger number can never be the divisor of the smaller number, so only smaller among is considered..
        while(r>0){
            if((a%r==0)&&(b%r==0)) break;   
            r--;    
        }
        return r;
    }
    
}
