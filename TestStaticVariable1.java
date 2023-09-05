/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class Student{  
   int rollno; 
   String name;  
   static String college ="AITR";
   
   Student(int r, String n){  
   rollno = r;  
   name = n;  
   }  
    
   void display (){System.out.println(rollno+" "+name+" "+college);}  
}  

public class TestStaticVariable1{  
 public static void main(String args[]){  
 Student s1 = new Student(111,"Karan");  
 Student s2 = new Student(222,"Ashish");  
 
 s1.display();  
 s2.display();  
 }  
}  