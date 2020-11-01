 
package beauty_sallon_system;

import java.util.Scanner;   
 
public class Beauty_sallon_system {
       private static double last_bill=0.0;
        
    public static void main(String[] args) {
       boolean check = true;
        customer use=new customer();     // make an object from customer class 
        discount use2=new discount();    // make an object from discount class 
       System.out.println("Enter your name "); 
       Scanner Name = new Scanner(System.in);  
      use.setname(Name.nextLine());
      System.out.println("Enter your work: "); 
       Scanner Work = new Scanner(System.in);
      use.setwork(Work.nextLine());
      
      System.out.println("Enter your age: "); 
       Scanner Age = new Scanner(System.in);
      use.setage(Age.nextInt());
      
      System.out.println("Enter your type of memmberhood   (0=> Not_memmber  1=> silver  2=> Gold  3=> premium) : ");  // to detemine the type of the customer 
       Scanner mem = new Scanner(System.in);
      use.setmember(mem.nextInt());
      
      System.out.println("Enter your bill : "); 
       Scanner Bill = new Scanner(System.in);
      use.setbill(Bill.nextDouble());
    
     System.out.println("your name is : "+ use.getname());                          // print the final results
            System.out.println("your work is : "+ use.getwork());
            System.out.println("your age is : "+use.getage());
            System.out.println("your mummbership degree is : "+use2.check_memmber()); 
            System.out.println(" your bill with services : " + use2.fin_bill()); 
           last_bill=use2.fin_bill() + last_bill;
  
    Visit fin=new Visit();       // make an object from visit class 
    while(check){      // use the boolean arrgement to check he want to buy any thin else or not 
    System.out.println("Do you want to buy any thing else ? ");       
    Scanner answer = new Scanner(System.in);
    if(answer.nextBoolean())
    {    
       last_bill= fin.check_visit(last_bill);            // to earn the value of this bill if there is any another thing the customer wants to buy after it
    }else
        {
            System.out.println("Thank you for your Visit " ); 
            check=false;
        }
    }
    
       
    }
    
}
