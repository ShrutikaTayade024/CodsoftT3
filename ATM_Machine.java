package atmmachine;

import java.util.Scanner;

class ATM{
  float Balance;
   int Pin=1234;
   
 public void checkpin() {
	   
	   System.out.println("Enter Your PIN:");
	   Scanner sc=new Scanner(System.in);
	   int enterthepin=sc.nextInt();
	   
	   if(enterthepin==Pin) {
		   System.out.println();
	         Menu();
	   }
	   else {
		   System.out.println("Incorrect pin");
	 }
   }
	
   public void Menu() {
	   System.out.println("Enter Your Choice:");
	   System.out.println();
	   System.out.println("1. Check A/C Balance");
	   System.out.println("2.Withdraw Money");
	   System.out.println("3.Deposit Money");
	   System.out.println("4.Exit");

	   Scanner sc=new Scanner(System.in);
	   int opt=sc.nextInt();
	   if(opt==1) {
		   checkBalance();
	   }else if(opt==2) {
		   withdrawMoney();
		   
	   }else if(opt==3) {
		   depositeMoney();
	   }else if(opt==4) {
		return;
	   }else {
		   System.out.println("Enter Valid Choice");

	   }
	   
   }
   
public void  checkBalance() {
	   
	   System.out.println("balance:"+Balance);
	   System.out.println();
	   Menu();
	   
   }
   
   public void withdrawMoney() {
System.out.println("Enter Amount");
	   Scanner sc=new Scanner(System.in);
	   int amount=sc.nextInt();
	   
	   if(amount>Balance) {
		   System.out.println("Insufficient Balance");
	   }else {
		   Balance=Balance-amount;
		   System.out.println("Withdraw Successfuly");

	   }Menu();
	   
   }
   public void depositeMoney() {
	   System.out.println("Enter the Amount");
	   Scanner sc=new Scanner(System.in);
	   int Amount=sc.nextInt();
	   Balance=Balance+Amount;
	   System.out.println("Money Deposit Successfully ");
Menu();
   }
}

public class ATM_Machine {

	public static void main(String[] args) {

		ATM A1=new ATM();
		A1.checkpin();
		
	}

}
