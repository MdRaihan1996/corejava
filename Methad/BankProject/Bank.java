class Bank
{
   public static void main(String[]args){
          

      //initializing static fields of BankAccount
	  BankAccount.setBankDetails("Kotak","Ameerpet","Hd123Am");
	  
	  //creating BankAccount instances

	  BankAccount acc1=new BankAccount();
	  BankAccount acc2=new BankAccount();

      System.out.println("Two instances are created for HK an BK object");
	  System.out.println("\nacc1 HK details");
	  acc1.display();

	  System.out.println("\nacc2 BK details");
	  acc2.display();

          //instance1 is initialize with  HK values

           acc1.setAccountdetails(1234L,"HK",1000);

           //instance2 is initialize with  BK values

		   acc2.setAccountdetails(5124L,"BK",2000);

		  System.out.println("\nacc1 HK Account Detalis.............!!!");
		  acc1.display();

		  System.out.println("\nacc2 BK Account Detalis.............!!!");
           
		   acc2.display();
		   //performing
		   acc1.deposit(6000);
		   System.out.println("\nacc1 current balance:");
		   acc1.currentBalance();

		   acc1.withdraw(2000);
		   System.out.println("\nacc1 current balance:");


		     System.out.println("\nacc1 HK Account Detalis.............!!!");
		     acc1.display();

		  System.out.println("\nacc2 BK Account Detalis.............!!!");
           
		   acc2.display();
		   
		   //performing bank operation
		   acc1.deposit(6000);
		   System.out.println("\nacc1 current balance:");
		   acc1.currentBalance();

		   acc1.withdraw(2000);
		   System.out.println("\nacc1 current balance:");
           acc1.currentBalance();

		   acc1.withdraw(2000);
		   System.out.println("\nacc1 current balance:");
		   acc1.currentBalance();

		   acc1.transferAmount(acc2,2300);
		   System.out.println("\nacc1 current balance:");
           acc1.currentBalance();

		   System.out.println("\nacc2 current balance:");
		   acc2.currentBalance();
   
             
			}
}




       
		    


          

