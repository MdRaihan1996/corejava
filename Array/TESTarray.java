class Student 
{
	int sno;
	String sname;
	String course;
	double fee;
}
class TESTarray
{
    	public static void main(String[] args){
//declaration and creating variable and object
		
	    	 Student[] sa=new Student[5];
		
//initializing Student[] object the student object
		
	      	    sa[0]=new Student();
		        sa[1]=new Student();
				sa[2]=new Student();
				sa[3]=new Student();
				sa[4]=new Student();
 sa[0].sno   =101;
 sa[0].sname ="raihan";
 sa[0].course="bca";
 sa[0].fee=30000;

         sa[1].sno   =102;
         sa[1].sname ="saddam";
         sa[1].course="mca";
         sa[1].fee=50000;

		
      
 sa[2].sno   =103;
 sa[2].sname ="Arshad";
 sa[2].course="bsc";
 sa[2].fee=40000;
              
			    sa[3].sno   =104;
                sa[3].sname ="Imran";
                sa[3].course="Mba";
                sa[3].fee=60000;

 sa[4].sno   =105;
 sa[4].sname ="sarfaraz";
 sa[4].course="Seo";
 sa[4].fee=70000;

System.out.println("Student[] value\n");
System.out.println(sa[0]);
System.out.println(sa[0].sno);
System.out.println(sa[0].sname);
System.out.println(sa[0].course);
System.out.println(sa[0].fee);
              
			  System.out.println(sa[1]);
              System.out.println(sa[1].sno);
              System.out.println(sa[1].sname);
              System.out.println(sa[1].course);
              System.out.println(sa[1].fee);
	
System.out.println(sa[2]);
System.out.println(sa[2].sno);
System.out.println(sa[2].sname);
System.out.println(sa[2].course);
System.out.println(sa[2].fee);

                   System.out.println(sa[3]);
                   System.out.println(sa[3].sno);
                   System.out.println(sa[3].sname);
                   System.out.println(sa[3].course);
                   System.out.println(sa[3].fee);

System.out.println(sa[4]);
System.out.println(sa[4].sno);
System.out.println(sa[4].sname);
System.out.println(sa[4].course);
System.out.println(sa[4].fee);

           


	}
}
