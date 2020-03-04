class if_elseif_else
{
   static void m1(int day)
	{
		if(day==1)
			System.out.println("Today is MON");
	}else if (day==2){
		System.out.println("Today is TUE");
	}else if (day==3){
		System.out.println("Today is WED");
	}else if (day==4){
		System.out.println("Today is THU");
	}else if (day==5){
		System.out.println("Today is FRI");
	}else if (day==6){
		System.out.println("Today is SAT");
	}else if (day==7){
		System.out.println("Today is SUN");
	}else{
		System.out.println("Invalid number");
		System.out.println("Enter between(1-7)only");
	}
}
  public static void main(String[]args){
	m1(3);



