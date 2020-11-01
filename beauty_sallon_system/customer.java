/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beauty_sallon_system;

/**
 *
 * @author 20111
 */
public class customer {                      // the Basic class of all customers
    protected  String name;
    protected   String work;
    protected int age;
    protected static int member_degree;
    protected static double total_bill;
    protected static int services;
    
    public customer()
    {   services=20;                    // initial services (can change as we like )
        total_bill=0;
    }
    public void setname(String n)    // to set name to the protected variable 
    {
        name=n;
    }
    
     public void setwork(String w)           // to set work to the protected variable
    {
        work=w;
    }
      public void setage(int a)             // to set age to the protected variable
    {
        age=a;
    }
       public static void setmember(int m)           // to set the kind of memmbership
    {
        member_degree=m;
    } 
        public static void setbill(double b)       // to set the bill cost
    {
        total_bill=b;
    }
    
    public String getname()                         // the GET function are resposiable for dill with the user innter values
    {
        return name;
    }
     public String getwork()
    {
        return work;
    }
      public int getage()
    {
        return age;
    }
       public int getmemberdegree()
    {
        return member_degree;
    }
       
      
    
}
