import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class tocheckroperties {

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("db.properties");  
		Properties p=new Properties();  
		p.load(reader);  
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password"));  
//	    Thread.sleep(10);
//	    wait(10);
//	    synchronized void deposit(int amount){  
//	    	System.out.println("going to deposit...");  
//	    	this.amount+=amount;  
//	    	System.out.println("deposit completed... ");  
//	    	notify();  
	}
}
