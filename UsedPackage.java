import java.util.Scanner;
public class UsedPackage {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String choice,choice2,choice3;
        int weight;
        while (true){
            System.out.print("Shipping Method:\nA - Air\n T - Truck\n M - Mail \n >>");
            choice=k.nextLine();
            choice=choice.toUpperCase();
            System.out.print("Enter the weight of the parcel >> ");
            weight=k.nextInt();
            k.nextLine();
            System.out.print("Do you want to avail an insurance for the parcel Y/N >>");
            choice2=k.nextLine();
            choice2=choice2.toUpperCase();
            if (choice2.equals("Y")){
                InsuredPackage i = new InsuredPackage(weight,choice);
                i.display();
            }
            else if(choice2.equals("N")){
                Package p = new Package(weight,choice);
                p.display();
            }
            System.out.println("Do you want to compute another parcel  Y/N >>");
            choice3=k.nextLine();
            choice3=choice3.toUpperCase();
            if(choice3.equals("Y")){
               continue;
            }
            else if(choice3.equals("N")){
                    System.out.println("Thank you and Goodbye!");
                break;
            }


        }
    }
    
}
