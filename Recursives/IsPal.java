package Recurse;
public class IsPal{
    public static void main(String[] args) {
        isPal(784);
    }

    static int reverse(int n, int temp){
        if(n==0) return temp;
        temp = (temp*10)+(n%10);
        return reverse(n/10, temp);
    } 

    static void isPal(int n){
        if(n == reverse(n, 0)) System.out.println("Yes");
        else System.out.println("No");
    }

  
     

}