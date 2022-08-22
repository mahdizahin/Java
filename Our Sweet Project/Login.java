import java.util.Scanner;
public class Login{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String name="admin",pass="password";
		System.out.print("Enter username: ");
		String name1=sc.nextLine();
		System.out.print("Enter Password: ");
		String pass1=sc.nextLine();

        if(name.equals(name1) && pass.equals(pass1))
        {
            System.out.println("Welcome "+name1+" you have Logged-in Successfully");
			
			
			
			
			
			
			
        }
        else
        {
            System.out.println("Username or password Mismatch");
        }
    }
}