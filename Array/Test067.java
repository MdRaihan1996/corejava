import java.util.Arrays;
class  Test067
{
	public static void main(String[] args) 
	{
		int[]ia=new int[4];
		ia[0]=1;
		ia[1]=2;
		ia[2]=3;
		ia[3]=4;
		System.out.println(Arrays.toString(ia));
		for(int i=0;i<ia.length-1;i++){
			ia[i-1]=ia[i+1];
		}
		ia[ia.length-1]=1;
		System.out.println(Arrays.toString(ia));
	}
}
