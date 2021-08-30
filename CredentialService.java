package services;
import model.Employee;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class CredentialService {
	
	public void logOut() {
		System.out.println("----Thank You for using create credentials portal-------");
	}
public void generateEmailAddress(Employee e) {
	String generateEmail;
	generateEmail=e.getFirstName() +e.getLastName()+"."+e.getDepartment()+"@"+"gl.com";
	e.setEmail(generateEmail);
	
}
public void generatePassword(Employee e) {
	StringBuilder generatePassword=new StringBuilder();
	HashMap<String,String> m=new HashMap();
	m.put("capital", "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	m.put("numbers", "0123456789");
	m.put("specialChar", "~!@#$%^&*(){}[]<>?:_");
	m.put("small", "abcdefghijklmnopqrstuvwxyz");
	for(Map.Entry<String, String> emp :m.entrySet()) {
		Random r=new Random();
		int index=(int) (r.nextFloat()* e.getValue().length());
		generatePassword.append(e.getValue().charAt(index));
		index=(int) (r.nextFloat() *e.getValue().length());
		generatePassword.append(e.getValue().charAt(index));
			
	}
	e.setPassword(generatePassword.toString());
	
} 

public void showCredentials(Employee e) {
	System.out.println("Dear"+e.getFirstName()+"your generated credentials are as follows");
	System.out.println("Email-->"+e.getEmail());
	System.out.println("Password-->"+e.getPassword());
}
}
