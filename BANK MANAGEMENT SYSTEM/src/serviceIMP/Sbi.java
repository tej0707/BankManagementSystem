package serviceIMP;

import java.util.Scanner;
import model.Account;

import service.Rbi;

public class Sbi implements Rbi {
	Scanner sc=new Scanner(System.in);
	Account a=new Account();
	
	public void createAccount() {
		System.out.println("ENTER ACCOUNT NO :");
		int accNO=sc.nextInt();
		System.out.println("ENTER NAME :");
		String name=sc.next();
		System.out.println("ENTER MOBNO :");
		String mobNO=sc.next();
		System.out.println("ENTER ADHAR NO :");
		String adharNO=sc.next();
		System.out.println("ENTER GENDER :");
		String gender=sc.next();
		System.out.println("ENETR AGE :");
		int age=sc.nextInt();
		System.out.println("ENTER AC BALANCE :");
		double balance=sc.nextDouble();
		a.setAccNO(accNO);
		a.setName(name);
		a.setMobNO(mobNO);
		a.setAdharNO(adharNO);
		a.setGender(gender);
		a.setAge(age);
		a.setBalance(balance);
		System.out.println("ACCOUNT CREATED SUCCESSFULLY !");
		}

	
	public void displayAllDetails() {
		System.out.println("----ACCOUNT DETAILS----");
		System.out.println("\n");
		System.out.println(a);
		}

	public void depositMoney() {
		
		System.out.println("ENTER AMMOUNT :");
		double d=sc.nextInt();
		
		double balance=a.getBalance();
		balance=balance+d;
		a.setBalance(balance);
		System.out.println("BALANCE DEPOSIT SUCCESSFULLY ! ");
		System.out.println("\n");
		
		
		
	}

	
	public void withdrawal() {
		System.out.println("ENTER AMOUNT :");
		double w=sc.nextDouble();
		
		double balance=a.getBalance();
		balance=balance-w;
		a.setBalance(balance);
		System.out.println("AMOUNT WITHDRAW SUCCESSFULLY !");
		System.out.println("\n");
		
		
	}

	
	public void balanceCheck() {
		System.out.println("ACCOUNT BALANCE :");
		System.out.println(a.getBalance());
		System.out.println("\n");
		
	}
}
