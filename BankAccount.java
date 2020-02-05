public class BankAccount {
	private String name;
	private String id;
	private double balance;
	private int numTransactions=0;
	
	public void setAccount(String newName, String newId, double newBalance, int newNumTransactions) {
		name = newName;
		id = newId;
		balance = newBalance;
		numTransactions = newNumTransactions;
	}
	public void setName(String newName) {
		name = newName;
	}
	public void setId(String newId) {
		id = newId;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public void setNumTransactions (int newNumTransaction) {
		numTransactions = newNumTransaction;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public int getNumTransactions() {
		return numTransactions;
	}
	
	public void deposit (double amount) {
				if ( amount <=0 || amount >= 10000) {
				System.out.println("Error, contact your bank");
			}	
			else {
			numTransactions++;	
			balance = balance + amount;
			System.out.println("The New amount is: "+balance + "And the number of transactions is: "+numTransactions);}}
	public void withdraw (double amount) {
				if ( amount <=0 || amount >= 10000) {
					System.out.println("Error, contact your bank");
					System.exit(numTransactions);
				}
				else {
				numTransactions++;
				balance = balance - amount;
				System.out.println("The New amount is: "+balance + "And the number of transactions is: "+numTransactions);
				}
			}
		public void finalput() {	
		System.out.println("The New amount is: "+balance + "And the number of transactions are: "+ numTransactions);
		}

		public BankAccount () {
			setAccount("John Smith", "0000", 500, 1);
		}
		public BankAccount (String newName, String newId, double newBalance){
			setAccount(newName,newId,newBalance,0);
		}

}

