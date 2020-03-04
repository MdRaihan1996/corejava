class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("main start");
		for(int i=1;i<=5;i++){
        System.out.println("\n outer loop iteration first loop are executed:"+i);
		for(int j=1;j<=7;j++){
		System.out.println("\n Inner loop iteration:"+j);
		// insert code here
		if(i==2)
			break;
	}
}
  System.out.println("main end");
	}
}
