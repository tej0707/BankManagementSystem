package model;

public class Account {
	private int accNO;
	private String name;
	private String mobNO;
	private String adharNO;
	private String gender;
	private int age;
	private double balance;
	
	public int getAccNO() {
		return accNO;
	}
	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobNO() {
		return mobNO;
	}
	public void setMobNO(String mobNO) {
		this.mobNO = mobNO;
	}
	public String getAdharNO() {
		return adharNO;
	}
	public void setAdharNO(String adharNO) {
		this.adharNO = adharNO;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return " ACCOUNT NO=" + accNO + "\n NAME=" + name + "\n MOB NO=" + mobNO + "\n ADHAR NO=" + adharNO + "\n GENDER="
				+ gender + "\n AGE=" + age + "\n BALANCE=" + balance + "\n";
	}
	

}
