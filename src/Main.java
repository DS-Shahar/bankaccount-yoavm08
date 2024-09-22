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
        boolean x = acct1.transfer(acct2, 1600);
        if(x == false)
        {
        	System.out.println("The funds transfer failed, you have passed your minimum balance.");
        }
        System.out.println(acct1.getOwner() + "'s balance is: " + acct1.getBalance());
        System.out.println(acct2.getOwner() + "'s balance is: " + acct2.getBalance());
        
        

        
    }


}
