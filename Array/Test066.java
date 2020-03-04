import java.util.Arrays;
class  Test066
{
	public static void main(String[] args) 
	{
		int[]ia=new int[5];
		ia[0]=5;
		ia[1]=6;
		ia[2]=7;
		ia[3]=8;
		
		System.out.println(Arrays.toString(ia));
		for(int i=ia.length-2;i>=0;i--){
			ia[i+1]=ia[i];
		}
		ia[0]=0;
		System.out.println(Arrays.toString(ia));
	}
}
