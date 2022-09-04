package Recurse;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(789, 0));
        
    }
    static int reverse(int n, int temp){
        if(n==0) return temp;
        temp = (temp*10)+(n%10);
        return reverse(n/10, temp);

    } 
}

    