package client;
import serviceIMP.Sbi;
import service.Rbi;
import model.Account;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Rbi bank=new Sbi();
		while(true) {
		
		System.out.println("----WELCOME----\n\n1.CREATE ACCOUNT\n\n2.DISPLAY DETAILS\n\n3.DEPOSIT MONEY\n\n4.WITHDRAW MONEY\n\n5.CHECK BALANCE\n\n6.EXIT\n\n");
		int ch=sc.nextInt();
		if(ch==1)
			
		{
			bank.createAccount();
		
		}
		else if(ch==2)
		{
			bank.displayAllDetails();
		}
		else if(ch==3)
		{
			bank.depositMoney();
		}
		else if(ch==4)
		{
			bank.withdrawal();
		}
		else if(ch==5)
		{
			bank.balanceCheck();
		}
		else if(ch==6)
		{
			System.out.println("******THANK YOU******");
			break;
		}
		else {
			System.out.println("--INVALID CHOICE--");
		}
	}

}
}