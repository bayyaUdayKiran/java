/*
 * For larger numbers factorial can't be computed (since, it causes overflow error) to avoid it..
 * We consider the total number of occurrences of 5 & 2 in pair in the factorial of the given numbers, as they produce a trailing zero..
 * By observing a number n's factorial we can conclude that the occurrence of 2 is greater compared to 5..
 * So considering the occurrences of 5 would make our job done..
 * And in the factorial series every 5th number has 1 occurence of five & every 25th number has 2 occurences of five and so on...
 * By observing this pattern we can conclude that for a number 'n' we have the occurrences of five as [n/5^1]fl+[n/5^2]fl+.....+[n/5^x]fl in it's factrial, where (5^x)>n. 
 */

public class TrailingZerosEffec {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(solution(n));
        
    }
    static int power(int b, int p){
        int k = 1;
        for(int i = 1; i<=p; i++){
            k*=b;
        }
        return k;
    }

    static int solution(int n){
        int res = 0;
        for (int i = 1; n/i>0; i++){
            res+=n/power(5, i);
        }
        return res;
    }
}
