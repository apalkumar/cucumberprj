class A{  
protected void msg(){System.out.println("Hello java");}  
}   



public class overridingmethod extends A {
	
	void msg(){System.out.println("Hello java");}  
	public static void main(String args[]){  
		
		overridingmethod om = new overridingmethod();
		om.msg();
	
	}
	}
