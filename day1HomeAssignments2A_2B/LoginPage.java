package week4.day1HomeAssignments2A_2B;

public class LoginPage extends BasePage{
	
	//created extends keyword by using the extends keyword able call the methods inside the basepage class.

	public void performCommonTasks() {
		
		System.out.println("PerormCommonTasks from Login page class");
		//Overriding the performCommonTasks() method in the LoginPage class.

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage(); //created object to call the basepage methods from login page class
		lp.findElement(); //calling findElement from basepage 
		lp.clickElement(); //calling clickElement from basepage
		lp.enterText(); //calling enterText from basepage
		lp.performCommonTasks();//calling performCommonTasks from LoginPage (Overriding)

		
	}

}
