package test;

public class SavingsAccount implements BankAccount{
	  private String acc= "Savings Account";
	  
	  public void AccountType(){
	    System.out.println("This is a "+acc);
	  }
	  public void checkBankBalance(){
	    System.out.println("The balance is Rs.50000");
	  }
	  public void validateUser(){
	    System.out.println("validated");
	  }


}
