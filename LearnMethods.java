package basic;

public class LearnMethods {

	
	public void sum1 (int x, int y) {
		int z = x+y;
		System.out.println(z);
	}
	
	public int sum2(int x, int y) {
		int z = x+y;
		return z;
	}
	
	
	public static void login() {
		System.out.println("Login Successfull !!!");
	}
		
	
	public void logout() {
		System.out.println("Log out successfull !!");
		
	}
	
	public static void main(String[] args) {
	
		LearnMethods obj = new LearnMethods();
		
		login();
		obj.logout();
		
		obj.sum1(5, 5);
		
		int a = obj.sum2(6, 6);
		System.out.println(a);
		
	}

}
