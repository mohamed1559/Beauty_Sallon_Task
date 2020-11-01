

package beauty_sallon_system;


public  class discount extends customer {     // this class inherte customer
      
    public static String check_memmber()            // this function is used to know the degree of the memmber
    {
        if(member_degree ==0 )
        {
           return "NOT_member";
           
        }
        else if (member_degree==1)
        {
            total_bill= (total_bill - total_bill*0.1);
          return "Silver";  
          
        }
        else if(member_degree==2)
        { 
           total_bill= (total_bill - total_bill*0.15);
            return "Gold";  
          
        }
        else if(member_degree==3){
            total_bill= (total_bill - total_bill*0.2);
        return "premium";  
          
        }
        else 
        {
            return "lt is not a choice";
        }
      
        
    }
  
  public static  double fin_bill()                      // to return the total_bill with services 
  {
       return total_bill+ services;
  }
    
    
}
