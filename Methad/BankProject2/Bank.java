import java.util.Scanner;
class Bank 
{
	public static void main(String[] args) 
	throws InterruptedException{

		Scanner scn=new Scanner(System.in);
      
	  BankAccount.setBankDetails("SBI","HanumanGanj","SBI000C1");
        

	while(true){
      		System.out.println("\n=========================================");

			System.out.println("\tWelcome to"+BankAccount.getBankName()+"Bank");

			System.out.println("Press enter key to continue......");

			System.out.println("\n=========================================");
			scn.nextLine();

	       BankAccount acc=null;

		   loop:while(true){
			   System.out.println("\nChoose one option");
			   System.out.println("1.Open Account");
			   System.out.println("2.Account Details");
			   System.out.println("3.Deposit");
			   System.out.println("4.Withdraw");
			   System.out.println("5.Balance Enquiry");
			   System.out.println("6.Transfer Amount");
			   System.out.println("7.Exit");

			   System.out.println("Enter one option:");
			   int option=scn.nextInt();scn.nextLine();

			   switch(option){
				   case 1: //open Account
				      
					  acc=new BankAccount();
					  System.out.println("Enter account details");

					  System.out.print("Enter accNo :");
					  double accNum=scn.nextDouble();scn.nextLine();

					  System.out.print("Enter holderName :");
					  String accholderName=scn.nextLine();

					  System.out.print("Enter balance:");
					  long balance=scn.nextLong(); scn.nextLine();
                      
					  acc.setAccountdetails(accNum,accholderName,balance);

					  System.out.println("====================================");
					  System.out.println("Account is created successfully.........");
                      System.out.println("====================================");

					  Thread.sleep(2000);
					  break;

					  case 2://displaying acc details

					  System.out.println("Your account details");
					  acc.display();

					  Thread.sleep(5000);

					  break;

					  case 3://deposit

					  System.out.println("Enter deposit amount");
					  long amt=scn.nextLong(); scn.nextLine();
					  acc.deposit(amt);

					  System.out.println(amt+" is credited to your account");
					  System.out.println("Current balance:");
					  acc.currentBalance();

					  Thread.sleep(3000);
					  break;

					  case 4://withdraw

					  System.out.println("Enter withdraw amount:");
					  amt=scn.nextLong();scn.nextLine();
					  acc.withdraw(amt);

					  System.out.println(amt+"is debited from your account");
					  System.out.println("Current balnce:");
					  acc.currentBalance();

					  Thread.sleep(3000);

					  break;
					  case 5://balance enquiry
					  System.out.println("Current Balnce is:");
					  acc.currentBalance();
					  Thread.sleep(2000);
					  break;

					  case 6://transfer amount
					  System.out.println("The service temporarily not available");
					  break;

					  case 7:

						  System.out.println("Thank you Please Visit Again");

						  Thread.sleep(2000);
						  break loop;

						  default:
							  System.out.println("Error:Invalid option");

			                         }               //switch close;

		                         }                  //while(true)close

	                         }                   //while(true)close

	                     }                      //main close

                      }                       //class close

					  
						  




	

