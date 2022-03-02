package classStudy;
class A{
	public static void m1(){
		System.out.println("Parent");
	}
}

class B extends A{
	public static void m1(){
		System.out.println("Child");
	}
}
public class StaticMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A aRef = new B(); // at compile it just look the class it is calling which is A
		A.m1(); //Parent
		aRef.m1(); // Parent - that's why here is Parent
		
	}

}
