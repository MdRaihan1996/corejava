import java.util.Scanner;
class College 
{
	public static void main(String[] args) 
	{   
		Scanner scn=new Scanner(System.in);
			Student s1=new Student();

		System.out.println("Enter Sno\t:");
		s1.Sno= scn.nextInt(); scn.nextLine();
		  System.out.println("Enter the Sname\t:");
		  s1.Sname= scn.nextLine();
		System.out.println("Enter the Course\t:");
		s1.Course=scn.nextLine();
		  System.out.println("Enter the fee\t:");
		  s1.fee= scn.nextDouble();
		System.out.println("Enter the email\t:"); scn.nextLine();
		s1.email=scn.nextLine();
		    System.out.println("Enter the mobile\t:");
		    s1.mobile=scn.nextLong();
		System.out.println("Enter the gender\t:"); scn.nextLine();
		s1.gender=scn.nextLine();
		    System.out.println("Enter the status\t:");
            s1.status=scn.nextBoolean();
		System.out.println("\ns1 object values");
		System.out.println("Sno\t\t:"+s1.Sno);
		System.out.println("Sname\t\t:"+s1.Sname);
		System.out.println("Course\t\t:"+s1.Course);
		System.out.println("fee\t\t:"+s1.fee);
		System.out.println("Email\t\t:"+s1.email);
		System.out.println("mobile\t\t:"+s1.mobile);
		System.out.println("gender\t\t:"+s1.gender);
		System.out.println("status\t\t:"+s1.status);

	}
}
