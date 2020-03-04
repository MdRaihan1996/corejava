class BankAccount
{
 private static String     bankName;
 private static String     branchName;
 private static String     ifsc;

 private double              accNo;
 private String            holderName;
 private long            balance;
 
 public static String getBankName(){
           return bankName;
 }
 public static void setBankDetails(String a,String b,String c){

	 bankName   =a;
	 branchName =b;
	 ifsc       =c;
 }
public void setAccountdetails(double d,String n,long bal){

	accNo            =d;
	holderName       =n;
	balance          =bal;

}
public void deposit(long amt){
	   balance = balance + amt;
}
public double withdraw(long amt){
	balance  = balance - amt;
	return amt;

}
public void currentBalance(){
	System.out.println(balance);
}
public void transferAmount(BankAccount desAcc,long amt){
	balance = balance - amt;
	desAcc.balance=desAcc.balance + amt;
}
     public void display(){
	//System.out.println(ifsc);
    //public void display("bank details");
System.out.println("BANK NAME    :"+bankName);
System.out.println("BRANCH       :"+branchName);
System.out.println("IFSC CODE    :"+ifsc);
System.out.println("AC.NUMBER    :"+accNo);
System.out.println("OWNER NAME   :"+holderName);
System.out.println("AVL.BALANCE  :"+balance);

     
      }
}
  

