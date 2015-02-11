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
	      username = JOptionPane.showInputDialog("Enter your username");
	      password = JOptionPane.showInputDialog("Enter your password");

	     
	      JOptionPane.showMessageDialog(null, "Hello " + username);
	      JOptionPane.showMessageDialog(null, "Welcome to CSC200 class!");
	      JOptionPane.showMessageDialog(null, "Your password is " + password);
	}
	public static void prompt()
	{
		username1 = JOptionPane.showInputDialog("Enter username: " );
		password1 = JOptionPane.showInputDialog("Enter password: " );
		if (username.equalsIgnoreCase(username1) && (password.equalsIgnoreCase(password1)))
		{
			JOptionPane.showMessageDialog(null, "Welcome " + username1);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Wrong username or password.");
		}
	}
}
