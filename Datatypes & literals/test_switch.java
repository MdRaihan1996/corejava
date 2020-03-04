class test_switch{
	static void m1(int day){
    switch (day)
    {
    case 1:
		System.out.println("Today is MON");
	    break;
		case 2:
		System.out.println("Today is TUE");
		break;
		case 3:
	    System.out.println("Today is WED");
		break;
		case 4:
		System.out.println("Today is THU");
		break;
		case 5:
		System.out.println("Today is FRI");
		break;
		case 6:
		System.out.println("Today is SAT");
		break;
		default:
		System.out.println("Invalid day Name");
		break;
	    }
    }
	public static void main(String[]args){
		m1(1);
		m1(2);
		m1(3);
		m1(4);
		m1(5);
		m1(6);
	}
}

  
