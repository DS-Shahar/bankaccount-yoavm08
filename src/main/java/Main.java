import java.util.*;
public class Main {
	Scanner input = new Scanner(System.in);
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		
		BankAccount acct1 = new BankAccount(1000, -1000, "Lisa");
        BankAccount acct2 = new BankAccount(1000, -1000, "Bob");
        System.out.println(acct1.getOwner() + "'s balance is: " + acct1.getBalance());
        System.out.println(acct2.getOwner() + "'s balance is: " + acct2.getBalance());
        System.out.println();
        acct1.transfer(acct2, 500);
        System.out.println(acct1.getOwner() + "'s balance is: " + acct1.getBalance());
        System.out.println(acct2.getOwner() + "'s balance is: " + acct2.getBalance());
        System.out.println();
        acct1.transfer(acct2, 1600);
        System.out.println(acct1.getOwner() + "'s balance is: " + acct1.getBalance());
        System.out.println(acct2.getOwner() + "'s balance is: " + acct2.getBalance());
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        int x;
		int y;
		
		System.out.print("Enter Rectangle1 lenght: ");
		x = reader.nextInt();
		System.out.print("Enter Rectangle1 width: ");
		y = reader.nextInt();
		Rectangle rec1 = new Rectangle(x, y);

		System.out.print("Enter Rectangle2 lenght: ");
		x = reader.nextInt();
		System.out.print("Enter Rectangle2 width: ");
		y = reader.nextInt();
		Rectangle rec2 = new Rectangle(x, y);
		System.out.println();
		
		System.out.println("Rectangle number 1:");
		rec1.draw();
		
		System.out.println("Rectangle number 2:");
		rec2.draw();
		
		rec1.scale(2);
		
		System.out.println("Rectangle1's area: " + rec1.calcArea());
		System.out.println("Rectangle1's calcPerimeter: " + rec1.calcPerimeter());
		System.out.println("Rectangle2's area: " + rec2.calcArea());
		System.out.println("Rectangle2's calcPerimeter: " + rec2.calcPerimeter());
        
        

        
    }


}
