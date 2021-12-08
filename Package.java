public class Package {
    protected String Smethod;
    protected int Weight;
    protected double Fmethod;
    public Package(int weight, String smethod){
        Weight=weight;
        Smethod=smethod;
        calculateCost(weight,smethod);
    
    }
    public  void calculateCost(int weight,String smethod){
       
            if (smethod.equals("A")){
               
                  if (weight>=1 && weight<=8){
                      Fmethod=2.00;
                  }
                   else if(weight>=9 && weight<=16){
                       Fmethod=3.00;
                   }
                  else if(weight>=17){
                      Fmethod=4.50;
                  }
            }
                 
            else if(smethod.equals("T")){
                 if (weight>=1 && weight<=8){
                      Fmethod=1.50;
                  }
                   else if(weight>=9 && weight<=16){
                       Fmethod=2.35;
                   }
                  else if(weight>=17){
                     Fmethod=3.25;
                  }
            }
            else if(smethod.equals("M")){
                if (weight>=1 && weight<=8){
                     Fmethod=0.50;
                  }
                   else if(weight>=9 && weight<=16){
                        Fmethod=1.50;
                   }
                  else if(weight>=17){
                      Fmethod=2.15;
                  }
            }
                
                
                  
                   
                  
                
        }
       
    
     public void display(){
        System.out.println("The Package weighs " + Weight + "\n" +
                            "Ship Method " + Smethod + "\n" +
                             "cost: " + Fmethod);
        
        
    }
  
}
