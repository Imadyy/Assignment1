import java.util.Scanner;
public class Authentication {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
	
       String USERNAME = "Imad";
       int password= 9000;
   
		System.out.println("Enter username");
		String user = keyboard.nextLine();
      
            
		System.out.println("Enter your password");
      int pass = keyboard.nextInt();
      
		
       if(USERNAME.equals(user)&& password == pass){
      System.out.println("Welcome! " + USERNAME);

	   }else { 
            System.out.println("Invalid Username or Password");
        }
            
   }
   
}
 
 
