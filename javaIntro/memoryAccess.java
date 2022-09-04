package GFG;
public class memoryAccess {
    public static void main(String args[]){
        
        //Non-primitives, call by reference..
        Point p1 = new Point();
        p1.x = 10;
        p1.y = 20;
        System.out.println(p1.x + " " + p1.y);
        Point p2 = p1;
        p2.x = 30;
        System.out.println(p1.x + " " + p1.y);

        //Primitives, call by value..
        int n1 = 10;
        int n2 = 20;
        System.out.println(n1 + " " + n2);
        int x = n1;
        x = 30;
        System.out.println(n1 + " " + n2);
        

        //Un-initialised primitives are by default initialised by default values & un-initialised non-primitives throws a compile time error ..
        Point px = new Point();
        System.out.println(px.x + "\n" + px.y + "\n" + px.name + "\n" + px.pt);


    }
}

class Point{
    int x;
    int y;
    String name;
    Pointx pt;
}

class Pointx{
    int num1;
    int num2;
}
