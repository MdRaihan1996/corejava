class A{
    static void m1(){
            System.out.println("A m1");
      }
}
class F{
    static void m3(){
           System.out.println("F m3");
     }
}
class B{
    static void m2(){
           System.out.println("B m2");
}
    public static void main(String[]args){
           System.out.println("main");
           m2();
           A.m1();
           F.m3();
    }
}