class test025 
{
	public static void main(String[] args) 
	{
		int[][][]ia =new int[3][2][2];
		ia[0][1][1]=5;
		ia[1][1][0]=6;
		ia[0][0][1]=7;
		ia[0][1][1]=8;
		for(int i=0;i<ia.length;i++)
		System.out.println(ia[i]);
	}
}
