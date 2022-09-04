package Recurse;
import java.util.Scanner;
public class nTo1 {
    static Scanner s = new Scanner(System.in);

    public static void main(String args[]) throws Exception {
        int x = recurse(5);
        System.out.println("\n\nExit return: " + x);
        
    }
    static int recurse(int n){
        if(n<1) return 0;//Base condition...
        System.out.println(n);
        return recurse(n-1); 

    }
}