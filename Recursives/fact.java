package Recurse;
public class fact {
    public static void main(String[] args) {
        System.out.println(solution(5));
        
        
    }
    static int solution(int n){
        if(n==0) return 1;
        return n*solution(n-1);
    }


    
}
