class Example
{
	static void m1(){
	Student s1=new Student();
	s1.sno=101;
	s1.sname="HK";
	s1.course="CJ";
	s1.fee=1000;
	System.out.println(s1.sno+""+s1.sname+""+s1.course+""+s1.fee);
}

static Student m2(){
	Student s2=new Student();
	s2.sno=102;
	s2.sname="BK";
	s2.course="Acting";
	s2.fee=2000;
	return s2;
}
}
