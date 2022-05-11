import java.util.Scanner;

public class AccountApplicationMainV3 {
	public static void main(String[] args) {
		String continueChoice;
		System.out.println("welcome");
		Scanner st = new Scanner(System.in);
		System.out.println("enter the accountNumber :");
		int accnum = st.nextInt();

		System.out.println("enter the name :");
		String name = st.next();

		System.out.println("enter the Balance :");
		double balance = st.nextDouble();
		System.out.println("acount opened successfully");
		do {

			System.out.println("1. withdraw");
			System.out.println("2. deposite ");
			System.out.println("3. check balance");

			System.out.println("enter the choice :");
			int menu = st.nextInt();

			switch (menu) {
			case 1:
				System.out.println("enter the withdrawal amount");
				double W_amount = st.nextInt();
				if (W_amount > 0 && balance >= W_amount)
					balance = balance - W_amount;
				System.out.println("total amount after withdrawal amount :" + balance);
				break;
			case 2:
				System.out.println("enter the deposited amount");
				double D_amount = st.nextInt();
				if (D_amount > 0)
					balance = balance + D_amount;
				System.out.println("total amount after deposite :" + balance);
				break;
			case 3:
				System.out.println("your total amount is :" + balance);
				break;
			default:
				System.out.println("invalid number");

			}
			System.out.println("Do you want to continue ?");
			continueChoice = st.next();
		} while (continueChoice.equals("yes"));

		System.out.println("theank you!!");

	}

}
