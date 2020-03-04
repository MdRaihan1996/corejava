import java util.Array;
class  Student12{
	int sno;
	String sname;
	String course;
	double fee;
}
class Test04
{
}
	public static void main(String[] args) 
	{
  Student[]sa1={new Student(),new Student()};
  Student[]sa2={new Student[sa1.length];

		System.out.println("sa1-->"+sa1+"\n\t-->"+Array.toString(sa1));
		System.out.println("\t\t"+sa1[0].sno+""+sa1[0].sname+""+sa1[0].course+""+sa1[0].fee);
		System.out.println("\t\t"+sa1[1].sno+""+sa1[1].sname+""+sa1[1].course+""+sa1[1].fee);
		System.out.println();


		System.out.println("sa1-->"+sa1+"\n\t-->"+Array.toString(sa2));
        System.out.println("\t\t"+sa2[0].sno+""+sa2[0].sname+""+sa2[0].course+""+sa2[0].fee);
		System.out.println("\t\t"+sa2[1].sno+""+sa2[1].sname+""+sa2[1].course+""+sa2[1].fee);
		System.out.println();

		for (int i=0;i<sa1.length;i++)
		{
			sa2[i]=sa1[i];
         System.out.println("\t\t"+sa2[0].sno+""+sa2[0].sname+""+sa2[0].course+""+sa2[0].fee);
		 System.out.println("\t\t"+sa2[1].sno+""+sa2[1].sname+""+sa2[1].course+""+sa2[1].fee);
         System.out.println();

	
		}
		
	}
}
