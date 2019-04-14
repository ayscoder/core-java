package corejava.thread.concurrent.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Bank {
	private Lock lock = new ReentrantLock();
	int balance = 100;

	public void deposit(int amount) {
		this.balance = amount;
		System.out.println(Thread.currentThread().getName() + " Deposit:"
				+ balance);
	}

	public void withdraw(int amount) throws Exception {
		try {
			lock.lock();
			if (balance >= amount) {
				System.out.println(Thread.currentThread().getName()
						+ " Withdrawing:" + amount);
				Thread.sleep(5000);
				this.balance = this.balance - amount;
				System.out.println(Thread.currentThread().getName()
						+ " Withdrawn" + amount);
			} else {
				System.out.println(Thread.currentThread().getName()
						+ " Withdraw: entered amount : " + amount
						+ " more than balance:" + balance);
			}
		} finally {
			lock.unlock();
		}

	}
}

class Withdrawer extends Thread {
	Bank bank;

	public Withdrawer(Bank bank) {
		this.bank = bank;
		start();

	}

	public void run() {
		try {
			bank.withdraw(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class BankTran {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.deposit(2000);
		new Withdrawer(bank);
		new Withdrawer(bank);
	}
}
