package tocheckinterfaceimplementation;

public abstract interface interfacecheck {
	public String stre = "Anil";
	
	void sleeping();
    default void runing() {
        System.out.println("I'm running now!");
        runingnew();
        runingnewlast();
    }
    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
    
	private void runingnew() {
        System.out.println("I'm running now then!");
    }
	
	protected void runingnewlast() {
        System.out.println("I'm running now now and then!");
    }
}
