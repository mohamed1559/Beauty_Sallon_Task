
package beauty_sallon_system;

import java.util.Scanner;


public class Visit  extends discount{                  // this class inherte discount
     
    public static double check_visit( double n)     // this function used to deal with more than one visit and adding the bill before 
    {   
        System.out.println("Enter your type of memmberhood   (0=> Not_memmber  1=> silver  2=> Gold  3=> premium) : "); 
       Scanner mem = new Scanner(System.in);
      setmember(mem.nextInt());
      
      System.out.println("Enter your bill : "); 
       Scanner Bill = new Scanner(System.in);
      setbill(Bill.nextDouble());
        System.out.println(" your bill with services : " +(fin_bill()+n) );
        return (fin_bill()+n);
    } 
    
}
