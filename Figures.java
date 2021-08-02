import java.util.Scanner;
public class Figures {

	int size = 0;
	int i, j;
		public void printBox() {
			
			for (i = 0; i < size; i++) {
				
				for (j = 0; j < size; j++) {
					
					System.out.print("*");
		}
					System.out.println();
	}
}
		public void printDiamond() {
			
			 for(i = 1; i <= size; i++) {
				 
				 for(j = size; j > i; j--) {
					 	System.out.print(" ");
				 }
				 
		            System.out.print("*"); 
		            
		          for(j = 1; j < (i - 1)*2; j++) {
		                System.out.print(" ");
		          }
		          
		           if(i == 1) {
		                System.out.print("\n");
		            }
		            
		           else {
		                System.out.print("*\n");
		            }
		        }
		        
		        for(i = size - 1; i >= 1; i--) {
		           
		        	for(j = size; j > i; j--) {
		                System.out.print(" ");
		            }
		        	
		            System.out.print("*");
		            
		            for(j = 1; j < (i -1 )*2; j++) {
		                System.out.print(" ");
		            }
		            
		            if(i == 1) {
		                System.out.print("\n");
		            }
		            
		            else {
		                 System.out.print("*\n");
}
}		
} 

		public void printX() {
			int prntx = size * 2 - 1;
			
			for(i = 1; i <= prntx ; i++) {
                 
	        for(j = 1; j<= prntx; j++){ 
	        	
	        	if(j == i || j == prntx - i + 1)
	        		System.out.print("*");
	        		System.out.print(" ");
                              
	        }
	        		System.out.println();
	}
}
		
	public static void main(String[] args) {
// #1. Asking for odd number		
		int oddnum;
		
	do {	
		
		Scanner fig = new Scanner(System.in);
		System.out.println("Please Enter an Odd Number");
			 oddnum = fig.nextInt();
		
		if (oddnum % 2 == 0) { 
			System.out.println("Number is Even. Reread Directions");
}
		
		else
			System.out.println("Your Number = "+ oddnum);
		}

	while (oddnum % 2 == 0);
// #2. Print Options	
	int choice;
		System.out.println("Print-Out Methods: \n 1. Print Box \n 2. Print Diamond \n 3. Print X \n 4. Quit Program");
	
	do {
		Scanner figtwo = new Scanner(System.in);
		System.out.println("Enter Number 1-4 to Choose");
			choice = figtwo.nextInt();
			
		if (choice == 1) {
			System.out.println("You Chose the Box Method");
			
			Figures Box = new Figures();
				Box.size = oddnum;
				Box.printBox();
}
		
		if (choice == 2) {
			System.out.println("You Chose the Diamond Method");
			
			Figures Diamond = new Figures();
				Diamond.size = oddnum;
				Diamond.printDiamond();
}
		
		if (choice == 3) {
			System.out.println("You Chose the X Method");
			
			Figures X = new Figures();
				X.size = oddnum;
				X.printX();
}
		
		if (choice == 4) {
			System.out.println("Goodbye!");
			
}
	}
		while (choice > 4);
	
	
	
	
	}
}
