package GFG;
import java.lang.Integer;

public class commandLineArgs {
    public static void main(String[] args) {
        if(args.length > 0){
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            for (String val: args)
                System.out.println(val + " ");
            System.out.format("Sum of arguments is: %d\n", n1+n2);

        }
    }
    
}
