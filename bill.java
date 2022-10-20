import java.util.Scanner;
public class bill {

	public static void main(String[] args)
     {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the quantity:");
		int quantity=sc.nextInt();
		
		int totalBill;
		int totalCost=540*quantity; 
	
		if(totalCost>2000)
         {
			
			totalBill=totalCost-(totalCost*(10/100));
			System.out.println("Total bill with 10% discount: "+totalBill);  
		}
	
		else 
        {
			System.out.println("Total bill: "+totalCost);
		}
	
	
	}

}