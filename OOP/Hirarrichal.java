class Parent{
   void m1(){
	System.out.println("Father");
   }
}  
class Child1 extends Parent{
	void m2(){
		System.out.println("Rehan");
	}
}
class Child2 extends Parent{
	void m3(){
		System.out.println("Faizan");
	}
}
class Hirarrichal{
	public static void main(String[] args){

		Child1 obj1=new Child1();
		Child2 obj2=new Child2();

obj1.m1();
obj1.m2();
obj2.m1();
obj2.m3();

	}
}

