
public class blockstatic {
	
	
	static {
		System.out.println("Without Object");
		method1();
		blockstatic obj = new blockstatic();
		obj.main(null);
	}
	
	static void method1() {
		System.out.println("First Method");
		method2();
		blockstatic obj1 = new blockstatic();
	}
	
	static void method2() {
		System.out.println("Second Method");
		blockstatic obj2 = new blockstatic();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
