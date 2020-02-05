
public class BankAccountDemo {
	public static void main (String[]args) {
		BankAccount saving = new BankAccount("Elbachir","123",1200);
		saving.deposit(1500);
		saving.deposit(700);
		saving.deposit(12000);
		saving.withdraw(750);
		saving.withdraw(11000);
		saving.finalput();
	}
}
