//Prints fibonacci series till nth term..
package Recurse;
public class fib {
    public static void main(String[] args) {
        System.out.println(0+"\n"+1);
        solution(0, 1, 8);
    }

    static void solution(int x, int y, int n){
        if((x+y)>n) return;
        System.out.println(x+y);
        solution(y, (x+y), n);

    }
}
