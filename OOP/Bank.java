class BankAccount
{
  String  bankName;
  String  branchName;
  String  ifsc;

  long    accNum;
  String  accHName;
  double  balance;

}
class Bank
{
   public static void main(String[]args){
          

      //HK bank details
	   BankAccount acc1=new BankAccount();
        
	  //BK bank detail

	  BankAccount acc2=new BankAccount();

	  //raihan bank details
	   BankAccount acc3=new BankAccount();


      //initialize acc1 for HK Product

           acc1. bankName   ="HDFC";
           acc1. branchName ="Ameerpet";
           acc1.  ifsc      ="hdf1002";
           acc1.  accNum    =12345;
           acc1.  accHName  ="HK";
           acc1.  balance   =30000;

	 
         //initialize acc1 for BK Product

            acc2. bankName   ="SBI";
           acc2. branchName ="Ameerpet";
           acc2.  ifsc      ="SBIN0002";
           acc2.  accNum    =123456;
           acc2.  accHName  ="BK";
           acc2.  balance   =25000;


           //initialize acc1 for Raihan Product
		   acc3. bankName   ="ICCI";
           acc3. branchName ="Ameerpet";
           acc3.  ifsc      ="SBIN0002";
           acc3.  accNum    =123001;
           acc3.  accHName  ="Raihan";
           acc3.  balance   =21000;



		   System.out.println("\n HK Account Detalis.............!!!");

		  // System.out.println("\n acc1 value");
		   System.out.println("acc1.bankName\t"+acc1.bankName);
		   System.out.println("acc1.branchName\t"+acc1.branchName);
		   System.out.println("acc1.ifsc\t"+acc1.ifsc);
		   System.out.println("acc1.accNum\t"+acc1.accNum);
		   System.out.println("acc1.accHName\t"+acc1.accHName);
		   System.out.println("acc1.balance\t"+acc1.balance);

		   System.out.println("\n BK Account Detalis............!!!!");

		   // System.out.println("\n acc2 value");
		   System.out.println("acc2.bankName\t"+acc2.bankName);
		   System.out.println("acc2.branchName\t"+acc2.branchName);
		   System.out.println("acc2.ifsc\t"+acc2.ifsc);
		   System.out.println("acc2.accNum\t"+acc2.accNum);
		   System.out.println("acc2.accHName\t"+acc2.accHName);
		   System.out.println("acc2.balance\t"+acc2.balance);



		    System.out.println("\n Raihan Account Detalis............!!!!");
           
		   // System.out.println("\n acc2 value");
		   System.out.println("acc3.bankName\t"+acc3.bankName);
		   System.out.println("acc3.branchName\t"+acc3.branchName);
		   System.out.println("acc3.ifsc\t"+acc3.ifsc);
		   System.out.println("acc3.accNum\t"+acc3.accNum);
		   System.out.println("acc3.accHName\t"+acc3.accHName);
		   System.out.println("acc3.balance\t"+acc3.balance);
		 
		 }
    }
