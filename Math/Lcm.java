public class Lcm {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(lcm(a, b));
        
    }
    static int lcm(int a, int b){
        int r = Math.max(a, b);
        while(r>0){
            if((r%a==0)&&(r%b==0)) break;
            r++;
        }
        return r;
    }
}
