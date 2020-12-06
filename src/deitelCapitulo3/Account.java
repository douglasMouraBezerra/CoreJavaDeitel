package deitelCapitulo3;

import javax.swing.JOptionPane;

public class Account {

	private double balance;

	public Account(double initialBalance) {
		if (initialBalance > 0) {
			balance = initialBalance;
		}
	}

	public void credit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void debit(double amount) {
		if (amount < balance) {
			balance -= amount;
		} else {
			String message = String.format("Debit amount exceeded account balance: %.2f", balance);
			JOptionPane.showMessageDialog(null, message);
		}
	}

}
