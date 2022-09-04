package Recurse;
public class totDigits{
    public static void main(String[] args) {
        String str = args[0];
        double a = Double.parseDouble(str);
        double r = Math.log10(a);
        System.out.format("Number of digits = %d\n", (int) r + 1);

        System.out.println(totDigi(Integer.parseInt(args[0])));


    }
    static int totDigi(int n){
        if(n<1) return 0;
        return 1+totDigi(n/10);
    }
}