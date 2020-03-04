class A{
}
class B{
static void m1(){
System.out.println("B m1");
    }
public static void main(String[]args){
System.out.println("B m1");
}
}
class C{ 
static void m2(){
  System.out.println("C m2");
}
public static void main(String[]args){
System.out.println("C main");
    }
}
class D{
static void m3(){
 System.out.println("D m4");
}
public static void main(String[]args){
System.out.println("D main");
    m3();
    B.m1();
    C.m2();
    
    C.main(new String[0]);
    
         }
     }


