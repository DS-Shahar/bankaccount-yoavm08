
public class BankAccount {

	private int balance;
	private int minBalance;
	private String owner;
	/**
	    * @param balance Amount of money in the account, can be negative
	    * @param balance Must be >= minBalance
	    */

    public BankAccount(int balance, int minBalance, String owner) 
    {
        this.balance = balance;
        this.minBalance = minBalance;
        this.owner = owner;
    }

    
    public String toString() 
    {
        return "balance of " + owner + ": " + balance;
    }

    
    public boolean transfer(BankAccount target, int amount) 
    {
    	if(withdraw(amount) == true)
    	{
    		target.deposit(amount);
    		return true;
    	}
    	return false;
    }

    
    public void deposit(int amount)
    {
    	balance += amount;
    }
    
    public boolean withdraw(int amount) 
    {
        if (balance - amount < minBalance)
            return false;
        balance = balance - amount;
        return true;
    }
    
	public int getBalance() 
	{
		return balance;
	}
	
	public String getOwner() 
	{
		return owner;
	}

	public int minBalance() 
	{
		return minBalance;
	}

	public void setBalance(int a) 
	{
		if (this.minBalance() <= a) 
		{
			balance = a;
		}
	}

}
