import javax.swing.JOptionPane;


public class Authentication {

	private static String username = "";
	private static String password = "";
	private static String username1 = "";
	private static String password1 = "";
	/*public static void main(String[] args)
	{
		 userAuthentication();
		 prompt();
	     
	}*/
	public static void userAuthentication()
	{
	      //Receive username and password input
	      username = JOptionPane.showInputDialog("Enter your username");
	      password = JOptionPane.showInputDialog("Enter your password");

	     
	      JOptionPane.showMessageDialog(null, "Hello " + username);
	      JOptionPane.showMessageDialog(null, "Welcome to CSC200 class!");
	      JOptionPane.showMessageDialog(null, "Your password is " + password);
	}
	//Receives username and password again for verification
	public static void prompt()
	{
		username1 = JOptionPane.showInputDialog("Enter username: " );
		password1 = JOptionPane.showInputDialog("Enter password: " );
		//If username and password match, then this print message
		if (username.equalsIgnoreCase(username1) && (password.equalsIgnoreCase(password1)))
		{
			JOptionPane.showMessageDialog(null, "Welcome " + username1);
		}
		//If username and password don't match, then print this message
		else
		{
			JOptionPane.showMessageDialog(null, "Wrong username or password.");
		}
	}
}
