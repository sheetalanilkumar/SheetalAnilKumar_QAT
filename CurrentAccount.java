package test;

public class CurrentAccount implements BankAccount{
	private String acc= "Current Account";
	  
	  public void AccountType(){
	    System.out.println("This is "+acc);
	  }
	  public void checkBankBalance(){
	    System.out.println("The balance is Rs.50000");
	  }
	  public void validateUser(){
	    System.out.println("validated");
	  }

}
