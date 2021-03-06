
public class singleton {
// It will create a single instance in the JVM memory as static are class level variables	
	private static singleton instance = null;
	
//It will restrict the instantiation of the Singleton class from the outside world
//	(i.e. Initialization of this class using the new keyword is prevented)	
	private singleton() {
		
	}
	
	
//	Static factory method: This provides the global point of access to the 
//	Singleton object and returns the instance to the caller
	
	public static singleton getInstance() {
		if (instance == null) {
			instance = new singleton();
		}
		return instance;
	}
}
