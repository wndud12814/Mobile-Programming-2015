package kr.ac.kookmin.exception.basicthread;

public class BankAccount {
	private int balance = 100;

	public int getBalance() {
		return balance;
	}
	public void withDraw(int amount) {
		balance -= amount;
	}

	public void add(int money) {
		balance += money;
		System.out.println("���� : " + balance + " " + money + " ��ŭ �Ա�");
	}
	public void delete(int money) {
		balance -= money;
		System.out.println("���� : " +balance + " " + money + " ��ŭ ���");
	}


}
