package week4.day1HomeAssignments1A;

public class JavaConnection implements DatabaseConnection{
	
	//created Concrete class Javaconnection and implemented the databaseconnection interface
	public static void main(String[] args) {
		
		JavaConnection jc = new JavaConnection();
		
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
	}

	@Override
	public void connect() {
		//printing connect method
		System.out.println("Connect");
		
	}

	@Override
	public void disconnect() {
		//printing disconnect method
		System.out.println("Disconnect");
		
	}

	@Override
	public void executeUpdate() {
		//printing executeupdate method
		System.out.println("ExecuteUpdate");
		
	}

}
