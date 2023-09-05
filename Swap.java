/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Swap{
    public static void main(String[] args)
    {
        int x = 100, y = 200;
  
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
  
        int temp = x;
        x = y;
        y = temp;
  
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}