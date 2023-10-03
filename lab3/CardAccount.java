public class Bank
{
	private int[] accountOne = new int[]{4,3,3,4,2,1,6,7,5,5,4,4,8,0,0,7};
	private int[] accountTwo = new int[]{4,3,3,4,2,1,6,7,5,5,4,4,8,5,3,9};
	private int[] accountThree = new int[]{4,3,3,4,2,1,0,7,0,5,4,4,8,0,0,5};
	
	private String nameOne = "Alice Smith";
	private String nameTwo = "Osian Jones";
	private String nameThree = "Claire Bevan";
	
	public Bank()
	{
		private int[] cardAccounts = new int[] {accountOne,accountTwo,accountThree};
	}
	
	public int[] getCardAccounts()
	{
		return cardAccounts;
	}
}

public class CardAccount 
{	
	private int[] accountNumber;
	private double balance =0;
	private String accountHolderName;
	
	public CardAccount(int[] accountNumber, String accountHolderName)
	{
		this.setAccountNumber(accountNumber);
		this.accountHolderName=accountHolderName;
	}


	public void setAccountNumber(int[] accountNumber) 
	{	
		System.out.println("Checking account:"+outputNumberFormatted(accountNumber));
		int[] batwest = {4,3,3,4,2,1};
		int checkSum=0;
		boolean validBank=true;
		boolean validPersonal=true; 
		
		for(int position=0;position<6;position++)
		{
			if(accountNumber[position]!=batwest[position])
			{
				validBank=false;
			}	
		}
		
		if(validBank)
		{
			System.out.println("The bank managing the account is batwest");
		}
		else
		{
			System.out.println("The bank managing the account is unrecognised");	
		}
		
		for(int position=6;position<15;position++)
		{
			if(accountNumber[position]!=0)
			{
				checkSum++;
			}
			else if(accountNumber[position]<0)
			{
				validBank=false;
			}
		}
		
		if (checkSum!=accountNumber[15])
		{
			validPersonal=false;
			System.out.println("Personal account number not valid");
		}
		else
		{
			System.out.println("Personal account number valid");
		}
		
		if(validPersonal && validBank)
		{
			this.accountNumber = accountNumber;
			System.out.println("Account number valid");
		}
		else
		{
			System.out.println("Account number not valid");
		}
	}
	
	public String outputNumberFormatted(int[]accountNumber)
	{
		// Modify me for Task 3!
		String number ="";
		for(int position=0;position<16;position++)
		{
			if (position%4==0&&position!=0)
			{
				number+=" ";
			}
			number+=accountNumber[position];
		}
		return number;
	}
	
	public boolean checkName(String name)
	{
		String[]splitCompare = name.split(" ");
		String[]splitAccount=accountHolderName.split(" ");
		
		if (!splitCompare[1].equals(splitAccount[1]))
		{
			return false;
		}
		if (!splitCompare[0].equals(splitAccount[0]))
		{
			if(splitCompare[0].charAt(0)!=splitAccount[0].charAt(0))
			{
				return false;
			}
			if (splitCompare[0].length()!=1)
			{
				return false;
			}
		}	
		return true;
	}
	
	public void processTransaction(char type, double amount)
	{
		switch(type) {
			case 'c':
				balance+=amount;
				System.out.println("Credited:£"+amount);
				System.out.println("Account balance: £"+balance);
				break;
			case 'd':
				balance-=amount;
				System.out.println("Debited:£"+amount);
				System.out.println("Account balance: £"+balance);
				break;
			case 'f':
				System.out.println("Account has been flagged so no action taken.");
				System.out.println("Account balance: £"+balance);	
				break;
		}	
	}
	
	public int[] getAccountNumber(){
		return accountNumber;
	}

	public String getAccountHolderName(){
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName = accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public static void main(String[] args)
	{
		
	}

	

}
