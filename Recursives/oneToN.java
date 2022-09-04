package Recurse;

public class oneToN{
    public static void main(String[] args) {
        solution(5, 1);
        
    }

    static int solution(int n, int i){
        if(i>n) return 0;
        System.out.println(i);
        return solution(n, i+1);
    } 
}