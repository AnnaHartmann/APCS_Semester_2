/**
 * The purpose of this program is to practice coding and solving piecewise functions, however this code specifically prints out the information created
 * in the recusion class and creates a userfriendly output. Along with a nice message at the end. 
 * 
 * @author Annabel Hartmann
 * @version 1/23/18
 */
public class RecursionTester {
	public static void main(String[] args)
    {
        int a; //Using a because using x would not works since I have different instances of x.
        int b; 
        int c;
        Recursion rMethods = new Recursion();
        
        System.out.println("---------------------------------");
        System.out.println("       f(a - 4) + 2    if a >  10");
        System.out.println("f(a) = ");
        System.out.println("       -7              if a <= 10");
        System.out.println("---------------------------------");
        System.out.println();      
        a = 25;
        System.out.println("Example 1:  a = " + a);
        System.out.println("f(" + a + ") = " + rMethods.fOf1(a));
        System.out.println();
        //Question 1 ^
        
        System.out.println("---------------------------------");
        System.out.println("       f(b / 12 + 5) -3 if b > 25");
        System.out.println("f(b) = ");
        System.out.println("       20              if x <= 25");
        System.out.println("---------------------------------");
        System.out.println();
        b = 30;
        System.out.println("Example 2:  b = " + b);
        System.out.println("f(" + b + ") = " + rMethods.fOf2(b));
        System.out.println();
        //Question 2 ^
        
        System.out.println("---------------------------------");
        System.out.println("       f(c / 12 + 5) -3 if c > 25");
        System.out.println("f(c) = ");
        System.out.println("       20              if c <= 25");
        System.out.println("---------------------------------");
        System.out.println();
        c = 500;
        System.out.println("Example 3:  c = " + c);
        System.out.println("f(" + c + ") = " + rMethods.fOf3(c));
        System.out.println();
        System.out.println("Have a nice day :)");
        //Question 4 ^
    }
}
