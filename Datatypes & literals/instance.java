class instance 
{
	public static void main(String[] args) 
	{
	A a1=new A();
	System.out.println(a1 instanceof A);
	System.out.println(a1 instanceof B);
//	System.out.println(a1 instanceof C);

    B b1=new B();
	System.out.println(b1 instanceof A);
	System.out.println(b1 instanceof B);
	//System.out.println(b1 instanceof C);

	C c1=new C();
	//System.out.println(c1 instanceof A);
	//System.out.println(c1 instanceof B);
	System.out.println(c1 instanceof C); 

	}
}
 class A{}
 class B extends A{}
 class C {}
 