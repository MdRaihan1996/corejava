
class college1 
{
	public static void main(String[]args)
	{
		//creating two instances for the student HK an BK
		Student s1=new Student();
		Student s2=new Student();
		//initializing(storing values)s1 instance with HK values
		s1.sno=101;
		s1.sname="HK";
		s1.course="BCA";
		s1.fees=1000;
		//initializing(storing values)s2 instance with BK values
		s2.sno=102;
		s2.sname="BK";
		s2.course="MCA";
		s2.fees=5000;
		//Printing HK values
        System.out.println("ns1 object values");
		System.out.println("s1.sno\t:"+s1.sno);
		System.out.println("s1.sname\t:"+s1.sname);
		System.out.println("s1.course\t:"+s1.course);
		System.out.println("s1.fees\t:"+s1.fees);
		//Printing BK values
		System.out.println("ns2 object values");
		System.out.println("s2.sno\t:"+s2.sno);
		System.out.println("s2.sname\t:"+s2.sname);
		System.out.println("s2.course\t:"+s2.course);
		System.out.println("s2.fees\t:"+s2.fees);
	}
}
