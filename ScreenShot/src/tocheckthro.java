
public class tocheckthro {
	
	public void checkAge(int age){
	      if(age<18)
	         throw new ArithmeticException("Not Eligible for voting");
	      else
	         System.out.println("Eligible for voting");
	   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tocheckthro obj = new tocheckthro();
	      obj.checkAge(13);
	      System.out.println("End Of Program");

	}

}
