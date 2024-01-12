package basic;

public class learnVariables {

	int i = 20;
	
	// System.out.println(i);  // statement is not called as execution starts from main() method
	// System.out.println(a); // cannot use local variable of any other method
	
	public void m1() {
		int a = 10;
		
		System.out.println(i); // can use global variable in a method
		System.out.println(a); // can call local variable of that method in the same method
	}
	
	public static void main(String[] args) {
	
		
		learnVariables l = new learnVariables();
		l.m1();
		System.out.println(l.i);
		
	//	System.out.println(i); // cannot use non static method directly
	//	System.out.println(a); // cannot use local variables of other method
		
	}

}
