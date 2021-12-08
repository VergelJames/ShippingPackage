public class InsuredPackage extends Package{
    double Insurance;
    public InsuredPackage(int weight,String smethod){
        super(weight,smethod);
        if (Fmethod>=0 && Fmethod<=1.00){
            Insurance=2.45;
        }
        else if(Fmethod>=1.01 && Fmethod<=3.00){
            Insurance=3.95;
        }
        else if(Fmethod>=3.01){
            Insurance=5.55;
        }
        Fmethod=Fmethod+Insurance;
        
    }
    @Override
      public void display(){
        System.out.println("The Package weighs " + Weight + "\n" +
                            "Ship Method " + Smethod + "\n" +
                             "cost: " + Fmethod);
        
        
    }
    
}
