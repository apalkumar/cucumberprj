abstract class Base {
    abstract void fun();
    static int i=10;
    
    static void funny() {
    	System.out.println("Hello Funny");
    }
}

class Derived extends Base {
    void fun()
    {
        System.out.println("Derived fun() called");
    }
    
}

public class demoabstract {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base.funny();
		int i = Base.i;
		i=20;
		System.out.println(Base.i);
		System.out.println(i);
		System.out.println(Base.i);
	}
}
