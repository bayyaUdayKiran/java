//import java.util.*;
package GFG;
public class typeConversions {
    public static void main(String[] args) {
        //Implicit type conversion(Widening)..
        //Variables with smaller size can be directly placed into the larger once..
        byte b = 56;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("Byte = " + b);
        System.out.println("Short = " + s);
        System.out.println("Int = " + i);
        System.out.println("Long = " + l);
        System.out.println("Float = " + f);
        System.out.println("Double = " + d + "\n");


        //Explicit type conversion(Narrowing)..
        //Variables with larger sizes can be also forcibly placed into a smaller sized once. But doing so there will be loss of precision..
        int in = (int) 3.14d;
        System.out.println(in);
        char ch = (char) 65;
        System.out.println(ch);

    }
    
}

