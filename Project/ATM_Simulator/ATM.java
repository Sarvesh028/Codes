import java.util.Scanner;
class ATM
{
	/**
	 *
	 */
	private static final String ENTER_YOUR_CHOICE = "Enter Your Choice........";

	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Atm Number....");
		double n=sc.nextDouble();
		System.out.println("Enter ATM Pin........");
		long pin=sc.nextLong();
		System.out.println("Press 1 For Withdraw:");
		System.out.println("Press 2 For Deposit:");
		System.out.println("Press 3 For Mini Statement:");
		System.out.println("Press 4 for Reset ATM Pin:");
		System.out.println("Press 5 For Exit:");
		System.out.println(ENTER_YOUR_CHOICE);
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Select Your Account Type:");
				System.out.println("Press 1 For Saving Account:");
				System.out.println("Press 2 For Current Account:");
				System.out.println("Enter Your Choice:.......");		
				int choose=sc.nextInt();
				switch(choose)
				{
					case 1:
						System.out.println("Enter Amount........");
						int amm=sc.nextInt();
						System.out.println("\n\n\n\tPlease Collect Your Cash Money:)");
						System.out.println("\n\n\n\n\n\n\t\tThanking You...\t\t\n\n\n\n\n\n\nVisit Again.......");
					break;
					case 2:
						System.out.println("Your Current Account detail.\t\t\n\nFor more detail Contact to your Branch.");
					break;
					default:
						System.out.println("Please Enter your Valid Entery........\t\t\n\n\n\nThank you...");
					break;
				}
			break;
			case 2:

				System.out.println("Select Your Account Type:");
				System.out.println("Press 1 For Saving Account:");
				System.out.println("Press 2 For Current Account:");
				System.out.println("Enter Your Choice:.......");		
				int reference=sc.nextInt();
				switch(reference)
				{
					case 1:
						System.out.println("Enter Your Ammount to Deposit........");
						long dep=sc.nextLong();
						System.out.println("\t\t\n\n\nYour Ammount is Successfully Deposited........");
						System.out.println("\t\t\n\n\n\n\n\nThanking You...\t\t\n\n\n\n\n\n\n\nVisit Again.......");
					break;
					case 2:
						System.out.println("Your Current Account detail.\t\t\n\nFor more detail Contact to your Branch.");
					break;
					default:
						System.out.println("Please Enter your Valid Entery........\t\t\n\n\n\nThank you...");
					break;
				}
			break;
			case 3:
				System.out.println("Your Mini Statement..");
				System.out.println("Your Total Ammount Is.......");
				int amm=sc.nextInt();
				System.out.println("For Last 10 Transcation Check Your Resister Email....");
			break;
			case 4:
				System.out.println("Enter your Old Pin:");
				long old=sc.nextLong();
				System.out.println("Enter your New Pin:");
				int npin=sc.nextInt();
				System.out.println("Confirm Your New Pin:");
				int cpin=sc.nextInt();
				System.out.println("Your ATM PIN has been Successfully Change...");
			break;
			case 5:
				System.exit(0);
			break;
			default:
				System.out.println("Invalid Input........");
			break;
		}
	}
}