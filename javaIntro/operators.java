package GFG;

public class operators {
    public static void main(String[] args) {
        // In arithmetc operators the precedence is as follows: " '*' > '/' > '%' > '+' > '-' " ...
        // When multiple operators of different precedence are been used the compiler follows the above stated order for computation ..
        int res = ((4-2)+(6*5));
        System.out.format("The result = %d\n", res); 

        //Pre & Post-increment / Decrement...
        int x = 5, y = 6, z = 0;
        y = x++;//This is same as y = x; x = x+1;
        System.out.format("Post-increment = %d\n", y);
        
        y = ++x;//This is same as x = x+1; y = x;
        System.out.format("Pre-increment = %d\n", y);


        //When multiple operators of same precedence are been used in an expression the compiler uses the associativity & for example in java associativity for assignment operator is from right to left...
        y = z = x;
        System.out.format("z = %d\n", y);

        //And assignment operators have associativity from left to right...
        System.out.format("Result = %d\n", 10-7-2);

        //Short-circuting in logical operators...
        //given x = true & y = false, then (y && x) is the state where short circuting is done by the java compiler. Here, 'y' is false so logical "&&" operation returns false without even looking at the 2nd expression(x)..
        //and in the same way if (x || y), then after knowing that x is 'true', the logical operator "||", skips the execution of y and simply returns 'true.'
        String str=null;
        if(str!=null && str.length()<100){
            //Here, 'str' is null so the 1st operand of the "&&" operator becomes false so it simply skips 'str.length()<100', because the second operand actually raises an error(accessing null pointer) but in our case it's short-circuted..
            System.out.println("Not Short Circuted..!");
        }else{
            System.out.println("Short circuted..!"); 
        }



        //Bit-wise operator..
        int a = 1, b = 3;
        System.out.format("Bitwise AND: %d\n", a&b);//Performs 'AND' on each bit..
        System.out.format("Bitwise OR: %d\n", a|b);//Performs 'OR' on each bit..
        System.out.format("Bitwise XOR: %d\n", a^b);//Performs 'XOR' on each bit..
        System.out.format("Bitwise NOT: %d\n", ~a);//Performs 'NOT' operation on each bit(just inverses every bit)


        //Note, that all the decimal numbers like int, byte, short, long or stored in normal binary form. But when it comes to -ve signed integers theyr'e stored in 2's compliment form, stating that if the lsb is 0, then the sign is +ve & if the lsb is 1, then the sign is -ve..



    }
}
