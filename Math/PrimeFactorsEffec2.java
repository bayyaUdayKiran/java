/*
 * Here we optimise the algorithm by pre-checking 2 conditions that whether the given number is divisible by 2 or 3 and if so handle the 2 prime factors 2 & 3 by priniting them and dividing 'n' by them.
 * As we already handled the prime numbers 2 & 3, it's time to handle the other numbers. We start with 5 and check in pairs(i.e, 6 -> (2, 3)).
 * Now all the multiples of 2 & 3 are ignored and other numbers are checked. To implement this functionality we consider a starting position(i) and at every step we increment it with 6(i+=6) and check for the numbers "(i+=2)" and "(i+=6)".
 * This is bcoz after eliminating all the multiples of 2 and 3 we are left with the numbers positioned at 2nd & 6th from the starting point..
 */
public class PrimeFactorsEffec2 {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        primeFact(i);
        
    }

    static void primeFact(int n){
        if(n<=1) return;
        while(n%2==0){
            System.out.println(2);
            n/=2;
        }
        while(n%3==0){
            System.out.println(3);
            n/=3;
        }

        for(int i = 5; i*i<=n; i+=6){
            while(n%i==0){
                System.out.println(i);
                n/=i;
            }
            while((n%i+2)==0){
                System.out.println(i+2);
                n/=(i+2);
            }
        }
        if(n>3) System.out.println(n);
    }
}
