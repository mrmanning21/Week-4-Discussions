//Creating the public class.
public class Account {

	//static numAccounts integer.
	static int numAccounts = 0;

	Account	() {

		//Set my numAccounts to increment by one.
		numAccounts = numAccounts + 1;
	}

	//Implementing the main method.
	public static void main (String[]args) {


		Account accOne = new Account ();

		Account accTwo = new Account ();

		Account accThree = new Account ();


		//Bringing in the actual number of accounts for the record.
		System.out.println("The number of accounts we have is = "+getNumAccounts());

}

	//Bringing in the accounts method for the return.
	private static int getNumAccounts () {

		return numAccounts;

	}

}