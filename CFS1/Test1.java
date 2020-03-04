class Test1
{
	static void m1()
	{
		System.out.println("m1 start");
		System.out.println("\n m1 before loop");
		for(int i=1;i<=5;i++){
			System.out.println("iteration"+i+"start");
			if(i==2)
				break;
			System.out.println("iteration"+i+"end");
		}
		System.out.println("\n m1 after loop");
		System.out.println("\n m1 end");
	}
	public static void main (String[]args){
		System.out.println("main start");
		m1();
		System.out.println("main end");
	}
}
